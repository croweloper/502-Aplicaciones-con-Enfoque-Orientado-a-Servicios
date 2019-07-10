package com.croweloper.globalchef.service;

import java.util.List;

import com.croweloper.globalchef.model.Preparacion;

public interface IPreparacionService {
	
	List<Preparacion> listaxReceta(int id) throws Exception;
	
	Preparacion guardar(Preparacion preparacion) throws Exception;

}
