/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croweloper.globalchef.wsdl;

import com.croweloper.globalchef.dao.impl.GrupoCategoriaDAOImpl;
import com.croweloper.globalchef.model.GrupoCategoria;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "swGrupoCategorias")
public class swGrupoCategorias {

    @WebMethod(operationName = "ListarGrupoCategoria")
    public List<GrupoCategoria> ListarGrupoCategoria() {
        return new GrupoCategoriaDAOImpl().listar();
    }

    @WebMethod(operationName = "ObtenerGrupoCategoria")
    public GrupoCategoria ObtenerGrupoCategoria(@WebParam(name = "id") int id) {
        return new GrupoCategoriaDAOImpl().buscarPorId(id);
    }
    
    @WebMethod(operationName = "ListarGrupoCategoriaCompleto")
    public List<GrupoCategoria> ListarGrupoCategoriaCompleto() {
        return new GrupoCategoriaDAOImpl().listarCompleto();
    }

    @WebMethod(operationName = "ObtenerGrupoCategoriaCompleto")
    public GrupoCategoria ObtenerGrupoCategoriaCompleto(@WebParam(name = "id") int id) {
        return new GrupoCategoriaDAOImpl().buscarPorIdCompleto(id);
    }
}
