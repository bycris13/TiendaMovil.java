/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tiendamovil.modelos;

/**
 *
 * @author Cristian
 */
public class Celular {

    // Atributos, objetos del celular
    private String referencia;
    private String descripcion;
    public double precio;
    public int cantidad;

    // Constructor 
    public Celular(String referencia, String descripcion, double precio, int cantidad) { // (parametros)
        // Celular(123,"nokia",2000.0); atributo = Valor de los parametros
        this.referencia = referencia;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Celular() {
    }

    // Metodos
    public String getReferencia() {  // el get es para pedir informacion
        return referencia;
    }

    public void setReferencia(String referencia) { //set es para establecer, cambiar,agregar,actualizar.
        this.referencia = referencia; // el this es el objeto que voy agregar a la base de datos
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void aplicarDescuento() {
        System.out.println("Aplicando descuento a " + referencia + " : " + descripcion);
        double descuento = 0; // Se creo una variable descuento de tipo double que inicia en cero por si no hay un descuento por aplicar  
        if (precio <= 50000) {
            descuento = precio * 0.1;
            System.out.println("Aplicado 10% de descuento");

        } else {
            descuento = precio * 0.05;
            System.out.println("Aplicado 5% de descuento");
        }
        
        System.out.println("Precio original = " + precio + "  --- Precio con descuento = " + (precio - descuento));
        setPrecio(precio - descuento);
        System.out.println("");
    }
    
    public void mostrarDatos() {
        System.out.println("referencia=" + referencia + ", descripcion=" + descripcion + ", precio=" + precio + ", cantidad=" + cantidad);
    }
    

}
