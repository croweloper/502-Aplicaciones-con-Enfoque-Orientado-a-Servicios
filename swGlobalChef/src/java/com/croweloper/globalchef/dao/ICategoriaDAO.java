package com.croweloper.globalchef.dao;

import java.util.List;
import com.croweloper.globalchef.model.Categoria;



public interface ICategoriaDAO {
	
	Categoria buscarPorId(int id);
	List<Categoria> listar();
	
	List<Categoria> listarPorGrupoCategoria(int id);
	
	Categoria buscarPorIdCompleto(int id);
	List<Categoria> listarCompleto();

}
