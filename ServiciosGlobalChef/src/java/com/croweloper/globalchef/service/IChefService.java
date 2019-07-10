package com.croweloper.globalchef.service;

import java.util.List;

import com.croweloper.globalchef.model.Chef;



public interface IChefService {
	
		
	Chef buscarPorId(int id) throws Exception;
	
	Chef registrar(Chef chefsito) throws Exception;
	
	Chef login(String mail,String pass) throws Exception;

}
