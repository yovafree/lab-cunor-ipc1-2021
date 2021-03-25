/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author erwin
 */
public class Estudiante {
    public String nombres;
    public String apellidos;
    public String direccion;
    public String edad;
    public String grado;
    public String noCarne;
    
    public void mostrarInfo(){
        System.out.println("No. Carné " + noCarne);
        System.out.println("Nombres " + nombres);
        System.out.println("Apellidos " + apellidos);
        System.out.println("Dirección " + direccion);
        System.out.println("Edad " + edad);
        System.out.println("Grado" + grado);
        
    }
}
