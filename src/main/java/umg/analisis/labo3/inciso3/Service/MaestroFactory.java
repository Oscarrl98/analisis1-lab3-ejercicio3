package umg.analisis.labo3.inciso3.Service;
import java.util.*;

/**
 * 
 */
public class MaestroFactory implements IMaestroFactory {


    private MaestroFactory() {
    }
    private static MaestroFactory instance;
    
    public static MaestroFactory getInstance(){
        if(instance ==null){
            return new MaestroFactory();
        }
        return instance;
    }

    public IMaestro getMaestro(String tipoMaestro) {
        switch(tipoMaestro){
        case "Principal":{
            System.out.println("Se contrato(creo) un maestro principal");
            return new MaestroPrincipal();
        }
        case "Suplente":{
            System.out.println("Se contrato(creo) un maestro suplente");
            return new MaestroSuplente();
        }
        default:return null;    
    }
        
    }

}