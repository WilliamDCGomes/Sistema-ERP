/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package submenus;

import screens.AllBills;
import screens.DebtScreen;
import screens.LocaleBill;
import screens.NewBill;

/**
 *
 * @author Alunos
 */
public class DebtMenu extends javax.swing.JFrame {

    /**
     * Creates new form DeptMenu
     */
    public DebtMenu() {
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

        txtDeptToPay = new javax.swing.JLabel();
        buttonDeptToPay = new javax.swing.JButton();
        txtDelayDept = new javax.swing.JLabel();
        buttonDelayDept = new javax.swing.JButton();
        txtDepit = new javax.swing.JLabel();
        buttonDebit = new javax.swing.JButton();
        txtNewDept = new javax.swing.JLabel();
        buttonNewDept = new javax.swing.JButton();
        txtDeptToRecev = new javax.swing.JLabel();
        buttonDeptToRecev = new javax.swing.JButton();
        txtLocaleDept = new javax.swing.JLabel();
        buttonLocaleDept = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        txtDeptToPay.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDeptToPay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDeptToPay.setText("A PAGAR");
        txtDeptToPay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDeptToPayMouseClicked(evt);
            }
        });

        buttonDeptToPay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/payCount.png"))); // NOI18N
        buttonDeptToPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeptToPayActionPerformed(evt);
            }
        });

        txtDelayDept.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDelayDept.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDelayDept.setText("ATRASOS");
        txtDelayDept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDelayDeptMouseClicked(evt);
            }
        });

        buttonDelayDept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delayPayment.png"))); // NOI18N
        buttonDelayDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDelayDeptActionPerformed(evt);
            }
        });

        txtDepit.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDepit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDepit.setText("DEBITAR");
        txtDepit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDepitMouseClicked(evt);
            }
        });

        buttonDebit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/endOfDebt.png"))); // NOI18N
        buttonDebit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDebitActionPerformed(evt);
            }
        });

        txtNewDept.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNewDept.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNewDept.setText("NOVA");
        txtNewDept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNewDeptMouseClicked(evt);
            }
        });

        buttonNewDept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newDebts.png"))); // NOI18N
        buttonNewDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewDeptActionPerformed(evt);
            }
        });

        txtDeptToRecev.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDeptToRecev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDeptToRecev.setText("A RECEBER");
        txtDeptToRecev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDeptToRecevMouseClicked(evt);
            }
        });

        buttonDeptToRecev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recevPayment.png"))); // NOI18N
        buttonDeptToRecev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeptToRecevActionPerformed(evt);
            }
        });

        txtLocaleDept.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtLocaleDept.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLocaleDept.setText("LOCALIZAR");
        txtLocaleDept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLocaleDeptMouseClicked(evt);
            }
        });

        buttonLocaleDept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/localeDebts.png"))); // NOI18N
        buttonLocaleDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLocaleDeptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNewDept, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNewDept, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLocaleDept, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLocaleDept, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDeptToPay, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDeptToPay, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonDeptToRecev, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDeptToRecev))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDelayDept, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDelayDept, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDepit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDebit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonDebit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDepit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonDelayDept, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDelayDept))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonDeptToRecev, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDeptToRecev))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonLocaleDept, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLocaleDept))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonNewDept, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNewDept))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonDeptToPay, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDeptToPay)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDeptToPayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDeptToPayMouseClicked
        AllBills allBills = new AllBills();
        allBills.txtAllBills.setText("CONTAS A PAGAR");
        allBills.setTitle("Contas a Pagar");
        allBills.setVisible(true);
    }//GEN-LAST:event_txtDeptToPayMouseClicked

    private void buttonDeptToPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeptToPayActionPerformed
        AllBills allBills = new AllBills();
        allBills.txtAllBills.setText("CONTAS A PAGAR");
        allBills.setTitle("Contas a Pagar");
        allBills.setVisible(true);
    }//GEN-LAST:event_buttonDeptToPayActionPerformed

    private void txtDelayDeptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDelayDeptMouseClicked
        AllBills allBills = new AllBills();
        allBills.txtAllBills.setText("CONTAS EM ATRASO");
        allBills.setTitle("Contas em Atraso");
        allBills.setVisible(true);
    }//GEN-LAST:event_txtDelayDeptMouseClicked

    private void buttonDelayDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDelayDeptActionPerformed
        AllBills allBills = new AllBills();
        allBills.txtAllBills.setText("CONTAS EM ATRASO");
        allBills.setTitle("Contas em Atraso");
        allBills.setVisible(true);
    }//GEN-LAST:event_buttonDelayDeptActionPerformed

    private void txtDepitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDepitMouseClicked
        DebtScreen debtScreen = new DebtScreen();
        debtScreen.setVisible(true);
    }//GEN-LAST:event_txtDepitMouseClicked

    private void buttonDebitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDebitActionPerformed
        DebtScreen debtScreen = new DebtScreen();
        debtScreen.setVisible(true);
    }//GEN-LAST:event_buttonDebitActionPerformed

    private void txtNewDeptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNewDeptMouseClicked
        NewBill newBill = new NewBill();
        newBill.setVisible(true);
    }//GEN-LAST:event_txtNewDeptMouseClicked

    private void buttonNewDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewDeptActionPerformed
        NewBill newBill = new NewBill();
        newBill.setVisible(true);
    }//GEN-LAST:event_buttonNewDeptActionPerformed

    private void txtDeptToRecevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDeptToRecevMouseClicked
        AllBills allBills = new AllBills();
        allBills.txtAllBills.setText("CONTAS A RECEBER");
        allBills.setTitle("Contas a Receber");
        allBills.setVisible(true);
    }//GEN-LAST:event_txtDeptToRecevMouseClicked

    private void buttonDeptToRecevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeptToRecevActionPerformed
        AllBills allBills = new AllBills();
        allBills.txtAllBills.setText("CONTAS A RECEBER");
        allBills.setTitle("Contas a Receber");
        allBills.setVisible(true);
    }//GEN-LAST:event_buttonDeptToRecevActionPerformed

    private void txtLocaleDeptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLocaleDeptMouseClicked
        LocaleBill localeBill = new LocaleBill();
        localeBill.setVisible(true);
    }//GEN-LAST:event_txtLocaleDeptMouseClicked

    private void buttonLocaleDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLocaleDeptActionPerformed
        LocaleBill localeBill = new LocaleBill();
        localeBill.setVisible(true);
    }//GEN-LAST:event_buttonLocaleDeptActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        this.dispose();
    }//GEN-LAST:event_formWindowLostFocus

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
            java.util.logging.Logger.getLogger(DebtMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DebtMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DebtMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DebtMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DebtMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDebit;
    private javax.swing.JButton buttonDelayDept;
    private javax.swing.JButton buttonDeptToPay;
    private javax.swing.JButton buttonDeptToRecev;
    private javax.swing.JButton buttonLocaleDept;
    private javax.swing.JButton buttonNewDept;
    private javax.swing.JLabel txtDelayDept;
    private javax.swing.JLabel txtDepit;
    private javax.swing.JLabel txtDeptToPay;
    private javax.swing.JLabel txtDeptToRecev;
    private javax.swing.JLabel txtLocaleDept;
    private javax.swing.JLabel txtNewDept;
    // End of variables declaration//GEN-END:variables
}
