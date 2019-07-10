package com.croweloper.globalchef.service;

import java.util.List;

import com.croweloper.globalchef.model.Receta;

public interface IRecetaService {
	
    Receta registrar(Receta receta) throws Exception;

    Receta actualizar(Receta receta) throws Exception;

    Receta buscar(int id) throws Exception;

    List<Receta> listarTodos() throws Exception;

    void eliminar(int id) ;

    Receta buscarCompleto(int id) throws Exception;

    List<Receta> listarTodosCompleto() throws Exception;

}
