/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.platanitos.dao;

import com.platanitos.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author crowe
 */
public class ClienteDAO {

    private Connection cx;

    public ClienteDAO() {
        cx = Conexion.conectar();
    }

    public Cliente Login(String mail, String pass) {
        Cliente cliente = null;
        try {
            //Cambiar Consulta por Procedure usp_LoginUsuario(?);
            String sql = "call usp_ClienteLogin(?,?);";
            //String sql = "SELECT * FROM tb_usuario where usu_correo = ? and usu_pass = ? ;";
            PreparedStatement preparedStatement = cx.prepareStatement(sql);
            preparedStatement.setString(1, mail);
            preparedStatement.setString(2, pass);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                cliente = new Cliente(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7));
            }
            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cliente;
    }

    public Cliente guardar(Cliente cliente) {
        try {

            String sql = "call usp_InsertCliente(?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement = cx.prepareStatement(sql);
            preparedStatement.setInt(1, 0);
            preparedStatement.setString(2, cliente.getDNI());
            preparedStatement.setString(3, cliente.getNombres());
            preparedStatement.setString(4, cliente.getApellidos());
            preparedStatement.setString(5, cliente.getGenero());
            preparedStatement.setString(6, cliente.getCorreo());
            preparedStatement.setString(7, cliente.getContraseña());
            preparedStatement.setInt(8, 0);
            preparedStatement.executeUpdate();

            preparedStatement.close();
            return cliente;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    //usp_ClienteDniCorreo
    
    public int validarDNIandMail(String dni, String correo) {
        int existe = 0;
        try {
            
            String sql = "call usp_ClienteDniCorreo(?,?);";
            
            PreparedStatement preparedStatement = cx.prepareStatement(sql);
            preparedStatement.setString(1, dni);
            preparedStatement.setString(2, correo);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                existe = resultSet.getInt(1);
            }
            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return existe;
    }

}
