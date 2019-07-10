/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croweloper.globalchef.wsdl;

import com.croweloper.globalchef.dao.impl.IngredientesDAOImpl;
import com.croweloper.globalchef.model.Ingredientes;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "swIngredientes")
public class swIngredientes {

    @WebMethod(operationName = "ListarPorReceta")
    public List<Ingredientes> ListarPorReceta(@WebParam(name = "id") int id) {
        return new IngredientesDAOImpl().listaxReceta(id);
    }
    
    @WebMethod(operationName = "RegistrarIngrediente")
    public Ingredientes RegistrarIngrediente(@WebParam(name = "ingrediente") Ingredientes ingrediente) {
        return new IngredientesDAOImpl().guardar(ingrediente);
    }
    
	
}
