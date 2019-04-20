
package com.empresa.proyecto.rs;

import com.empresa.proyecto.bean.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;


@Path("user")
public class UserRest {

    @Context
    private UriInfo context;

    public UserRest() {
    }

    @GET
    @Path("text")
    @Produces("text/xml")
    public String getObjetoTextXml(){
        String objetoXML="<cliente><id>10</id><nombre>Juanito</nombre><dni>75964854</dni></cliente>";
        return objetoXML;
    }
    
    @GET
    @Path("application")
    @Produces("application/xml")
    public Cliente getObjetoApplicationXml(){
        Cliente c=new Cliente();
        c.setId("1");
        c.setNombre("Elsa");
        c.setDni("75896458");
        return c;
        
    }
    
    @GET
    @Path("path/{name}")
    @Produces("text/xml")
    public String getPath(@PathParam("name") String name){
        String xml="<nombre>"+name+"</nombre>";
        return xml;
    }
    
    
    @GET
    @Path("query")
    @Produces("text/xml")
    public String getQuery(@QueryParam("name") String name){
        String xml="<nombre>"+name+"</nombre>";
        return xml;
    }
    
    @GET
    @Path("lista")
    @Produces("application/xml")
    public List<Cliente> getListaClientesXML(){
        
        List<Cliente> lista=new ArrayList<Cliente>();
        for (int i = 0; i < 10; i++) {
            Cliente c=new Cliente();
            c.setId("id"+i);
            c.setNombre("Cliente:"+i);
            c.setDni("DNI"+i);
            lista.add(c);
            
        }
        return lista;
    }
    
}
