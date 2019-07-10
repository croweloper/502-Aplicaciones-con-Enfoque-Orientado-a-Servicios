/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croweloper.globalchef.wsdl;

import com.croweloper.globalchef.dao.impl.PlatoDAOImpl;
import com.croweloper.globalchef.model.Plato;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author crowe
 */
@WebService(serviceName = "swPlato")
public class swPlato {
    
   
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListaPlato")
    public List<Plato> ListaPlato() {
        //TODO write your implementation code here:
        return new PlatoDAOImpl().listar();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ObtenerPlato")
    public Plato ObtenerPlato(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return new PlatoDAOImpl().buscarPorId(id);
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListarPlatoCompleto")
    public List<Plato> ListarPlatoCompleto() {
        //TODO write your implementation code here:
        return new PlatoDAOImpl().listarCompleto();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ObtenerPlatoCompleto")
    public Plato ObtenerPlatoCompleto(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return new PlatoDAOImpl().buscarPorIdCompleto(id);
    }
}
