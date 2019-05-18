/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.ClienteDao;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Cliente;

/**
 *
 * @author crowe
 */
@WebService(serviceName = "WSCliente")
public class WSCliente {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregarCliente")
    public String agregarCliente(@WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido) {
        
        ClienteDao obdao=new ClienteDao();
        Cliente cli=new Cliente(nombre, apellido);
        
        obdao.AgregarCliente(cli);
        
        
        return "Cliente Agregado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultarCliente")
    public Cliente consultarCliente(@WebParam(name = "codigo") int codigo) {
        //TODO write your implementation code here:
        ClienteDao obdao=new ClienteDao();
        Cliente cli=obdao.consultarCliente(codigo);
                
        return cli;
    }
}
