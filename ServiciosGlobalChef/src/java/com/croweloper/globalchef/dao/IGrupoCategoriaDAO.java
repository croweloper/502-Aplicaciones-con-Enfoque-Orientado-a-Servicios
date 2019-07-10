package com.croweloper.globalchef.dao;

import java.util.List;

import com.croweloper.globalchef.model.GrupoCategoria;


public interface IGrupoCategoriaDAO {
	
	GrupoCategoria buscarPorId(int id);
	List<GrupoCategoria> listar();
		
	GrupoCategoria buscarPorIdCompleto(int id);
	List<GrupoCategoria> listarCompleto();

}
