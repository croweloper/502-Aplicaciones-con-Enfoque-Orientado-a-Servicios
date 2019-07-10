/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croweloper.globalchef.wsdl;

import com.croweloper.globalchef.dao.impl.RecetaDAOImpl;
import com.croweloper.globalchef.model.Receta;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "swReceta")
public class swReceta {

    @WebMethod(operationName = "RegistrarReceta")
    public Receta RegistrarReceta(@WebParam(name = "receta") Receta receta) {
        //TODO write your implementation code here:
        return new RecetaDAOImpl().guardar(receta);
    }

    @WebMethod(operationName = "ActualizarReceta")
    public Receta ActualizarReceta(@WebParam(name = "receta") Receta receta) {
        //TODO write your implementation code here:
        return new RecetaDAOImpl().actualizar(receta);
    }
    

    @WebMethod(operationName = "BuscarReceta")
    public Receta BuscarReceta(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return new RecetaDAOImpl().buscarPorId(id);
    }

    @WebMethod(operationName = "ListarRecetas")
    public List<Receta> ListarRecetas() {
        //TODO write your implementation code here:
        return new RecetaDAOImpl().listar();
    }
    
     @WebMethod(operationName = "EliminarReceta")
    public void EliminarReceta(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        new RecetaDAOImpl().eliminar(id);
        
    }
    
    @WebMethod(operationName = "BuscarRecetaCompleto")
    public Receta BuscarRecetaCompleto(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return new RecetaDAOImpl().buscarPorIdCompleto(id);
    }

    @WebMethod(operationName = "ListarRecetasCompleto")
    public List<Receta> ListarRecetasCompleto() {
        //TODO write your implementation code here:
        return new RecetaDAOImpl().listarCompleto();
    }

    @WebMethod(operationName = "ListarRecetasPorChef")
    public List<Receta> ListarRecetasPorChef(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return new RecetaDAOImpl().listarPorChef(id);
    }    
    
   
}
