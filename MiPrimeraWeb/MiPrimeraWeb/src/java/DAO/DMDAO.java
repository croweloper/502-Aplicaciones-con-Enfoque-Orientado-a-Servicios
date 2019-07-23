/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.DM;
import modelo.Trabajador;

/**
 *
 * @author Administrador
 */
public class DMDAO {
    
    public static void RegistrarDM(DM nuevodm){
		// Establecer conexión con la base de datos
		
		Connection con=null;
		PreparedStatement pst=null;
                
                try {
			con = new Conexion().conectar();
			String sql="{call sp_nuevo_DM(?,?,?,?,?,?,?,?)}";
                        pst=con.prepareCall(sql);
                        pst.setString(1, nuevodm.getIdDescanso());
			pst.setString(2, nuevodm.getDFinicio());
			pst.setString(3,nuevodm.getDFfin());
			pst.setString(4,nuevodm.getDdiagnostico());
			pst.setString(5, nuevodm.getDCentroSalud());
			pst.setString(6,nuevodm.getDMedico());
			pst.setString(7,nuevodm.getDCMP());
			pst.setString(8, nuevodm.getIdTrabajador());
			pst.executeQuery();
			
			
			// pst.executeUpdate();
			 System.out.println("Se añadio correctamente el Descanso Medico");
                         
                         con.close();
			 
		} catch (Exception e) {
			System.out.println("Error al insertar nuevo Descanso Medico");
		}
				
	    	
	    }
    
    public static List<DM> ListarDM(){
        
        try {
            List<DM> lista;
            try(Connection conectar=new Conexion().conectar() ){
                String sql="call sp_consultar_DM()";
                PreparedStatement ps=conectar.prepareCall(sql);
                ResultSet rs=ps.executeQuery();
                lista=new ArrayList<DM>();
                
                while (rs.next()) {
                    DM t=new DM();
                    t.setIdDescanso(rs.getString(1));
                    
                    lista.add(t);
                    
                }
                
                conectar.close();
                
            }
            return lista;
        } catch (Exception e) {
        }
        
        return null;
    }
    
    public static String generacodigo(){
        
        return ("DM"+(1000+ListarDM().size()+1));
    
    }
    
    
}
