/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.service;

import com.empresa.proyecto.bean.PaisBean;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crowe
 */
public class PaisService {
    
    List<PaisBean> listaPaises=new ArrayList<PaisBean>();
    
    public List<PaisBean> listarPaises(){
        return listaPaises;
    }
    
    public String nuevoPais(String nombPais){
        PaisBean p=new PaisBean();
        p.setIdPais(listaPaises.size()+1);
        p.setNombPais(nombPais);
        listaPaises.add(p);
        return "Se guardo el pais correctamente";
    }
    
}
