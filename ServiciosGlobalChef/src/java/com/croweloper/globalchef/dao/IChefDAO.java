package com.croweloper.globalchef.dao;



import com.croweloper.globalchef.model.Chef;


public interface IChefDAO {
	
	Chef buscarxID(int id);
	
	Chef registrar(Chef chefsito);
	
	Chef Login(String mail,String pass);
	
	
}
