/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pro;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author computo
 */
public class hilo extends Thread {
    private int inicio;
    private int segundos;
    private int minutos;
    private int hora;
    private JLabel salida;
    private JLabel temp;
    private boolean pausa;
    private JTextArea ola;
    private String a = null,b = null,c = null;

    public JTextArea getOla() {
        return ola;
    }

    public void setOla(JTextArea ola) {
        this.ola = ola;
    }

    public boolean isPausa() {
        return pausa;
    }

    public void setPausa(boolean pausa) {
        this.pausa = pausa;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public JLabel getSalida() {
        return salida;
    }

    public void setSalida(JLabel salida) {
        this.salida = salida;
    }

    public JLabel getTemp() {
        return temp;
    }

    public void setTemp(JLabel temp) {
        this.temp = temp;
    }
    public void run(){
        
        for (hora=0;hora<60;hora++){
            for(minutos=0;minutos<60;minutos++){
                for(segundos=0;segundos<60;segundos++){
                    for(inicio=0;inicio<500;inicio++){
                        
                    
                    try{
                    while(pausa)
            {
                synchronized(this){
                    wait();
                }
            }
                    a = Integer.toString(segundos);//esto es para los segundos
                    b = Integer.toString(hora);//esto es la hora
                    c = Integer.toString(minutos);
                    if(segundos<10){
                        a = ("0"+segundos);
                    }
                    if(hora<10){
                        b= ("0"+hora);
                    }
                    if(minutos<10){
                        c = ("0"+minutos);
                    }
                    salida.setText(b+":"+c+":"+a);
                    String mil = Integer.toString(inicio);
                    temp.setText(mil);
                    sleep(1);
                    
                    }catch (InterruptedException ex) {
            if(!pausa)
            { //terminar el hilo
                
                return;
            }
         }
                }
            }
            }
            
        }
        
        
        
        
    }
    public static void delaysegundo(){
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            
        }
        
    }
    public void setPausa() {
        ola.append(b+":"+c+":"+a+"  "+inicio+"\n");
        this.pausa =true;
        interrupt();
    }
    public void continuar()
    {
        
        synchronized(this){
            pausa=false;
            notify();
        }
    }
    
    
}
