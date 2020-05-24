/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.analisis.labo3.inciso3.Entity;

/**
 *
 * @author Oscar Lopez
 */
public abstract class ComponenteEscuelaEntity {
    
     public ComponenteEscuelaEntity() {
    }
    
    
    private String nombre;

    private String apellido;

    public void setNombre(String nombre) {
       this.nombre=nombre;
    }

    public String getNombre() {
       
        return this.nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido=apellido;
    }

    public String getApellido() {
   
        return this.apellido;
    }       
    
}
