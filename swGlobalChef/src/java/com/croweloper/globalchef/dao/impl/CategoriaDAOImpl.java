package com.croweloper.globalchef.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import com.croweloper.globalchef.dao.Conexion;
import com.croweloper.globalchef.dao.ICategoriaDAO;
import com.croweloper.globalchef.model.Categoria;



public class CategoriaDAOImpl implements ICategoriaDAO{
	
	private Connection cx;
	
	public CategoriaDAOImpl() {
		cx = Conexion.conectar();
	}

	@Override
	public Categoria buscarPorId(int id) {
		Categoria cat = null;
		try {
			String sql="call usp_BuscarCategoria(?)";
			//String sql = "SELECT * FROM tb_categoria where cat_id = ? ;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				cat = new Categoria(
						resultSet.getInt("cat_id"), 
						resultSet.getString("cat_descripcion"),
						resultSet.getString("cat_urlimg"), 
						resultSet.getInt("cat_gcatid"),
						resultSet.getInt("cat_estado")
						);
				
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cat;
	}

	@Override
	public List<Categoria> listar() {
		List<Categoria> cats = new ArrayList<>();
		try {
			//Cambiar Consulta por Procedure usp_ListarPaises();
			String sql="call usp_ListarCategorias";
			//String sql = "select * from tb_categoria;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				cats.add( new Categoria(
						resultSet.getInt("cat_id"), 
						resultSet.getString("cat_descripcion"),
						resultSet.getString("cat_urlimg"), 
						resultSet.getInt("cat_gcatid"),
						resultSet.getInt("cat_estado")
						));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			System.out.println("No devolvi nada");
			System.out.println(e.toString());
			System.out.println(e.getMessage());			
			cats = new ArrayList<>();
		}
		return cats;
	}
	
	@Override
	public List<Categoria> listarPorGrupoCategoria(int id) {
		List<Categoria> cats = new ArrayList<>();
		try {
			//String sql = "SELECT * FROM tb_categoria where cat_gcatid = ? ;";
			String sql = "call usp_ListarCategoriasPorGrupo(?);";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				cats.add( new Categoria(
						resultSet.getInt("cat_id"), 
						resultSet.getString("cat_descripcion"),
						resultSet.getString("cat_urlimg"), 
						resultSet.getInt("cat_gcatid"),
						resultSet.getInt("cat_estado")
						));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			System.out.println("No devolvi nada");
			System.out.println(e.toString());
			System.out.println(e.getMessage());			
			cats = new ArrayList<>();
		}
		return cats;
	}

	@Override
	public Categoria buscarPorIdCompleto(int id) {
		Categoria cat = null;
		try {
			
			String sql = "SELECT * FROM tb_categoria where cat_id = ? ;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				cat = new Categoria(
						resultSet.getInt("cat_id"), 
						resultSet.getString("cat_descripcion"),
						resultSet.getString("cat_urlimg"), 
						resultSet.getInt("cat_gcatid"),
						resultSet.getInt("cat_estado")
						);
				cat.setListaplatos(new PlatoDAOImpl().buscarPorCategoria(resultSet.getInt("cat_id")));
				
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cat;
	}

	@Override
	public List<Categoria> listarCompleto() {
		List<Categoria> cats = new ArrayList<>();
		try {
			//Cambiar Consulta por Procedure usp_ListarPaises();
			String sql = "select * from tb_categoria;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				cats.add( new Categoria(
						resultSet.getInt("cat_id"), 
						resultSet.getString("cat_descripcion"),
						resultSet.getString("cat_urlimg"), 
						resultSet.getInt("cat_gcatid"),
						resultSet.getInt("cat_estado"),
						new PlatoDAOImpl().buscarPorCategoria(resultSet.getInt("cat_id"))
						));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			System.out.println("No devolvi nada");
			System.out.println(e.toString());
			System.out.println(e.getMessage());			
			cats = new ArrayList<>();
		}
		return cats;
	}
	

}
