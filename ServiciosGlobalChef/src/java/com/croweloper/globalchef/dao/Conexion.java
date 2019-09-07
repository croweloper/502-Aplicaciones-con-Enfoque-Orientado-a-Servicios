package com.croweloper.globalchef.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	
	//static String _IP="localhost",_PORT="3306",_BD="bd_globalchef",_USER="root",_PASSWORD="";
	static String _IP="node47302-globalchef.jl.serv.net.mx",_PORT="3306",_BD="bd_globalchef",_USER="root",_PASSWORD="KVPpak33112";
	
	protected static Connection cx;

	public static Connection conectar() {
		if (cx != null) {
			return cx;
		}

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			cx = DriverManager.getConnection(String.format("jdbc:mysql://%s:%s/%s", _IP,_PORT,_BD),_USER,_PASSWORD);
			System.out.println("Conectado.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error de conexion.");
			
		}
		return cx;
	}

	public static void desconectar() {
		if (cx == null) {
			return;
		}

		try {
			cx.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
