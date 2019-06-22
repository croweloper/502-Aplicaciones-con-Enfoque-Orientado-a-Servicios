/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croweloper.model;

/**
 *
 * @author Administrador
 */


import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Articulo {
    
    private int codigo;
    private String titulo;
    private String contenido;
    private Calendar fecha;
    private String autor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Articulo() {
    }

    public Articulo(int codigo, String titulo, String contenido, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.contenido = contenido;
        this.autor = autor;
        this.fecha =new GregorianCalendar();
        
    }
    
    
    
    
    
}
