package com.croweloper.globalchef.dao;

import java.util.List;



import com.croweloper.globalchef.model.Pais;


public interface IPaisDAO{

	Pais buscarPorId(String id);
	List<Pais> listar();

}
