/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import clases.Fruta;

/**
 *
 * @author erwin
 */
public class Principal {
    int num1=1;
    
    public static void main(String[] args){
        Fruta fruta = new Fruta();
        fruta.color = "Rojo";
        fruta.sabor = "Dulce";
        fruta.forma = "Redonda";
        fruta.tamanio = "10 cms";
        fruta.nombre = "Manzana";
        
        fruta.mostrarInformacion();
        
        Fruta fruta2 = new Fruta();
        fruta2.color = "Verde";
        fruta2.sabor = "Dulce";
        fruta2.forma = "Algo redonda";
        fruta2.tamanio = "10 cms";
        fruta2.nombre = "Pera";
        System.out.print("\n");
        fruta2.mostrarInformacion();
        
        System.out.println(fruta2.obtTamanio());
    }
}
