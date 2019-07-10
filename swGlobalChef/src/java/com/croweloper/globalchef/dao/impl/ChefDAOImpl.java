package com.croweloper.globalchef.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.croweloper.globalchef.dao.Conexion;
import com.croweloper.globalchef.dao.IChefDAO;
import com.croweloper.globalchef.model.Chef;


public class ChefDAOImpl implements IChefDAO {
	
	private Connection cx;
	
	public ChefDAOImpl() {
		cx = Conexion.conectar();
	}
	
	private int chef_id;
	private String chef_nombre;	
	private String chef_apellido;	
	private String chef_correo;
	private String chef_contraseña;	
	private String chef_foto;	
	private int chef_cantseguidores;	
	private int chef_cantrecetas;	
	private int chef_contrato;	
	private String chef_paisid;	
	private String chef_descripcion;	
	private int chef_membresia;	
	private int chef_stado;

	@Override
	public Chef buscarxID(int id) {
		Chef chef = null;
		try {
			//Cambiar Consulta por Procedure usp_BuscarUsuarioPorId(?);
			String sql = "SELECT * FROM tb_chef where chef_id = ? ;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				chef = new Chef(
						resultSet.getInt("chef_id"), 
						resultSet.getString("chef_nombre"), 
						resultSet.getString("chef_apellido"),
						resultSet.getString("chef_correo"),
						resultSet.getString("chef_contraseña"),
						resultSet.getString("chef_foto"),
						resultSet.getInt("chef_cantseguidores"),
						resultSet.getInt("chef_cantrecetas"),
						resultSet.getInt("chef_contrato"),
						resultSet.getString("chef_paisid"),
						resultSet.getString("chef_descripcion"),
						resultSet.getInt("chef_membresia"),
						resultSet.getInt("chef_stado")
						);
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return chef;
	}

	@Override
	public Chef Login(String mail, String pass) {
		Chef chef = null;
		try {
			//Cambiar Consulta por Procedure usp_BuscarUsuarioPorId(?);
			String sql = "SELECT * FROM tb_chef where chef_correo = ? and chef_contrase�a = ? ;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, mail);
			preparedStatement.setString(1, pass);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				chef = new Chef(
						resultSet.getInt("chef_id"), 
						resultSet.getString("chef_nombre"), 
						resultSet.getString("chef_apellido"),
						resultSet.getString("chef_correo"),
						resultSet.getString("chef_contrase�a"),
						resultSet.getString("chef_foto"),
						resultSet.getInt("chef_cantseguidores"),
						resultSet.getInt("chef_cantrecetas"),
						resultSet.getInt("chef_contrato"),
						resultSet.getString("chef_paisid"),
						resultSet.getString("chef_descripcion"),
						resultSet.getInt("chef_membresia"),
						resultSet.getInt("chef_stado")
						);
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return chef;
		
	}

	@Override
	public Chef registrar(Chef chefsito) {
		try {
			
			String sql = "INSERT INTO `tb_chef` (`chef_nombre`, `chef_apellido`, `chef_correo`, `chef_contraseña`, `chef_foto`, `chef_cantseguidores`, `chef_cantrecetas`, `chef_contrato`, `chef_paisid`, `chef_descripcion`, `chef_membresia`, `chef_stado`) VALUES \r\n" + 
					"(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?);";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, chefsito.getChef_nombre());
			preparedStatement.setString(2, chefsito.getChef_apellido());
			preparedStatement.setString(3, chefsito.getChef_correo());
			preparedStatement.setString(4, chefsito.getChef_contraseña());
			preparedStatement.setString(5, chefsito.getChef_foto());
			preparedStatement.setInt(6, chefsito.getChef_cantseguidores());
			preparedStatement.setInt(7, chefsito.getChef_cantrecetas());
			preparedStatement.setInt(8, chefsito.getChef_contrato());
			preparedStatement.setString(9, chefsito.getChef_paisid());
			preparedStatement.setString(10, chefsito.getChef_descripcion());
			preparedStatement.setInt(11, chefsito.getChef_membresia());
			preparedStatement.setInt(12, chefsito.getChef_stado());
			preparedStatement.executeUpdate();
			System.out.println("Hasta aqui todo Gud ");
			/*ResultSet resultSet = preparedStatement.getGeneratedKeys();
			int generatedKey = 0;
			if (resultSet.next()) {
			    generatedKey = resultSet.getInt(1);
			}
			resultSet.close();
			usuario.setUsu_id(generatedKey);*/
			preparedStatement.close();
			return chefsito;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
