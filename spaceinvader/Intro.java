/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvader;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author edoar
 */
public class Intro extends Space {

    private int i = 0;

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.setFont(new Font("Bold", Font.PLAIN, 80));
        g.drawString("Space Invaders", 100, 100);
        g.setColor(Color.green);
        g.setFont(new Font("Bold", Font.PLAIN, 25));
        g.drawString("          ideato da Edo Cecca", 126, 126);
    }

    void run() throws InterruptedException {
        setBackground(Color.BLACK);
        setSize(800, 600);

        for (i = 100; i >= 0; i -= 1) {
            System.out.println("i: " + i);
            this.repaint();
            Thread.sleep(50);
        }
    }
    
}
