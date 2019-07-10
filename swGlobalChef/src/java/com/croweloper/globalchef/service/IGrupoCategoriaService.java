package com.croweloper.globalchef.service;

import java.util.List;

import com.croweloper.globalchef.model.GrupoCategoria;


public interface IGrupoCategoriaService {
	
	GrupoCategoria buscar(int id) throws Exception;
	
	List<GrupoCategoria> listarTodos() throws Exception;	
	
	GrupoCategoria buscarCompleto(int id) throws Exception;
	
	List<GrupoCategoria> listarTodosCompleto() throws Exception;	

}
