package umg.analisis.labo3.inciso3.Service;
import java.util.*;

/**
 * 
 */
public class FactoryManager {

    public FactoryManager() {
    }

    public IMaestroFactory getFactory(String tipoFactory) {
        switch(tipoFactory){
            case "LiceoAntigua":{
                IMaestroFactory maes1= MaestroFactory.getInstance();
                return maes1;
            }
            case "ITED":{
                IMaestroFactory maes=MaestroMatematicasFactory.getInstance();
                return maes;
            }
        }
        return null;
    }

}