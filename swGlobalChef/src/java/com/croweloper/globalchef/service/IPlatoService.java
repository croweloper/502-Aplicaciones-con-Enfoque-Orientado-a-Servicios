package com.croweloper.globalchef.service;

import java.util.List;

import com.croweloper.globalchef.model.Plato;


public interface IPlatoService {

	Plato buscar(int id) throws Exception;
	
	List<Plato> listarTodos() throws Exception;
	
	Plato buscarCompleto(int id) throws Exception;
	
	List<Plato> listarTodosCompleto() throws Exception;
	
}
