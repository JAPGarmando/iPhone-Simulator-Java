package Pro;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Azka
 */
public class HiloBola extends Thread {
   GUI ok; 
    conectar cc = new conectar();
    Connection con = cc.conexion();
    PreparedStatement instruccion;
    ResultSet datos;

    private int x = 31, y = 3, xCambio = 1, yCambio = 1, p = 0, dif = 4;
    private int w, h;
    private Graphics g;
    private Color fondo, bola;
    private boolean colision = false;
    
    Rectangle rectangle1;
    private JLabel coor, lp2, score;
    String q = "0";
    Juego2 chido;

    public JLabel getScore() {
        return score;
    }

    public void setScore(JLabel score) {
        this.score = score;
    }

    public JLabel getLp2() {
        return lp2;
    }

    public void setLp2(JLabel lp2) {
        this.lp2 = lp2;
    }

    public JLabel getCoor() {
        return coor;
    }

    public void setCoor(JLabel coor) {
        this.coor = coor;
    }

    public HiloBola(int o, Rectangle lol, Juego2 chido, GUI ok) {
        this.p = o;
        this.chido = chido;
        rectangle1 = lol.getBounds();
        this.ok = ok;

        if (rectangle1.intersects(John())) {
            colision = true;
        } else {
            colision = false;
        }

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxCambio() {
        return xCambio;
    }

    public void setxCambio(int xCambio) {
        this.xCambio = xCambio;
    }

    public int getyCambio() {
        return yCambio;
    }

    public void setyCambio(int yCambio) {
        this.yCambio = yCambio;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public Graphics getG() {
        return g;
    }

    public void setG(Graphics g) {
        this.g = g;
    }

    public Color getFondo() {
        return fondo;
    }

    public void setFondo(Color fondo) {
        this.fondo = fondo;
    }

    public Color getBola() {
        return bola;
    }

    public void setBola(Color bola) {
        this.bola = bola;
    }

    public Rectangle John() {
        return new Rectangle(x, y, 1, 30);
    }

    public void collision() {
        //return game.racquet.getBounds().intersects(getBounds());
        Rectangle rectangle1 = chido.boundess();

        if (rectangle1.intersects(John())) {
            colision = true;
        } else {
            colision = false;
        }

    }

    public void OK() {
        System.out.println("KO");
    }

    public void run() {

        //Graphics g = chido.getGraphics();
        //g.drawRect(0, 0, getWidth()-150, getHeight());
        // g.drawRect(0, 0, 500, 300);
        g = chido.getGraphics();
        while (true) {
            g.setColor(chido.getBackground());
                g.fillRect(x, y, 30, 30);
            
            int b = Integer.parseInt(q);
            Rectangle ola = new Rectangle(b, 560, 75, 1);
            Color myWhite = new Color(255, 255, 255);

            //g.setColor(fondo);
            //g.fillOval(x, y, 30, 30);
            try {

                if (x == (w - 31)) {
                    xCambio = -xCambio;
                    Sonido.BOING.play();
                }
                if (x == 1) {
                    xCambio = -xCambio;
                    Sonido.BOING.play();

                }
                if (y == h - 30) {
                    //yCambio = -yCambio;
                    Sonido.CHUEK.stop();
                    Sonido.GAMEOVERR.play();
                    JOptionPane.showMessageDialog(chido, "GAME OVER, HICISTE: "+chido.puntos.getText()+" Puntos!");
                    try {

                    int ren;
                    instruccion = con.prepareStatement("INSERT INTO juegotennis (Usuario, Puntaje) VALUES(?,?)");

                    instruccion.setString(1, JOptionPane.showInputDialog("Ingresa el nombre de usuario: "));
                    instruccion.setInt(2, Integer.parseInt(chido.puntos.getText()));
                    

                    ren = instruccion.executeUpdate();
                    JOptionPane.showMessageDialog(chido, "Insertó " + ren);
                    int in = JOptionPane.showConfirmDialog(null, "¿Desea ver puntaje de algún jugador?", "Checar Base", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (in == 0) {
                        try {
                            instruccion = con.prepareStatement("SELECT Usuario, Puntaje, FechaHora FROM juegotennis WHERE ID=?");
                            instruccion.setInt(1, Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ID")));
                            datos = instruccion.executeQuery();
                            if (datos.next()) {
                                JOptionPane.showMessageDialog(chido, "Usuario: " + datos.getString(1) + "\nPuntaje: " + datos.getString(2)  + "\nFechaHora: " + datos.getString(3));
                                //txActualizado.setText(datos.getString("last_update"));

                            } else {
                                JOptionPane.showMessageDialog(chido, "No se recuperó información");

                            }

                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(chido, "Error BD\n"
                                    + e.getMessage() + "\n" + e.getSQLState()
                                    + "\n" + e.getErrorCode()
                            );
                        }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(chido, "El ID debe de ser numérico");
                }
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(chido, "Error BD\n"
                            + e.getMessage() + "\n" + e.getSQLState()
                            + "\n" + e.getErrorCode()
                    );
                }
                    ok.dispose();
        GUI.main(null);
                return;
                    //System.exit(0);
                }
                if (y == 1) {
                    yCambio = -yCambio;
                    
                    Sonido.BOING.play();

                }

                if (ola.intersects(John())) {
                    yCambio = -yCambio;
                    Sonido.BOING.play();
                    score.setText(Integer.toString(p - 1));
                    p++;

                }

                x += xCambio;
                y += yCambio;
                //System.out.println(xCambio);
                g.setColor(bola);
                g.fillOval(x, y, 30, 30);
                q = coor.getText();

                String m = score.getText();
                int d = Integer.parseInt(m);
                if (d >= 5 && d < 10) {
                    dif = 3;
                }
                if (d >= 10 && d < 20) {
                    dif = 2;
                }
                if (d >= 20) {
                    dif = 1;
                }
                sleep(dif);

            } catch (InterruptedException ex) {
                System.out.println("ERROR");
            }
        }

    }

}
