/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croweloper.servicios ;

import com.croweloper.dao.BaseDeDatos;
import static com.croweloper.dao.BaseDeDatos.lista;
import com.croweloper.model.Articulo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class ArticuloServicio {
    
    //falta conectar
    List<Articulo> listado=llenarlista();
    
    //llenarlista();
    
    
    public List<Articulo> llenarlista(){
        
        List<Articulo> lista=new ArrayList<>();
        
        for (int i = 1; i < 11; i++) {
            Articulo art=new Articulo(i, "Titulo "+i, "Contenido "+i, "Autor "+i);
            lista.add(art);
        }
        
        return lista;
        
    }
    
    public Articulo getArticulo(int id){
        Articulo buscado=null;
        
        for (Articulo articulo : listado) {
            if (articulo.getCodigo()==id) {
                buscado=articulo;
            }
        }
        
        return buscado;
    }
    
    public Articulo agregarArticulo(Articulo articulo){
        articulo.setCodigo(listado.size()+1);
        
        listado.add(articulo);
        
        return articulo;
    }
    
    private int getMaxId(){
        if (listado.size()>0) {
            return listado.get(listado.size()-1).getCodigo()+1;
        }
        return 1;
    }
    
    private int getPosicion(int id){
        int posicion=0;
        for (int i = 0; i < listado.size(); i++) {
            if (id==listado.get(i).getCodigo()) {
                posicion=i;
            }
        }
        return posicion;
    }
    
    public Articulo modificarArticulo(Articulo articulo){
        
        listado.set(getPosicion(articulo.getCodigo()), articulo);
        return articulo;                
                
    }
    
    public void eliminarArticulo(int id){
        
        listado.remove(getPosicion(id));
                 
                
    }
    
    
    
}
