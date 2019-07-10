package com.croweloper.globalchef.dao;

import java.util.List;



import com.croweloper.globalchef.model.FavoritosReceta;

public interface IFavoritosDAO {
	
	List<FavoritosReceta> listar(int id);
	
	List<FavoritosReceta> listarCompleto(int id);

}
