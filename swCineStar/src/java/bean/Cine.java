package bean;

import java.util.ArrayList;
import java.util.List;

public class Cine {
    int idCine,Salas,idDistrito;
    String RazonSocial,Direccion,Telefonos,Detalle;
    boolean Eliminado,Valido;

    public int getIdCine() {
        return idCine;
    }

    public void setIdCine(int idCine) {
        this.idCine = idCine;
    }

    public int getSalas() {
        return Salas;
    }

    public void setSalas(int Salas) {
        this.Salas = Salas;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefonos() {
        return Telefonos;
    }

    public void setTelefonos(String Telefonos) {
        this.Telefonos = Telefonos;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    public boolean isEliminado() {
        return Eliminado;
    }

    public void setEliminado(boolean Eliminado) {
        this.Eliminado = Eliminado;
    }

    public boolean isValido() {
        return Valido;
    }

    public void setValido(boolean Valido) {
        this.Valido = Valido;
    }

    public Cine() { }
    
    public Cine( String[] aRegistro ) {
        setRegistro( aRegistro );
    }

    public void setRegistro( String[] aRegistro ) {
        Valido = aRegistro != null;
        if ( Valido ) {
            idCine = Integer.parseInt( aRegistro[0] );
            RazonSocial = aRegistro[1];
            Salas = Integer.parseInt( aRegistro[2] );
            idDistrito = Integer.parseInt( aRegistro[3] );
            Direccion = aRegistro[4];
            Telefonos = aRegistro[5];
            Eliminado = aRegistro[6].equals("true");
            Detalle = aRegistro[7];
        }
    }
    
    public Object[] getRegistro() {
        return new Object[] { idCine,RazonSocial,Salas,idDistrito,Direccion,Telefonos,Eliminado };
    }
    
    public List<Cine> getListCine( String[][] mCines ) {
        if ( mCines == null ) return null;
            
        List<Cine> lstCine = new ArrayList<Cine>();
        for ( String[] aCine : mCines ) 
            lstCine.add( new Cine( aCine ) );
            
        return lstCine;
    }
    
}
