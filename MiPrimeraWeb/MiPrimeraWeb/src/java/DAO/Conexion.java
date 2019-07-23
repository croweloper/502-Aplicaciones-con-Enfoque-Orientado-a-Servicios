/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class Conexion {
    
    private final String URL="jdbc:mysql://localhost:3306/descanso";
    private final String DRIVER="com.mysql.jdbc.Driver";
    private final String USER="root";
    private final String PASS="root";
    
    public Connection conectar(){
        try {
            
            Class.forName(this.DRIVER);
            Connection connec=DriverManager.getConnection(this.URL,this.USER,this.PASS);
            return connec;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar "+e.getMessage());
        }
        return null;
        
    }
}
