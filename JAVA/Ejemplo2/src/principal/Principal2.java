/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import clases.Estudiante;
import java.util.Scanner;

/**
 *
 * @author erwin
 */
public class Principal2 {
    static Estudiante lstEstudiantes[] = new Estudiante[100];
    static int op = 0;
    static int contador = 0;
    
    public static void main(String[] args){
        do{
            menu();
            Scanner sc = new Scanner(System.in);
            op = Integer.parseInt(sc.nextLine());
            
            switch(op){
                case 1:
                    System.out.println("\nIngrese la información del estudiante:");
                    
                    lstEstudiantes[contador] = new Estudiante();
                    
                    System.out.println("Ingrese el nombre del estudiante:");
                    String valor = sc.nextLine();
                    lstEstudiantes[contador].nombres = valor;
                    
                    System.out.println("Ingrese los apellidos del estudiante:");
                    valor = sc.nextLine();
                    lstEstudiantes[contador].apellidos = valor;
                    
                    System.out.println("Ingrese la dirección del estudiante:");
                    valor = sc.nextLine();
                    lstEstudiantes[contador].direccion = valor;
                    
                    System.out.println("Ingrese la Edad del estudiante: ");
                    valor = sc.nextLine();
                    lstEstudiantes[contador].edad = valor;
                    
                    contador++;
                    break;
                case 2:
                    mostrarAlumnos();
                    System.out.println("\nIngrese el no. de estudiante que desea editar:");
                    int noAlumno = Integer.parseInt(sc.nextLine())-1;
                    
                    System.out.println("Ingrese el nombre del estudiante:");
                    valor = sc.nextLine();
                    lstEstudiantes[noAlumno].nombres = valor;
                    
                    System.out.println("Ingrese el apellido del estudiante:");
                    valor = sc.nextLine();
                    lstEstudiantes[noAlumno].apellidos = valor;
                    
                    System.out.println("Ingrese la dirección del estudiante:");
                    valor = sc.nextLine();
                    lstEstudiantes[noAlumno].direccion = valor;
                    
                    System.out.println("Ingrese la edad del estudiante:");
                    valor = sc.nextLine();
                    lstEstudiantes[noAlumno].edad = valor;
                    
                    break;
                case 3:
                    mostrarAlumnos();
                    sc.next();
                    break;
                case 4:
                    mostrarAlumnos();
                    System.out.println("\nIngrese el no. de estudiante que desea eliminar:");
                    noAlumno = Integer.parseInt(sc.nextLine())-1;
                    
                    lstEstudiantes[noAlumno] = new Estudiante();
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
    
    public static void mostrarAlumnos(){
        System.out.println("\n-------------------");
        System.out.println("  LISTADO DE ALUMNOS");
        System.out.println("-------------------");
        
        System.out.println("No. \tNombres \tApellidos \tDirección \tEdad");

        for (int x =0;x<=contador-1;x++){
            System.out.println("" + (x+1) + ") \t" + lstEstudiantes[x].nombres +" \t\t"+lstEstudiantes[x].apellidos +" \t\t"+lstEstudiantes[x].direccion +" \t\t"+lstEstudiantes[x].edad);
        }
    }
    
}
