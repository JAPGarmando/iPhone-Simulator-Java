/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pro;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Azka
 */
public class time extends Thread{
    Juego jpp;
    public time(Juego jpp){
        this.jpp=jpp;
    }
    public void run(){
        int i = 0;
        while(!jpp.perder){
            try {
                sleep(1000);
                jpp.tiempo.setText(Integer.toString(i));
                i++;
            } catch (InterruptedException ex) {
                Logger.getLogger(time.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
