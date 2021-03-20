/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import java.util.Scanner;

/**
 * Registrar un listado de estudiantes
 * @author erwin
 */
public class Ejemplo10 {
    static int op = 0;
    
    static int contador = 0;
    
    static String[] lstEstudiantes;
    
    
    public static void main(String[] args){
        lstEstudiantes = new String[100];
        llenarEstudiantes();
        
        do{
            menu();
            Scanner sc = new Scanner(System.in);
            op = Integer.parseInt(sc.nextLine());
            
            switch(op){
                case 1:
                    System.out.println("\nIngrese el nombre del estudiante:");
                    String nombre = sc.nextLine();
                    
                    lstEstudiantes[contador] = nombre;
                    contador++;
                    break;
                case 2:
                    mostrarAlumnos();
                    System.out.println("\nIngrese el no. de estudiante que desea editar:");
                    int noAlumno = Integer.parseInt(sc.nextLine())-1;
                    
                    System.out.println("Ingrese el nombre del estudiante:");
                    String estudiante = sc.nextLine();
                    lstEstudiantes[noAlumno] = estudiante;
                    
                    break;
                case 3:
                    mostrarAlumnos();
                    sc.next();
                    break;
                case 4:
                    mostrarAlumnos();
                    System.out.println("\nIngrese el no. de estudiante que desea eliminar:");
                    noAlumno = Integer.parseInt(sc.nextLine())-1;
                    
                    lstEstudiantes[noAlumno] = "-----------";
                    break;
            }
        }while(op!= 7);
    }
    
    public static void llenarEstudiantes(){
        lstEstudiantes[contador++] = "Carlos Pan";
        lstEstudiantes[contador++] = "Daniel San";
        lstEstudiantes[contador++] = "Juan Pan";
        lstEstudiantes[contador++] = "Alberto Pan";
        lstEstudiantes[contador++] = "Marcos Pan";
        lstEstudiantes[contador++] = "Luis Pan";
        lstEstudiantes[contador++] = "Juana Pan";
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

        for (int x =0;x<=contador-1;x++){
            System.out.println("" + (x+1) + ") " + lstEstudiantes[x]);
        }
    }
    
    
    
}
