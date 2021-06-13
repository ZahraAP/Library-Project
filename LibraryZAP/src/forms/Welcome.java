package forms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zahra AP
 */
public class Welcome extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Welcome() {
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

        jPanelWelcome = new javax.swing.JPanel();
        jLibrary = new javax.swing.JLabel();
        jLogin = new javax.swing.JButton();
        jRegister = new javax.swing.JButton();
        jExitWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome");
        setBackground(new java.awt.Color(153, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(300, 300));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 300));

        jPanelWelcome.setBackground(new java.awt.Color(102, 0, 102));
        jPanelWelcome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelWelcomeMousePressed(evt);
            }
        });

        jLibrary.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLibrary.setForeground(new java.awt.Color(255, 255, 255));
        jLibrary.setText("Welcome To Your Library");
        jLibrary.setToolTipText("");

        jLogin.setBackground(new java.awt.Color(255, 255, 255));
        jLogin.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLogin.setForeground(new java.awt.Color(102, 0, 102));
        jLogin.setText("Login");
        jLogin.setBorderPainted(false);
        jLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginActionPerformed(evt);
            }
        });

        jRegister.setBackground(new java.awt.Color(255, 255, 255));
        jRegister.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jRegister.setForeground(new java.awt.Color(51, 51, 51));
        jRegister.setText("Register");
        jRegister.setBorderPainted(false);
        jRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegisterActionPerformed(evt);
            }
        });

        jExitWelcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/interface-delete-1-x8zqpdddl47ewg5ugtkv2.png"))); // NOI18N
        jExitWelcome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jExitWelcomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelWelcomeLayout = new javax.swing.GroupLayout(jPanelWelcome);
        jPanelWelcome.setLayout(jPanelWelcomeLayout);
        jPanelWelcomeLayout.setHorizontalGroup(
            jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWelcomeLayout.createSequentialGroup()
                .addGroup(jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelWelcomeLayout.createSequentialGroup()
                        .addGroup(jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelWelcomeLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLibrary))
                            .addGroup(jPanelWelcomeLayout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addGroup(jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWelcomeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jExitWelcome)))
                .addContainerGap())
        );
        jPanelWelcomeLayout.setVerticalGroup(
            jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWelcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jExitWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLibrary)
                .addGap(32, 32, 32)
                .addComponent(jLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRegister)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLoginActionPerformed

    private void jRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegisterActionPerformed
        new Register().setVisible(true);
        dispose();
    }//GEN-LAST:event_jRegisterActionPerformed

    private void jExitWelcomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExitWelcomeMouseClicked
        dispose();
        System.exit (0);
    }//GEN-LAST:event_jExitWelcomeMouseClicked

    private void jPanelWelcomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelWelcomeMousePressed
       
    }//GEN-LAST:event_jPanelWelcomeMousePressed

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jExitWelcome;
    private javax.swing.JLabel jLibrary;
    private javax.swing.JButton jLogin;
    private javax.swing.JPanel jPanelWelcome;
    private javax.swing.JButton jRegister;
    // End of variables declaration//GEN-END:variables
}
