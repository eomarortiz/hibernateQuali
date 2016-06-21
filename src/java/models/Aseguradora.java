package models;
// Generated 20/06/2016 12:09:30 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Aseguradora generated by hbm2java
 */
public class Aseguradora  implements java.io.Serializable {


     private Byte idAseguradora;
     private String nombreAseguradora;
     private Date fechaEncuadre;
     private Set<Pagina> paginas = new HashSet<Pagina>(0);
     private Set<Ejecutivo> ejecutivos = new HashSet<Ejecutivo>(0);

    public Aseguradora() {
    }

	
    public Aseguradora(String nombreAseguradora) {
        this.nombreAseguradora = nombreAseguradora;
    }
    public Aseguradora(String nombreAseguradora, Date fechaEncuadre, Set<Pagina> paginas, Set<Ejecutivo> ejecutivos) {
       this.nombreAseguradora = nombreAseguradora;
       this.fechaEncuadre = fechaEncuadre;
       this.paginas = paginas;
       this.ejecutivos = ejecutivos;
    }
   
    public Byte getIdAseguradora() {
        return this.idAseguradora;
    }
    
    public void setIdAseguradora(Byte idAseguradora) {
        this.idAseguradora = idAseguradora;
    }
    public String getNombreAseguradora() {
        return this.nombreAseguradora;
    }
    
    public void setNombreAseguradora(String nombreAseguradora) {
        this.nombreAseguradora = nombreAseguradora;
    }
    public Date getFechaEncuadre() {
        return this.fechaEncuadre;
    }
    
    public void setFechaEncuadre(Date fechaEncuadre) {
        this.fechaEncuadre = fechaEncuadre;
    }
    public Set<Pagina> getPaginas() {
        return this.paginas;
    }
    
    public void setPaginas(Set<Pagina> paginas) {
        this.paginas = paginas;
    }
    public Set<Ejecutivo> getEjecutivos() {
        return this.ejecutivos;
    }
    
    public void setEjecutivos(Set<Ejecutivo> ejecutivos) {
        this.ejecutivos = ejecutivos;
    }




}

