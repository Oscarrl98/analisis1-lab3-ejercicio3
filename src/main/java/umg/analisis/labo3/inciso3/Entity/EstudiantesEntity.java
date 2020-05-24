 package umg.analisis.labo3.inciso3.Entity;

import java.util.*;

public class EstudiantesEntity extends ComponenteEscuelaEntity {
    
    public static EstudiantesEntity instance;
    private EstudiantesEntity() {
    }
   public static EstudiantesEntity getInstanceEs(){
        if(instance == null){
             instance = new EstudiantesEntity();
        }
            return instance;
        
   }
    
    

}