package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class clsBD {
    //String _IP="node26129-oaemdljsp.es-1.axarnet.cloud", _PORT="3306", _BD="", _USER="root", _PASSWORD="TQPkmz99618";
    String _IP="node46016-env-2917677.jl.serv.net.mx", _PORT="3306", _BD="", _USER="root", _PASSWORD="HVZqkb82374";
    //String _IP="localhost", _PORT="3306", _BD="", _USER="root", _PASSWORD="";
    
    Connection cn = null;
    PreparedStatement ps = null;

    public clsBD( String _BD ) {
        this._BD = _BD;
        getConnection();
    }

    public clsBD(String _BD, String _USER, String _PASSWORD) {
        this._BD = _BD; this._USER = _USER; this._PASSWORD = _PASSWORD;
        getConnection();
    }

    public clsBD(String _IP, String _PORT, String _BD, String _USER, String _PASSWORD) {
        this._IP = _IP;this._PORT = _PORT;this._BD = _BD; 
        this._USER = _USER; this._PASSWORD = _PASSWORD;
        getConnection();
    }

    private void getConnection() {
        try {
            Class.forName( "com.mysql.jdbc.Driver" );
            cn = DriverManager.getConnection( String.format("jdbc:mysql://%s:%s/%s",_IP,_PORT,_BD), _USER, _PASSWORD );
        } catch ( ClassNotFoundException | SQLException ex ) { System.out.println( ex.getMessage() ); }
    }
    
    public void Sentencia(String _SQL) {
        try {
            ps = cn.prepareStatement( _SQL );
        } catch (SQLException ex) { System.out.println( ex.getMessage() ); }
    }

    public String[][] getRegistros() {
        String [][] mRegistros = null;
        
        try {
            ResultSet rs = ps.executeQuery();
            if ( rs.last() ) {
                int columnas = rs.getMetaData().getColumnCount();
                mRegistros = new String[ rs.getRow() ][ columnas ];
                rs.beforeFirst();
                
                for ( int fila = 0; rs.next();  fila++ )
                    for ( int i= 0; i < columnas; i++ )
                        mRegistros[ fila ][i] = rs.getString( i + 1).trim();
            }            
        } catch (SQLException ex) { System.out.println( ex.getMessage() ); }

        return mRegistros;
    }

    public String[] getRegistro() {
        String[] aRegistro = null;
        
        try {
            ResultSet rs = ps.executeQuery();
            if ( rs.next() ) {
                int columnas = rs.getMetaData().getColumnCount();
                aRegistro = new String[ columnas ];
                for ( int i= 0; i < columnas; i++ )
                    aRegistro[i] = rs.getString( i + 1).trim();
            }            
        } catch (SQLException ex) { System.out.println( ex.getMessage() ); }

        return aRegistro;
    }
  
}
