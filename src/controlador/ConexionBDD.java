package controlador;


import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tiririn
 */
public class ConexionBDD {
java.sql.Connection conexion;
    public java.sql.Connection conectar(){
         
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            
           conexion = DriverManager.getConnection("jdbc:mysql://localhost/prueba_poo?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true", "root", "root");
            System.out.println("CONECTADO"); 
        } catch (ClassNotFoundException | SQLException e)
        {
             System.out.println("NO SE CONECTO ");
        e.printStackTrace();
        }
        return conexion;
    }
    public void cerrarConexion(){
        try {
            if(conexion !=null && !conexion.isClosed()){
            conexion.close();
                System.out.println("CONEXION CERRADA");
            }
        } catch (SQLException e) {
            System.out.println("");
        }
    }
}  