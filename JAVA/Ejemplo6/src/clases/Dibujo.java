/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author erwin
 */
public class Dibujo extends JPanel{
    int x = 40;
    public Dibujo(){
        this.setSize(521,300);
        this.setVisible(true);
    }
    
    public void cambiarX(int i){
        x+= i;
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        Color c = Color.BLACK;
        g.setColor(c);
        
        g.fillRect(x, 40, 100, 3);
                
        g.setColor(Color.RED);
        g.drawRect(x, 60, 100, 10);
        
        g.setColor(Color.PINK);
        g.fillOval(x, 75, 25, 25);
    }
}
