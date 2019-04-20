/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.dao.impl;

import com.empresa.proyecto.bean.BeanProducto;
import com.empresa.proyecto.dao.ProductoDAO;
import com.empresa.proyecto.utils.ConecxionBD;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crowe
 */
public class ProductoDAOImpl implements ProductoDAO{

    public ConecxionBD db;
    
    public ProductoDAOImpl(){
        db=new ConecxionBD();
    }
    
    
    @Override
    public List<BeanProducto> list() {
        List<BeanProducto> listaProductos=null;
        
        String sql="select idproducto,nombre,precio from productos;";
        try {
            Connection cn=db.getConexion();
            PreparedStatement st=cn.prepareStatement(sql);
            ResultSet rs=st.executeQuery(sql);
            listaProductos=new ArrayList<>();
            while (rs.next()) {                
                BeanProducto p=new BeanProducto(rs.getInt(1), rs.getString(2),rs.getDouble(3));
                listaProductos.add(p);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaProductos;
        
    }
    
    
}
