package umg.analisis.labo3.inciso3.Service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.*;

public class ConexionService {
    public static ConexionService instance;
    private Connection conexion = null;
    private Statement stm = null;

    private ConexionService() {
    }
    public static ConexionService getInstance(){
        if(instance == null){
           instance = new ConexionService();
        }
           return instance;
        
    }
    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");      
            conexion = DriverManager.getConnection("jdbc:mysql://192.185.4.65:3306/jbarilla_ingsoftware", "jbarilla_estudia", "2Ui!OssHDQGv");  
        } catch (Exception e) {
        }
        return conexion;
    }
    
 public void desconectar() {

        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

}