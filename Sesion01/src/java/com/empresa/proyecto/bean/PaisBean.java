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
public class PaisBean {
    
    private int idPais;
    private String nombPais;

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNombPais() {
        return nombPais;
    }

    public void setNombPais(String nombPais) {
        this.nombPais = nombPais;
    }

    public PaisBean() {
    }

    public PaisBean(int idPais, String nombPais) {
        this.idPais = idPais;
        this.nombPais = nombPais;
    }
    
    
    
    
    
}
