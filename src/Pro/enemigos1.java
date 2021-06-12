/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pro;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Azka
 */
public class enemigos1 extends Thread{
        conectar cc = new conectar();
    Connection con = cc.conexion();
    
    GUI ok;
    PreparedStatement instruccion;
    ResultSet datos;
    Juego jpp;
    private Graphics g;
    int x=5,y=5,alto=20,ancho=20,xCambio=5,yCambio=5;

    public Graphics getG() {
        return g;
    }

    public void setG(Graphics g) {
        this.g = g;
    }
    
    
    public enemigos1(Juego jpp, GUI ok){
        this.ok = ok;
        this.jpp=jpp;
        
    }
    public void run(){
        
        
        //Rectangle bola;
        //bola = ok.colision();
        Color ene = new Color(((int)(Math.random()*250)),((int)(Math.random()*250)),((int)(Math.random()*250))    );
        while(!jpp.perder){
            
        //g.clearRect(x, y, alto, ancho);
        g.setColor(jpp.getBackground());
        g.fillRect(x, y, alto, ancho);
        if(x>jpp.getWidth()-24){
            xCambio = -xCambio;
        }
        if(x==0){
            xCambio = -xCambio;
        }
        if(y>jpp.getHeight()-27){
            yCambio = -yCambio;
        }
        if(y==0){
            yCambio=-yCambio;
            //enemigos ola = new enemigos(ok, jpp);
            //ola.setG(g);
            //ola.start();
        }
        if(jpp.colision().intersects(x, y, alto, ancho)){
            Sonido.LINK.stop();
            jpp.perder = true;
            Sonido.GAMEOVER.play();
            
            JOptionPane.showMessageDialog(jpp,"GAMEOVER ;(\n HICISTE: "+jpp.tiempo.getText()+" SEGUNDOS!");
            Sonido.GAMEOVER.stop();
                
                //gameover = true;
                //JOptionPane.showMessageDialog(null, "PERDISTEEEEEEE, tu puntuación fue de:\n " + Integer.parseInt(ok.tequiero.getText()) + " puntos");

                try {

                    int ren;
                    instruccion = con.prepareStatement("INSERT INTO juegobola (usuario, puntaje, longitud) VALUES(?,?,?)");

                    instruccion.setString(1, JOptionPane.showInputDialog("Ingresa el nombre de usuario: "));
                    instruccion.setInt(2, Integer.parseInt(jpp.tiempo.getText()));
                    instruccion.setInt(3, Integer.parseInt(jpp.tiempo.getText()));

                    ren = instruccion.executeUpdate();
                    JOptionPane.showMessageDialog(jpp, "Insertó " + ren);
                    int in = JOptionPane.showConfirmDialog(null, "¿Desea ver puntaje de algún jugador?", "Checar Base", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (in == 0) {
                        try {
                            instruccion = con.prepareStatement("SELECT usuario, puntaje, longitud, fechahora FROM juegobola WHERE id=?");
                            instruccion.setInt(1, Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ID")));
                            datos = instruccion.executeQuery();
                            if (datos.next()) {
                                JOptionPane.showMessageDialog(jpp, "Usuario: " + datos.getString(1) + "\nPuntaje: " + datos.getString(2) + "\nLongitud: " + datos.getString(3) + "\nFechaHora: " + datos.getString(4));
                                //txActualizado.setText(datos.getString("last_update"));

                            } else {
                                JOptionPane.showMessageDialog(jpp, "No se recuperó información");

                            }

                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(jpp, "Error BD\n"
                                    + e.getMessage() + "\n" + e.getSQLState()
                                    + "\n" + e.getErrorCode()
                            );
                        }
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(jpp, "Error BD\n"
                            + e.getMessage() + "\n" + e.getSQLState()
                            + "\n" + e.getErrorCode()
                    );
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(jpp, "El ID debe de ser numérico");
                }
          ok.dispose();
        GUI.main(null);
                return;
            
            //System.out.println("colision");
            
        }
        y+=yCambio;
        x+=xCambio;
            //System.out.println(""+x+" "+y );
            //System.out.println("KO");
            
        
        g.setColor(ene);
        g.fillRect(x, y, alto, ancho);
            
            try {
                sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(enemigos1.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("ERROR");
            }
        
        
        
        
        }
        
        
    }
  
}