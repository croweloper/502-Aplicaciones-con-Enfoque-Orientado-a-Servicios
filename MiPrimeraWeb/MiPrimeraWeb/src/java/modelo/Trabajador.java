
package modelo;


public class Trabajador {
        
    private String idTra;
    private String nomTra;
    private String apeTra;
    private String fnacTra;
    private String direcTra;
    private String sexoTra;
    private String dniTra;
    private String estcivTra;

    public Trabajador() {
    }

    public Trabajador(String idTra, String nomTra, String apeTra, String fnacTra, String direcTra, String sexoTra, String dniTra, String estcivTra) {
        this.idTra = idTra;
        this.nomTra = nomTra;
        this.apeTra = apeTra;
        this.fnacTra = fnacTra;
        this.direcTra = direcTra;
        this.sexoTra = sexoTra;
        this.dniTra = dniTra;
        this.estcivTra = estcivTra;
    }

    public String getIdTra() {
        return idTra;
    }

    public void setIdTra(String idTra) {
        this.idTra = idTra;
    }

    public String getNomTra() {
        return nomTra;
    }

    public void setNomTra(String nomTra) {
        this.nomTra = nomTra;
    }

    public String getApeTra() {
        return apeTra;
    }

    public void setApeTra(String apeTra) {
        this.apeTra = apeTra;
    }

    public String getFnacTra() {
        return fnacTra;
    }

    public void setFnacTra(String fnacTra) {
        this.fnacTra = fnacTra;
    }

    public String getDirecTra() {
        return direcTra;
    }

    public void setDirecTra(String direcTra) {
        this.direcTra = direcTra;
    }

    public String getSexoTra() {
        return sexoTra;
    }

    public void setSexoTra(String sexoTra) {
        this.sexoTra = sexoTra;
    }

    public String getDniTra() {
        return dniTra;
    }

    public void setDniTra(String dniTra) {
        this.dniTra = dniTra;
    }

    public String getEstcivTra() {
        return estcivTra;
    }

    public void setEstcivTra(String estcivTra) {
        this.estcivTra = estcivTra;
    }
    
    
    
    
    
}
