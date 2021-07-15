/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author kon-boot
 */
public class Estudiante {
    //nombre del estduiante
    public String nombre;
    
    private String carrera;
    
    public Estudiante(String nombre,  String carrera){
        this.nombre = nombre;
        this.carrera = carrera;
        
    }
    public void imprimirCarrera(){
        System.out.println(carrera);
    }
    
    
    
    
}
