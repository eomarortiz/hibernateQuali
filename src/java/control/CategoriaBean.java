/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import models.Campana;
import models.MarcaCliente;
import models.Solicitud;
import models.StatusSolicitud;
import models.SubmarcaCliente;
import models.TipoContacto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import sesion.HibernateUtilS;

/**
 *
 * @author inquisicion
 */
@ManagedBean(name = "categoriaBn")
@RequestScoped

/*Codigo para controlar la lectura e insercion del catalogo de tareas*/
public class CategoriaBean {

    private Solicitud solicitud;
    private List<Solicitud> solicitudes; 

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public List<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(List<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }
    
    
    
    public CategoriaBean() {
    }
    
    public List<MarcaCliente> getExternas(){
        SessionFactory sf = HibernateUtilS.getSessionFactory();
        Session ses = sf.openSession();
        
        List<MarcaCliente> lista = ses.createQuery("from MarcaCliente where idAseguradora = 1").list();
        
        return lista;
    }
    public List getAnios(){
        
        List<Integer> lista = new ArrayList<Integer>();
        int j=0;
        for(int i=1985;i<=2017;i++){
        
            lista.add(i);
        }
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
        
        return lista;
    }
    
    public List<SubmarcaCliente> getSubMarca(){
    
        SessionFactory sf = HibernateUtilS.getSessionFactory();
        Session ses = sf.openSession();
        
        List<SubmarcaCliente> lista = ses.createQuery("FROM SubmarcaCliente  where anio = 2014 and idMarcaCliente =16").list();
        
        return lista;
        
    }
    
    public String guardarSolicitud(){
        SessionFactory sf = HibernateUtilS.getSessionFactory();
        Session ses = sf.openSession();
        Transaction tx = ses.beginTransaction();
        //Campana campana, StatusSolicitud statusSolicitud, TipoContacto tipoContacto, String nombre, String telefono, String correo, String cp, Date anio, String marca, String modelo, String comentarios, Date fechaSolicitud
        //Campana campana, StatusSolicitud statusSolicitud, TipoContacto tipoContacto, String nombre, String telefono, String correo, String cp, Date anio, String marca, String modelo, String comentarios, Date fechaSolicitud
        
        
        Campana camp = (Campana)ses.createQuery("FROM Campana where id=1");
        StatusSolicitud status = (StatusSolicitud)ses.createQuery("FROM StatusSolicitud where id=1");
        TipoContacto contacto = (TipoContacto)ses.createQuery("FROM TipoContacto where id=1");
        
        
        Solicitud ext = new Solicitud(camp,status,contacto,solicitud.getNombre(),solicitud.getTelefono(),solicitud.getCorreo(),solicitud.getCp(),solicitud.getAnio(),solicitud.getMarca(),solicitud.getModelo(),"",solicitud.getFechaSolicitud());
        ses.saveOrUpdate(ext);
        tx.commit();
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso" , "Exito al guardar");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        solicitud.setNombre("");
        solicitud.setApellidoMaterno("");
        return "index";
    }
    
    
    public List<SubmarcaCliente> getSubmarcaActualziada(String marca){
        SessionFactory sf = HibernateUtilS.getSessionFactory();
        Session ses = sf.openSession();
        List<SubmarcaCliente> lista = ses.createQuery("FROM SubmarcaCliente where idMarcaCliente= (select idMarcaCliente from MarcaCliente where clave = 'marca')").list();
        
        return lista;
    
    }
    
    public static void main(String[] args){
        CategoriaBean a = new CategoriaBean();
        String b ="AA";
        //a.getSubMarca();
     }
    
}
