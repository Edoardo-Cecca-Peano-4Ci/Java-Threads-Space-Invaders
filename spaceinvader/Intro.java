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
public class Intro extends Space{
    
    
    @Override
        public void paint(Graphics g) {
            g.setColor(Color.blue);
            g.setFont(new Font("Bold", Font.PLAIN, 80));
            g.drawString("Space Invaders", 100, 100);
            g.setColor(Color.green);
            g.setFont(new Font("Bold", Font.PLAIN, 25));
            g.drawString("          ideato da Edo Cecca", 126, 126);            
        }

    void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
