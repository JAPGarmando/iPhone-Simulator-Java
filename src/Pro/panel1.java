/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pro;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Azka
 */
public class panel1 extends javax.swing.JPanel {
//Variables necesariar para la conexión y el acceso a otros paneles

    Connection con;
    PreparedStatement instruccion;
    ResultSet datos;
    panel2 pn2 = new panel2();
    Panel0 pn0 = new Panel0();
    conectar cc = new conectar();
    Connection cn = cc.conexion();
    variablesbool var = new variablesbool();

    /**
     * Creates new form panel1
     */
    public panel1() {
        initComponents();
        //Se compara los privilegios del usuario, y se pone dependiendo cuales botones estarán libres de acceso
        if (var.admin == true) {
            JOptionPane.showMessageDialog(this, "Eres Admin, puedes:\ncambiar todos los ajustes que quieras");
            contra.setEnabled(true);
            color.setEnabled(true);
            fondo.setEnabled(true);
        }
        if (var.usuario) {
            var.adus = 2;
            avistx.setText("Cambiar contraseña Usuario");
            bot.setEnabled(false);
            bot.setVisible(false);
        } else if (var.invitado) {
            var.adus = 3;
            avistx.setText("No puedes hacer cambios");
            bot.setEnabled(false);
            bot.setVisible(false);
        }
        if (var.usuario) {
            JOptionPane.showMessageDialog(this, "Eres Usuario, puedes:\ncambiar el color del iPhone, su fondo, y cambiar la contraseña del usuario");
            contra.setEnabled(true);
            color.setEnabled(true);
            fondo.setEnabled(true);

        }
        if (var.invitado) {
            JOptionPane.showMessageDialog(this, "Eres invitado, puedes:\ncambiar el fondo del iPhone");
            contra.setEnabled(false);
            color.setEnabled(false);
            fondo.setEnabled(true);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        ant = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        contra = new javax.swing.JButton();
        nue = new javax.swing.JPasswordField();
        nue2 = new javax.swing.JPasswordField();
        prueba = new javax.swing.JLabel();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        fondo = new javax.swing.JButton();
        radio4 = new javax.swing.JRadioButton();
        radionegro = new javax.swing.JRadioButton();
        radioblanco = new javax.swing.JRadioButton();
        color = new javax.swing.JButton();
        avistx = new javax.swing.JLabel();
        bot = new javax.swing.JButton();

        setBackground(new java.awt.Color(126, 126, 126));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        ant.setBackground(new java.awt.Color(34, 34, 34));
        ant.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        ant.setForeground(new java.awt.Color(255, 255, 255));
        ant.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESA CONTRASEÑA ANTIGUA");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INGRESA CONTRASEÑA NUEVA");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VUELVE A INGRESAR CONTRASEÑA ");

        contra.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 8)); // NOI18N
        contra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hola/OKI.png"))); // NOI18N
        contra.setBorderPainted(false);
        contra.setContentAreaFilled(false);
        contra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/hola/OKI (1).png"))); // NOI18N
        contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraActionPerformed(evt);
            }
        });

        nue.setBackground(new java.awt.Color(34, 34, 34));
        nue.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        nue.setForeground(new java.awt.Color(255, 255, 255));
        nue.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nue2.setBackground(new java.awt.Color(34, 34, 34));
        nue2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        nue2.setForeground(new java.awt.Color(255, 255, 255));
        nue2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        buttonGroup1.add(radio1);
        radio1.setText("1");
        radio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hola/fondo (1).png"))); // NOI18N

        buttonGroup1.add(radio2);
        radio2.setText("2");
        radio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hola/fondo2.jpg"))); // NOI18N

        buttonGroup1.add(radio3);
        radio3.setText("3");
        radio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hola/fondopre.jpg"))); // NOI18N

        fondo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        fondo.setText("cambiar fondo");
        fondo.setContentAreaFilled(false);
        fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fondoActionPerformed(evt);
            }
        });

        radio4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hola/New Project (6).png"))); // NOI18N
        radio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio4ActionPerformed(evt);
            }
        });

        buttonGroup3.add(radionegro);
        radionegro.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        radionegro.setText("Negro");
        radionegro.setContentAreaFilled(false);

        buttonGroup3.add(radioblanco);
        radioblanco.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        radioblanco.setText("Blanco");
        radioblanco.setContentAreaFilled(false);

        color.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        color.setText("cambiar color iPhone");
        color.setBorderPainted(false);
        color.setContentAreaFilled(false);
        color.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorActionPerformed(evt);
            }
        });

        avistx.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        avistx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        avistx.setText("CAMBIAR CONTRASEÑA ADMIN");

        bot.setText(">");
        bot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(radionegro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioblanco)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(ant, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(nue, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(nue2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(contra, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prueba, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(color))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(radio1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fondo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radio2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(radio3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(radio4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(avistx, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bot)
                        .addGap(19, 19, 19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bot)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(avistx, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(ant, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(nue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(nue2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(contra, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radio1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(fondo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioblanco, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(radionegro))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prueba, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraActionPerformed
        // TODO add your handling code here:}
//Comparar y cambiar contraseña

        String a = ant.getText();
        String b = nue.getText();
        String c = nue2.getText();

        try {
            int A = Integer.parseInt(a);
            int B = Integer.parseInt(b);
            int C = Integer.parseInt(c);
            String sql = "";
            if (var.adus == 1) {
                sql = ("SELECT contra2 FROM contraseña WHERE contra2='" + a + "'");
            }
            if (var.adus == 2) {
                sql = ("SELECT contra FROM contraseña WHERE contra='" + a + "'");
            }
            if (var.adus == 3) {
                sql = ("SELECT contra3 FROM contraseña WHERE contra3='" + a + "'");
            }
            //sql = ("SELECT contra FROM contraseña WHERE contra='" + a + "'");
            PreparedStatement sen = cn.prepareStatement(sql);
            ResultSet resultado = sen.executeQuery();
            if (resultado.next()) {
                if (b.equals(c) && c.equals(b)) {
                    if (var.adus == 1) {
                        //sql = ("SELECT contra2 FROM contraseña WHERE contra2='" + a + "'");
                        instruccion = cn.prepareStatement("UPDATE contraseña SET contra2=? WHERE contra2=?");
                    }
                    if (var.adus == 2) {
                        //sql = ("SELECT contra FROM contraseña WHERE contra='" + a + "'");
                        instruccion = cn.prepareStatement("UPDATE contraseña SET contra=? WHERE contra=?");
                    }
                    if (var.adus == 3) {
                        //sql = ("SELECT contra3 FROM contraseña WHERE contra3='" + a + "'");
                        instruccion = cn.prepareStatement("UPDATE contraseña SET contra3=? WHERE contra3=?");
                    }
                    //instruccion = cn.prepareStatement("UPDATE contraseña SET contra=? WHERE contra=?");
                    instruccion.setString(1, b);
                    instruccion.setString(2, a);
                    int ren = instruccion.executeUpdate();
                    JOptionPane.showMessageDialog(this, "actualizó " + ren);
                    //JOptionPane.showMessageDialog(this, "Cambio hecho con éxito");
//                    String sql2 = "";
//                    sql2 = ("UPDATE contraseña SET contra'"+b+"'  WHERE contra'"+a+"'");
//                    PreparedStatement sn = cn.prepareStatement(sql2);
//                    sn.executeUpdate();
//                    String sql3 = "";
//                    sql3 = ("INSERT INTO contraseña(contra) VALUES (?)");
//                    PreparedStatement sn3 = cn.prepareStatement(sql3);
//                    sn3.setString(1, B);
//                    sn3.executeUpdate();
//                    sn3.close();
                } else {
                    JOptionPane.showMessageDialog(this, "Las contraseñas no son iguales");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Contraseña incorrecta, intente de nuevo");
                nue.setText("");
                nue2.setText("");
                ant.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "La nueva contraseña debe de ser numérica:\n" + e);
        }
    }//GEN-LAST:event_contraActionPerformed

    private void fondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fondoActionPerformed
        // TODO add your handling code here:
        //cambiar el fondo de pantalla del celular
        int a = 1;
        if (radio1.isSelected()) {
            a = 1;
        }
        if (radio2.isSelected()) {
            a = 2;
        }
        if (radio3.isSelected()) {
            a = 3;
        }
        if (radio4.isSelected()) {
            a = 4;
        }
        //Cada radio button tiene un valor que se pondrá en la base de datos, y dependiendo del valor
        //Será el fondo que se le asignará (El valor lo ocupa en panel0)
        try {
            String sql = "";
            sql = ("SELECT * FROM fondopantalla");
            PreparedStatement sen = cn.prepareStatement(sql);
            ResultSet resultado = sen.executeQuery();
            if (resultado.next()) {
                String B = Integer.toString(a);
                String m = resultado.getString("wallpaper");
                //JOptionPane.showMessageDialog(this, "a huevo: " + m);
                //BORRAR Y PONER
                String sql2 = "";
                sql2 = ("DELETE FROM fondopantalla WHERE wallpaper='" + m + "'");
                PreparedStatement sn = cn.prepareStatement(sql2);
                sn.executeUpdate();
                String sql3 = "";
                sql3 = ("INSERT INTO fondopantalla(wallpaper) VALUES (?)");
                PreparedStatement sn3 = cn.prepareStatement(sql3);
                sn3.setString(1, B);
                sn3.executeUpdate();
                sn3.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en el fondo");
        }


    }//GEN-LAST:event_fondoActionPerformed

    private void radio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio4ActionPerformed

    private void colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorActionPerformed
        // TODO add your handling code here:
        //Cambiar color de iphone
        int a = 1;
        if (radionegro.isSelected()) {
            a = 1;
        }
        if (radioblanco.isSelected()) {
            a = 2;
        }

        try {
            String sql = "";
            sql = ("SELECT * FROM coloriphone");
            PreparedStatement sen = cn.prepareStatement(sql);
            ResultSet resultado = sen.executeQuery();
            if (resultado.next()) {
                String B = Integer.toString(a);
                String m = resultado.getString("iphone");
                //BORRAR Y PONER
                String sql2 = "";
                sql2 = ("DELETE FROM coloriphone WHERE iphone='" + m + "'");
                PreparedStatement sn = cn.prepareStatement(sql2);
                sn.executeUpdate();
                String sql3 = "";
                sql3 = ("INSERT INTO coloriphone(iphone) VALUES (?)");
                PreparedStatement sn3 = cn.prepareStatement(sql3);
                sn3.setString(1, B);
                sn3.executeUpdate();
                sn3.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en el fondo");
        }
    }//GEN-LAST:event_colorActionPerformed

    private void botActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botActionPerformed

        //Dependiendo del valor de var.adus y si var.admin es verdadero, se podrá cambiar la contraseña de ambos
        //Admin y usuario
        if (var.admin) {
            var.adus++;
            if (var.adus > 2) {
                var.adus = 1;
            }
            if (var.adus == 1) {
                avistx.setText("CAMBIAR CONTRASEÑA ADMIN");
            } else if (var.adus == 2) {
                avistx.setText("CAMBIAR CONTRASEÑA USUARIO");
            }
            
        }
        System.out.println(""+var.adus);
    }//GEN-LAST:event_botActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ant;
    private javax.swing.JLabel avistx;
    private javax.swing.JButton bot;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton color;
    private javax.swing.JButton contra;
    private javax.swing.JButton fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField nue;
    private javax.swing.JPasswordField nue2;
    private javax.swing.JLabel prueba;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JRadioButton radio4;
    private javax.swing.JRadioButton radioblanco;
    private javax.swing.JRadioButton radionegro;
    // End of variables declaration//GEN-END:variables
}