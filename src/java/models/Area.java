package models;
// Generated 20/06/2016 12:09:30 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Area generated by hbm2java
 */
public class Area  implements java.io.Serializable {


     private Byte idArea;
     private String nombreArea;
     private String descripcionArea;
     private Set<Ejecutivo> ejecutivos = new HashSet<Ejecutivo>(0);

    public Area() {
    }

	
    public Area(String nombreArea) {
        this.nombreArea = nombreArea;
    }
    public Area(String nombreArea, String descripcionArea, Set<Ejecutivo> ejecutivos) {
       this.nombreArea = nombreArea;
       this.descripcionArea = descripcionArea;
       this.ejecutivos = ejecutivos;
    }
   
    public Byte getIdArea() {
        return this.idArea;
    }
    
    public void setIdArea(Byte idArea) {
        this.idArea = idArea;
    }
    public String getNombreArea() {
        return this.nombreArea;
    }
    
    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }
    public String getDescripcionArea() {
        return this.descripcionArea;
    }
    
    public void setDescripcionArea(String descripcionArea) {
        this.descripcionArea = descripcionArea;
    }
    public Set<Ejecutivo> getEjecutivos() {
        return this.ejecutivos;
    }
    
    public void setEjecutivos(Set<Ejecutivo> ejecutivos) {
        this.ejecutivos = ejecutivos;
    }




}

