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
public class Fruta {
    public String sabor;
    public String forma;
    public String color;
    public String nombre;
    public String tamanio;
    
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Sabor: " + sabor);
        System.out.println("Forma: " + forma);
        System.out.println("Tamaño: " + tamanio);
    }
    
    public String obtTamanio(){
        return tamanio;
    }
}
