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
public class Ejemplo10 {
    static int op = 0;
    
    
    public static void main(String[] args){
        do{
            menu();
            Scanner sc = new Scanner(System.in);
            op = Integer.parseInt(sc.nextLine());
            
            switch(op){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }while(op!= 7);
    }
    
    public static void menu(){
        System.out.println("------------");
        System.out.println("MENU");
        System.out.println("------------");
        System.out.println("1) Agregar un alumno");
        System.out.println("2) Editar un alumno");
        System.out.println("3) Ver lista de alumnos");
        System.out.println("4) Eliminar un alumno");
        System.out.println("7) Salir");
        System.out.println("Ingrese la opción: ");
    }
    
    
}
