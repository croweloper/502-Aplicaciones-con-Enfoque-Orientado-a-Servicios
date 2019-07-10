package com.croweloper.globalchef.dao;

import java.util.List;
import com.croweloper.globalchef.model.Preparacion;


public interface IPreparacionDAO {
	
	List<Preparacion> listaxReceta(int id);
	
	Preparacion guardar(Preparacion preparacion);

}
