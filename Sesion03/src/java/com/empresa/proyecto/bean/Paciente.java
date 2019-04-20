/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author crowe
 */
@XmlRootElement(name="paciente")
public class Paciente {
    
    private String idpaciente;
    private String nombres;
    private String codigo;
    private String medico;

    @XmlElement
    public String getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(String idpaciente) {
        this.idpaciente = idpaciente;
    }

    @XmlElement
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @XmlElement
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @XmlElement
    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }
    
    @Override 
    public String toString(){
        return "Paciente{"+"idpaciente="+idpaciente+" , nombres="+nombres+" , codigo="+codigo+" , medico="+medico+"}";
                
     }
    
    
}
