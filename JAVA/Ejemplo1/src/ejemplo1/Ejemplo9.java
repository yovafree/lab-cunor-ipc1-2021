/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

/**
 * USO de Métodos en Java
 * @author erwin
 */
public class Ejemplo9 {
    
    public static void main(String[] args){
        suma(2,3);
        suma(8,3);
        suma(11,2);
        suma(100,2);
        
        int val = multiplicacion(8,9);
        
        System.out.println(val);
        //menu();
    }
    
    public static void menu(){
        System.out.println("------------");
        System.out.println("MENU");
        System.out.println("------------");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicación");
        System.out.println("4) División");
        System.out.println("6) Salir");
    }
    
    public static void suma(int num1, int num2){
        System.out.println("La suma es: " + (num1+num2));
    }
    
    public static void resta(int num1, int num2){
        System.out.println("La resta es: " + (num1-num2));
    }
    
    public static int multiplicacion(int num1, int num2){
        int resu = num1*num2;
        return resu;
    }
}
