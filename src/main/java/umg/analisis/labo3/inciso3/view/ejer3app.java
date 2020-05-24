package umg.analisis.labo3.inciso3.view;
import java.util.*;
import umg.analisis.labo3.inciso3.Entity.EstudiantesEntity;
import umg.analisis.labo3.inciso3.Dao.EscuelaDao;
import umg.analisis.labo3.inciso3.Entity.ComponenteEscuelaEntity;
import umg.analisis.labo3.inciso3.Service.EscuelaService;
import umg.analisis.labo3.inciso3.Service.FactoryManager;

import umg.analisis.labo3.inciso3.Service.IMaestro;
public class ejer3app {

  
    public ejer3app() {
    }

    public static void main(String[] args) {

     EstudiantesEntity est=EstudiantesEntity.getInstanceEs();
     String entradaTeclado ="";

        Scanner entradaEscaner = new Scanner (System.in);  
        EscuelaService escs = EscuelaService.getInstance();
        System.out.println("MENU");
        System.out.println("1) Cursos por estudiante ");
        System.out.println("2) Estudiantes por curso ");
        System.out.println("3) SALIR");
        entradaTeclado = entradaEscaner.nextLine (); 
        est.setNombre(entradaTeclado);
        
       switch(est.getNombre()){
           case "1":{escs.runSqlQuery(est);
           }break;
           case "2":{escs.runSqlQuery2(est);       
           } 
           case "3":{break;
           }
       }
        System.out.println("----------------------------------------------------    ");
       FactoryManager admin = new FactoryManager();
       IMaestro maes1=admin.getFactory("LiceoAntigua").getMaestro("Principal");
       IMaestro maes2=admin.getFactory("LiceoAntigua").getMaestro("Suplente");
       IMaestro maes3=admin.getFactory("ITED").getMaestro("PincipalMate");
       IMaestro maes4=admin.getFactory("ITED").getMaestro("SuplenteMate");
       IMaestro maes5=admin.getFactory("ITED").getMaestro("SuplenteMates");
       
        
       
    }

}