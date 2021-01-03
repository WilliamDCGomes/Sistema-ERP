package screens;
import functioncontroller.GetDate;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import connectionbd.ConnectionModule;
import javax.swing.table.DefaultTableModel;
public class NewOrder extends javax.swing.JFrame {
    int x = 0;
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    PreparedStatement pst2 = null;
    ResultSet rs2 = null;
    PreparedStatement pst3 = null;
    ResultSet rs3 = null;
    public NewOrder() {
        initComponents();
        ConnectionModule connect = new ConnectionModule();
        connection = connect.getConnectionMySQL();
    }
    private void add(){
        String[] aux = this.getTitle().split(" ");
        int id = Integer.parseInt( aux[aux.length - 1] );
        String sql = "insert into orderProduct(codOrder, codClient, paymentForm, paymentMethod, dateOrder, deliveryForecast, statusOrder, totalValue, subTotalValue, obs, provider)values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pst = connection.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2,inputClient.getText());
            if(inputInCash.isSelected()){
                pst.setString(3, "A Vista");
            }
            else if(inputTerm.isSelected()){
                pst.setString(3, "A Prazo");
            }
            pst.setString(4, inputFormPayment.getSelectedItem().toString());
            pst.setString(5,inputDateOfSale.getText());
            pst.setString(6,inputDeliveryForecast.getText());
            if(inputFinishSale.isSelected()){
                pst.setString(7, "Finalizada");
            }
            else if(inputPendingSale.isSelected()){
                pst.setString(7, "Pendente");
            }
            pst.setString(8,outputTotal.getText().replace(",", "."));
            pst.setString(9,outputSubTotal.getText().replace(",", "."));
            pst.setString(10,inputObservation.getText());
            pst.setString(11,inputProvider.getText());
            pst.executeUpdate();
            addProducts(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void addProducts(int id){
        DefaultTableModel table = (DefaultTableModel) tableItems.getModel();
        String sql = "insert into addProducts(codOrder, barCode, quantity, price)values(?,?,?,?)";
        try {
            for(int i=table.getRowCount()-1; i >= 0; i--){
                pst = connection.prepareStatement(sql);
                pst.setInt(1, id);
                pst.setString(2, tableItems.getModel().getValueAt(i,0).toString());
                pst.setInt(3, Integer.parseInt(tableItems.getModel().getValueAt(i,2).toString()));
                pst.setString(4, tableItems.getModel().getValueAt(i,3).toString().replace(",", "."));
                pst.executeUpdate();
            }
            JOptionPane.showMessageDialog(null,"PEDIDO CADASTRADO COM SUCESSO");
            OrderScreen orderScreen = new OrderScreen();
            this.dispose();
            orderScreen.setTitle("Pedido: " + Integer.toString(id));
            orderScreen.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private int newOrderId(){
        String sql ="select max(id) from orderProduct";
        try {
            pst=connection.prepareStatement(sql);
            rs= pst.executeQuery();
            if(rs.next()){
                return rs.getInt(1) + 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return 1;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupFormPayment = new javax.swing.ButtonGroup();
        groupStatus = new javax.swing.ButtonGroup();
        txtObservation = new javax.swing.JLabel();
        inputProductCode = new javax.swing.JTextField();
        buttonAllProducts = new javax.swing.JButton();
        txtQuantity = new javax.swing.JLabel();
        inputQuantity = new javax.swing.JTextField();
        tableNewOrder = new javax.swing.JScrollPane();
        tableItems = new javax.swing.JTable();
        txtProductCode = new javax.swing.JLabel();
        txtClient = new javax.swing.JLabel();
        inputClient = new javax.swing.JTextField();
        buttonLocaleClient = new javax.swing.JButton();
        buttonNewClient = new javax.swing.JButton();
        txtProvider = new javax.swing.JLabel();
        inputProvider = new javax.swing.JTextField();
        buttonLocaleProduct = new javax.swing.JButton();
        buttonNewProvider = new javax.swing.JButton();
        buttonLocaleProvider = new javax.swing.JButton();
        txtFormPayment = new javax.swing.JLabel();
        inputInCash = new javax.swing.JRadioButton();
        inputTerm = new javax.swing.JRadioButton();
        txtPaymentMethod = new javax.swing.JLabel();
        inputFormPayment = new javax.swing.JComboBox<>();
        txtDateOfSale = new javax.swing.JLabel();
        txtDeliveryForecast = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JLabel();
        outputSubTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        outputTotal = new javax.swing.JLabel();
        txtNewOrder = new javax.swing.JLabel();
        buttonRemove = new javax.swing.JButton();
        txtStatus = new javax.swing.JLabel();
        inputFinishSale = new javax.swing.JRadioButton();
        inputPendingSale = new javax.swing.JRadioButton();
        txtItems = new javax.swing.JLabel();
        observationNewOrder = new javax.swing.JScrollPane();
        inputObservation = new javax.swing.JTextArea();
        buttonSave = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        inputDateOfSale = new javax.swing.JTextField();
        inputDeliveryForecast = new javax.swing.JTextField();
        txtNameProduct = new javax.swing.JLabel();
        inputNameProduct = new javax.swing.JTextField();
        txtNameClient = new javax.swing.JLabel();
        inputNameClient = new javax.swing.JTextField();
        txtNameProvider = new javax.swing.JLabel();
        inputNameProvider = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Pedido");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        txtObservation.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtObservation.setText("Observações");
        getContentPane().add(txtObservation);
        txtObservation.setBounds(20, 350, 110, 20);

        inputProductCode.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputProductCode);
        inputProductCode.setBounds(20, 100, 90, 30);

        buttonAllProducts.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        buttonAllProducts.setText("TODOS");
        buttonAllProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAllProductsActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAllProducts);
        buttonAllProducts.setBounds(230, 100, 80, 30);

        txtQuantity.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtQuantity.setText("Quantidade");
        getContentPane().add(txtQuantity);
        txtQuantity.setBounds(790, 70, 90, 20);

        inputQuantity.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputQuantity);
        inputQuantity.setBounds(790, 100, 70, 30);

        tableItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód Produto", "Descrição", "Quantidade", "Valor", "Cliente", "Fornecedor"
            }
        ));
        tableNewOrder.setViewportView(tableItems);

        getContentPane().add(tableNewOrder);
        tableNewOrder.setBounds(310, 380, 560, 240);

        txtProductCode.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtProductCode.setText("Código do Produto");
        getContentPane().add(txtProductCode);
        txtProductCode.setBounds(20, 70, 140, 20);

        txtClient.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtClient.setText("CPF / CNPJ Cliente");
        getContentPane().add(txtClient);
        txtClient.setBounds(20, 140, 160, 20);

        inputClient.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputClient);
        inputClient.setBounds(20, 170, 160, 30);

