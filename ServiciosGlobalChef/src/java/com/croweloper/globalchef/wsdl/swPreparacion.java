/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croweloper.globalchef.wsdl;

import com.croweloper.globalchef.dao.impl.PreparacionDAOImpl;
import com.croweloper.globalchef.model.Preparacion;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "swPreparacion")
public class swPreparacion {
        
    @WebMethod(operationName = "ListaPorReceta")
    public List<Preparacion> ListaPorReceta(@WebParam(name = "id") int id) {
        return new PreparacionDAOImpl().listaxReceta(id);
    }
    
    @WebMethod(operationName = "RegistrarPreparacion")
    public Preparacion RegistrarPreparacion(@WebParam(name = "preparacion") Preparacion preparacion) {
        return new PreparacionDAOImpl().guardar(preparacion);
    }
}
