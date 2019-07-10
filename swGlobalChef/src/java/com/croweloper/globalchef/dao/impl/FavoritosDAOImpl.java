package com.croweloper.globalchef.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.croweloper.globalchef.dao.Conexion;
import com.croweloper.globalchef.dao.IFavoritosDAO;
import com.croweloper.globalchef.model.FavoritosReceta;


public class FavoritosDAOImpl implements IFavoritosDAO {
	
	private Connection cx;
	
	public FavoritosDAOImpl() {
		cx = Conexion.conectar();
	}
		
	@Override
	public List<FavoritosReceta> listar(int id) {
		List<FavoritosReceta> favoritos = new ArrayList<>();
		try {

			String sql = "select * from tb_favoritosreceta where favr_usuarioid = ? ;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				favoritos.add( new FavoritosReceta(
						resultSet.getInt("favr_id"), 
						resultSet.getInt("favr_item"), 
						resultSet.getInt("favr_usuarioid"),
						resultSet.getInt("favr_recetaid")
						));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			System.out.println("No devolvi nada");
			System.out.println(e.toString());
			System.out.println(e.getMessage());			
			favoritos = new ArrayList<>();
		}
		return favoritos;
	}

	@Override
	public List<FavoritosReceta> listarCompleto(int id) {
		List<FavoritosReceta> favoritos = new ArrayList<>();
		try {

			String sql = "select * from tb_favoritosreceta where favr_usuarioid = ? ;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				favoritos.add( new FavoritosReceta(
						resultSet.getInt("favr_id"), 
						resultSet.getInt("favr_item"), 
						resultSet.getInt("favr_usuarioid"),
						resultSet.getInt("favr_recetaid"),
						new RecetaDAOImpl().buscarPorId(resultSet.getInt("favr_recetaid"))
						));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			System.out.println("No devolvi nada");
			System.out.println(e.toString());
			System.out.println(e.getMessage());			
			favoritos = new ArrayList<>();
		}
		return favoritos;
	}

}
