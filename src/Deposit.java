
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Deposit extends javax.swing.JFrame {
      
    private JLabel LBLbalance; 
    private double balance;
    private HistoryFrame historyFrame; 
    private Deposit deposit;
    private Account account;
 

   

    /**
     * Creates new form Deposit
     */
    public Deposit(Account account) {
        this.account = account;
        this.historyFrame = historyFrame;
        initComponents();
                 updateBalance(account.getBalance());  // Update LBbalance with the account balance
    }

    public void updateBalance(double balance) {
        LBbalance.setText("Available Balance: " + balance);
      

    
    }

    private Deposit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBamountdep = new javax.swing.JLabel();
        TFamountdep = new javax.swing.JTextField();
        BTNdeposit = new javax.swing.JButton();
        BTNexit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LBbalance = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LBamountdep.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LBamountdep.setText("Enter amount to deposit");

        BTNdeposit.setBackground(new java.awt.Color(51, 51, 51));
        BTNdeposit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BTNdeposit.setForeground(new java.awt.Color(0, 153, 0));
        BTNdeposit.setText("DEPOSIT");
        BTNdeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNdepositActionPerformed(evt);
            }
        });

        BTNexit.setBackground(new java.awt.Color(51, 51, 51));
        BTNexit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BTNexit.setForeground(new java.awt.Color(0, 153, 0));
        BTNexit.setText("EXIT");
        BTNexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNexitActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("UNIVERSAL BANK");

        LBbalance.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LBbalance.setForeground(new java.awt.Color(0, 153, 0));
        LBbalance.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BTNexit, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTNdeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(LBamountdep, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TFamountdep)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(LBbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFamountdep, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBamountdep, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNdeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNexit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNdepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNdepositActionPerformed
try {
        String input = TFamountdep.getText();
        if (input.matches("[0-9]+")) {
            double depositAmount = Double.parseDouble(input);
            account.deposit(depositAmount);
            JOptionPane.showMessageDialog(Deposit.this, "Deposit successful! New balance: " + account.getBalance());
            new DashboardFrame(account).setVisible(true);
            this.dispose(); // Close the Deposit frame
        } else {
            JOptionPane.showMessageDialog(Deposit.this, "Please enter a valid number for the deposit amount.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(Deposit.this, "Please enter a valid number for the deposit amount.");
    }


    }//GEN-LAST:event_BTNdepositActionPerformed

    private void BTNexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNexitActionPerformed
        new DashboardFrame(account).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTNexitActionPerformed

   
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
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposit().setVisible(true);
            }
        });
    
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNdeposit;
    private javax.swing.JButton BTNexit;
    private javax.swing.JLabel LBamountdep;
    private javax.swing.JLabel LBbalance;
    private javax.swing.JTextField TFamountdep;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
