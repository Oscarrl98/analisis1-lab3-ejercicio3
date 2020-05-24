/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg.analisis.labo3.inciso3.Service;

/**
 *
 * @author Oscar Lopez
 */
public class NullMaestro implements IMaestro{
    public NullMaestro(){
        
    }

    @Override
    public String DarClases(String input) {
       return "NO DISPONIBLE";
    }
    
}
