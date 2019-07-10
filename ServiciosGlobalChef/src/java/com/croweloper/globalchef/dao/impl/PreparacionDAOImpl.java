package com.croweloper.globalchef.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import com.croweloper.globalchef.dao.Conexion;
import com.croweloper.globalchef.dao.IPreparacionDAO;
import com.croweloper.globalchef.model.Preparacion;


public class PreparacionDAOImpl implements IPreparacionDAO{
	
	private Connection cx;
	
	public PreparacionDAOImpl() {
		cx = Conexion.conectar();
	}
	

	@Override
	public List<Preparacion> listaxReceta(int id) {
		List<Preparacion> preparacion = new ArrayList<>();
		try {
			//Cambiar Consulta por Procedure
			String sql = "select * from tb_preparacionreceta where prec_recetaid = ?;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				preparacion.add( new Preparacion(
						resultSet.getInt("prec_id"), 
						resultSet.getInt("prec_nropaso"),
						resultSet.getInt("prec_recetaid"),
						resultSet.getString("prec_paso")
						));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			System.out.println("No devolvi nada");
			System.out.println(e.toString());
			System.out.println(e.getMessage());			
			preparacion = new ArrayList<>();
		}
		return preparacion;
	}
	@Override
	public Preparacion guardar(Preparacion preparacion) {
		try {
			
			String sql = "INSERT INTO tb_preparacionreceta(prec_id,prec_nropaso,prec_recetaid,prec_paso) VALUES (?,?,?,?)";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, preparacion.getPrec_id());
			preparedStatement.setInt(2, preparacion.getPrec_nropaso());
			preparedStatement.setInt(3, preparacion.getPrec_recetaid());
			preparedStatement.setString(4, preparacion.getPrec_paso());
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
			return preparacion;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	

}
