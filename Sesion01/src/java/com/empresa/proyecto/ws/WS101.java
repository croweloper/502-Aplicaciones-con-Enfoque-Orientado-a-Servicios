/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.proyecto.ws;

import com.empresa.proyecto.bean.PaisBean;
import com.empresa.proyecto.service.PaisService;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "WS101")
public class WS101 {
    
    PaisService paisService=new PaisService();

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "listarPaises")
    public List<PaisBean> listarPaises(){
        return paisService.listarPaises();
    }
    
    
    @WebMethod(operationName = "nuevoPais")
    public String nuevoPais(@WebParam(name = "nombPais") String nombPais){
        return paisService.nuevoPais(nombPais);
    }
    
}
