/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.LibrarianRole;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Blu-Ray
 */
public class AddBook extends javax.swing.JFrame implements Node {

    private Node parent;

    /**
     * Creates new form AddBook
     */
    public AddBook() {
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

        jPanel1 = new javax.swing.JPanel();
        bookAuthorNameLabel = new javax.swing.JLabel();
        bookIdTextField = new javax.swing.JTextField();
        bookIdLabel = new javax.swing.JLabel();
        bookPublisherLabel = new javax.swing.JLabel();
        bookTitleLabel = new javax.swing.JLabel();
        bookCopiesLabel = new javax.swing.JLabel();
        bookPublisherTextField = new javax.swing.JTextField();
        bookAuthorNameTextField = new javax.swing.JTextField();
        bookCopiesTextField = new javax.swing.JTextField();
        bookTitleTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Add Book");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        bookAuthorNameLabel.setBackground(new java.awt.Color(0, 255, 0));
        bookAuthorNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        bookAuthorNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookAuthorNameLabel.setText("Author Name");
        bookAuthorNameLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bookAuthorNameLabel.setOpaque(true);

        bookIdLabel.setBackground(new java.awt.Color(0, 255, 0));
        bookIdLabel.setForeground(new java.awt.Color(0, 0, 0));
        bookIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookIdLabel.setText("Book Id");
        bookIdLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bookIdLabel.setOpaque(true);

        bookPublisherLabel.setBackground(new java.awt.Color(0, 255, 0));
        bookPublisherLabel.setForeground(new java.awt.Color(0, 0, 0));
        bookPublisherLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookPublisherLabel.setText("Publisher");
        bookPublisherLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bookPublisherLabel.setOpaque(true);

        bookTitleLabel.setBackground(new java.awt.Color(0, 255, 0));
        bookTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        bookTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookTitleLabel.setText("Title");
        bookTitleLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bookTitleLabel.setOpaque(true);

        bookCopiesLabel.setBackground(new java.awt.Color(0, 255, 0));
        bookCopiesLabel.setForeground(new java.awt.Color(0, 0, 0));
        bookCopiesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookCopiesLabel.setText("No of copies");
        bookCopiesLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bookCopiesLabel.setOpaque(true);

        bookTitleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookTitleTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookCopiesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(bookPublisherLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bookAuthorNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bookIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bookTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bookCopiesTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(bookPublisherTextField)
                    .addComponent(bookAuthorNameTextField)
                    .addComponent(bookIdTextField)
                    .addComponent(bookTitleTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookAuthorNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookAuthorNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookPublisherTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookPublisherLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookCopiesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookCopiesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addButton.setBackground(new java.awt.Color(0, 0, 0));
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(addButton)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookTitleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookTitleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookTitleTextFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        String bookID = bookIdTextField.getText();
        String bookTitle = bookTitleTextField.getText();
        String bookAuthorName = bookAuthorNameTextField.getText();
        String bookPublisher = bookPublisherTextField.getText();
        String bookNumCopies = bookCopiesTextField.getText();
        LibrarianRole librarian = new LibrarianRole();
        char[] array = bookNumCopies.toCharArray();
        boolean isNumeric = true;
        for (char c : array) {
            if (!Character.isDigit(c)) {
                isNumeric = false;
                break;
            }
        }
        if (bookID.equals("") || bookTitle.equals("") || bookAuthorName.equals("") || bookPublisher.equals("") || bookNumCopies.equals(""))
            JOptionPane.showMessageDialog(null, "Some fields are empty");
        else if(!isNumeric)
            JOptionPane.showMessageDialog(null, "You should enter a numeric value in the field whoise name is 'number of copies'");
        int numOfBooks = librarian.getListOfBooks().length;
        librarian.addBook(bookID, bookTitle, bookAuthorName, bookPublisher, Integer.parseInt(bookNumCopies));
        int newNummOfBooks = librarian.getListOfBooks().length;
        if (numOfBooks == newNummOfBooks) {
            JOptionPane.showMessageDialog(null, "The librarian with ID = " + bookID + " already exists!");
        } else {
            bookIdTextField.setText("");
            bookTitleTextField.setText("");
            bookAuthorNameTextField.setText("");
            bookPublisherTextField.setText("");
            bookCopiesTextField.setText("");
            JOptionPane.showMessageDialog(null, "The librarian with ID = " + bookID + " has been successfully added");
        }

    }//GEN-LAST:event_addButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setVisible(false);
        ((JFrame) getParentNode()).setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel bookAuthorNameLabel;
    private javax.swing.JTextField bookAuthorNameTextField;
    private javax.swing.JLabel bookCopiesLabel;
    private javax.swing.JTextField bookCopiesTextField;
    private javax.swing.JLabel bookIdLabel;
    private javax.swing.JTextField bookIdTextField;
    private javax.swing.JLabel bookPublisherLabel;
    private javax.swing.JTextField bookPublisherTextField;
    private javax.swing.JLabel bookTitleLabel;
    private javax.swing.JTextField bookTitleTextField;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public Node getParentNode() {
        return parent;
    }

    @Override
    public void setParentNode(Node node) {
        this.parent = node;
    }
}
