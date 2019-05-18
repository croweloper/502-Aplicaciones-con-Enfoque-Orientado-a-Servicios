/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Cliente;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.;
/**
 *
 * @author crowe
 */
public class ClienteDao {
    
    public Cliente consultarCliente(int cod){
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session sesion=sf.openSession();
        Cliente cli=(Cliente)sesion.get(Cliente.class,cod);
        if (cli!=null) {
            return cli;
        }else{
            return null;
        }
    }
    
    public List consultarClientes(){
        SessionFactory sf=HibernateUtil.getSessionFactory();
        Session sesion=sf.openSession();
        
        Query query=sesion.createQuery("from Cliente");
        
        List<Cliente> lista=query.list();
        sesion.close();
        return lista;
    }
    
    public void AgregarCliente(Cliente cli){
        Transaction tra=null;
        
        try {
            SessionFactory sf=HibernateUtil.getSessionFactory();
            Session session=sf.openSession();
            tra=session.beginTransaction();
            session.save(cli);
            tra.commit();
            session.close();
        } catch (Exception e) {
            tra.rollback();
            throw  new RuntimeException("Error al insertar datos");
        }
        
        //return null;
    }
    
    public void ModificarCliente(Cliente cli){
        Transaction tra=null;
        
        try {
            SessionFactory sf=HibernateUtil.getSessionFactory();
            Session session=sf.openSession();
            tra=session.beginTransaction();
            
            cli=consultarCliente(cli.getCodCli());
            
            session.update(cli);
            tra.commit();
            session.close();
        } catch (Exception e) {
            tra.rollback();
            throw  new RuntimeException("Error al Actualizar datos");
        }
        
        //return null;
    }
    
    public void EliminarCliente(Cliente cli){
        Transaction tra=null;
        
        try {
            SessionFactory sf=HibernateUtil.getSessionFactory();
            Session session=sf.openSession();
            tra=session.beginTransaction();
            session.save(cli);
            tra.commit();
            session.close();
        } catch (Exception e) {
            tra.rollback();
            throw  new RuntimeException("Error al insertar datos");
        }
        
        //return null;
    }
    
}
