/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvader;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

/**
 *
 * @author edoar
 */
public class Intro extends Space {

    private int i = 0;
    private BufferStrategy strategy;

   

    void run() throws InterruptedException {
        createBufferStrategy(2);
        strategy = getBufferStrategy();
        
        
        for (i = 100; i >= 10; i -= 1) {
            System.out.println("i: " + i);
            this.paint();
            Thread.sleep(10);
        }
        
    }
    
     public void paint() {
        Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
        g.fillRect(0, 0, 800, 500);
        g.setColor(Color.blue);
        g.setFont(new Font("Bold", Font.PLAIN, 40+i));
        g.drawString("Space Invaders", 100+i, 100+i);
        g.setColor(Color.green);
        g.setFont(new Font("Bold", Font.PLAIN, 25+i));
        g.drawString("          ideato da Edo Cecca", 126+ i +i, 126+i+i);
        g.dispose(); 
        strategy.show();
    }
    
}
