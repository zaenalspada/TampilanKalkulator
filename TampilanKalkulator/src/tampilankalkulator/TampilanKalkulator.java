
package tampilankalkulator;

/**
 *
 * @author Zaenal
 */
public class TampilanKalkulator extends javax.swing.JFrame {
String angka;

double jumlah,angka1,angka2;

int pilih; 

  
    public TampilanKalkulator() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        display = new javax.swing.JTextField();
        btnAngka3 = new javax.swing.JButton();
        btnAngka2 = new javax.swing.JButton();
        btnAngka4 = new javax.swing.JButton();
        btnAngka5 = new javax.swing.JButton();
        btnAngka6 = new javax.swing.JButton();
        btnAngka7 = new javax.swing.JButton();
        btnAngka8 = new javax.swing.JButton();
        btnAngka9 = new javax.swing.JButton();
        btnAngka0 = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnAngka1 = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btnKoma = new javax.swing.JButton();
        btnSamaDengan = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        getContentPane().add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 220, 30));

        btnAngka3.setText("3");
        btnAngka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 60, -1));

        btnAngka2.setText("2");
        btnAngka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 60, -1));

        btnAngka4.setText("4");
        btnAngka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 60, -1));

        btnAngka5.setText("5");
        btnAngka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 60, -1));

        btnAngka6.setText("6");
        btnAngka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 60, -1));

        btnAngka7.setText("7");
        btnAngka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 60, -1));

        btnAngka8.setText("8");
        btnAngka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 60, -1));

        btnAngka9.setText("9");
        getContentPane().add(btnAngka9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 60, -1));

        btnAngka0.setText("0");
        getContentPane().add(btnAngka0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 60, -1));

        btnHapus.setText("C");
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 60, -1));

        btnAngka1.setText("1");
        btnAngka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAngka1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 60, -1));

        btnTambah.setText("+");
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 60, -1));

        btnKurang.setText("-");
        getContentPane().add(btnKurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 60, -1));

        btnBagi.setText("/");
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });
        getContentPane().add(btnBagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 60, -1));

        btnKoma.setText(",");
        getContentPane().add(btnKoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 60, -1));

        btnSamaDengan.setText("=");
        getContentPane().add(btnSamaDengan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 130, -1));

        btnKali.setText("*");
        getContentPane().add(btnKali, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 60, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAngka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka7ActionPerformed
        angka += "7";

display.setText(angka);
    }//GEN-LAST:event_btnAngka7ActionPerformed

    private void btnAngka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAngka8ActionPerformed

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBagiActionPerformed

    private void btnAngka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka1ActionPerformed
      angka += "1";

display.setText(angka);
    }//GEN-LAST:event_btnAngka1ActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

    private void btnAngka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka2ActionPerformed
      angka += "2";

display.setText(angka);
    }//GEN-LAST:event_btnAngka2ActionPerformed

    private void btnAngka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka3ActionPerformed
       angka += "3";

display.setText(angka);
    }//GEN-LAST:event_btnAngka3ActionPerformed

    private void btnAngka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka4ActionPerformed
     angka += "4";

display.setText(angka);
    }//GEN-LAST:event_btnAngka4ActionPerformed

    private void btnAngka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka5ActionPerformed
     angka += "5";

display.setText(angka);
    }//GEN-LAST:event_btnAngka5ActionPerformed

    private void btnAngka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka6ActionPerformed
     angka += "6";

display.setText(angka);
    }//GEN-LAST:event_btnAngka6ActionPerformed

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
            java.util.logging.Logger.getLogger(TampilanKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilanKalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAngka0;
    private javax.swing.JButton btnAngka1;
    private javax.swing.JButton btnAngka2;
    private javax.swing.JButton btnAngka3;
    private javax.swing.JButton btnAngka4;
    private javax.swing.JButton btnAngka5;
    private javax.swing.JButton btnAngka6;
    private javax.swing.JButton btnAngka7;
    private javax.swing.JButton btnAngka8;
    private javax.swing.JButton btnAngka9;
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKoma;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnSamaDengan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JTextField display;
    // End of variables declaration//GEN-END:variables
}
