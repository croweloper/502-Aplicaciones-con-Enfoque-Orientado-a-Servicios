/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croweloper.globalchef.wsdl;

import com.croweloper.globalchef.dao.impl.ChefDAOImpl;
import com.croweloper.globalchef.model.Chef;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "swChef")
public class swChef {
    
    @WebMethod(operationName = "RegistrarChef")
    public Chef RegistrarChef(@WebParam(name = "chef") Chef chef) {
        return new ChefDAOImpl().registrar(chef);
    }
    
    @WebMethod(operationName = "BuscarChef")
    public Chef BuscarChef(@WebParam(name = "id") int id) {
        return new ChefDAOImpl().buscarxID(id);
    }
    
    @WebMethod(operationName = "LoginChef")
    public Chef LoginChef(@WebParam(name = "mail") String mail, @WebParam(name = "pass") String pass) {
        return new ChefDAOImpl().Login(mail, pass);
    }
    
}
