/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.services;

import com.empresa.proyecto.bean.BeanProducto;
import com.empresa.proyecto.dao.impl.ProductoDAOImpl;
import java.util.List;

/**
 *
 * @author crowe
 */
public class ProductoService {
    
    ProductoDAOImpl productoDao;

    public ProductoService() {
        productoDao=new ProductoDAOImpl();
    }
    
    public List<BeanProducto> listarProductos(){
        return productoDao.list();
    }
    
    
    
}
