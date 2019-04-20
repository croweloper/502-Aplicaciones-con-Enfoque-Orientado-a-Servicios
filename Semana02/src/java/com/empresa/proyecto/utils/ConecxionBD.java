/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.utils;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author crowe
 */
public class ConecxionBD {
    
    String ConxBD="jdbc:mysql://localhost:3306/pruebas";
    String UserBD="root";
    String PassBD="";
    String JdbcBD="com.mysql.jdbc.Driver";
    Connection Conexion;
    
    public ConecxionBD(){
        try {
            Class.forName(JdbcBD);
            Conexion=DriverManager.getConnection(ConxBD,UserBD,PassBD);
            if(Conexion!=null){
                DatabaseMetaData dm=(DatabaseMetaData)Conexion.getMetaData();
                System.out.println("Mi Base de datos : "+dm);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Connection getConexion(){
        return this.Conexion;
    }
    
    public static void main(String[] args){
        ConecxionBD cn=new ConecxionBD();
    }
    
    
}
