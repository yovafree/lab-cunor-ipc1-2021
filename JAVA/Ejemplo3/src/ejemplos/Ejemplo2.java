/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import clases.Persona;

/**
 *
 * @author erwin
 */
public class Ejemplo2 {
    
    public static void main(String[] args){
        Persona persona1;
        persona1 = new Persona();
        
        
        persona1.setCui("4565456");
        persona1.setPrimerNombre("Juan");
        persona1.setSegundoNombre("Alberto");
        persona1.setPrimerApellido("Pan");
        
        System.out.println(persona1.getCui());
        System.out.println(persona1.getPrimerNombre() + " " + persona1.getSegundoNombre() + " " + persona1.getPrimerApellido());
    }
}
