/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import java.util.Scanner;

/**
 * Ciclo Do While
 * @author erwin
 */
public class Ejemplo7 {
    public static void main(String[] args){
        int n = 0;
        
//        do{
//            n++;
//            System.out.println(n);
//        }while(n<100);

        do{
            System.out.println("------------");
            System.out.println("MENU");
            System.out.println("------------");
            System.out.println("1) Suma");
            System.out.println("2) Resta");
            System.out.println("3) Multiplicación");
            System.out.println("4) División");
            System.out.println("6) Salir");
            System.out.println("Ingrese la opción:");
            Scanner sc = new Scanner(System.in);
            
            String entrada = sc.nextLine();
            
            n = Integer.parseInt(entrada);
            
            if (n==1){
                System.out.println("Ingrese el primer número");
                entrada = sc.nextLine();
                int num1 = Integer.parseInt(entrada);
                
                System.out.println("Ingrese el segundo número");
                entrada = sc.nextLine();
                int num2 = Integer.parseInt(entrada);
                
                System.out.println("La suma es: " + (num1+num2));
            }
            
        }while(n!=6);
    }
}
