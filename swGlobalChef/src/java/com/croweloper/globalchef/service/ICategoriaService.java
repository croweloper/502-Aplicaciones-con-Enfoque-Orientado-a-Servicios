package com.croweloper.globalchef.service;

import java.util.List;

import com.croweloper.globalchef.model.Categoria;



public interface ICategoriaService {
	
	Categoria buscar(int id) throws Exception;
	
	List<Categoria> listarTodos() throws Exception;
	
	Categoria buscarCompleto(int id) throws Exception;
	
	List<Categoria> listarTodosCompleto() throws Exception;

}
