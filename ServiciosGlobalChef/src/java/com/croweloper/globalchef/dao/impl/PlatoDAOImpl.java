package com.croweloper.globalchef.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import com.croweloper.globalchef.dao.Conexion;
import com.croweloper.globalchef.dao.IPlatoDAO;
import com.croweloper.globalchef.model.Plato;



public class PlatoDAOImpl implements IPlatoDAO {
	
	private Connection cx;
	
	public PlatoDAOImpl() {
		cx = Conexion.conectar();
	}
	
	@Override
	public Plato buscarPorId(int id) {
		Plato pla = null;
		try {
			String sql="call usp_BuscarPlato(?);";
			//String sql = "SELECT * FROM tb_plato where pla_id = ? ;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				pla = new Plato(
						resultSet.getInt("pla_id"), 
						resultSet.getString("pla_titulo"),
						resultSet.getInt("pla_categoria"),
						resultSet.getString("pla_paisid"),
						resultSet.getInt("pla_cantrecetas"),
						resultSet.getInt("pla_estado")
						);
				
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pla;
	}

	@Override
	public List<Plato> listar() {
		List<Plato> plato = new ArrayList<>();
		try {
			String sql="call usp_ListarPlatos();";
			//String sql = "select * from tb_plato;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				plato.add(new Plato(
						resultSet.getInt("pla_id"), 
						resultSet.getString("pla_titulo"),
						resultSet.getInt("pla_categoria"),
						resultSet.getString("pla_paisid"),
						resultSet.getInt("pla_cantrecetas"),
						resultSet.getInt("pla_estado")
						));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			System.out.println("No devolvi nada");
			System.out.println(e.toString());
			System.out.println(e.getMessage());			
			plato = new ArrayList<>();
		}
		return plato;
	}

	@Override
	public Plato buscarPorIdCompleto(int id) {
		Plato pla = null;
		try {
			
			String sql = "SELECT * FROM tb_plato where pla_id = ? ;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				pla = new Plato(
						resultSet.getInt("pla_id"), 
						resultSet.getString("pla_titulo"),
						resultSet.getInt("pla_categoria"),
						resultSet.getString("pla_paisid"),
						resultSet.getInt("pla_cantrecetas"),
						resultSet.getInt("pla_estado")					
						);
				pla.setListarecetas(new RecetaDAOImpl().listarPorPlato(resultSet.getInt("pla_id")));
				
				
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pla;
	}

	@Override
	public List<Plato> listarCompleto() {
		List<Plato> plato = new ArrayList<>();
		try {
			
			String sql = "select * from tb_plato;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				plato.add(new Plato(
						resultSet.getInt("pla_id"), 
						resultSet.getString("pla_titulo"),
						resultSet.getInt("pla_categoria"),
						resultSet.getString("pla_paisid"),
						resultSet.getInt("pla_cantrecetas"),
						resultSet.getInt("pla_estado"),
						new RecetaDAOImpl().listarPorPlato(resultSet.getInt("pla_id"))
						));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			System.out.println("No devolvi nada");
			System.out.println(e.toString());
			System.out.println(e.getMessage());			
			plato = new ArrayList<>();
		}
		return plato;
	}

	@Override
	public List<Plato> buscarPorCategoria(int id) {
		List<Plato> plato = new ArrayList<>();
		try {
			
			String sql = "select * from tb_plato where pla_categoria = ?;";
			
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				plato.add(new Plato(
						resultSet.getInt("pla_id"), 
						resultSet.getString("pla_titulo"),
						resultSet.getInt("pla_categoria"),
						resultSet.getString("pla_paisid"),
						resultSet.getInt("pla_cantrecetas"),
						resultSet.getInt("pla_estado")						
						));
				
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			System.out.println("No devolvi nada");
			System.out.println(e.toString());
			System.out.println(e.getMessage());			
			plato = new ArrayList<>();
		}
		return plato;
	}

}
