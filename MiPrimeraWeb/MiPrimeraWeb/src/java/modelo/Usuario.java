package modelo;

public class Usuario {
    private String codigoUsu;
    private String apodo;
    private String nombreUsu;

    public Usuario() {
    }

    public Usuario(String codigoUsu, String apodo, String nombreUsu) {
        this.codigoUsu = codigoUsu;
        this.apodo = apodo;
        this.nombreUsu = nombreUsu;
    }

    public String getNombreUsu() {
        return nombreUsu;
    }

    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }

    public String getCodigoUsu() {
        return codigoUsu;
    }

    public void setCodigoUsu(String codigoUsu) {
        this.codigoUsu = codigoUsu;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
    
}
