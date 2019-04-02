/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;

/**
 *
 * @author hdavi
 */
public class venPartidaNueva extends javax.swing.JFrame {

    /**
     * Creates new form venPartidaNueva
     */
    public venPartidaNueva() {
        initComponents();
        
        sumNPC.setVisible(false);
        resNPC.setVisible(false);
        mosNPC.setVisible(false);
          
        
        onePlayer.setSelected(true);
        onePlayer1.setSelected(true);
        
        onePlayer1.setEnabled(false);
        twoPlayer1.setEnabled(false);
        threePlayer1.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cantJugadores = new javax.swing.ButtonGroup();
        cantNPC = new javax.swing.ButtonGroup();
        resNPC = new javax.swing.JButton();
        mosNPC = new javax.swing.JTextField();
        sumNPC = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        onePlayer = new javax.swing.JRadioButton();
        twoPlayer = new javax.swing.JRadioButton();
        threePlayer = new javax.swing.JRadioButton();
        fourPlayer = new javax.swing.JRadioButton();
        textCantJugadores = new javax.swing.JLabel();
        textNPC = new javax.swing.JLabel();
        isNPC = new javax.swing.JCheckBox();
        onePlayer1 = new javax.swing.JRadioButton();
        twoPlayer1 = new javax.swing.JRadioButton();
        threePlayer1 = new javax.swing.JRadioButton();
        Siguiente = new javax.swing.JButton();

        resNPC.setText("-");
        resNPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resNPCActionPerformed(evt);
            }
        });

        mosNPC.setText("1");
        mosNPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mosNPCActionPerformed(evt);
            }
        });

        sumNPC.setText("+");
        sumNPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumNPCActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configurar Partida");
        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        onePlayer.setBackground(new java.awt.Color(51, 51, 51));
        cantJugadores.add(onePlayer);
        onePlayer.setForeground(new java.awt.Color(255, 255, 255));
        onePlayer.setText("1");
        onePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onePlayerActionPerformed(evt);
            }
        });
        jPanel1.add(onePlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        twoPlayer.setBackground(new java.awt.Color(51, 51, 51));
        cantJugadores.add(twoPlayer);
        twoPlayer.setForeground(new java.awt.Color(255, 255, 255));
        twoPlayer.setText("2");
        twoPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoPlayerActionPerformed(evt);
            }
        });
        jPanel1.add(twoPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        threePlayer.setBackground(new java.awt.Color(51, 51, 51));
        cantJugadores.add(threePlayer);
        threePlayer.setForeground(new java.awt.Color(255, 255, 255));
        threePlayer.setText("3");
        threePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threePlayerActionPerformed(evt);
            }
        });
        jPanel1.add(threePlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        fourPlayer.setBackground(new java.awt.Color(51, 51, 51));
        cantJugadores.add(fourPlayer);
        fourPlayer.setForeground(new java.awt.Color(255, 255, 255));
        fourPlayer.setText("4");
        fourPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourPlayerActionPerformed(evt);
            }
        });
        jPanel1.add(fourPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        textCantJugadores.setForeground(new java.awt.Color(255, 255, 255));
        textCantJugadores.setText("Cantidad de Jugadores:");
        jPanel1.add(textCantJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 55, -1, -1));

        textNPC.setForeground(new java.awt.Color(255, 255, 255));
        textNPC.setText("Jugadores NPC");
        jPanel1.add(textNPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        isNPC.setBackground(new java.awt.Color(51, 51, 51));
        isNPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isNPCActionPerformed(evt);
            }
        });
        jPanel1.add(isNPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        onePlayer1.setBackground(new java.awt.Color(51, 51, 51));
        cantNPC.add(onePlayer1);
        onePlayer1.setForeground(new java.awt.Color(255, 255, 255));
        onePlayer1.setText("1");
        onePlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onePlayer1ActionPerformed(evt);
            }
        });
        jPanel1.add(onePlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        twoPlayer1.setBackground(new java.awt.Color(51, 51, 51));
        cantNPC.add(twoPlayer1);
        twoPlayer1.setForeground(new java.awt.Color(255, 255, 255));
        twoPlayer1.setText("2");
        twoPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoPlayer1ActionPerformed(evt);
            }
        });
        jPanel1.add(twoPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        threePlayer1.setBackground(new java.awt.Color(51, 51, 51));
        cantNPC.add(threePlayer1);
        threePlayer1.setForeground(new java.awt.Color(255, 255, 255));
        threePlayer1.setText("3");
        jPanel1.add(threePlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        Siguiente.setBackground(new java.awt.Color(255, 255, 153));
        Siguiente.setForeground(new java.awt.Color(102, 51, 0));
        Siguiente.setText("Siguiente");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(Siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 210));

        setSize(new java.awt.Dimension(418, 243));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onePlayerActionPerformed
        // TODO add your handling code here:
        isNPC.setEnabled(true);
        if(isNPC.isSelected()){
            onePlayer1.setEnabled(true);
            twoPlayer1.setEnabled(true);
            threePlayer1.setEnabled(true);
        }
        
    }//GEN-LAST:event_onePlayerActionPerformed

    private void resNPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resNPCActionPerformed
        // TODO add your handling code here:
        sumNPC.setEnabled(true);
        String valor =mosNPC.getText();
        if(!valor.equals("2")){
            resNPC.setEnabled(true);
            int valorEntero = Integer.parseInt(valor);
            valorEntero--;
            String valorNuevo = Integer.toString(valorEntero);
            mosNPC.setText(valorNuevo);
        }
        else{
            int valorEntero = Integer.parseInt(valor);
            valorEntero--;
            String valorNuevo = Integer.toString(valorEntero);
            mosNPC.setText(valorNuevo);
            resNPC.setEnabled(false);
        }
    }//GEN-LAST:event_resNPCActionPerformed

    private void isNPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isNPCActionPerformed
        // TODO add your handling code here:
        if(isNPC.isSelected()){
            if(onePlayer.isSelected()){
                onePlayer1.setEnabled(true);
                twoPlayer1.setEnabled(true);
                threePlayer1.setEnabled(true);
            }
            if(twoPlayer.isSelected()){
                onePlayer1.setEnabled(true);
                twoPlayer1.setEnabled(true);
                //threePlayer1.setEnabled(true);
            }
            else{
                onePlayer1.setEnabled(true);
                //twoPlayer1.setEnabled(true);
                //threePlayer1.setEnabled(true);
            }
            
        }
        else{
            onePlayer1.setEnabled(false);
            twoPlayer1.setEnabled(false);
            threePlayer1.setEnabled(false);
        }
    }//GEN-LAST:event_isNPCActionPerformed

    private void sumNPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumNPCActionPerformed
        // TODO add your handling code here:
        
        
        /*  BOTONES DE SUMA Y RESTA
        resNPC.setEnabled(true);
        String valor =mosNPC.getText();
        if(!valor.equals("2")){
            sumNPC.setEnabled(true);
            int valorEntero = Integer.parseInt(valor);
            valorEntero++;
            String valorNuevo = Integer.toString(valorEntero);
            mosNPC.setText(valorNuevo);
        }
        else{
            int valorEntero = Integer.parseInt(valor);
            valorEntero++;
            String valorNuevo = Integer.toString(valorEntero);
            mosNPC.setText(valorNuevo);
            sumNPC.setEnabled(false);
        }
        */
     
    }//GEN-LAST:event_sumNPCActionPerformed

    private void mosNPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mosNPCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mosNPCActionPerformed

    private void twoPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoPlayerActionPerformed
        // TODO add your handling code here:
        isNPC.setEnabled(true);
        if(isNPC.isSelected()){
            onePlayer1.setEnabled(true);
            twoPlayer1.setEnabled(true);
            threePlayer1.setEnabled(false);
            onePlayer1.setSelected(true);
        }
        
    }//GEN-LAST:event_twoPlayerActionPerformed

    private void onePlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onePlayer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onePlayer1ActionPerformed

    private void twoPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoPlayer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twoPlayer1ActionPerformed

    private void fourPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourPlayerActionPerformed
        // TODO add your handling code here:
        isNPC.setEnabled(false);
        onePlayer1.setEnabled(false);
        twoPlayer1.setEnabled(false);
        threePlayer1.setEnabled(false);
                
    }//GEN-LAST:event_fourPlayerActionPerformed

    private void threePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threePlayerActionPerformed
        // TODO add your handling code here:
        isNPC.setEnabled(true);
        if(isNPC.isSelected()){
            onePlayer1.setEnabled(true);
            twoPlayer1.setEnabled(false);
            threePlayer1.setEnabled(false);
            onePlayer1.setSelected(true);
        }

        
    }//GEN-LAST:event_threePlayerActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        // TODO add your handling code here:
        int cantjugadores=0;
        if(onePlayer.isSelected()){
            cantjugadores=1;
            crearJugador nuevoJugador = new crearJugador(cantjugadores);
            nuevoJugador.setVisible(true);
        }
        if(twoPlayer.isSelected()){
            cantjugadores=2;
            crearJugador nuevoJugador = new crearJugador(cantjugadores);
            nuevoJugador.setVisible(true);
        }
        if(threePlayer.isSelected()){
            cantjugadores=3;
            crearJugador nuevoJugador = new crearJugador(cantjugadores);
            nuevoJugador.setVisible(true);
        }
        if(fourPlayer.isSelected()){
            cantjugadores=4;
            crearJugador nuevoJugador = new crearJugador(cantjugadores);
            nuevoJugador.setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_SiguienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(venPartidaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(venPartidaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(venPartidaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(venPartidaNueva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new venPartidaNueva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Siguiente;
    private javax.swing.ButtonGroup cantJugadores;
    private javax.swing.ButtonGroup cantNPC;
    private javax.swing.JRadioButton fourPlayer;
    private javax.swing.JCheckBox isNPC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mosNPC;
    private javax.swing.JRadioButton onePlayer;
    private javax.swing.JRadioButton onePlayer1;
    private javax.swing.JButton resNPC;
    private javax.swing.JButton sumNPC;
    private javax.swing.JLabel textCantJugadores;
    private javax.swing.JLabel textNPC;
    private javax.swing.JRadioButton threePlayer;
    private javax.swing.JRadioButton threePlayer1;
    private javax.swing.JRadioButton twoPlayer;
    private javax.swing.JRadioButton twoPlayer1;
    // End of variables declaration//GEN-END:variables
}