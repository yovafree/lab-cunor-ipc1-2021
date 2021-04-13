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
    
    public Estudiante(){
        this.nombres = "";
        this.apellidos = "";
        this.direccion = "";
        this.edad = "";
        this.grado = "";
        this.noCarne = "";
    }
    
    public Estudiante(String nombres, String apellidos, String direccion){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }
    
    public Estudiante(String nombres, String apellidos, String direccion, String edad, String grado, String nocarne){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.edad = edad;
        this.grado = grado;
        this.noCarne = nocarne;
    }
    
    public int sumar(int a, int b){
        return a+b;
    }
    
    public int sumar(int a, int b, int c){
        return a+b+c;
    }
    
}
