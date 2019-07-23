package controlador;

import DAO.DMDAO;
import DAO.TrabajadorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.DM;
import modelo.Trabajador;
import modelo.operaciones;

public class control extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String pag;
        
        
        String res=request.getParameter("res");
        
        if (res.equals("1")) {
            String nomtrab=request.getParameter("nombre").trim();
            String apetrab=request.getParameter("apellido").trim();
            String fecnac=request.getParameter("fechanac").trim();
            String direccion=request.getParameter("direccion").trim();
        
            String sexo=request.getParameter("sexo").trim();
            String doctrab=request.getParameter("doc").trim();
            String estado=request.getParameter("ecivil").trim();
            Trabajador trab=new Trabajador(apetrab.substring(0,1)+nomtrab.substring(0,1)+doctrab, nomtrab, apetrab, fecnac, direccion, sexo, doctrab, estado);
            TrabajadorDAO.RegistrarUsuario(trab);
            pag="/succes.html";    
            
        }else if(res.equals("2")){
            pag = "/registrardescansomedico.jsp";
            String idtra = request.getParameter("idtra");
            System.out.println("EL ID es: "+idtra);
            request.setAttribute("id", idtra);
            
            
        }else if(res.equals("3")){
            
            String idtra = request.getParameter("idtrabajador");
            String fecini=request.getParameter("fecini").trim();
            String fecfin=request.getParameter("fecfin").trim();
            String diagnostico=request.getParameter("diagnostico").trim();
            String centromedico=request.getParameter("cmedico").trim();
            String medico=request.getParameter("nmedico").trim();
            String cmp=request.getParameter("cmp").trim();
            
            
            
            
            DM trab=new DM(DMDAO.generacodigo(), fecini, fecfin, diagnostico, centromedico, medico, cmp, idtra);
            DMDAO.RegistrarDM(trab);
            pag = "//succes.html";
            
        }else {
            pag="/error.html"; 
        }
        
        getServletContext().getRequestDispatcher(pag).forward(request, response);
        
       
        
        
        /*
        double n1=Double.parseDouble(request.getParameter("n1"));
        double n2=Double.parseDouble(request.getParameter("n2"));
        double result=0;
        
        operaciones oper = new operaciones(n1, n2);
        
        String opera=request.getParameter("opera");
        if(opera.equals("sumar")){
            result=oper.suma();
        }
        if(opera.equals("restar")){
            result=oper.resta();
        }
        if(opera.equals("dividir")){
            result=oper.division();
        }
        if(opera.equals("multiplicar")){
            result=oper.multiplicacion();
        }
        out.println("Número 1: "+n1);
        out.println("<br>Número 2: "+n2);
        out.println("<br>Resultado: "+result);
        */
        String id=request.getParameter("idtra").trim();
        String nom=request.getParameter("nomtra").trim();
        String ape=request.getParameter("apetra").trim();
        
        List<Trabajador> ntrab;
        ntrab=TrabajadorDAO.listar_trabajadores();
        
        /*for (int i = 0; i < ntrab.size(); i++) {
                out.println(ntrab.get(i).getIdTra()+"</br>");
                out.println(ntrab.get(i).getNomTra()+"</br>");
        }
        */
        try {
            if (id.length()==0 && ape.length()==0 && nom.length()==0 ) {
                out.println("<table border=\"1\">");
                out.println("<th colspan=\"8\">"+"Datos de Alumnos"+"</th>");
                
                for (int i = 0; i < ntrab.size(); i++) {
                    out.println("<tr>");
                    out.println("<td>"+ntrab.get(i).getIdTra()+"</td>");
                    out.println("<td>"+ntrab.get(i).getNomTra()+"</td>");
                    out.println("<td>"+ntrab.get(i).getApeTra()+"</td>");
                    out.println("<td>"+ntrab.get(i).getDniTra()+"</td>");
                    out.println("<td>"+ntrab.get(i).getDirecTra()+"</td>");
                    out.println("<td>"+ntrab.get(i).getEstcivTra()+"</td>");
                    out.println("<td>"+ntrab.get(i).getFnacTra()+"</td>");
                    out.println("<td>"+ntrab.get(i).getSexoTra()+"</td>");
                    
                    out.println("</tr>");
                
                }
                out.println("</table>");
                
                /*for (int i = 0; i < ntrab.size(); i++) {
                    out.println(ntrab.get(i).getIdTra()+" - ");
                    out.println(ntrab.get(i).getNomTra()+" - ");
                    out.println(ntrab.get(i).getApeTra()+" - ");
                    out.println(ntrab.get(i).getDniTra()+"</br>");
                }*/
            }else if(id.length()!=0){
                for (int i = 0; i < ntrab.size(); i++) {
                    if (ntrab.get(i).getIdTra().equals(id)) {
                        out.println(ntrab.get(i).getIdTra()+" - ");
                        out.println(ntrab.get(i).getNomTra()+" - ");
                        out.println(ntrab.get(i).getApeTra()+" - ");
                        out.println(ntrab.get(i).getDniTra()+"</br>");
                    }
            
                }
            }else if (nom.length()!=0 ) {
                for (int i = 0; i < ntrab.size(); i++) {
                    int intIndex = ntrab.get(i).getNomTra().indexOf(nom);
                    if(intIndex != - 1){
                        out.println(ntrab.get(i).getIdTra()+" - ");
                        out.println(ntrab.get(i).getNomTra()+" - ");
                        out.println(ntrab.get(i).getApeTra()+" - ");
                        out.println(ntrab.get(i).getDniTra()+"</br>");
                    }
            
                } 
            }
            
        } catch (Exception e) {
        }
        
        
        
        
    }
    
    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
