/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pro;

/**
 *
 * @author Azka
 */
public class panel2 extends javax.swing.JPanel {
hilo o = new hilo();
    /**
     * Creates new form panel2
     */
    public panel2() {
        initComponents();
        play.setVisible(false);
        pau.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        play = new javax.swing.JLabel();
        stop = new javax.swing.JLabel();
        pau = new javax.swing.JButton();
        crono = new javax.swing.JLabel();
        ini = new javax.swing.JButton();
        btTerminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mili = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(29, 27, 27));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        setPreferredSize(new java.awt.Dimension(330, 580));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pro/A VER/play.png"))); // NOI18N
        play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(play, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pro/A VER/pausab.png"))); // NOI18N
        add(stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        pau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pro/A VER/transp.png"))); // NOI18N
        pau.setBorder(null);
        pau.setBorderPainted(false);
        pau.setContentAreaFilled(false);
        pau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauActionPerformed(evt);
            }
        });
        add(pau, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, 130));

        crono.setBackground(new java.awt.Color(255, 255, 255));
        crono.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        crono.setForeground(new java.awt.Color(255, 255, 255));
        crono.setText("00:00:00");
        add(crono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 59));

        ini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pro/A VER/inicio.png"))); // NOI18N
        ini.setText("INICIO");
        ini.setBorder(null);
        ini.setBorderPainted(false);
        ini.setContentAreaFilled(false);
        ini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniActionPerformed(evt);
            }
        });
        add(ini, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 130));

        btTerminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pro/A VER/stop bien.png"))); // NOI18N
        btTerminar.setBorder(null);
        btTerminar.setBorderPainted(false);
        btTerminar.setContentAreaFilled(false);
        btTerminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTerminarActionPerformed(evt);
            }
        });
        add(btTerminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 150, 140));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CRONÓMETRO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Julio Armando Pérez Gama");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        mili.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mili.setForeground(new java.awt.Color(255, 255, 255));
        mili.setText("000");
        add(mili, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(29, 27, 27));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jTextArea1.setFocusable(false);
        jTextArea1.setSelectionColor(new java.awt.Color(204, 204, 204));
        add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 130, 250));
    }// </editor-fold>//GEN-END:initComponents

    private void iniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniActionPerformed
        // TODO add your handling code here:
        o = new hilo();
        o.setSalida(crono);
        o.setTemp(mili);
        o.setOla(jTextArea1);
        o.start();
        ini.setEnabled(false);
        stop.setVisible(true);

    }//GEN-LAST:event_iniActionPerformed

    private void btTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTerminarActionPerformed
        o.interrupt();
        crono.setText("00:00:00");
        mili.setText("000");
        ini.setEnabled(true);
        play.setVisible(false);
        stop.setVisible(true);
        jTextArea1.setText("");
    }//GEN-LAST:event_btTerminarActionPerformed

    private void pauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauActionPerformed
        // TODO add your handling code here:
        if(o.getState()==Thread.State.WAITING){

            
            o.continuar();
            play.setVisible(false);
            stop.setVisible(true);

        }else{
           
            
            o.setPausa();

            play.setVisible(true);
            stop.setVisible(false);

        }
    }//GEN-LAST:event_pauActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btTerminar;
    private javax.swing.JLabel crono;
    private javax.swing.JButton ini;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel mili;
    private javax.swing.JButton pau;
    private javax.swing.JLabel play;
    private javax.swing.JLabel stop;
    // End of variables declaration//GEN-END:variables
}