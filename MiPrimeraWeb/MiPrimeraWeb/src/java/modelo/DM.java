/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class DM {
    
    //IdDescanso, DFinicio, DFfin, Ddiagnostico, DCentroSalud, DMedico, DCMP, IdTrabajador
    private String IdDescanso;
    private String DFinicio;
    private String DFfin;
    private String Ddiagnostico;
    private String DCentroSalud;
    private String DMedico;
    private String DCMP;
    private String IdTrabajador;

    public DM() {
    }

    public DM(String IdDescanso, String DFinicio, String DFfin, String Ddiagnostico, String DCentroSalud, String DMedico, String DCMP, String IdTrabajador) {
        this.IdDescanso = IdDescanso;
        this.DFinicio = DFinicio;
        this.DFfin = DFfin;
        this.Ddiagnostico = Ddiagnostico;
        this.DCentroSalud = DCentroSalud;
        this.DMedico = DMedico;
        this.DCMP = DCMP;
        this.IdTrabajador = IdTrabajador;
    }

    public String getIdTrabajador() {
        return IdTrabajador;
    }

    public void setIdTrabajador(String IdTrabajador) {
        this.IdTrabajador = IdTrabajador;
    }

    public String getIdDescanso() {
        return IdDescanso;
    }

    public void setIdDescanso(String IdDescanso) {
        this.IdDescanso = IdDescanso;
    }

    public String getDFinicio() {
        return DFinicio;
    }

    public void setDFinicio(String DFinicio) {
        this.DFinicio = DFinicio;
    }

    public String getDFfin() {
        return DFfin;
    }

    public void setDFfin(String DFfin) {
        this.DFfin = DFfin;
    }

    public String getDdiagnostico() {
        return Ddiagnostico;
    }

    public void setDdiagnostico(String Ddiagnostico) {
        this.Ddiagnostico = Ddiagnostico;
    }

    public String getDCentroSalud() {
        return DCentroSalud;
    }

    public void setDCentroSalud(String DCentroSalud) {
        this.DCentroSalud = DCentroSalud;
    }

    public String getDMedico() {
        return DMedico;
    }

    public void setDMedico(String DMedico) {
        this.DMedico = DMedico;
    }

    public String getDCMP() {
        return DCMP;
    }

    public void setDCMP(String DCMP) {
        this.DCMP = DCMP;
    }
    
    
    
}
