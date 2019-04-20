/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.bean;

/**
 *
 * @author crowe
 */
public class ProductoBean {
    
    private int idproducto;
    private String nombProducto;
    private double precio;

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombProducto() {
        return nombProducto;
    }

    public void setNombProducto(String nombProducto) {
        this.nombProducto = nombProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ProductoBean(int idproducto, String nombProducto, double precio) {
        this.idproducto = idproducto;
        this.nombProducto = nombProducto;
        this.precio = precio;
    }

    public ProductoBean() {
    }
    
    
            
    
}
