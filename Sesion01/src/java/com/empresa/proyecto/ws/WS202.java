/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.ws;

import com.empresa.proyecto.bean.PaisBean;
import com.empresa.proyecto.bean.ProductoBean;
import com.empresa.proyecto.service.ProductoService;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author crowe
 */
@WebService(serviceName = "WS202")
public class WS202 {

    ProductoService productoService=new ProductoService();
    
    @WebMethod(operationName = "listarProductos")
    public List<ProductoBean> listarProductos(){
        return productoService.listarProductos();
    }
    
    
    @WebMethod(operationName = "nuevoProducto")
    public String nuevoProducto(@WebParam(name = "nombProducto") String nombProducto,@WebParam(name = "precio") double precio){
        return productoService.nuevoProducto(nombProducto,precio);
    }
}
