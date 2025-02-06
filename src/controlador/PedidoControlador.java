package controlador;


import controlador.ConexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.PedidoModelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tiririn
 */
public class PedidoControlador {
        private ConexionBDD conexion;
    private Connection conectado;
    PreparedStatement ejecutar;
    ResultSet res;
    public ArrayList<Object[]> buscarPedidocedula;

    public PedidoControlador() {
        conexion = new ConexionBDD();
        conectado = conexion.conectar();
    }

   public ArrayList<PedidoModelo> buscarPedidocedula(String cedula) {
    ArrayList<PedidoModelo> listaPedidos = new ArrayList<>();
    try {
        String sql = "call sp_buscarCedula"; 
        ejecutar = conectado.prepareCall(sql);
        ejecutar.setString(1, "%" + cedula + "%");
        res = ejecutar.executeQuery();
        
        while (res.next()) {
            PedidoModelo pedido = new PedidoModelo();
            pedido.setIdPedido(res.getInt("idPedido"));
            pedido.setIdCliente(res.getInt("idCliente"));
            pedido.setFechaPedido(res.getDate("fechaPedido"));
            pedido.setDescripcion(res.getString("descripcion"));
            pedido.setCantidad(res.getInt("cantidad"));
            pedido.setPrecioTotal(res.getDouble("precioTotal"));
            
            listaPedidos.add(pedido);
        }
    } catch (SQLException e) {
        System.out.println("ERROR SQL: " + e);
    }
    return listaPedidos;
}
}