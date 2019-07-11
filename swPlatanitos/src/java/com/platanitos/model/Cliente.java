/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platanitos.model;

/**
 *
 * @author crowe
 */
public class Cliente {

    private int idCliente;

    private String DNI;

    private String Nombres;

    private String Apellidos;

    private String Genero;

    private String Correo;

    private String Contraseña;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public Cliente(int idCliente, String DNI, String Nombres, String Apellidos, String Genero, String Correo, String Contraseña) {
        this.idCliente = idCliente;
        this.DNI = DNI;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Genero = Genero;
        this.Correo = Correo;
        this.Contraseña = Contraseña;
    }

    public Cliente() {
    }
    
    

}
