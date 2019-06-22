
package dao;

public class daoPelicula {
    
    bd.clsBD clsBD=new bd.clsBD("cinestar");
    
    public String[][] getVerPeliculas(Object id) {
        clsBD.Sentencia(String.format("call usp_getVerPeliculas(%s);", id));
        return clsBD.getRegistros();
    }
    
}
