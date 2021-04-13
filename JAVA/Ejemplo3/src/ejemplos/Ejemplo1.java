/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import clases.Estudiante;

/**
 *
 * @author erwin
 */
public class Ejemplo1 {
    
    public static void main(String[] args){
        Estudiante estudiante1 = new Estudiante("Carlos","García","Cobán","16","2do. Básico", "4566-2021");
        
        
        System.out.println(estudiante1.sumar(2, 3));
        System.out.println(estudiante1.sumar(2, 3, 3));
        
        System.out.println("Nombres: " + estudiante1.nombres);
        System.out.println("Apellidos: " + estudiante1.apellidos);
        System.out.println("Dirección: " + estudiante1.direccion);
    }
    
}
