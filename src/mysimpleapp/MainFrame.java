/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysimpleapp;

/**
 *
 * @author Administrator
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        txtA = new javax.swing.JTextField();
        lbPlus = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        lbEqual = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        txtMinusA = new javax.swing.JTextField();
        lbMinus = new javax.swing.JLabel();
        txtMinusB = new javax.swing.JTextField();
        lbEqual1 = new javax.swing.JLabel();
        txtMinusC = new javax.swing.JTextField();
        txtMultiplyA = new javax.swing.JTextField();
        lbMultiply = new javax.swing.JLabel();
        txtMultiplyB = new javax.swing.JTextField();
        lbEqual2 = new javax.swing.JLabel();
        txtMultiplyC = new javax.swing.JTextField();
        txtShareA = new javax.swing.JTextField();
        lbShare = new javax.swing.JLabel();
        txtShareB = new javax.swing.JTextField();
        lbEqual3 = new javax.swing.JLabel();
        txtShareC = new javax.swing.JTextField();
        bnPlus = new javax.swing.JButton();
        bnMinus = new javax.swing.JButton();
        bnMultiply = new javax.swing.JButton();
        bnShare = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hello World");

        lbPlus.setText("+");

        txtB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBActionPerformed(evt);
            }
        });

        lbEqual.setText("=");

        lbMinus.setText("-");

        txtMinusB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinusBActionPerformed(evt);
            }
        });

        lbEqual1.setText("=");

        lbMultiply.setText("*");

        txtMultiplyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMultiplyBActionPerformed(evt);
            }
        });

        lbEqual2.setText("=");

        lbShare.setText("/");

        txtShareB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShareBActionPerformed(evt);
            }
        });

        lbEqual3.setText("=");

        bnPlus.setText("+");
        bnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnPlusActionPerformed(evt);
            }
        });

        bnMinus.setText("-");
        bnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnMinusActionPerformed(evt);
            }
        });

        bnMultiply.setText("*");
        bnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnMultiplyActionPerformed(evt);
            }
        });

        bnShare.setText("/");
        bnShare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnShareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtShareA, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbShare)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtShareB, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEqual3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtShareC, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMultiplyA, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMultiply)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMultiplyB, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEqual2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMultiplyC, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMinusA, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMinus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMinusB, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEqual1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMinusC, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPlus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEqual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bnPlus, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(bnMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnMultiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnShare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPlus)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEqual)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnPlus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMinusA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMinus)
                    .addComponent(txtMinusB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEqual1)
                    .addComponent(txtMinusC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnMinus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMultiplyA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMultiply)
                    .addComponent(txtMultiplyB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEqual2)
                    .addComponent(txtMultiplyC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnMultiply))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtShareA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbShare)
                    .addComponent(txtShareB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEqual3)
                    .addComponent(txtShareC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnShare))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBActionPerformed

    private void txtMinusBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinusBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinusBActionPerformed

    private void txtMultiplyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMultiplyBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMultiplyBActionPerformed

    private void txtShareBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShareBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtShareBActionPerformed

    private void bnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnPlusActionPerformed
        // TODO add your handling code here:
        String a = txtA.getText();
        String b = txtB.getText();
        
        int intA = new Integer (a);
        int intB = new Integer (b);
        int intC = intA+intB;
        
                
        String c = Integer.toString(intC);
        
        
        txtC.setText(c);
    }//GEN-LAST:event_bnPlusActionPerformed

    private void bnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnMinusActionPerformed
        // TODO add your handling code here:
        String a = txtMinusA.getText();
        String b = txtMinusB.getText();
        
        int intA = new Integer (a);
        int intB = new Integer (b);
        int intC = intA-intB;
        
                
        String c = Integer.toString(intC);
        
        
        txtMinusC.setText(c);
    }//GEN-LAST:event_bnMinusActionPerformed

    private void bnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnMultiplyActionPerformed
        // TODO add your handling code here:
        String a = txtMultiplyA.getText();
        String b = txtMultiplyB.getText();
        
        int intA = new Integer (a);
        int intB = new Integer (b);
        int intC = intA*intB;
        
                
        String c = Integer.toString(intC);
        
        
        txtMultiplyC.setText(c);
    }//GEN-LAST:event_bnMultiplyActionPerformed

    private void bnShareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnShareActionPerformed
        // TODO add your handling code here:
        String a = txtShareA.getText();
        String b = txtShareB.getText();
        
        int intA = new Integer (a);
        int intB = new Integer (b);
        int intC = intA/intB;
        
                
        String c = Integer.toString(intC);
        
        
        txtShareC.setText(c);
    }//GEN-LAST:event_bnShareActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnMinus;
    private javax.swing.JButton bnMultiply;
    private javax.swing.JButton bnPlus;
    private javax.swing.JButton bnShare;
    private javax.swing.JLabel lbEqual;
    private javax.swing.JLabel lbEqual1;
    private javax.swing.JLabel lbEqual2;
    private javax.swing.JLabel lbEqual3;
    private javax.swing.JLabel lbMinus;
    private javax.swing.JLabel lbMultiply;
    private javax.swing.JLabel lbPlus;
    private javax.swing.JLabel lbShare;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtMinusA;
    private javax.swing.JTextField txtMinusB;
    private javax.swing.JTextField txtMinusC;
    private javax.swing.JTextField txtMultiplyA;
    private javax.swing.JTextField txtMultiplyB;
    private javax.swing.JTextField txtMultiplyC;
    private javax.swing.JTextField txtShareA;
    private javax.swing.JTextField txtShareB;
    private javax.swing.JTextField txtShareC;
    // End of variables declaration//GEN-END:variables
}
