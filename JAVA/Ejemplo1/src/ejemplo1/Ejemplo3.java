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
public class Ejemplo3 {
    public static void main(String[] args){
        int num = 4;
        
        switch(num){
            case 0:
                System.out.println("Opción 0");
                break;
            case 1:
                System.out.println("Opción 1");
                break;
            case 2:
                System.out.println("Opción 2");
                break;
            case 3:
                System.out.println("Opción 3");
                break;
            default:
                System.out.println("Default");
                break;
        }
        
        char letra = 'a';
        
        switch(letra){
            case 'a':
                System.out.println("Opción (a)");
                break;
            case 'b':
                System.out.println("Opción (b)");
                break;
            case 'c':
                System.out.println("Opción (c)");
                break;
        }
    }
}
