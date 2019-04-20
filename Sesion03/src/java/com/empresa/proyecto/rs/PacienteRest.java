/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.rs;

import com.empresa.proyecto.bean.Paciente;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author crowe
 */
@Path("generic")
public class PacienteRest {

    @Context
    private UriInfo context;

    static List<Paciente> lista=new ArrayList<Paciente>();
    
    public PacienteRest() {
    }

    @GET
    @Path("pacientes")
    @Produces("application/xml")
    public List<Paciente> getPacienteNuevoXML(
            @QueryParam("idpaciente") String idpaciente,
            @QueryParam("nombre") String nombre,
            @QueryParam("codigo") String codigo,
            @QueryParam("medico") String medico){
        
        Paciente p=new Paciente();
        p.setIdpaciente(idpaciente);
        p.setNombres(nombre);
        p.setCodigo(codigo);
        p.setMedico(medico);
        
        lista.add(p);
        
        return lista;
    }

}
