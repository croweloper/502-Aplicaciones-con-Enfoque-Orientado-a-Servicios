/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platanitos.wsdl;

import com.platanitos.dao.ClienteDAO;
import com.platanitos.model.Cliente;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author crowe
 */
@WebService(serviceName = "swCliente")
public class swCliente {

    
     @WebMethod(operationName = "Login")
    public Cliente Login(@WebParam(name = "mail") String mail, @WebParam(name = "pass") String pass) {
        //TODO write your implementation code here:
        return new ClienteDAO().Login(mail, pass);
    }
    
    @WebMethod(operationName = "Registrar")
    public Cliente Registrar(@WebParam(name = "cliente") Cliente cliente) {
        //TODO write your implementation code here:
        return new ClienteDAO().guardar(cliente);
    }
    
     @WebMethod(operationName = "validarDNIandMail")
    public int validarDNIandMail(@WebParam(name = "dni") String dni, @WebParam(name = "mail") String mail) {
        //TODO write your implementation code here:
        return new ClienteDAO().validarDNIandMail(dni, mail);
    }

    
    
}
