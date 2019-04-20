/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.ws;

import com.empresa.proyecto.bean.BeanProducto;
import com.empresa.proyecto.services.ProductoService;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author crowe
 */
@WebService(serviceName = "WS2021")
public class WS2021 {

    /**
     * This is a sample web service operation
     */
    ProductoService productoService=new ProductoService();
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "obtenerCodigo")
    public String obtenerCodigo(@WebParam(name = "codigo") String codigo) {
        return "Este codigo desde Ws : " + codigo + " !";
    }
    
    @WebMethod(operationName = "ListarProductos")
    public List<BeanProducto> ListarProductos(){
        return productoService.listarProductos();
    }
    
}
