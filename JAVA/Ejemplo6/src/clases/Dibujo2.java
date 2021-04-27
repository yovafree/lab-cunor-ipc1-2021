/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author erwin
 */
public class Dibujo2 extends JPanel{
    int x=8;
    int y=12;
    int cSize = 25;
    int posI = 45;
    int Xsize =0;
    int Ysize =0;
    
    
    int[][] mat;
    
    
    public Dibujo2(int xSize, int ySize){
        this.setSize(xSize, ySize);
        this.Xsize = xSize;
        this.Ysize = ySize;
        
        
        mat = new int[8][12];
        for (int i=0;i<8;i++){
            for (int j=0;j<12;j++){
                mat[i][j] = 0;
            }
        }
    }
    
    public void setMat(int[][] mat){
        this.mat = mat;
    }
    
    @Override
    public void paint(Graphics g){
        g.clearRect(0, 0, this.Xsize, this.Ysize);
        
        for(int k =0; k<y;k++){
            for(int j =0; j<x;j++){
                if (mat[j][k] == 0){
                    g.setColor(Color.BLACK);
                    g.drawRect(posI+(j*cSize), posI+(k*cSize), cSize, cSize);
                }else if(mat[j][k] == 1){
                    g.setColor(Color.ORANGE);
                    g.fillRect(posI+(j*cSize), posI+(k*cSize), cSize, cSize);
                }else if(mat[j][k] == 2){
                    g.setColor(Color.RED);
                    g.fillRect(posI+(j*cSize), posI+(k*cSize), cSize, cSize);
                }
            }
        }
    }
    
}
