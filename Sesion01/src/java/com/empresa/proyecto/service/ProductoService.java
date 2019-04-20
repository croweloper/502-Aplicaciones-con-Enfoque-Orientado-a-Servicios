/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.service;

import com.empresa.proyecto.bean.ProductoBean;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crowe
 */
public class ProductoService {
    
    List<ProductoBean> listaProductos=new ArrayList<ProductoBean>();
    
    public List<ProductoBean> listarProductos(){
        return listaProductos;
    }
    
    public String nuevoProducto(String nombProducto,double precio){
        ProductoBean prod=new ProductoBean();
        prod.setIdproducto(listaProductos.size()+1);
        prod.setNombProducto(nombProducto);
        prod.setPrecio(precio);
        listaProductos.add(prod);
        return "Se añadio el Producto correctamente";
    }
    
}
