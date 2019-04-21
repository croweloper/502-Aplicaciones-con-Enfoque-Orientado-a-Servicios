/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.ws;

import com.empresa.proyecto.bean.ClienteBean;
import com.empresa.proyecto.services.ClienteService;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author crowe
 */
@WebService(serviceName = "WSCliente")
public class WSCliente {

    
    ClienteService clienteservice=new ClienteService();
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "listarclientes")
    public List<ClienteBean> ListarClientes() {
        return clienteservice.ListarClientes();
    }
    
    @WebMethod(operationName = "registrarclientes")
    public String RegistrarClientes(@WebParam(name = "nombre") String nombre,@WebParam(name = "apellidos") String apellido,@WebParam(name = "saldo") String saldo) {
                
        return clienteservice.RegistrarCliente(nombre,apellido,saldo);
    }
}
