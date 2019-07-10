package com.croweloper.globalchef.dao;

import java.util.List;



import com.croweloper.globalchef.model.Receta;


public interface IRecetaDAO {
	
	Receta guardar(Receta receta);
	
	Receta actualizar(Receta receta);
	
	Receta buscarPorId(int id);
	
	List<Receta> listar();
	
	void eliminar(int id);
	
	Receta buscarPorIdCompleto(int id);
	
	List<Receta> listarCompleto();
	
	List<Receta> listarPorPlato(int id);
        
        List<Receta> listarPorChef(int id) ;
	
	
}
