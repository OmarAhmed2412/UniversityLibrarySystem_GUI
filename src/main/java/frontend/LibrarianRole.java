/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

/**
 *
 * @author Blu-Ray
 */
public class LibrarianRole extends javax.swing.JFrame implements Node{
    private Node parent;

    /**
     * Creates new form LibrarianRole
     */
    public LibrarianRole() {
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

        viewBorrowedBooksButton = new javax.swing.JButton();
        borrowBookButton = new javax.swing.JButton();
        addBookButton = new javax.swing.JButton();
        viewBooksButton = new javax.swing.JButton();
        returnBookButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Librarian Role");

        viewBorrowedBooksButton.setBackground(new java.awt.Color(0, 0, 0));
        viewBorrowedBooksButton.setForeground(new java.awt.Color(255, 255, 255));
        viewBorrowedBooksButton.setText("View Borrowed Books");
        viewBorrowedBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBorrowedBooksButtonActionPerformed(evt);
            }
        });

        borrowBookButton.setBackground(new java.awt.Color(0, 0, 0));
        borrowBookButton.setForeground(new java.awt.Color(255, 255, 255));
        borrowBookButton.setText("Borrow Book");
        borrowBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowBookButtonActionPerformed(evt);
            }
        });

        addBookButton.setBackground(new java.awt.Color(0, 0, 0));
        addBookButton.setForeground(new java.awt.Color(255, 255, 255));
        addBookButton.setText("Add Book");
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });

        viewBooksButton.setBackground(new java.awt.Color(0, 0, 0));
        viewBooksButton.setForeground(new java.awt.Color(255, 255, 255));
        viewBooksButton.setText("View Books");
        viewBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBooksButtonActionPerformed(evt);
            }
        });

        returnBookButton.setBackground(new java.awt.Color(0, 0, 0));
        returnBookButton.setForeground(new java.awt.Color(255, 255, 255));
        returnBookButton.setText("Return Book");
        returnBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBookButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(0, 0, 0));
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewBorrowedBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrowBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(addBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(borrowBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewBorrowedBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(returnBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewBorrowedBooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBorrowedBooksButtonActionPerformed
        ViewBorrowedBooks vbb = new ViewBorrowedBooks();
        vbb.setParentNode(this);
        this.setVisible(false);
        vbb.setVisible(true);
    }//GEN-LAST:event_viewBorrowedBooksButtonActionPerformed

    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        AddBook ab = new AddBook();
        ab.setParentNode(this);
        this.setVisible(false);
        ab.setVisible(true);
    }//GEN-LAST:event_addBookButtonActionPerformed

    private void returnBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBookButtonActionPerformed
        ReturnBook rb = new ReturnBook();
        rb.setParentNode(this);
        this.setVisible(false);
        rb.setVisible(true);
    }//GEN-LAST:event_returnBookButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        LibrarySystem ls = new LibrarySystem();
        this.setVisible(false);
        ls.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void viewBooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBooksButtonActionPerformed
        ViewBooks vb = new ViewBooks();
        vb.setParentNode(this);
        this.setVisible(false);
        vb.setVisible(true);
    }//GEN-LAST:event_viewBooksButtonActionPerformed

    private void borrowBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowBookButtonActionPerformed
        BorrowBook bb = new BorrowBook();
        bb.setParentNode(this);
        this.setVisible(false);
        bb.setVisible(true);
    }//GEN-LAST:event_borrowBookButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LibrarianRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarianRole().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookButton;
    private javax.swing.JButton borrowBookButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton returnBookButton;
    private javax.swing.JButton viewBooksButton;
    private javax.swing.JButton viewBorrowedBooksButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public Node getParentNode() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setParentNode(Node node) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
