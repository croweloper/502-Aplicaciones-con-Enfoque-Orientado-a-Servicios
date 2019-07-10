package com.croweloper.globalchef.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.croweloper.globalchef.dao.Conexion;
import com.croweloper.globalchef.dao.IIngredienteDAO;
import com.croweloper.globalchef.model.Ingredientes;



public class IngredientesDAOImpl implements IIngredienteDAO{
	
	private Connection cx;
	
	public IngredientesDAOImpl() {
		cx = Conexion.conectar();
	}

	@Override
	public List<Ingredientes> listaxReceta(int id) {
		List<Ingredientes> ingredientes = new ArrayList<>();
		try {
			//Cambiar Consulta por Procedure
			String sql = "select * from tb_ingredientes where ing_recetaid = ? ;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				ingredientes.add( new Ingredientes(
						resultSet.getInt("ing_id"), 
						resultSet.getInt("ing_item"),
						resultSet.getInt("ing_recetaid"),
						resultSet.getString("ing_descripcion")
						));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			System.out.println("No devolvi nada");
			System.out.println(e.toString());
			System.out.println(e.getMessage());			
			ingredientes = new ArrayList<>();
		}
		return ingredientes;
	}
	


	@Override
	public Ingredientes guardar(Ingredientes ingrediente) {
		try {
		
			String sql = "INSERT INTO tb_ingredientes(usu_nombre,usu_apellido,usu_correo,usu_pass) VALUES (?,?,?,?)";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, ingrediente.getIng_id());
			preparedStatement.setInt(2, ingrediente.getIng_item());
			preparedStatement.setInt(3, ingrediente.getIng_recetaid());
			preparedStatement.setString(4, ingrediente.getIng_descripcion());
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
			return ingrediente;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
