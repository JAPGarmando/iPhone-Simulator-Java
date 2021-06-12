/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import static javafx.scene.paint.Color.color;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Azka
 */
public class Panel0 extends javax.swing.JPanel {

    conectar cc = new conectar();
    Connection cn = cc.conexion();
    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    JColorChooser Selectorcolor=new JColorChooser();
    public ResultSet seleccionar(String desde, String donde){
        ResultSet resultado = null;
        try {
            String sql = "";
            sql = ("SELECT * FROM " +desde);
            PreparedStatement sen = cn.prepareStatement(sql);
            resultado = sen.executeQuery();
         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
        }
        
        return resultado;
    }
GUI ok;
    /**
     * Creates new form Panel0
     */
    public Panel0() {
        initComponents();
        GUI ok;
        
        
        //HORA
        String min="";
        String hor="";
        LocalDateTime locaDate = LocalDateTime.now();
        int hora = locaDate.getHour();
        int minutos = locaDate.getMinute();
        if(minutos>9){
            min= (Integer.toString(minutos));
                }else{
            min= ("0"+minutos);
        }
        
        if(hora<12){
        horal.setText(hora + ":" + min+" AM");
        }else{
        horal.setText((hora-12) + ":" + min+" PM");   
        }
        
        
        
        ResultSet resultado=seleccionar("fondopantalla","wallpaper");
        //OK
        try{
           if (resultado.next()) {

                String m = resultado.getString("wallpaper");

                int fondo = Integer.parseInt(m);
                if (fondo == 1) {
                    fondolabel.setIcon(new ImageIcon(getClass().getResource("/hola/fondo (1).png")));
                } else if (fondo == 2) {
                    fondolabel.setIcon(new ImageIcon(getClass().getResource("/hola/fondo (2).png")));
                } else if (fondo == 3) {
                    fondolabel.setIcon(new ImageIcon(getClass().getResource("/hola/fondo (3).png")));
                    cronob.setForeground(Color.WHITE);
                    ajustesb.setForeground(Color.WHITE);
                    baterial.setIcon(new ImageIcon(getClass().getResource("/hola/New Project (5).png")));
                    baterial.setForeground(Color.WHITE);
                    horal.setForeground(Color.WHITE);
                    telcel.setForeground(Color.WHITE);
                    
                } else if(fondo==4){             
                    fondolabel.setIcon(new ImageIcon(getClass().getResource("/hola/New Project (7).png")));
                    baterial.setForeground(Color.WHITE);
                    horal.setForeground(Color.WHITE);
                    telcel.setForeground(Color.WHITE);
                    baterial.setIcon(new ImageIcon(getClass().getResource("/hola/New Project (5).png")));
                }
                else {
                    JOptionPane.showMessageDialog(this, "Error inesperado");
                }
           
            }
        }catch(Exception e){
                   JOptionPane.showMessageDialog(this,"ERROR RARÍSIMO");
                   }
        
        //OK
        
        /*try {
            String sql = "";
            sql = ("SELECT * FROM fondopantalla");
            PreparedStatement sen = cn.prepareStatement(sql);
            ResultSet resultado = sen.executeQuery();
            if (resultado.next()) {

                String m = resultado.getString("wallpaper");

                int fondo = Integer.parseInt(m);
                if (fondo == 1) {
                    fondolabel.setIcon(new ImageIcon(getClass().getResource("/hola/fondo (1).png")));
                } else if (fondo == 2) {
                    fondolabel.setIcon(new ImageIcon(getClass().getResource("/hola/fondo (2).png")));
                } else if (fondo == 3) {
                    fondolabel.setIcon(new ImageIcon(getClass().getResource("/hola/fondo (3).png")));
                    cronob.setForeground(Color.WHITE);
                    ajustesb.setForeground(Color.WHITE);
                    baterial.setIcon(new ImageIcon(getClass().getResource("/hola/New Project (5).png")));
                    baterial.setForeground(Color.WHITE);
                    horal.setForeground(Color.WHITE);
                    telcel.setForeground(Color.WHITE);
                    
                } else if(fondo==4){             
                    fondolabel.setIcon(new ImageIcon(getClass().getResource("/hola/New Project (7).png")));
                    baterial.setForeground(Color.WHITE);
                    horal.setForeground(Color.WHITE);
                    telcel.setForeground(Color.WHITE);
                    baterial.setIcon(new ImageIcon(getClass().getResource("/hola/New Project (5).png")));
                }
                else {
                    JOptionPane.showMessageDialog(this, "Error inesperado");
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en el fondoooo");
        }
        //FIN COSAS RARAS
*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelpri = new javax.swing.JPanel();
        baterial = new javax.swing.JLabel();
        telcel = new javax.swing.JLabel();
        horal = new javax.swing.JLabel();
        cronob = new javax.swing.JButton();
        ajustesb = new javax.swing.JButton();
        fondolabel = new javax.swing.JLabel();
        cronob2 = new javax.swing.JButton();
        cronob1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(323, 580));

        panelpri.setBackground(new java.awt.Color(255, 255, 255));
        panelpri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        panelpri.setPreferredSize(new java.awt.Dimension(280, 523));
        panelpri.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelpriKeyPressed(evt);
            }
        });

        baterial.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        baterial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        baterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hola/bateria bueno.png"))); // NOI18N
        baterial.setText("88%");
        baterial.setFocusable(false);
        baterial.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        telcel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        telcel.setText("TELCEL");
        telcel.setFocusable(false);

        horal.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 11)); // NOI18N
        horal.setText("4:56 PM");
        horal.setFocusable(false);

        cronob.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 11)); // NOI18N
        cronob.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hola/ap (1).png"))); // NOI18N
        cronob.setBorder(null);
        cronob.setBorderPainted(false);
        cronob.setContentAreaFilled(false);
        cronob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cronob.setFocusable(false);
        cronob.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cronob.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        cronob.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cronob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cronobActionPerformed(evt);
            }
        });

        ajustesb.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 11)); // NOI18N
        ajustesb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hola/ap.png"))); // NOI18N
        ajustesb.setBorder(null);
        ajustesb.setBorderPainted(false);
        ajustesb.setContentAreaFilled(false);
        ajustesb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ajustesb.setFocusable(false);
        ajustesb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ajustesb.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ajustesb.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ajustesb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajustesbActionPerformed(evt);
            }
        });

        fondolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondolabel.setFocusable(false);
        fondolabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fondolabelKeyPressed(evt);
            }
        });

        cronob2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 11)); // NOI18N
        cronob2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hola/ap (1) (1).png"))); // NOI18N
        cronob2.setBorder(null);
        cronob2.setBorderPainted(false);
        cronob2.setContentAreaFilled(false);
        cronob2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cronob2.setFocusable(false);
        cronob2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cronob2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        cronob2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cronob2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cronob2ActionPerformed(evt);
            }
        });

        cronob1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 11)); // NOI18N
        cronob1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hola/ap (1) (2).png"))); // NOI18N
        cronob1.setBorder(null);
        cronob1.setBorderPainted(false);
        cronob1.setContentAreaFilled(false);
        cronob1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cronob1.setFocusable(false);
        cronob1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cronob1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        cronob1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cronob1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cronob1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelpriLayout = new javax.swing.GroupLayout(panelpri);
        panelpri.setLayout(panelpriLayout);
        panelpriLayout.setHorizontalGroup(
            panelpriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpriLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(telcel)
                .addGap(93, 93, 93)
                .addComponent(horal)
                .addGap(73, 73, 73)
                .addComponent(baterial))
            .addGroup(panelpriLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(ajustesb))
            .addGroup(panelpriLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(cronob1))
            .addGroup(panelpriLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(cronob))
            .addGroup(panelpriLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(cronob2))
            .addComponent(fondolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelpriLayout.setVerticalGroup(
            panelpriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelpriLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelpriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telcel)
                    .addComponent(horal)
                    .addComponent(baterial))
                .addGap(490, 490, 490)
                .addComponent(ajustesb))
            .addGroup(panelpriLayout.createSequentialGroup()
                .addGap(511, 511, 511)
                .addComponent(cronob1))
            .addGroup(panelpriLayout.createSequentialGroup()
                .addGap(511, 511, 511)
                .addComponent(cronob))
            .addGroup(panelpriLayout.createSequentialGroup()
                .addGap(511, 511, 511)
                .addComponent(cronob2))
            .addComponent(fondolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelpri, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelpri, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ajustesbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajustesbActionPerformed
        // TODO add your handling code here:
        panel1 pn1 = new panel1();
        pn1.setSize(323, 580);
        panelpri.removeAll();
        panelpri.add(pn1, BorderLayout.CENTER);
        panelpri.revalidate();
        panelpri.repaint();

    }//GEN-LAST:event_ajustesbActionPerformed

    private void cronobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cronobActionPerformed
        // TODO add your handling code here:
        panel2 pn2 = new panel2();
        pn2.setSize(323, 580);
        panelpri.removeAll();
        panelpri.add(pn2, BorderLayout.CENTER);
        panelpri.revalidate();
        panelpri.repaint();
    }//GEN-LAST:event_cronobActionPerformed

    private void cronob1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cronob1ActionPerformed
        // TODO add your handling code here:
        
        Juego  pn2 = new Juego();
        pn2.setSize(323, 580);
        
        panelpri.removeAll();
        panelpri.add(pn2, BorderLayout.CENTER);
        panelpri.revalidate();
        panelpri.repaint();
        
        
        
        //ok.setFocusable(true);
        
        
    }//GEN-LAST:event_cronob1ActionPerformed

    private void fondolabelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fondolabelKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fondolabelKeyPressed

    private void panelpriKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelpriKeyPressed
        // TODO add your handling code here:
        System.out.println("o");
    }//GEN-LAST:event_panelpriKeyPressed

    private void cronob2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cronob2ActionPerformed
        // TODO add your handling code here:
        Juego2 pn2 = new Juego2();
        pn2.setSize(323, 580);
        panelpri.removeAll();
        panelpri.add(pn2, BorderLayout.CENTER);
        panelpri.revalidate();
        panelpri.repaint();
    }//GEN-LAST:event_cronob2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajustesb;
    private javax.swing.JLabel baterial;
    private javax.swing.JButton cronob;
    private javax.swing.JButton cronob1;
    private javax.swing.JButton cronob2;
    private javax.swing.JLabel fondolabel;
    private javax.swing.JLabel horal;
    private javax.swing.JPanel panelpri;
    private javax.swing.JLabel telcel;
    // End of variables declaration//GEN-END:variables
}
