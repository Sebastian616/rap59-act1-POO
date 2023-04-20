package proceso;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

public class calculadoraWin extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("javaScript");
    
    public calculadoraWin() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void addNumber(String digito){
        labelOperacion.setText(labelOperacion.getText()+ digito);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        labelOperacion = new javax.swing.JLabel();
        labelResultado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bIgual = new javax.swing.JButton();
        bC = new javax.swing.JButton();
        bPot = new javax.swing.JButton();
        bPorcen = new javax.swing.JButton();
        bDiv = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bPor = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bmenos = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bmas = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(244, 253, 251));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelOperacion.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        labelOperacion.setForeground(new java.awt.Color(55, 62, 71));
        labelOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(labelOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 36));

        labelResultado.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        labelResultado.setForeground(new java.awt.Color(55, 62, 71));
        labelResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(labelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 53, 270, 36));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 100));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bIgual.setBackground(new java.awt.Color(244, 253, 251));
        bIgual.setText("=");
        bIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIgualActionPerformed(evt);
            }
        });
        jPanel1.add(bIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 62, 50));

        bC.setBackground(new java.awt.Color(244, 253, 251));
        bC.setText("C");
        bC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCActionPerformed(evt);
            }
        });
        jPanel1.add(bC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 62, 50));

        bPot.setBackground(new java.awt.Color(244, 253, 251));
        bPot.setText("^");
        bPot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPotActionPerformed(evt);
            }
        });
        jPanel1.add(bPot, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 62, 50));

        bPorcen.setBackground(new java.awt.Color(244, 253, 251));
        bPorcen.setText("%");
        bPorcen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPorcenActionPerformed(evt);
            }
        });
        jPanel1.add(bPorcen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 62, 50));

        bDiv.setBackground(new java.awt.Color(244, 253, 251));
        bDiv.setText("/");
        bDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivActionPerformed(evt);
            }
        });
        jPanel1.add(bDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 62, 50));

        b7.setBackground(new java.awt.Color(244, 253, 251));
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel1.add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 62, 50));

        b4.setBackground(new java.awt.Color(244, 253, 251));
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 62, 50));

        b1.setBackground(new java.awt.Color(244, 253, 251));
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 62, 50));

        b0.setBackground(new java.awt.Color(244, 253, 251));
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        jPanel1.add(b0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 62, 50));

        b8.setBackground(new java.awt.Color(244, 253, 251));
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 62, 50));

        b9.setBackground(new java.awt.Color(244, 253, 251));
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel1.add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 62, 50));

        bPor.setBackground(new java.awt.Color(244, 253, 251));
        bPor.setText("x");
        bPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPorActionPerformed(evt);
            }
        });
        jPanel1.add(bPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 62, 50));

        b5.setBackground(new java.awt.Color(244, 253, 251));
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 62, 50));

        b6.setBackground(new java.awt.Color(244, 253, 251));
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 62, 50));

        bmenos.setBackground(new java.awt.Color(244, 253, 251));
        bmenos.setText("-");
        bmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmenosActionPerformed(evt);
            }
        });
        jPanel1.add(bmenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 62, 50));

        b2.setBackground(new java.awt.Color(244, 253, 251));
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 62, 50));

        b3.setBackground(new java.awt.Color(244, 253, 251));
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 62, 50));

        bmas.setBackground(new java.awt.Color(244, 253, 251));
        bmas.setText("+");
        bmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmasActionPerformed(evt);
            }
        });
        jPanel1.add(bmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 62, 50));

        jButton19.setBackground(new java.awt.Color(244, 253, 251));
        jButton19.setText(".");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 62, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 290, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIgualActionPerformed
        try{
           String resultado = se.eval(labelOperacion.getText()).toString();
           labelResultado.setText(resultado);
        }catch (Exception e) {
        }
        
    }//GEN-LAST:event_bIgualActionPerformed

    private void bCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCActionPerformed
        labelOperacion.setText("");
        labelResultado.setText("");
        
    }//GEN-LAST:event_bCActionPerformed

    private void bPotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPotActionPerformed
        addNumber(" ^ ");         // TODO add your handling code here:
    }//GEN-LAST:event_bPotActionPerformed

    private void bPorcenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPorcenActionPerformed
        addNumber(" % ");         // TODO add your handling code here:
    }//GEN-LAST:event_bPorcenActionPerformed

    private void bDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDivActionPerformed
        addNumber("/");         // TODO add your handling code here:
    }//GEN-LAST:event_bDivActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        addNumber("7");    
    }//GEN-LAST:event_b7ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        addNumber("4");         // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        addNumber("1");         // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        addNumber("0"); 
    }//GEN-LAST:event_b0ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        addNumber("8");         // TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        addNumber("9");         // TODO add your handling code here:
    }//GEN-LAST:event_b9ActionPerformed

    private void bPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPorActionPerformed
        addNumber(" x ");         // TODO add your handling code here:
    }//GEN-LAST:event_bPorActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        addNumber("5");         // TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        addNumber("6");         // TODO add your handling code here:
    }//GEN-LAST:event_b6ActionPerformed

    private void bmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmenosActionPerformed
        addNumber(" - ");         // TODO add your handling code here:
    }//GEN-LAST:event_bmenosActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        addNumber("2");         // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        addNumber("3");         // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void bmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmasActionPerformed
        addNumber(" + ");         // TODO add your handling code here:
    }//GEN-LAST:event_bmasActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        addNumber(".");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

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
            java.util.logging.Logger.getLogger(calculadoraWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadoraWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadoraWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadoraWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadoraWin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bC;
    private javax.swing.JButton bDiv;
    private javax.swing.JButton bIgual;
    private javax.swing.JButton bPor;
    private javax.swing.JButton bPorcen;
    private javax.swing.JButton bPot;
    private javax.swing.JButton bmas;
    private javax.swing.JButton bmenos;
    private javax.swing.JButton jButton19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelOperacion;
    private javax.swing.JLabel labelResultado;
    // End of variables declaration//GEN-END:variables
}
