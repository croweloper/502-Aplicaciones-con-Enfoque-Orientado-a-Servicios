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
public class ClienteBean {
    
    private int codigo;
    private String nombres;
    private String apellidos;
    private double saldo;
    private String tipocuenta;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    public ClienteBean() {
    }

    public ClienteBean(int codigo, String nombres, String apellidos, double saldo) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.saldo = saldo;
        tipoSaldo(saldo);
    }
    
    void tipoSaldo(double saldo){
        if (saldo>3000){
            tipocuenta="Premium";
        }else{
            tipocuenta="Simple";
        }
        
    }
    
}
