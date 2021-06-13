package forms;

import classes.Books;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zahra AP
 */
public class AdminPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminPage
     */
    public AdminPage() {
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
        jAdd = new javax.swing.JButton();
        jSearchField = new javax.swing.JTextField();
        jSearch = new javax.swing.JLabel();
        jBookListAdmin = new javax.swing.JScrollPane();
        BookListAdmin = new javax.swing.JTable();
        jLogoutAdmin = new javax.swing.JLabel();
        jExitAdmin = new javax.swing.JLabel();
        jBookNameAdd = new javax.swing.JTextField();
        jAuthorAdd = new javax.swing.JTextField();
        jGenreAdd = new javax.swing.JTextField();
        jBookName = new javax.swing.JLabel();
        jAuthor = new javax.swing.JLabel();
        jGenre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin");
        setLocation(new java.awt.Point(300, 300));
        setUndecorated(true);
        setResizable(false);

        jPanelWelcome.setBackground(new java.awt.Color(102, 0, 102));
        jPanelWelcome.setPreferredSize(new java.awt.Dimension(450, 600));

        jAdd.setBackground(new java.awt.Color(255, 255, 255));
        jAdd.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jAdd.setForeground(new java.awt.Color(102, 0, 102));
        jAdd.setText("Add Book");
        jAdd.setBorderPainted(false);
        jAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddActionPerformed(evt);
            }
        });

        jSearchField.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jSearchField.setMinimumSize(new java.awt.Dimension(6, 20));
        jSearchField.setSelectionColor(new java.awt.Color(102, 0, 102));
        jSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchFieldActionPerformed(evt);
            }
        });

        jSearch.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jSearch.setForeground(new java.awt.Color(255, 255, 255));
        jSearch.setText("Search");
        jSearch.setToolTipText("");

        BookListAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null,  new Boolean(false)},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
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
                "Book", "Author", "Genre", "Available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BookListAdmin.setColumnSelectionAllowed(true);
        BookListAdmin.setGridColor(new java.awt.Color(102, 0, 102));
        BookListAdmin.setSelectionBackground(new java.awt.Color(102, 0, 102));
        BookListAdmin.getTableHeader().setReorderingAllowed(false);
        jBookListAdmin.setViewportView(BookListAdmin);
        BookListAdmin.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jLogoutAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/interface-logout-4e8igal4j6tyuw6x0r6n5.png"))); // NOI18N
        jLogoutAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLogoutAdminMouseClicked(evt);
            }
        });

        jExitAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/interface-delete-1-x8zqpdddl47ewg5ugtkv2.png"))); // NOI18N
        jExitAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jExitAdminMouseClicked(evt);
            }
        });

        jBookNameAdd.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jBookNameAdd.setSelectionColor(new java.awt.Color(102, 0, 102));

        jAuthorAdd.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jAuthorAdd.setSelectionColor(new java.awt.Color(102, 0, 102));

        jGenreAdd.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jGenreAdd.setSelectionColor(new java.awt.Color(102, 0, 102));

        jBookName.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jBookName.setForeground(new java.awt.Color(255, 255, 255));
        jBookName.setText("Book:");

        jAuthor.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jAuthor.setForeground(new java.awt.Color(255, 255, 255));
        jAuthor.setText("Author:");

        jGenre.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jGenre.setForeground(new java.awt.Color(255, 255, 255));
        jGenre.setText("Genre:");

        javax.swing.GroupLayout jPanelWelcomeLayout = new javax.swing.GroupLayout(jPanelWelcome);
        jPanelWelcome.setLayout(jPanelWelcomeLayout);
        jPanelWelcomeLayout.setHorizontalGroup(
            jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWelcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelWelcomeLayout.createSequentialGroup()
                        .addComponent(jLogoutAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jExitAdmin))
                    .addGroup(jPanelWelcomeLayout.createSequentialGroup()
                        .addGroup(jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jBookListAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelWelcomeLayout.createSequentialGroup()
                                    .addComponent(jSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jSearch)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWelcomeLayout.createSequentialGroup()
                                .addGroup(jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelWelcomeLayout.createSequentialGroup()
                                        .addGroup(jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanelWelcomeLayout.createSequentialGroup()
                                                .addComponent(jBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53)
                                                .addComponent(jAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanelWelcomeLayout.createSequentialGroup()
                                                .addComponent(jBookNameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53)
                                                .addComponent(jAuthorAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(54, 54, 54)
                                        .addGroup(jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jGenreAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jGenre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(11, 11, 11)))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelWelcomeLayout.setVerticalGroup(
            jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWelcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jExitAdmin)
                    .addComponent(jLogoutAdmin))
                .addGap(61, 61, 61)
                .addGroup(jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBookListAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBookName)
                    .addComponent(jAuthor)
                    .addComponent(jGenre))
                .addGap(0, 0, 0)
                .addGroup(jPanelWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBookNameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAuthorAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jGenreAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jAdd)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelWelcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSearchFieldActionPerformed

    private void jAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddActionPerformed
        String bookName = jBookNameAdd.getText();
        String author = jAuthorAdd.getText();
        String genre = jGenreAdd.getText();
        Boolean available = true;
        
        if(!(bookName.equals("") || author.equals("") || genre.equals(""))) {
            Books j = new Books(bookName, author, genre, available);
            j.addBook();
            
            jBookNameAdd.setText("");
            jAuthorAdd.setText("");
            jGenreAdd.setText("");
            
            JOptionPane.showMessageDialog(this, "Book added successfully");
        } else {JOptionPane.showMessageDialog(this, "Please fill out all of the fields");}
    }//GEN-LAST:event_jAddActionPerformed

    private void jExitAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExitAdminMouseClicked
        dispose();
        System.exit (0);
    }//GEN-LAST:event_jExitAdminMouseClicked

    private void jLogoutAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLogoutAdminMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLogoutAdminMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsejAddBooksc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BookListAdmin;
    private javax.swing.JButton jAdd;
    private javax.swing.JLabel jAuthor;
    private javax.swing.JTextField jAuthorAdd;
    private javax.swing.JScrollPane jBookListAdmin;
    private javax.swing.JLabel jBookName;
    private javax.swing.JTextField jBookNameAdd;
    private javax.swing.JLabel jExitAdmin;
    private javax.swing.JLabel jGenre;
    private javax.swing.JTextField jGenreAdd;
    private javax.swing.JLabel jLogoutAdmin;
    private javax.swing.JPanel jPanelWelcome;
    private javax.swing.JLabel jSearch;
    private javax.swing.JTextField jSearchField;
    // End of variables declaration//GEN-END:variables
}
