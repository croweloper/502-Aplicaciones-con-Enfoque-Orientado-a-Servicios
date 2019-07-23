
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Trabajador;

public class TrabajadorDAO {
    public static List<Trabajador> listar_trabajadores(){
        
        try {
            List<Trabajador> lista;
            try(Connection conectar=new Conexion().conectar() ){
                String sql="call sp_Listar_Trabajadores()";
                PreparedStatement ps=conectar.prepareCall(sql);
                ResultSet rs=ps.executeQuery();
                lista=new ArrayList<Trabajador>();
                
                while (rs.next()) {
                    Trabajador t=new Trabajador();
                    t.setIdTra(rs.getString(1));
                    t.setNomTra(rs.getString(2));
                    t.setApeTra(rs.getString(3));
                    t.setFnacTra(rs.getString(4));
                    t.setDirecTra(rs.getString(5));
                    t.setSexoTra(rs.getString(6));
                    t.setDniTra(rs.getString(7));
                    t.setEstcivTra(rs.getString(8));
                    
                    lista.add(t);
                    
                }
                
                conectar.close();
                
            }
            return lista;
        } catch (Exception e) {
        }
        
        return null;
    }
    
    public static void RegistrarUsuario(Trabajador nuevotrab){
		// Establecer conexión con la base de datos
		
		Connection con=null;
		PreparedStatement pst=null;
                
                try {
			con = new Conexion().conectar();
			String sql="{call sp_nuevo_trabajador(?,?,?,?,?,?,?,?)}";
                        pst=con.prepareCall(sql);
                        pst.setString(1, nuevotrab.getIdTra());
			pst.setString(2, nuevotrab.getNomTra());
			pst.setString(3,nuevotrab.getApeTra());
			pst.setString(4,nuevotrab.getFnacTra());
			pst.setString(5, nuevotrab.getDirecTra());
			pst.setString(6,nuevotrab.getSexoTra());
			pst.setString(7,nuevotrab.getDniTra());
			pst.setString(8, nuevotrab.getEstcivTra());
			pst.executeQuery();
			
			
			// pst.executeUpdate();
			 System.out.println("Se añadio correctamente el Registro");
                         
                         con.close();
			 
		} catch (Exception e) {
			System.out.println("Error al insertar nuevo Descanso Medico");
		}
				
	    	
	    }
}
