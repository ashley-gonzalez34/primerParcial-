
package com.ashli.factura;


public class ClsFacturaporrateo {
    private int      cantidad;
    private String   descripcion;
    private int      precio;
    private double   gastoPeso;
    private double   gastoValor;
    private double   costoUnidad;
    private double   totalVenta;
    private int      pesoProducto;

   
    public int getCantidad() {
        return cantidad;
    }

    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    public String getDescripcion() {
        return descripcion;
    }

    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    public int getPrecio() {
        return precio;
    }

    
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
    public double getGastoPeso() {
        return gastoPeso;
    }

    
    public void setGastoPeso(double gastoPeso) {
        this.gastoPeso = gastoPeso;
    }

    
    public double getGastoValor() {
        return gastoValor;
    }

   
    public void setGastoValor(double gastoValor) {
        this.gastoValor = gastoValor;
    }

    
    public double getCostoUnidad() {
        return costoUnidad;
    }

    
    public void setCostoUnidad(double costoUnidad) {
        this.costoUnidad = costoUnidad;
    }

    
    public double getTotalVenta() {
        return totalVenta;
    }

    
    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    
    public int getProducto() {
        return pesoProducto;
    }

    
    public void setProducto(int Producto) {
        this.pesoProducto = Producto;
    }
    
}


