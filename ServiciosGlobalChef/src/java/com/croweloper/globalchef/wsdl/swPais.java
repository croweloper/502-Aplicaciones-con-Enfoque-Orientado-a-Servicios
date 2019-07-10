/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croweloper.globalchef.wsdl;

import com.croweloper.globalchef.dao.impl.PaisDAOImpl;
import com.croweloper.globalchef.model.Pais;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author crowe
 */
@WebService(serviceName = "swPais")
public class swPais {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListarPaises")
    public List<Pais> ListarPaises() {
        //TODO write your implementation code here:
        return new PaisDAOImpl().listar();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "BuscarPais")
    public Pais BuscarPais(@WebParam(name = "codigo") String codigo) {
        //TODO write your implementation code here:
        return new PaisDAOImpl().buscarPorId(codigo);
    }
}
