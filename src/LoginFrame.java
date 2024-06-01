
import java.util.HashMap;
import javax.swing.JOptionPane;

public class LoginFrame extends javax.swing.JFrame {

    private Account account;
    private static HashMap<String, String> userCredentials = new HashMap<>();
    
    static {
        userCredentials.put("admin", "password");
    }

    public LoginFrame() {
        initComponents();
        account = new Account(5000.0);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBusername = new javax.swing.JLabel();
        TFusername = new javax.swing.JTextField();
        LBpassword = new javax.swing.JLabel();
        PFpassword = new javax.swing.JPasswordField();
        BTNlogin = new javax.swing.JButton();
        BTNsignup = new javax.swing.JButton();
        BTNexit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LBsignupoffer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(51, 204, 0));

        LBusername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LBusername.setText("Username");

        LBpassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LBpassword.setText("Password");

        BTNlogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BTNlogin.setText("LOGIN");
        BTNlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNloginActionPerformed(evt);
            }
        });

        BTNsignup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BTNsignup.setText("Sign-up");
        BTNsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNsignupActionPerformed(evt);
            }
        });

        BTNexit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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

        LBsignupoffer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LBsignupoffer.setForeground(new java.awt.Color(0, 153, 0));
        LBsignupoffer.setText("Don't have an account?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LBpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LBusername, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TFusername, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addComponent(PFpassword))
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(LBsignupoffer, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BTNsignup)
                .addGap(198, 198, 198)
                .addComponent(BTNexit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNlogin)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {LBpassword, LBusername});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BTNexit, BTNlogin, BTNsignup});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBusername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFusername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PFpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 190, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNlogin)
                    .addComponent(BTNexit)
                    .addComponent(LBsignupoffer, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNsignup))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {LBpassword, LBusername});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNexitActionPerformed
        System.exit(0);

    }//GEN-LAST:event_BTNexitActionPerformed

    private void BTNloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNloginActionPerformed
        // Get the username and password entered by the user
      String enteredUsername = TFusername.getText();
        String enteredPassword = new String(PFpassword.getPassword());

        if (userCredentials.containsKey(enteredUsername) && userCredentials.get(enteredUsername).equals(enteredPassword)) {
            new DashboardFrame(account).setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password!");
        }
    

    }//GEN-LAST:event_BTNloginActionPerformed

    private void BTNsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNsignupActionPerformed
        new SignUpFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTNsignupActionPerformed
public static void addUser(String username, String password) {
        userCredentials.put(username, password);
    }
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNexit;
    private javax.swing.JButton BTNlogin;
    private javax.swing.JButton BTNsignup;
    private javax.swing.JLabel LBpassword;
    private javax.swing.JLabel LBsignupoffer;
    private javax.swing.JLabel LBusername;
    private javax.swing.JPasswordField PFpassword;
    private javax.swing.JTextField TFusername;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
