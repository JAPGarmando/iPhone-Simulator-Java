/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pro;

import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Azka
 */
public class Lanzador extends Thread{
    enemigos1 lol;
    Juego jpp;
    GUI ok;
    Graphics g;
    
    public Lanzador(enemigos1 lol, Juego jpp, GUI ok){
        this.lol= lol;
        this.jpp = jpp;
        this.ok = ok;
        
        
        
    }

    public Graphics getG() {
        return g;
    }

    public void setG(Graphics g) {
        this.g = g;
    }
            
    public void run(){
        while(true){
            try {
                sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Lanzador.class.getName()).log(Level.SEVERE, null, ex);
            }
        enemigos1 ola = new enemigos1(jpp,ok);
            ola.setG(g);
            ola.start();
            
        }
        
    }
}
