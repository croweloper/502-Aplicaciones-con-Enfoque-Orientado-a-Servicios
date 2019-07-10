package com.croweloper.globalchef.dao;

import java.util.List;

import com.croweloper.globalchef.model.Plato;


public interface IPlatoDAO {
	
	Plato buscarPorId(int id);
	List<Plato> listar();
	
	List<Plato> buscarPorCategoria(int id);
	
	Plato buscarPorIdCompleto(int id);
	List<Plato> listarCompleto();

}
