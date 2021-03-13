/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import java.util.Date;

/**
 *
 * @author erwin
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1=-2,num2=6,num3=24;
        
        // Estructuras de control de flujo
        // Condiciones  - IF
        
        if (num1 > 0){
            System.out.println("El número es positivo");
        }else{
            if (num1 < 0){
                System.out.println("El número es negativo");
            }else{
                System.out.println("El número es 0");
            }
        }
        
        if (num1 > 0){
            System.out.println("El número es positivo");
        }else if(num1 < 0){
            System.out.println("El número es negativo");
        }
        else{
            System.out.println("El número es 0");
        }
        
        
        //System.out.println(num1);
    }
    
}