        buttonLocaleClient.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        buttonLocaleClient.setText("LOCALIZAR");
        buttonLocaleClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLocaleClientActionPerformed(evt);
            }
        });
        getContentPane().add(buttonLocaleClient);
        buttonLocaleClient.setBounds(190, 170, 100, 30);

        buttonNewClient.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        buttonNewClient.setText("NOVO");
        getContentPane().add(buttonNewClient);
        buttonNewClient.setBounds(300, 170, 70, 30);

        txtProvider.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtProvider.setText("Fornecedor");
        getContentPane().add(txtProvider);
        txtProvider.setBounds(20, 210, 110, 20);

        inputProvider.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputProvider);
        inputProvider.setBounds(20, 240, 90, 30);

        buttonLocaleProduct.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        buttonLocaleProduct.setText("LOCALIZAR");
        buttonLocaleProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLocaleProductActionPerformed(evt);
            }
        });
        getContentPane().add(buttonLocaleProduct);
        buttonLocaleProduct.setBounds(120, 100, 100, 30);

        buttonNewProvider.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        buttonNewProvider.setText("TODOS");
        getContentPane().add(buttonNewProvider);
        buttonNewProvider.setBounds(230, 240, 90, 30);

        buttonLocaleProvider.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        buttonLocaleProvider.setText("LOCALIZAR");
        buttonLocaleProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLocaleProviderActionPerformed(evt);
            }
        });
        getContentPane().add(buttonLocaleProvider);
        buttonLocaleProvider.setBounds(120, 240, 100, 30);

        txtFormPayment.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtFormPayment.setText("Forma de Pagamento");
        getContentPane().add(txtFormPayment);
        txtFormPayment.setBounds(20, 280, 149, 27);

        groupFormPayment.add(inputInCash);
        inputInCash.setText("A Vista");
        getContentPane().add(inputInCash);
        inputInCash.setBounds(20, 310, 61, 23);

        groupFormPayment.add(inputTerm);
        inputTerm.setText("A Prazo");
        getContentPane().add(inputTerm);
        inputTerm.setBounds(110, 310, 64, 23);

        txtPaymentMethod.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtPaymentMethod.setText("Meio de Pagamento");
        getContentPane().add(txtPaymentMethod);
        txtPaymentMethod.setBounds(210, 280, 140, 27);

        inputFormPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Dinheiro", "Boleto", "Carnê", "Cartão", "Cheque" }));
        inputFormPayment.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                inputFormPaymentItemStateChanged(evt);
            }
        });
        inputFormPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFormPaymentActionPerformed(evt);
            }
        });
        getContentPane().add(inputFormPayment);
        inputFormPayment.setBounds(210, 310, 102, 30);

        txtDateOfSale.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtDateOfSale.setText("Data do Pedido");
        getContentPane().add(txtDateOfSale);
        txtDateOfSale.setBounds(580, 280, 108, 30);

        txtDeliveryForecast.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtDeliveryForecast.setText("Previsão de Entrega");
        getContentPane().add(txtDeliveryForecast);
        txtDeliveryForecast.setBounds(720, 280, 145, 27);

        txtSubTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtSubTotal.setText("SubTotal");
        getContentPane().add(txtSubTotal);
        txtSubTotal.setBounds(490, 630, 80, 40);

        outputSubTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        outputSubTotal.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        outputSubTotal.setText("0,00");
        getContentPane().add(outputSubTotal);
        outputSubTotal.setBounds(570, 640, 120, 24);

        txtTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTotal.setText("Total");
        getContentPane().add(txtTotal);
        txtTotal.setBounds(700, 630, 80, 40);

        outputTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        outputTotal.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        outputTotal.setText("0,00");
        getContentPane().add(outputTotal);
        outputTotal.setBounds(750, 640, 120, 24);

        txtNewOrder.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtNewOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNewOrder.setText("NOVO PEDIDO");
        getContentPane().add(txtNewOrder);
        txtNewOrder.setBounds(310, 20, 280, 32);

        buttonRemove.setText("REMOVER");
        buttonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(buttonRemove);
        buttonRemove.setBounds(140, 640, 100, 25);

        txtStatus.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtStatus.setText("Status:");
        getContentPane().add(txtStatus);
        txtStatus.setBounds(390, 280, 57, 27);

        groupStatus.add(inputFinishSale);
        inputFinishSale.setText("Finalizada");
        getContentPane().add(inputFinishSale);
        inputFinishSale.setBounds(390, 310, 80, 30);

        groupStatus.add(inputPendingSale);
        inputPendingSale.setText("Pendente");
        getContentPane().add(inputPendingSale);
        inputPendingSale.setBounds(480, 310, 90, 30);

        txtItems.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        txtItems.setText("Itens");
        getContentPane().add(txtItems);
        txtItems.setBounds(310, 350, 40, 20);

        inputObservation.setColumns(20);
        inputObservation.setRows(5);
        observationNewOrder.setViewportView(inputObservation);

        getContentPane().add(observationNewOrder);
        observationNewOrder.setBounds(20, 380, 280, 240);

        buttonSave.setText("SALVAR");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSave);
        buttonSave.setBounds(260, 640, 78, 25);

        buttonAdd.setText("ADICIONAR");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAdd);
        buttonAdd.setBounds(20, 640, 100, 25);

        inputDateOfSale.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputDateOfSale);
        inputDateOfSale.setBounds(580, 310, 90, 30);

        inputDeliveryForecast.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        getContentPane().add(inputDeliveryForecast);
        inputDeliveryForecast.setBounds(720, 310, 90, 30);

        txtNameProduct.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtNameProduct.setText("Nome do Produto");
        getContentPane().add(txtNameProduct);
        txtNameProduct.setBounds(360, 70, 140, 30);

        inputNameProduct.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(inputNameProduct);
        inputNameProduct.setBounds(360, 100, 380, 30);

        txtNameClient.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtNameClient.setText("Nome do Cliente");
        getContentPane().add(txtNameClient);
        txtNameClient.setBounds(430, 140, 160, 30);

        inputNameClient.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(inputNameClient);
        inputNameClient.setBounds(430, 170, 380, 30);

        txtNameProvider.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtNameProvider.setText("Nome do Fornecedor");
        getContentPane().add(txtNameProvider);
        txtNameProvider.setBounds(380, 210, 170, 30);

        inputNameProvider.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(inputNameProvider);
        inputNameProvider.setBounds(380, 240, 380, 30);

        setSize(new java.awt.Dimension(900, 707));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLocaleClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLocaleClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLocaleClientActionPerformed

    private void buttonLocaleProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLocaleProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLocaleProductActionPerformed

    private void buttonLocaleProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLocaleProviderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLocaleProviderActionPerformed

    private void inputFormPaymentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_inputFormPaymentItemStateChanged

    }//GEN-LAST:event_inputFormPaymentItemStateChanged

    private void inputFormPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFormPaymentActionPerformed
        if(inputTerm.isSelected()){
            FormPayment formPayment = new FormPayment();
            formPayment.setVisible(true);
        }
    }//GEN-LAST:event_inputFormPaymentActionPerformed

    private void buttonAllProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAllProductsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAllProductsActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(x==0){
            x++;
            GetDate getDate = new GetDate();
            inputDateOfSale.setText(getDate.dateOfSystem());
            this.setTitle( this.getTitle() + ": " + Integer.toString( newOrderId() ) );
        }
    }//GEN-LAST:event_formWindowActivated

    private void buttonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveActionPerformed
        
    }//GEN-LAST:event_buttonRemoveActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        JOptionPane.showMessageDialog(null, "PEDIDO CADASTRADO COM SUCESSO");
        OrderScreen orderScreen = new OrderScreen();
        this.dispose();
        orderScreen.setVisible(true);
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAddActionPerformed

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
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonAllProducts;
    private javax.swing.JButton buttonLocaleClient;
    private javax.swing.JButton buttonLocaleProduct;
    private javax.swing.JButton buttonLocaleProvider;
    private javax.swing.JButton buttonNewClient;
    private javax.swing.JButton buttonNewProvider;
    private javax.swing.JButton buttonRemove;
    private javax.swing.JButton buttonSave;
    private javax.swing.ButtonGroup groupFormPayment;
    private javax.swing.ButtonGroup groupStatus;
    private javax.swing.JTextField inputClient;
    private javax.swing.JTextField inputDateOfSale;
    private javax.swing.JTextField inputDeliveryForecast;
    private javax.swing.JRadioButton inputFinishSale;
    private javax.swing.JComboBox<String> inputFormPayment;
    private javax.swing.JRadioButton inputInCash;
    public static javax.swing.JTextField inputNameClient;
    private javax.swing.JTextField inputNameProduct;
    private javax.swing.JTextField inputNameProvider;
    private javax.swing.JTextArea inputObservation;
    private javax.swing.JRadioButton inputPendingSale;
    private javax.swing.JTextField inputProductCode;
    private javax.swing.JTextField inputProvider;
    private javax.swing.JTextField inputQuantity;
    private javax.swing.JRadioButton inputTerm;
    private javax.swing.JScrollPane observationNewOrder;
    private javax.swing.JLabel outputSubTotal;
    private javax.swing.JLabel outputTotal;
    private javax.swing.JTable tableItems;
    private javax.swing.JScrollPane tableNewOrder;
    private javax.swing.JLabel txtClient;
    private javax.swing.JLabel txtDateOfSale;
    private javax.swing.JLabel txtDeliveryForecast;
    private javax.swing.JLabel txtFormPayment;
    private javax.swing.JLabel txtItems;
    private javax.swing.JLabel txtNameClient;
    private javax.swing.JLabel txtNameProduct;
    private javax.swing.JLabel txtNameProvider;
    public static javax.swing.JLabel txtNewOrder;
    private javax.swing.JLabel txtObservation;
    private javax.swing.JLabel txtPaymentMethod;
    private javax.swing.JLabel txtProductCode;
    private javax.swing.JLabel txtProvider;
    private javax.swing.JLabel txtQuantity;
    private javax.swing.JLabel txtStatus;
    private javax.swing.JLabel txtSubTotal;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
