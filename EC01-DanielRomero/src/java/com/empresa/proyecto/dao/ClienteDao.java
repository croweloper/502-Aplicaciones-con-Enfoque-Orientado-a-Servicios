/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.dao;

import com.empresa.proyecto.bean.ClienteBean;
import java.util.List;

/**
 *
 * @author crowe
 */
public interface ClienteDao {
    
    List<ClienteBean> ListarClientes();
    String RegistrarCliente(String nombre,String apellido,String saldo);
    
}
