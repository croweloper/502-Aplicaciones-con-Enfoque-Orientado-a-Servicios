package model;
// Generated 17-may-2019 20:01:56 by Hibernate Tools 4.3.1



/**
 * Login generated by hbm2java
 */
public class Login  implements java.io.Serializable {


     private Integer codLog;
     private Cliente cliente;
     private String corLog;
     private String pasLog;
     private Character tipUsu;

    public Login() {
    }

    public Login(Cliente cliente, String corLog, String pasLog, Character tipUsu) {
       this.cliente = cliente;
       this.corLog = corLog;
       this.pasLog = pasLog;
       this.tipUsu = tipUsu;
    }
   
    public Integer getCodLog() {
        return this.codLog;
    }
    
    public void setCodLog(Integer codLog) {
        this.codLog = codLog;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getCorLog() {
        return this.corLog;
    }
    
    public void setCorLog(String corLog) {
        this.corLog = corLog;
    }
    public String getPasLog() {
        return this.pasLog;
    }
    
    public void setPasLog(String pasLog) {
        this.pasLog = pasLog;
    }
    public Character getTipUsu() {
        return this.tipUsu;
    }
    
    public void setTipUsu(Character tipUsu) {
        this.tipUsu = tipUsu;
    }




}


