
package com.empresa.proyecto.utils;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    
    public Conexion() {
		
	}

	public static Connection getConection() {

		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/bdec01", "root", "");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("ERROR al cargar el Driver");
			
		} 
		return con;
	}
    
}
