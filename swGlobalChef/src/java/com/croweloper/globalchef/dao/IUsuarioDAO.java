package com.croweloper.globalchef.dao;

import java.sql.SQLException;
import java.util.List;
import com.croweloper.globalchef.model.Usuario;


public interface IUsuarioDAO {
	
    Usuario guardar(Usuario usuario);
	
    Usuario actualizar(Usuario usuario);
	
    Usuario buscarPorId(int id);
	
	List<Usuario> listar();
	
	void eliminar(int id);

	void delete2(int id) throws SQLException;
	
	Usuario Login(String mail,String pass);
	
	Usuario Login(Usuario usuario);
	
	

}
