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
public class Ejemplo11 {
    static int[][] matriz;
    
    public static void main(String[] args){
        matriz = new int[8][8];
        
        for (int y = 0; y<=7; y++){
            for (int x = 0; x<=7; x++){
                matriz[x][y] = 0;
            }
        }
        
        int valor = 0;
        for (int y = 0; y<=7; y++){
            for (int x = 0; x<=7; x++){
                matriz[x][y] = valor;
                
                if (valor == 0){
                    valor++;
                }else{
                    valor--;
                }
            }
            
            if (valor == 0){
                valor++;
            }else{
                valor--;
            }
        }
        
        for (int y = 0; y<=7; y++){
            for (int x = 0; x<=7; x++){
                System.out.print(matriz[x][y] + " ");
            }
            System.out.print("\n");
        }
    }
    
}
