/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.rs;

import com.empresa.proyecto.bean.Costillas;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author crowe
 */
@Path("costillas")
public class CostillasRest {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CostillasRest
     */
    public CostillasRest() {
    }

    /**
     * Retrieves representation of an instance of com.empresa.proyecto.rs.CostillasRest
     * @return an instance of Costillas
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Costillas getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of CostillasRest
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(Costillas content) {
    }
}
