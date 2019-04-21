/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.services;

import com.empresa.proyecto.bean.ClienteBean;
import com.empresa.proyecto.dao.ClienteDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crowe
 */
public class ClienteService implements ClienteDao{

    List<ClienteBean> listaClientes=new ArrayList<ClienteBean>();
    
    @Override
    public List<ClienteBean> ListarClientes() {
        return listaClientes;
    }

    @Override
    public String RegistrarCliente(String  nombre,String apellido,String saldo) {
        
        
        ClienteBean c=new ClienteBean(listaClientes.size()+1,nombre,apellido,Double.parseDouble(saldo));
                
        listaClientes.add(c);
        return "Se guardo el Cliente correctamente";
        
    }
    
}
