/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens.files.editfiles;

import callframes.CallOtherFrame;
import javax.swing.JFrame;
import setsoons.SetAndOrganizeSoons;
import screens.cadastrescreens.CadastreUsers;
/**
 *
 * @author fibba
 */
public class ScreenUser extends setsoons.AuxiliaryJFrame {

    /**
     * Creates new form ScreenUser
     */
    public ScreenUser() {
        initComponents();
    }
    SetAndOrganizeSoons setAndOrganizeSoons = new SetAndOrganizeSoons();
    boolean inicializedWindow = false;
    private void callOtherScreen(JFrame screen){
        CallOtherFrame callOtherFrame = new CallOtherFrame();
        callOtherFrame.callOtherScreen(screen);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        soonTavile = new javax.swing.JLabel();
        soonProxxi = new javax.swing.JLabel();
        txtUserText = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        outputName = new javax.swing.JFormattedTextField();
        txtLogin = new javax.swing.JLabel();
        outputLogin = new javax.swing.JFormattedTextField();
        txtBranch = new javax.swing.JLabel();
        outputBranch = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JLabel();
        outputEmail = new javax.swing.JFormattedTextField();
        txtPhone = new javax.swing.JLabel();
        outputPhone = new javax.swing.JFormattedTextField();
        buttonEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuário");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(soonTavile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 173, 67));
        getContentPane().add(soonProxxi, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 0, 173, 67));

        txtUserText.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtUserText.setText("Usuário");
        getContentPane().add(txtUserText, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        txtName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtName.setText("Nome");
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 30));

        try {
            outputName.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        outputName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(outputName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 138, -1));

        txtLogin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtLogin.setText("Login");
        getContentPane().add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 124, -1, -1));

        try {
            outputLogin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        outputLogin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(outputLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 121, 140, -1));

        txtBranch.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtBranch.setText("Filial");
        getContentPane().add(txtBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 30));

        try {
            outputBranch.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        outputBranch.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(outputBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 150, -1));

        txtEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtEmail.setText("Email");
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        try {
            outputEmail.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        outputEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(outputEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 225, -1));

        txtPhone.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPhone.setText("Telefone");
        getContentPane().add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 30));

        try {
            outputPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        outputPhone.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(outputPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 162, -1));

        buttonEdit.setText("EDITAR");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        setSize(new java.awt.Dimension(602, 376));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        CadastreUsers cadastreUsers = new CadastreUsers();
        cadastreUsers.setTitle("Editar Login");
        cadastreUsers.textCadastreUsers.setText("Editar Login");
        cadastreUsers.setDefaultCloseOperation(1);
        this.dispose();
        callOtherScreen(cadastreUsers);
    }//GEN-LAST:event_buttonEditActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(inicializedWindow==false){
            inicializedWindow = true;
            setAndOrganizeSoons.SetSoons(this);
            setAndOrganizeSoons.SetLocationSoons(this, soonTavile.getX(), soonTavile.getY(), soonProxxi.getX(), soonProxxi.getY());
        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(ScreenUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEdit;
    private javax.swing.JFormattedTextField outputBranch;
    private javax.swing.JFormattedTextField outputEmail;
    private javax.swing.JFormattedTextField outputLogin;
    private javax.swing.JFormattedTextField outputName;
    private javax.swing.JFormattedTextField outputPhone;
    public static javax.swing.JLabel soonProxxi;
    public static javax.swing.JLabel soonTavile;
    private javax.swing.JLabel txtBranch;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtLogin;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtPhone;
    private javax.swing.JLabel txtUserText;
    // End of variables declaration//GEN-END:variables
}
