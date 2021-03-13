/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import java.util.Scanner;

/**
 *
 * @author erwin
 */
public class Ejemplo5 {
    
    public static void main(String[] args){
        // Tablas de multiplicar del 1 al 10
        
//        for (int j=1;j<=10;j++){
//            System.out.println("--------------------");
//            System.out.println("    Tabla del " + j);
//            System.out.println("--------------------");
//            for (int k=1;k<=12;k++){
//                System.out.println(j + " * " + k + " = " + (j*k));
//            }
//        }
        
        //Fibonacci Algoritmo Jorge Dubón
        
        System.out.println("Ingrese el número: ");
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        int n = Integer.parseInt(entrada);
        
        int a=1, b=0;
        
        for (int j=1;j<=n;j++){
            System.out.print(b + " ");
            a=a+b;
            b=a-b;
        }
        
        System.out.println(" ");
        
        int x=1,v=0;
        
        for(int j = 1; j<=n;j++){
            System.out.print(v + " ");
            int z = x+v;
            v=x;
            x=z;
        }
    }
}
