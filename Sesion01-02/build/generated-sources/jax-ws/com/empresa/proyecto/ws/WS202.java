
package com.empresa.proyecto.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WS202", targetNamespace = "http://ws.proyecto.empresa.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WS202 {


    /**
     * 
     * @return
     *     returns java.util.List<com.empresa.proyecto.ws.ProductoBean>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarProductos", targetNamespace = "http://ws.proyecto.empresa.com/", className = "com.empresa.proyecto.ws.ListarProductos")
    @ResponseWrapper(localName = "listarProductosResponse", targetNamespace = "http://ws.proyecto.empresa.com/", className = "com.empresa.proyecto.ws.ListarProductosResponse")
    @Action(input = "http://ws.proyecto.empresa.com/WS202/listarProductosRequest", output = "http://ws.proyecto.empresa.com/WS202/listarProductosResponse")
    public List<ProductoBean> listarProductos();

    /**
     * 
     * @param precio
     * @param nombProducto
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "nuevoProducto", targetNamespace = "http://ws.proyecto.empresa.com/", className = "com.empresa.proyecto.ws.NuevoProducto")
    @ResponseWrapper(localName = "nuevoProductoResponse", targetNamespace = "http://ws.proyecto.empresa.com/", className = "com.empresa.proyecto.ws.NuevoProductoResponse")
    @Action(input = "http://ws.proyecto.empresa.com/WS202/nuevoProductoRequest", output = "http://ws.proyecto.empresa.com/WS202/nuevoProductoResponse")
    public String nuevoProducto(
        @WebParam(name = "nombProducto", targetNamespace = "")
        String nombProducto,
        @WebParam(name = "precio", targetNamespace = "")
        double precio);

}
