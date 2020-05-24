package umg.analisis.labo3.inciso3.Service;
import umg.analisis.labo3.inciso3.Dao.EscuelaDao;
import umg.analisis.labo3.inciso3.Entity.EstudiantesEntity;

public class EscuelaService implements IRunSqlAction{

    private static EscuelaService instance;
    private EscuelaService() {
    }
    public static EscuelaService getInstance(){
          if(instance == null){
             instance = new EscuelaService();
        }
            return instance;
    }
    
    
    @Override
    public void runSqlQuery(EstudiantesEntity est) { 
        EscuelaDao eje=EscuelaDao.getInstance();
       eje.getSql(est);     
    }

  
    public void runSqlQuery2(EstudiantesEntity est) {
        EscuelaDao eje2=EscuelaDao.getInstance();
        eje2.getSql2(est);
    }
    
   
    
 
}