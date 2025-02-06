package controlador;


import java.sql.Connection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tiririn
 */
public class ClienteControlador {
        private ConexionBDD conexion;
    private Connection conectado;

    public ClienteControlador() {
        conexion = new ConexionBDD();
        conectado = conexion.conectar();
    }
}
