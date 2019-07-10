package com.croweloper.globalchef.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import com.croweloper.globalchef.dao.Conexion;
import com.croweloper.globalchef.dao.IGrupoCategoriaDAO;
import com.croweloper.globalchef.model.GrupoCategoria;


public class GrupoCategoriaDAOImpl implements IGrupoCategoriaDAO {
	
	private Connection cx;
	
	public GrupoCategoriaDAOImpl() {
		cx = Conexion.conectar();
	}
	
	
	@Override
	public GrupoCategoria buscarPorId(int id) {
		GrupoCategoria gcat = null;
		try {
			String sql="call usp_BuscarGrupoCategoria(?);";	
			//String sql = "SELECT * FROM tb_grupocategoria where gcat_id = ? ;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				gcat = new GrupoCategoria(
						resultSet.getInt("gcat_id"), 
						resultSet.getString("gcat_descripcion"),
						resultSet.getString("gcat_img"), 
						resultSet.getInt("gcat_estado") 
						);
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gcat;
	}

	@Override
	public List<GrupoCategoria> listar() {
		List<GrupoCategoria> gcats = new ArrayList<>();
		try {
			//Cambiar Consulta por Procedure usp_ListarPaises();
			String sql="call usp_ListarGrupoCategorias();";
			//String sql = "select * from tb_grupocategoria;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				gcats.add( new GrupoCategoria(
						resultSet.getInt("gcat_id"), 
						resultSet.getString("gcat_descripcion"),
						resultSet.getString("gcat_img"), 
						resultSet.getInt("gcat_estado")
						));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			System.out.println("No devolvi nada");
			System.out.println(e.toString());
			System.out.println(e.getMessage());			
			gcats = new ArrayList<>();
		}
		return gcats;
	}


	@Override
	public GrupoCategoria buscarPorIdCompleto(int id) {
		GrupoCategoria gcat = null;
		try {
			//Cambiar Consulta por Procedure usp_BuscarPaisPorId(?);
			String sql = "SELECT * FROM tb_grupocategoria where gcat_id = ? ;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				gcat = new GrupoCategoria(
						resultSet.getInt("gcat_id"), 
						resultSet.getString("gcat_descripcion"),
						resultSet.getString("gcat_img"), 
						resultSet.getInt("gcat_estado") 
						);
				gcat.setListacategoria(new CategoriaDAOImpl().listarPorGrupoCategoria(id));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gcat;
	}


	@Override
	public List<GrupoCategoria> listarCompleto() {
		List<GrupoCategoria> gcats = new ArrayList<>();
		try {
			//Cambiar Consulta por Procedure usp_ListarPaises();
			String sql = "select * from tb_grupocategoria;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				gcats.add( new GrupoCategoria(
						resultSet.getInt("gcat_id"), 
						resultSet.getString("gcat_descripcion"),
						resultSet.getString("gcat_img"), 
						resultSet.getInt("gcat_estado"),
						new CategoriaDAOImpl().listarPorGrupoCategoria(resultSet.getInt("gcat_id"))
						));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			System.out.println("No devolvi nada");
			System.out.println(e.toString());
			System.out.println(e.getMessage());			
			gcats = new ArrayList<>();
		}
		return gcats;
	}

}
