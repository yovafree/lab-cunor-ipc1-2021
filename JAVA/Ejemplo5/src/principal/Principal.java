/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import clases.FiguraGeometrica;
import clases.Triangulo;

/**
 *
 * @author erwin
 */
public class Principal {
    
    public static void main(String[] args){
        FiguraGeometrica fg = new FiguraGeometrica(3,6,8,"Triangulo");
        
        fg.MostrarInfo();
        
        Triangulo tr = new Triangulo();
        System.out.println("");
        tr.MostrarInfo();
        
    }
    
}
