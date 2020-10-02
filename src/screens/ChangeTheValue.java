/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class ChangeTheValue extends javax.swing.JFrame {

    /**
     * Creates new form ChangeTheValue
     */
    public ChangeTheValue() {
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

        txtChangeValue = new javax.swing.JLabel();
        txtActualValue = new javax.swing.JLabel();
        inputNewVale = new javax.swing.JTextField();
        txtNewValue = new javax.swing.JLabel();
        outputActualValue = new javax.swing.JTextField();
        buttonSave = new javax.swing.JButton();
        txtChangeReason = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputChangeReason = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Valor do Caixa");
        setResizable(false);
        getContentPane().setLayout(null);

        txtChangeValue.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtChangeValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtChangeValue.setText("ALTERAR VALOR DO CAIXA");
        getContentPane().add(txtChangeValue);
        txtChangeValue.setBounds(20, 10, 330, 29);

        txtActualValue.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtActualValue.setText("Valor Atual no Caixa");
        getContentPane().add(txtActualValue);
        txtActualValue.setBounds(50, 60, 140, 19);

        inputNewVale.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(inputNewVale);
        inputNewVale.setBounds(210, 100, 90, 25);

        txtNewValue.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtNewValue.setText("Novo Valor");
        getContentPane().add(txtNewValue);
        txtNewValue.setBounds(50, 105, 80, 19);

        outputActualValue.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        outputActualValue.setEnabled(false);
        getContentPane().add(outputActualValue);
        outputActualValue.setBounds(210, 60, 90, 25);

        buttonSave.setText("SALVAR");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSave);
        buttonSave.setBounds(50, 340, 90, 23);

        txtChangeReason.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtChangeReason.setText("Motivo da Alteração");
        getContentPane().add(txtChangeReason);
        txtChangeReason.setBounds(50, 150, 140, 19);

        inputChangeReason.setColumns(20);
        inputChangeReason.setRows(5);
        jScrollPane1.setViewportView(inputChangeReason);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 180, 250, 150);

        setSize(new java.awt.Dimension(382, 413));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        JOptionPane.showMessageDialog(null, "VALOR ATUALIZADO COM SUCESSO");
        this.dispose();
        CashDrive cashDrive = new CashDrive();
        cashDrive.setVisible(true);
    }//GEN-LAST:event_buttonSaveActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeTheValue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeTheValue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeTheValue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeTheValue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeTheValue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSave;
    private javax.swing.JTextArea inputChangeReason;
    private javax.swing.JTextField inputNewVale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField outputActualValue;
    private javax.swing.JLabel txtActualValue;
    private javax.swing.JLabel txtChangeReason;
    private javax.swing.JLabel txtChangeValue;
    private javax.swing.JLabel txtNewValue;
    // End of variables declaration//GEN-END:variables
}
