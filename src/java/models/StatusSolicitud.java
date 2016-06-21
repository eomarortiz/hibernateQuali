package models;
// Generated 20/06/2016 12:09:30 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * StatusSolicitud generated by hbm2java
 */
public class StatusSolicitud  implements java.io.Serializable {


     private Byte idStatusSolicitud;
     private String descripcion;
     private Set<Solicitud> solicituds = new HashSet<Solicitud>(0);

    public StatusSolicitud() {
    }

    public StatusSolicitud(String descripcion, Set<Solicitud> solicituds) {
       this.descripcion = descripcion;
       this.solicituds = solicituds;
    }
   
    public Byte getIdStatusSolicitud() {
        return this.idStatusSolicitud;
    }
    
    public void setIdStatusSolicitud(Byte idStatusSolicitud) {
        this.idStatusSolicitud = idStatusSolicitud;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set<Solicitud> getSolicituds() {
        return this.solicituds;
    }
    
    public void setSolicituds(Set<Solicitud> solicituds) {
        this.solicituds = solicituds;
    }




}

