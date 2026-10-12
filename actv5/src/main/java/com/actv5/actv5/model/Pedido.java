package com.actv5.actv5.model;

import java.util.List;

public class Pedido {
    double precioTotal;
    private Cliente cliente;
    private List<Producto> productos;

    public Pedido( List<Producto>productos, Cliente cliente) {
        this.productos = productos;
        this.cliente = cliente;
    }

    public Pedido() {}

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPrecioTotal() {
        double precioTotal = 0;
        for(Producto p : productos){
            precioTotal += p.getPrecioUnitario() * p.getCantidad();
        }
        return precioTotal;
    }
    public int getTotalProductos() {
        int totalProductos = 0;
        for (Producto p : productos) {
            totalProductos += p.getCantidad();
        }
        return totalProductos;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
}