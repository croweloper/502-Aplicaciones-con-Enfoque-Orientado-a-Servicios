/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author crowe
 */
public class daoCine {
    
    bd.clsBD clsBD=new bd.clsBD("cinestar");

    public String[][] getVercines() {
        clsBD.Sentencia("call usp_getVerCines;");
        return clsBD.getRegistros();
    }
    
}
