package com.croweloper.globalchef.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import com.croweloper.globalchef.dao.Conexion;
import com.croweloper.globalchef.dao.IPaisDAO;
import com.croweloper.globalchef.model.Pais;


public class PaisDAOImpl implements IPaisDAO {
	
	private Connection cx;
	
	public PaisDAOImpl() {
		cx = Conexion.conectar();
	}

	@Override
	public Pais buscarPorId(String id) {
		Pais pais = null;
		try {
			//Cambiar Consulta por Procedure usp_BuscarPaisPorId(?);
			String sql="call usp_BuscarPaisPorId(?)";
			//String sql = "SELECT * FROM tb_pais where pais_codigo = ? ;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				pais = new Pais(
						resultSet.getString("pais_codigo"), 
						resultSet.getString("pais_nombre"), 
						resultSet.getInt("pais_estado")
						);
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pais;
	}

	@Override
	public List<Pais> listar() {
		List<Pais> paises = new ArrayList<>();
		try {
			//Cambiar Consulta por Procedure usp_ListarPaises();
			String sql="call usp_ListarPaises";
			//String sql = "select * from tb_pais;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				paises.add( new Pais(
						resultSet.getString("pais_codigo"), 
						resultSet.getString("pais_nombre"), 
						resultSet.getInt("pais_estado")
						));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			System.out.println("No devolvi nada");
			System.out.println(e.toString());
			System.out.println(e.getMessage());			
			paises = new ArrayList<>();
		}
		return paises;
	}

}
