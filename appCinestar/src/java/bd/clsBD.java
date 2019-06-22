
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class clsBD {
    
    //String _IP="node46016-env-2917677.jl.serv.net.mx",_PORT="3306",_BD="cinestar",_USER="root",_PASSWORD="HVZqkb82374",_SQL="";
    String _IP="localhost",_PORT="3306",_BD="cinestar",_USER="root",_PASSWORD="",_SQL="";
    Connection cn=null;
    PreparedStatement ps=null;
    

    public clsBD(String BD) {
        this._BD=BD;
        getConnection();
    }
    
    
    private void getConnection(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection(String.format("jdbc:mysql://%s:%s/%s", _IP,_PORT,_BD),_USER,_PASSWORD);
            System.out.println("Conectado.");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void Sentencia(String SQL) {
        
        this._SQL=SQL;
        
        try {
            ps=cn.prepareStatement(SQL);
        } catch (SQLException ex) {
            System.out.println("soy un error");
            System.out.println(ex.getMessage());
        }
        
    }

    public String[][] getRegistros() {
        String[][] mRegistro=null;
        
        try {
            ResultSet rs=ps.executeQuery();
            if (rs.last()) {
                
                int filas=rs.getRow();
                int columnas=rs.getMetaData().getColumnCount();
                mRegistro=new String[filas][columnas];
                rs.beforeFirst();
                
                for (int i = 0; rs.next(); i++) {
                    for (int j = 0; j < columnas; j++) {
                        mRegistro[i][j]=rs.getString(j+1).trim();
                    }
                }
                
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return mRegistro;
    }
    
}
