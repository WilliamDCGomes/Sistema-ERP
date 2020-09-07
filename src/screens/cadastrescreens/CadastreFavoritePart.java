package screens.cadastrescreens;
import callframes.CallOtherFrame;
import functioncontroller.LimitNumberCharacters;
import functionsuport.CallItemScreen;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import setsoons.SetAndOrganizeSoons;

/**
 *
 * @author willi
 */
public class CadastreFavoritePart extends setsoons.AuxiliaryJFrame {

    /**
     * Creates new form CadastreFavoritePart
     */
    public CadastreFavoritePart() {
        initComponents();
        inputCodeItem.setDocument(new LimitNumberCharacters());
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

        buttonSave = new javax.swing.JButton();
        inputCodeItem = new javax.swing.JTextField();
        buttonAddPart = new javax.swing.JButton();
        soonTavile = new javax.swing.JLabel();
        soonProxxi = new javax.swing.JLabel();
        txtNewFavoriteParts = new javax.swing.JLabel();
        tableOfPartsFavorite = new javax.swing.JScrollPane();
        tableFavoriteParts = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nova Peça Favorita");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        buttonSave.setText("SALVAR");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        inputCodeItem.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        inputCodeItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputCodeItemKeyPressed(evt);
            }
        });

        buttonAddPart.setText("ADICIONAR");

        txtNewFavoriteParts.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtNewFavoriteParts.setText("Nova Peça Favorita");

        tableFavoriteParts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Quantidade", "Endereço"
            }
        ));
        tableOfPartsFavorite.setViewportView(tableFavoriteParts);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(soonTavile, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                .addComponent(soonProxxi, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtNewFavoriteParts)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tableOfPartsFavorite, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonSave)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputCodeItem, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(buttonAddPart)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(soonTavile, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soonProxxi, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(txtNewFavoriteParts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCodeItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddPart))
                .addGap(14, 14, 14)
                .addComponent(tableOfPartsFavorite, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSave)
                .addGap(17, 17, 17))
        );

        setSize(new java.awt.Dimension(597, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputCodeItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCodeItemKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCodeItemKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(inicializedWindow==false){
            inicializedWindow = true;
            setAndOrganizeSoons.SetSoons(this);
            setAndOrganizeSoons.SetLocationSoons(this, soonTavile.getX(), soonTavile.getY(), soonProxxi.getX(), soonProxxi.getY());
        }
    }//GEN-LAST:event_formWindowActivated

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        setAndOrganizeSoons.SetLocationSoons(this, soonTavile.getX(), soonTavile.getY(), soonProxxi.getX(), soonProxxi.getY());
    }//GEN-LAST:event_formComponentResized

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        JOptionPane.showMessageDialog(null, "PEÇA CADASTRADA COMO FAVORITA");
        CallItemScreen callItemScreen = new CallItemScreen();
        this.dispose();
        callItemScreen.callScreen();
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
            java.util.logging.Logger.getLogger(CadastreFavoritePart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastreFavoritePart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastreFavoritePart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastreFavoritePart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastreFavoritePart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddPart;
    private javax.swing.JButton buttonSave;
    private javax.swing.JTextField inputCodeItem;
    public static javax.swing.JLabel soonProxxi;
    public static javax.swing.JLabel soonTavile;
    private javax.swing.JTable tableFavoriteParts;
    private javax.swing.JScrollPane tableOfPartsFavorite;
    private javax.swing.JLabel txtNewFavoriteParts;
    // End of variables declaration//GEN-END:variables
}
