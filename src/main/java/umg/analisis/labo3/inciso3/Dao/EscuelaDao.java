package umg.analisis.labo3.inciso3.Dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.util.*;
import umg.analisis.labo3.inciso3.Entity.ComponenteEscuelaEntity;
import umg.analisis.labo3.inciso3.Entity.EstudiantesEntity;
import umg.analisis.labo3.inciso3.Service.ConexionService;
import umg.analisis.labo3.inciso3.Service.ConexionService;

/**
 * 
 */
public class EscuelaDao {

    public static EscuelaDao instance;
    private EscuelaDao() {
    }
    public static EscuelaDao getInstance(){
        if(instance == null){
             instance = new EscuelaDao();
        }
            return instance;
        
    }
    public void getSql(ComponenteEscuelaEntity student) {
        try{
        ConexionService newconnection=ConexionService.getInstance();
         Connection conection =newconnection.conectar();
         Statement consulta = conection.createStatement();
            ResultSet resultado = consulta.executeQuery ("select c.id_course,c.name,s.name from t2_student_rel_course sc, t2_student s, t2_course c where sc.id_student = s.id_student and sc.id_course = c.id_course;");
            System.out.println (" id Curso<------>NombreCurso<---------------------->Alumno<");
            while (resultado.next()){
                System.out.println (resultado.getInt ("id_course") + "   " + resultado.getString (2)+ " | "+ resultado.getString (3)+ "");
            }
            conection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        }
    public void getSql2(ComponenteEscuelaEntity student) {
        try{
        ConexionService newconnection=ConexionService.getInstance();
         Connection conection =newconnection.conectar();
         Statement consulta = conection.createStatement();
            ResultSet resultado = consulta.executeQuery ("select s.id_student, s.name,c.name from t2_student_rel_course sc, t2_student s, t2_course c where sc.id_course = c.id_course and sc.id_student = s.id_student ORDER BY s.name;");
            System.out.println (" id Alumno<------>NombreAlumno<---------->Curso<");
            while (resultado.next()){
                System.out.println (resultado.getInt ("id_student") + "   " + resultado.getString (2)+ " | "+ resultado.getString (3)+ "");
            }
            conection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        }

}