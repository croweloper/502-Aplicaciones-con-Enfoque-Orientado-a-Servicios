package com.croweloper.globalchef.service;

import java.util.List;

import com.croweloper.globalchef.model.Pais;

public interface IPaisService {

	Pais buscar(String id) throws Exception;
	
	List<Pais> listarTodos() throws Exception;
	
}
