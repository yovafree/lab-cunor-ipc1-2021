/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

/**
 *
 * @author erwin
 */
public class Ejemplo6 {
    public static void main(String[] args){
        // Ciclo While
//        int n = 1;
//        while(n<=100){
//            System.out.println(n);
//            n=n+2;
//        }      
//        
//        while(n>=1){
//            System.out.println(n);
//            n=n-2;
//        }     

        int j = 0;
        int k= 1;
        
        while(j<=10){
            j++;
            while(k<=10){
                System.out.println(j + " * " + k + " = "+(j*k));
                k++;
            }
        }
    }
}
