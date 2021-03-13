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
public class Ejemplo2 {
    
    
    // Uso de condiciones IF
    public static void main(String[] args){
        int num1= 3, num2=5, num3=15;
        
        if (num1>num2){
            System.out.println("El mayor es: " + num1);
        }else{
            System.out.println("El mayor es: " + num2);
        }
        
        if (num1<num2){
            System.out.println("El menor es: " + num1);
        }else{
            System.out.println("El menor es: " + num2);
        }
        
        if (num1>num2){
            if(num1>num3){
                System.out.println("El mayor es: " + num1);
            }else{
                System.out.println("El mayor es: " + num3);
            }
        }else{
            if(num2>num3){
                System.out.println("El mayor es: " + num2);
            }else{
                System.out.println("El mayor es: " + num3);
            }
        }
        
        if (num1<num2){
            if(num1<num3){
                System.out.println("El menor es: " + num1);
            }else{
                System.out.println("El menor es: " + num3);
            }
        }else{
            if(num2<num3){
                System.out.println("El menor es: " + num2);
            }else{
                System.out.println("El menor es: " + num3);
            }
        }
    }
}
