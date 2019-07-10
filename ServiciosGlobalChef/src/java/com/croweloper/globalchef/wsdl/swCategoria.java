/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croweloper.globalchef.wsdl;

import com.croweloper.globalchef.dao.impl.CategoriaDAOImpl;
import com.croweloper.globalchef.dao.impl.GrupoCategoriaDAOImpl;
import com.croweloper.globalchef.model.Categoria;
import com.croweloper.globalchef.model.GrupoCategoria;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author crowe
 */
@WebService(serviceName = "swCategoria")
public class swCategoria {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListaCategoria")
    public List<Categoria> ListaCategoria() {
        //TODO write your implementation code here:
        return new CategoriaDAOImpl().listar();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ObtenerCategoria")
    public Categoria ObtenerCategoria(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return new CategoriaDAOImpl().buscarPorId(id);
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListarCategoriaCompleto")
    public List<Categoria> ListarCategoriaCompleto() {
        //TODO write your implementation code here:
        return new CategoriaDAOImpl().listarCompleto();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ObtenerCategoriaCompleto")
    public Categoria ObtenerCategoriaCompleto(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return new CategoriaDAOImpl().buscarPorIdCompleto(id);
    }
}
