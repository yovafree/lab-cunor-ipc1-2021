/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fnc;

/**
 *
 * @author erwin
 */
public class Funciones {
    
    /**
     * Método que convierte un entero a binario
     * @param dec
     * @return 
     */
    public String DecABin(int dec){
        String bin = "";
        int a = 0;
        int b = 0;
        for (int i = 1; i<= 8; i++){
            a = dec / 2;
            b = dec % 2;
            dec = a;
            bin = b + bin;
        }
        return bin;
    }
    
    /**
     * Binario a decimal
     * @param bin
     * @return 
     */
    public int BinADec(String bin){
        int dec = 0;
        int cont = 0;
        
        for (int x = bin.length()-1; x>=0;x--){
            int a = Integer.parseInt(""+bin.charAt(x));
            int b = (int)Math.pow(2, cont);          
            dec = dec + (a*b);
            cont++;
        }
        
        return dec;
    }
    
}
