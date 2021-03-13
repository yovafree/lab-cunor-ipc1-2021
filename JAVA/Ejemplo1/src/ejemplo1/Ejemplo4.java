/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import java.util.Scanner;

/**
 * Ciclo FOR
 * @author erwin
 */
public class Ejemplo4 {
    
    public static void main(String[] args){
        
//        for(int j=1;j<=100;j++){
//            System.out.println(j);
//        }
//        
//        for(int j=100;j>=1;j--){
//            System.out.println(j);
//        }
        
        //Programa que imprima la tabla de multiplicar de N números
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa que muestra la tabla de multiplicar de un número N");
        System.out.println("Ingrese un número: ");
        String entrada = sc.nextLine();
        
        int n = Integer.parseInt(entrada);
        
        for (int j=1;j<=10;j++){
            System.out.println(n + " * " + j + " = " + (n*j));
        }
    }
}
