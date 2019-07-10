
package servicio;

import bd.clsBD;
import bean.Cine;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "swCinestar")
public class swCinestar {
    
    clsBD clsBD = new clsBD("cinestar");

  
    @WebMethod(operationName = "getVerCines")
    public List<Cine> getVerCines() {
        clsBD.Sentencia( "call usp_getVerCines()" );
        return new Cine().getListCine( clsBD.getRegistros() );
    }
}
