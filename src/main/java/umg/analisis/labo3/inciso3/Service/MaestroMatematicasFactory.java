package umg.analisis.labo3.inciso3.Service;
import java.util.*;

public class MaestroMatematicasFactory implements IMaestroFactory {

    private MaestroMatematicasFactory() {
    }
    private static MaestroMatematicasFactory instance;
    
    public static MaestroMatematicasFactory getInstance(){
        if(instance ==null){
            return new MaestroMatematicasFactory();
        }
        return instance;
    }

    @Override
    public IMaestro getMaestro(String tipoMaestro) {
        switch(tipoMaestro){
        case "PincipalMate":{
            System.out.println("Se contrato(creo) un maestro principal de matematicas");
            return new MaestroPrincipalMate();
        }
        case "SuplenteMate":{
            System.out.println("Se contrato(creo) un maestro suplente de matematicas");
            return new MaestroSuplenteMate();
        }
        default:return null;
    }
        
    }

}