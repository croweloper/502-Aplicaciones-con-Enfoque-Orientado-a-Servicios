package com.croweloper.globalchef.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.croweloper.globalchef.dao.Conexion;
import com.croweloper.globalchef.dao.IChefDAO;
import com.croweloper.globalchef.model.Chef;

public class ChefDAOImpl implements IChefDAO {

    private Connection cx;

    public ChefDAOImpl() {
        cx = Conexion.conectar();
    }

    @Override
    public Chef buscarxID(int id) {
        Chef chef = null;
        try {
            //Cambiar Consulta por Procedure usp_BuscarUsuarioPorId(?);
            String sql = "SELECT * FROM tb_chef where chef_id = ? ;";
            PreparedStatement preparedStatement = cx.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                chef = new Chef(
                        resultSet.getInt("chef_id"),
                        resultSet.getString("chef_nombre"),
                        resultSet.getString("chef_apellido"),
                        resultSet.getString("chef_correo"),
                        resultSet.getString("chef_contraseña"),
                        resultSet.getString("chef_foto"),
                        resultSet.getInt("chef_cantseguidores"),
                        resultSet.getInt("chef_cantrecetas"),
                        resultSet.getInt("chef_contrato"),
                        resultSet.getString("chef_paisid"),
                        resultSet.getString("chef_descripcion"),
                        resultSet.getInt("chef_membresia"),
                        resultSet.getInt("chef_stado")
                );
            }
            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return chef;
    }

    @Override
    public Chef Login(String mail, String pass) {
        Chef chef = null;
        try {
            //Cambiar Consulta por Procedure usp_BuscarUsuarioPorId(?);
            String sql = "call usp_LoginChef(?,?);";
            PreparedStatement preparedStatement = cx.prepareStatement(sql);
            preparedStatement.setString(1, mail);
            preparedStatement.setString(2, pass);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                chef = new Chef(
                        resultSet.getInt("chef_id"),
                        resultSet.getString("chef_nombre"),
                        resultSet.getString("chef_apellido"),
                        resultSet.getString("chef_correo"),
                        resultSet.getString("chef_contraseña"),
                        resultSet.getString("chef_foto"),
                        resultSet.getInt("chef_cantseguidores"),
                        resultSet.getInt("chef_cantrecetas"),
                        resultSet.getInt("chef_contrato"),
                        resultSet.getString("chef_paisid"),
                        resultSet.getString("chef_descripcion"),
                        resultSet.getInt("chef_membresia"),
                        resultSet.getInt("chef_stado")
                );
            }
            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return chef;

    }

    @Override
    public Chef registrar(Chef chefsito) {
        try {

            String sql = "call usp_RegistrarChef(?,?,?,?,?);";
            PreparedStatement preparedStatement = cx.prepareStatement(sql);
            preparedStatement.setString(1, chefsito.getChef_nombre());
            preparedStatement.setString(2, chefsito.getChef_apellido());
            preparedStatement.setString(3, chefsito.getChef_correo());
            preparedStatement.setString(4, chefsito.getChef_contraseña());
            preparedStatement.setString(5, chefsito.getChef_paisid());
            preparedStatement.executeUpdate();
            System.out.println("Hasta aqui todo Gud ");
            /*ResultSet resultSet = preparedStatement.getGeneratedKeys();
			int generatedKey = 0;
			if (resultSet.next()) {
			    generatedKey = resultSet.getInt(1);
			}
			resultSet.close();
			usuario.setUsu_id(generatedKey);*/
            preparedStatement.close();
            return chefsito;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
