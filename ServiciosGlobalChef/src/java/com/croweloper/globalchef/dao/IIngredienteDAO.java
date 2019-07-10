package com.croweloper.globalchef.dao;

import java.util.List;



import com.croweloper.globalchef.model.Ingredientes;


public interface IIngredienteDAO {
	
	List<Ingredientes> listaxReceta(int id);
	
	Ingredientes guardar(Ingredientes ingrediente);

}
