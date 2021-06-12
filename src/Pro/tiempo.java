/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pro;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Azka
 */
public class tiempo extends Thread{
    JLabel ok;
    Juego jpp;

    public JLabel getOk() {
        return ok;
    }

    public void setOk(JLabel ok) {
        this.ok = ok;
    }
    public tiempo(Juego jpp){
        this.jpp = jpp;
    }
    
    public void run(){
        int i= 0;
        while(!jpp.perder){
            
            try {
                
                jpp.tiempo.setText(Integer.toString(i));
                sleep(1000);
                i++;
            } catch (InterruptedException ex) {
                Logger.getLogger(tiempo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
