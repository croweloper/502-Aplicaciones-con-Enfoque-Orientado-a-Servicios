package com.croweloper.globalchef.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.croweloper.globalchef.dao.Conexion;
import com.croweloper.globalchef.dao.IRecetaDAO;
import com.croweloper.globalchef.model.Receta;


public class RecetaDAOImpl implements IRecetaDAO{
	
	private Connection cx;
	
	public RecetaDAOImpl() {
		cx = Conexion.conectar();
	}

	@Override
	public Receta guardar(Receta receta) {
		try {
			

			String sql = "INSERT INTO `tb_receta` (`rec_descripcion`, `rec_platoid`, `rec_tiempoprep`, `rec_paisid`, `rec_chefid`, `rec_votos`, `rec_dificultad`, `rec_feccreacion`, `rec_cantporcion`, `rec_consejo`, `rec_estado`) VALUES	(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, receta.getRec_descripcion());
			preparedStatement.setInt(2, receta.getRec_platoid());
			preparedStatement.setString(3, receta.getRec_tiempoprep());
			preparedStatement.setString(4, receta.getRec_paisid());
			preparedStatement.setInt(5, receta.getRec_chefid());
			preparedStatement.setInt(6, receta.getRec_votos());
			preparedStatement.setString(7, receta.getRec_dificultad());
			preparedStatement.setDate(8, receta.getRec_feccreacion());
			preparedStatement.setInt(9, receta.getRec_cantporcion());
			preparedStatement.setString(10, receta.getRec_consejo());
			preparedStatement.setInt(11, receta.getRec_estado());
			
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
			return receta;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public Receta actualizar(Receta receta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Receta buscarPorId(int id) {
		Receta receta = null;
		try {
			//Cambiar Consulta por Procedure usp_BuscarUsuarioPorId(?);
			String sql = "SELECT * FROM tb_receta where rec_id = ? ;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				receta = new Receta(
						resultSet.getInt("rec_id"), 
						resultSet.getString("rec_descripcion"), 
						resultSet.getInt("rec_platoid"),
						resultSet.getString("rec_tiempoprep"),
						resultSet.getString("rec_paisid"),
						resultSet.getInt("rec_chefid"),
						resultSet.getInt("rec_votos"),
						resultSet.getString("rec_dificultad"),
						null,//resultSet.getDate("rec_feccreacion")
						resultSet.getInt("rec_cantporcion"),
						resultSet.getString("rec_consejo"),
						resultSet.getInt("rec_estado")
						);
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return receta;
	}

	@Override
	public List<Receta> listar() {
		List<Receta> recetas = new ArrayList<>();
		try {
			//Cambiar Consulta por Procedure
			String sql = "select * from tb_receta;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				recetas.add( new Receta(
						resultSet.getInt("rec_id"), 
						resultSet.getString("rec_descripcion"), 
						resultSet.getInt("rec_platoid"),
						resultSet.getString("rec_tiempoprep"),
						resultSet.getString("rec_paisid"),
						resultSet.getInt("rec_chefid"),
						resultSet.getInt("rec_votos"),
						resultSet.getString("rec_dificultad"),
						null,
						resultSet.getInt("rec_cantporcion"),
						resultSet.getString("rec_consejo"),
						resultSet.getInt("rec_estado")
						));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			System.out.println("No devolvi nada");
			System.out.println(e.toString());
			System.out.println(e.getMessage());			
			recetas = new ArrayList<>();
		}
		return recetas;
	}

	@Override
	public void eliminar(int id) {
		try {
			
			//Cambiar Consulta por Procedure
			String sql = "DELETE FROM tb_receta where rec_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Receta buscarPorIdCompleto(int id) {
		Receta receta = null;
		try {
			//Cambiar Consulta por Procedure usp_BuscarUsuarioPorId(?);
			String sql = "SELECT * FROM tb_receta where rec_id = ? ;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				receta = new Receta(
						resultSet.getInt("rec_id"), 
						resultSet.getString("rec_descripcion"), 
						resultSet.getInt("rec_platoid"),
						resultSet.getString("rec_tiempoprep"),
						resultSet.getString("rec_paisid"),
						resultSet.getInt("rec_chefid"),
						resultSet.getInt("rec_votos"),
						resultSet.getString("rec_dificultad"),
						null,//resultSet.getDate("rec_feccreacion")
						resultSet.getInt("rec_cantporcion"),
						resultSet.getString("rec_consejo"),
						resultSet.getInt("rec_estado")
						);
				receta.setIngredientes(new IngredientesDAOImpl().listaxReceta(id));
				receta.setPreparacion(new PreparacionDAOImpl().listaxReceta(id));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return receta;
	}

	@Override
	public List<Receta> listarCompleto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Receta> listarPorPlato(int id) {
		List<Receta> recetas = new ArrayList<>();
		try {
			//Cambiar Consulta por Procedure
			String sql = "select * from tb_receta where rec_platoid = ? ;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				recetas.add( new Receta(
						resultSet.getInt("rec_id"), 
						resultSet.getString("rec_descripcion"), 
						resultSet.getInt("rec_platoid"),
						resultSet.getString("rec_tiempoprep"),
						resultSet.getString("rec_paisid"),
						resultSet.getInt("rec_chefid"),
						resultSet.getInt("rec_votos"),
						resultSet.getString("rec_dificultad"),
						null,
						resultSet.getInt("rec_cantporcion"),
						resultSet.getString("rec_consejo"),
						resultSet.getInt("rec_estado")
						));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			System.out.println("No devolvi nada");
			System.out.println(e.toString());
			System.out.println(e.getMessage());			
			recetas = new ArrayList<>();
		}
		return recetas;
	}
	
	

}
