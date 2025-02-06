package controlador;


import controlador.ConexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

    public PedidoControlador() {
        conexion = new ConexionBDD();
        conectado = conexion.conectar();
    }

    public ArrayList<Object[]> buscarPostulante(String cedula) {
            ArrayList<Object[]> listaObject=new ArrayList<>();
        try {
            String sql = "call sp_buscarCedula('%"+cedula+"%');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            res = ejecutar.executeQuery();
            int cont = 1;
            
            while (res.next()) {
                Object[] obpedido = new Object[6];
                for (int i = 0; i < 6; i++) {
                    obpedido[i] = res.getObject(i+1);
                }
                obpedido[0]=cont;
                listaObject.add(obpedido);
                cont++;
            }

            return listaObject;
        } catch (SQLException e) {
            System.out.println("ERROR SQL"+e);
        }
        return null;
    }
    
}
