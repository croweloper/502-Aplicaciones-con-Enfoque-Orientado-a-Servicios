/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croweloper.recursos;

import com.croweloper.model.Articulo;
import com.croweloper.servicios.ArticuloServicio;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/articulos")
public class ArticuloRecurso {
    
    ArticuloServicio as=new ArticuloServicio();
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Articulo getArticulo(){
        Articulo articulo=new Articulo(1,"Primer Post","Ejemplo de Servicio","Daniel Romero");
        return articulo;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/{codigo}")
    public Articulo getArticulo(@PathParam("codigo") int id){
        return as.getArticulo(id);
        
    }
    
    @POST
    
    public Articulo agregarArticulo(Articulo articulo){
        return as.agregarArticulo(articulo);
        
    }
    
    @DELETE
    @Path("/{codigo}")
    public void eliminarArticulo(@PathParam("codigo")int id){
        as.eliminarArticulo(id);
        
    }
    
    @PUT
    @Path("/{codigo}")
    public Articulo actualizarArticulo(@PathParam("codigo")int id,Articulo articulo){
        articulo.setCodigo(id);
        return as.modificarArticulo(articulo);
        
    }
    
    
    
    
    
    
}
