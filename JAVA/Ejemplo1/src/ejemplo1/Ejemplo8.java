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
public class Ejemplo8 {
    public static void main(String[] args){
        //Array - Vector
        String[] datos = new String[4];
        
        datos[0] = "Juán Pérez";
        datos[1] = "Daniel Ortega";
        datos[2] = "Carlos Agustín";
        
        for (int x = 0;x<=3;x++){
            System.out.println(datos[x]);
        }
    }
}
