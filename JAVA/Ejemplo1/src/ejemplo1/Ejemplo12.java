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
public class Ejemplo12 {
    static int op = 0;
    
    static int contador = 0;
    
    static String[][] lstEstudiantes;
    
    
    public static void main(String[] args){
        lstEstudiantes = new String[4][100];
        llenarEstudiantes();
        
        do{
            menu();
            Scanner sc = new Scanner(System.in);
            op = Integer.parseInt(sc.nextLine());
            
            switch(op){
                case 1:
                    System.out.println("\nIngrese la información del estudiante:");
                    
                    System.out.println("Ingrese el nombre del estudiante:");
                    String valor = sc.nextLine();
                    lstEstudiantes[0][contador] = valor;
                    
                    System.out.println("Ingrese los apellidos del estudiante:");
                    valor = sc.nextLine();
                    lstEstudiantes[1][contador] = valor;
                    
                    System.out.println("Ingrese la dirección del estudiante:");
                    valor = sc.nextLine();
                    lstEstudiantes[2][contador] = valor;
                    
                    System.out.println("Ingrese la Edad del estudiante: ");
                    valor = sc.nextLine();
                    lstEstudiantes[3][contador] = valor;
                    
                    contador++;
                    break;
                case 2:
                    mostrarAlumnos();
                    System.out.println("\nIngrese el no. de estudiante que desea editar:");
                    int noAlumno = Integer.parseInt(sc.nextLine())-1;
                    
                    System.out.println("Ingrese el nombre del estudiante:");
                    valor = sc.nextLine();
                    lstEstudiantes[0][noAlumno] = valor;
                    
                    System.out.println("Ingrese el apellido del estudiante:");
                    valor = sc.nextLine();
                    lstEstudiantes[1][noAlumno] = valor;
                    
                    System.out.println("Ingrese la dirección del estudiante:");
                    valor = sc.nextLine();
                    lstEstudiantes[2][noAlumno] = valor;
                    
                    System.out.println("Ingrese la edad del estudiante:");
                    valor = sc.nextLine();
                    lstEstudiantes[3][noAlumno] = valor;
                    
                    break;
                case 3:
                    mostrarAlumnos();
                    sc.next();
                    break;
                case 4:
                    mostrarAlumnos();
                    System.out.println("\nIngrese el no. de estudiante que desea eliminar:");
                    noAlumno = Integer.parseInt(sc.nextLine())-1;
                    
                    lstEstudiantes[0][noAlumno] = "-----";
                    lstEstudiantes[1][noAlumno] = "-----";
                    lstEstudiantes[2][noAlumno] = "-----";
                    lstEstudiantes[3][noAlumno] = "-----";
                    break;
            }
        }while(op!= 7);
    }
    
    public static void llenarEstudiantes(){
        lstEstudiantes[0][contador] = "Carlos";
        lstEstudiantes[1][contador] = "Pan";
        lstEstudiantes[2][contador] = "Cobán";
        lstEstudiantes[3][contador++] = "22";
        
        lstEstudiantes[0][contador] = "Daniel";
        lstEstudiantes[1][contador] = "Pan";
        lstEstudiantes[2][contador] = "Carchá";
        lstEstudiantes[3][contador++] = "23";
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
    
    public static void mostrarAlumnos(){
        System.out.println("\n-------------------");
        System.out.println("  LISTADO DE ALUMNOS");
        System.out.println("-------------------");
        
        System.out.println("No. \tNombres \tApellidos \tDirección \tEdad");

        for (int x =0;x<=contador-1;x++){
            System.out.println("" + (x+1) + ") \t" + lstEstudiantes[0][x] +" \t\t"+lstEstudiantes[1][x] +" \t\t"+lstEstudiantes[2][x] +" \t\t"+lstEstudiantes[3][x]);
        }
    }
}
