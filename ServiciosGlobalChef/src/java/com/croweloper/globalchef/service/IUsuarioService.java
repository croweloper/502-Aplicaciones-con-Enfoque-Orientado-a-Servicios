package com.croweloper.globalchef.service;

import java.util.List;

import com.croweloper.globalchef.model.Usuario;

public interface IUsuarioService {
	
	Usuario registrar(Usuario usuario) throws Exception;
	
	Usuario actualizar(Usuario usuario) throws Exception;
	
	Usuario buscar(int id) throws Exception;
	
	List<Usuario> listarTodos() throws Exception;
	
	Usuario login(Usuario usuario) throws Exception;
	
	Usuario login(String correo,String pass) throws Exception;
	
	void eliminar(int id) ;
	
	void eliminar2(int id);

}
