package com.croweloper.globalchef.service;

import java.util.List;

import com.croweloper.globalchef.model.Ingredientes;



public interface IIngredientesService {
	
 	Ingredientes buscar(Ingredientes ingrediente) throws Exception;
	
	List<Ingredientes> listarxReceta(int id) throws Exception;	

}
