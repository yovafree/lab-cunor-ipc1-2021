/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 * Ejemplos de recursividad e iteración
 * @author erwin
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Factorial utilizando un método iterativo:");
        System.out.println("El factorial de 3 es: "+facI(3));
        System.out.println("El factorial de 6 es: "+facI(6));
        
        
        System.out.println("Factorial utilizando un método recursivo:");
        System.out.println("El factorial de 3 es: "+ facR(3));
        System.out.println("El factorial de 6 es: "+ facR(6));
        System.out.println();
        
        
    }
    
    // Esto es un equivalente iterativo
    
    
    static int facI (int n){
        int t, resultado;
        resultado=1;
        
        for (t=1; t<=n; t++) 
            resultado *=t;
        
        return resultado;
    }
    
    // Esto es un método recursivo
    static int facR (int n){
        int resultado;
        
        if (n==1) 
            return 1;
        
        resultado=facR(n-1)*n;
        return resultado;
    }
}
