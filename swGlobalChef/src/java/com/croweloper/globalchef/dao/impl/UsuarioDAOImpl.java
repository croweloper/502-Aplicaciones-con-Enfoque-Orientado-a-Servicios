package com.croweloper.globalchef.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.croweloper.globalchef.dao.Conexion;
import com.croweloper.globalchef.dao.IUsuarioDAO;
import com.croweloper.globalchef.model.Usuario;


public class UsuarioDAOImpl implements IUsuarioDAO{
	
	private Connection cx;
	
	public UsuarioDAOImpl() {
		cx = Conexion.conectar();
	}

	@Override
	public Usuario guardar(Usuario usuario) {
		try {
			//Cambiar Consulta por Procedure usp_RegistrarUsuario(?,?,?,?,?,?,?,?,?)
			String sql="call usp_RegistrarUsuario(?,?,?,?,?,?,?)";
			//String sql = "INSERT INTO tb_usuario(usu_nombre,usu_apellido,usu_correo,usu_pass,usu_foto,usu_telefono,usu_paisid,usu_documento,usu_estado) VALUES (?,?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, usuario.getUsu_nombre());
			preparedStatement.setString(2, usuario.getUsu_apellido());
			preparedStatement.setString(3, usuario.getUsu_correo());
			preparedStatement.setString(4, usuario.getUsu_pass());
			preparedStatement.setString(5, usuario.getUsu_telefono());
			preparedStatement.setString(6, usuario.getUsu_paisid());
			preparedStatement.setString(7, usuario.getUsu_documento());
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
			return usuario;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public Usuario actualizar(Usuario usuario) {
		try {
			//Cambiar Consulta por Procedure usp_ActualizarUsuario(?,?,?,?,?,?,?,?,?,?)
			String sql = "UPDATE tb_usuario SET nombres = ? , email = ? WHERE id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, usuario.getUsu_id());
			preparedStatement.setString(2, usuario.getUsu_nombre());
			preparedStatement.setString(3, usuario.getUsu_apellido());
			preparedStatement.setString(4, usuario.getUsu_correo());
			preparedStatement.setString(5, usuario.getUsu_pass());
			preparedStatement.setString(6, usuario.getUsu_foto());
			preparedStatement.setString(7, usuario.getUsu_telefono());
			preparedStatement.setString(8, usuario.getUsu_paisid());
			preparedStatement.setString(9, usuario.getUsu_documento());
			preparedStatement.setInt(10, usuario.getUsu_estado());
			preparedStatement.executeUpdate();
			preparedStatement.close();
			return usuario;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public Usuario buscarPorId(int id) {
		Usuario usuario = null;
		try {
			//Cambiar Consulta por Procedure usp_BuscarUsuarioPorId(?);
			
			String sql = "call usp_BuscarUsuarioPorId(?);";
			//String sql = "SELECT * FROM tb_usuario where usu_id = ? ;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				usuario = new Usuario(
						resultSet.getInt("usu_id"), 
						resultSet.getString("usu_nombre"), 
						resultSet.getString("usu_apellido"),
						resultSet.getString("usu_correo"),
						resultSet.getString("usu_pass"),
						resultSet.getString("usu_foto"),
						resultSet.getString("usu_telefono"),
						resultSet.getString("usu_paisid"),
						resultSet.getString("usu_documento"),
						resultSet.getInt("usu_estado")
						);
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuario;
	}

	@Override
	public List<Usuario> listar() {
		List<Usuario> usuarios = new ArrayList<>();
		try {
			//Cambiar Consulta por Procedure
			String sql = "call usp_ListarUsuarios";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				usuarios.add( new Usuario(
						resultSet.getInt("usu_id"), 
						resultSet.getString("usu_nombre"), 
						resultSet.getString("usu_apellido"),
						resultSet.getString("usu_correo"),
						resultSet.getString("usu_pass"),
						resultSet.getString("usu_foto"),
						resultSet.getString("usu_telefono"),
						resultSet.getString("usu_paisid"),
						resultSet.getString("usu_documento"),
						resultSet.getInt("usu_estado")));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			System.out.println("No devolvi nada");
			System.out.println(e.toString());
			System.out.println(e.getMessage());			
			usuarios = new ArrayList<>();
		}
		return usuarios;
	}

	@Override
	public void eliminar(int id) {
		try {
			
			//Cambiar Consulta por Procedure
			String sql = "DELETE FROM tb_usuario where usu_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete2(int id) throws SQLException {
		PreparedStatement preparedStatementDelete = null;
		PreparedStatement preparedStatementupdate = null;
		try {
			cx.setAutoCommit(false); //Inicio del bloque transaccionnal
			//Cambiar Consulta por Procedure
			String sql_delete = "DELETE FROM PERSONA WHERE ID = ?";
			String sql_update = "UPDATE PERSONA_ SET nombres = ? , email = ? WHERE id = ?";
			
			preparedStatementDelete = cx.prepareStatement(sql_delete);
			preparedStatementDelete.setInt(1, id);
			preparedStatementDelete.executeUpdate();
			
			preparedStatementupdate = cx.prepareStatement(sql_update);
			preparedStatementupdate.setString(1, null);
			preparedStatementupdate.setString(2, null);
			preparedStatementupdate.setInt(3, id);
			preparedStatementupdate.executeUpdate();
			
			cx.commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			cx.rollback();
		} finally{
			if(preparedStatementDelete != null) {
				preparedStatementDelete.close();
			}
			if(preparedStatementupdate != null) {
				preparedStatementupdate.close();
			}
			
		}
	}

	@Override
	public Usuario Login(String mail, String pass) {
		Usuario usuario = null;
		try {
			//Cambiar Consulta por Procedure usp_LoginUsuario(?);
			String sql = "call usp_LoginUsuario(?,?);";
			//String sql = "SELECT * FROM tb_usuario where usu_correo = ? and usu_pass = ? ;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, mail);
			preparedStatement.setString(2, pass);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				usuario = new Usuario(
						resultSet.getInt("usu_id"), 
						resultSet.getString("usu_nombre"), 
						resultSet.getString("usu_apellido"),
						resultSet.getString("usu_correo"),
						resultSet.getString("usu_pass"),
						resultSet.getString("usu_foto"),
						resultSet.getString("usu_telefono"),
						resultSet.getString("usu_paisid"),
						resultSet.getString("usu_documento"),
						resultSet.getInt("usu_estado")
						);
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuario;
	}
	
	@Override
	public Usuario Login(Usuario usu) {
		Usuario usuario = null;
		try {
			String sql = "call usp_LoginUsuario(?,?);";
			//String sql = "SELECT * FROM tb_usuario where usu_correo = ? and usu_pass = ? ;";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, usu.getUsu_correo());
			preparedStatement.setString(2, usu.getUsu_pass());
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				usuario = new Usuario(
						resultSet.getInt("usu_id"), 
						resultSet.getString("usu_nombre"), 
						resultSet.getString("usu_apellido"),
						resultSet.getString("usu_correo"),
						resultSet.getString("usu_pass"),
						resultSet.getString("usu_foto"),
						resultSet.getString("usu_telefono"),
						resultSet.getString("usu_paisid"),
						resultSet.getString("usu_documento"),
						resultSet.getInt("usu_estado")
						);
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuario;
	}

}
