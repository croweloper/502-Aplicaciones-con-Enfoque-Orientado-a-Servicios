/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croweloper.globalchef.wsdl;

import com.croweloper.globalchef.dao.impl.UsuarioDAOImpl;
import com.croweloper.globalchef.model.Usuario;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author crowe
 */
@WebService(serviceName = "swUsuario")
public class swUsuario {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getUsuario")
    public Usuario getUsuario(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return new UsuarioDAOImpl().buscarPorId(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Login")
    public Usuario Login(@WebParam(name = "mail") String mail, @WebParam(name = "pass") String pass) {
        //TODO write your implementation code here:
        return new UsuarioDAOImpl().Login(mail, pass);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "RegistrarUsuario")
    public Usuario RegistrarUsuario(@WebParam(name = "usuario") Usuario usuario) {
        //TODO write your implementation code here:
        return new UsuarioDAOImpl().guardar(usuario);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ActualizarUsuario")
    public Usuario ActualizarUsuario(@WebParam(name = "usuario") Usuario usuario) {
        //TODO write your implementation code here:
        return new UsuarioDAOImpl().actualizar(usuario);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "EliminarUsuario")
    public void EliminarUsuario(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        new UsuarioDAOImpl().eliminar(id);
        //return null;
    }
}
