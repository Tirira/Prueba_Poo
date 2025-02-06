package modelo;


import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tiririn
 */
public class PedidoModelo {
    private int idPedido;
    private int idCliente;
    private Date fechaPedido;
    private String descripcion;
    private int cantidad;
    private double precioTotal;

    public PedidoModelo() {
    }

    public PedidoModelo(int idPedido, int idCliente, Date fechaPedido, String descripcion, int cantidad, double precioTotal) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.fechaPedido = fechaPedido;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "PedidoModelo{" + "idPedido=" + idPedido + ", idCliente=" + idCliente + ", fechaPedido=" + fechaPedido + ", descripcion=" + descripcion + ", cantidad=" + cantidad + ", precioTotal=" + precioTotal + '}';
    }

    
}
