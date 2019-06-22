
package com.croweloper.dao;

import com.croweloper.model.Articulo;
import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    
    public static BaseDeDatos bd=new BaseDeDatos();
    public static List<Articulo> lista=new ArrayList<>();
    
    
    private BaseDeDatos(){
        
        llenarlista();
        
    }
    
    public static BaseDeDatos obtenerInstancia(){
        return bd;
    }
    
    public static List<Articulo> obtenerLista(){
        return lista;
    }
    
    public void llenarlista(){
        
        for (int i = 1; i < 11; i++) {
            Articulo art=new Articulo(i, "Titulo "+i, "Contenido "+i, "Autor "+i);
            lista.add(art);
        }
        
    }
    
    
    /*    
    Articulo art1=new Articulo(1, "Titulo 1", "Contenido 1", "Autor 1");
    Articulo art2=new Articulo(2, "Titulo 2", "Contenido 2", "Autor 2");
    Articulo art3=new Articulo(3, "Titulo 3", "Contenido 3", "Autor 3");
    Articulo art4=new Articulo(4, "Titulo 4", "Contenido 4", "Autor 4");
    Articulo art5=new Articulo(5, "Titulo 5", "Contenido 5", "Autor 5");
    Articulo art6=new Articulo(6, "Titulo 6", "Contenido 6", "Autor 6");
    Articulo art7=new Articulo(7, "Titulo 7", "Contenido 7", "Autor 7");
    Articulo art8=new Articulo(8, "Titulo 8", "Contenido 8", "Autor 8");
    Articulo art9=new Articulo(9, "Titulo 9", "Contenido 9", "Autor 9");
    Articulo art10=new Articulo(10,"Titulo 10", "Contenido 10", "Autor 10");
    */
    
    
    
}
