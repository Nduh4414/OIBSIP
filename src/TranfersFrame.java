
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class TranfersFrame extends javax.swing.JFrame {
   private JLabel jLabel2; 

   
   
Account account;
  private javax.swing.JTextField TFrecname ;

    
    public TranfersFrame(Account account) {
         this.account = account;
         
    
    initComponents();
    updateBalance(account.getBalance());
    TFnewsendamount = new JTextField(10);
  
    
    if(LBbalance != null) {
        LBbalance.setText(String.valueOf(account.getBalance()));
    }
   
}

    public void updateBalanceDisplay() {
        // Get the current balance from wherever you're storing it.
        double balance = account.getBalance();

        // Update the balance label.
        LBbalance.setText("Current Balance: R " + balance);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBlogo = new javax.swing.JLabel();
        BTNsend = new javax.swing.JButton();
        LBsndamountpromt = new javax.swing.JLabel();
        javax.swing.JTextField TFsndamount = new javax.swing.JTextField();
        BTNexit = new javax.swing.JButton();
        LBbalance = new javax.swing.JLabel();
        TFnewsendamount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LBlogo.setBackground(new java.awt.Color(0, 51, 255));
        LBlogo.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        LBlogo.setForeground(new java.awt.Color(0, 0, 51));
        LBlogo.setText("UNIVERSAL BANK");

        BTNsend.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        BTNsend.setText("SEND");
        BTNsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNsendActionPerformed(evt);
            }
        });

        LBsndamountpromt.setText("Please provide amount to send");

        TFsndamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFsndamountActionPerformed(evt);
            }
        });

        BTNexit.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        BTNexit.setText("EXIT");
        BTNexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNexitActionPerformed(evt);
            }
        });

        LBbalance.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LBbalance.setText("jLabel2");

        TFnewsendamount.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BTNexit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(BTNsend, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(LBsndamountpromt, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFsndamount)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TFnewsendamount, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBlogo))
                        .addGap(0, 137, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BTNexit, BTNsend});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LBlogo)
                .addGap(18, 18, 18)
                .addComponent(LBbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(TFsndamount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBsndamountpromt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFnewsendamount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNsend, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNexit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNexitActionPerformed
      new DashboardFrame(account).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BTNexitActionPerformed

    private void BTNsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNsendActionPerformed
      double amount = Double.parseDouble(TFnewsendamount.getText());

   
    if(account.getBalance() >= amount) {
        
        account.withdraw(amount);

      
        JOptionPane.showMessageDialog(null, "Withdrawal successful!");

        
        new DashboardFrame(account).setVisible(true);
        this.dispose();
    } else {
        
        JOptionPane.showMessageDialog(null, "Insufficient balance!");
    }
 
      
    }//GEN-LAST:event_BTNsendActionPerformed

    private void TFsndamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFsndamountActionPerformed

    }//GEN-LAST:event_TFsndamountActionPerformed

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
            java.util.logging.Logger.getLogger(TranfersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TranfersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TranfersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TranfersFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Account account = new Account(300);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TranfersFrame(account).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNexit;
    private javax.swing.JButton BTNsend;
    private javax.swing.JLabel LBbalance;
    private javax.swing.JLabel LBlogo;
    private javax.swing.JLabel LBsndamountpromt;
    private javax.swing.JTextField TFnewsendamount;
    // End of variables declaration//GEN-END:variables

    private String TAhistory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void updateBalance(double balance) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    


}
