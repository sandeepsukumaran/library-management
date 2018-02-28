/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Sandeep
 */
public class BaseJFrame extends javax.swing.JFrame {

    /**
     * Creates new form BaseJFrame
     */
    public BaseJFrame() {
        initComponents();
        try{
            createDBConnection();
        }catch(java.sql.SQLException|ClassNotFoundException e){
            javax.swing.JOptionPane.showMessageDialog(this,"Unable to establish database connection.","DB error",javax.swing.JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddUserTab = new javax.swing.JTabbedPane();
        AddUserjPanel = new javax.swing.JPanel();
        RegisterNewUserjLabel = new javax.swing.JLabel();
        NamejLabel = new javax.swing.JLabel();
        FirstNamejTextField = new javax.swing.JTextField("",20);
        LastNamejTextField = new javax.swing.JTextField("",20);
        NamejLabel1 = new javax.swing.JLabel();
        PhonejLabel = new javax.swing.JLabel();
        MaskFormatter phoneFormatter = null;
        try{
            phoneFormatter = new javax.swing.text.MaskFormatter("(###) ###-####");
            phoneFormatter.setPlaceholderCharacter('0');
        }catch(ParseException e){System.err.println("Parse Error in mask formatter");}
        PhonejFormattedTextField = new JFormattedTextField(phoneFormatter);

        ;
        MaskFormatter ssnFormatter = null;
        try{
            ssnFormatter = new javax.swing.text.MaskFormatter("###-##-####");
            ssnFormatter.setPlaceholderCharacter('0');
        }catch(ParseException e){System.err.println("Parse Error in mask formatter");}
        SSNjFormattedTextField = new JFormattedTextField(ssnFormatter);

        ;
        AddressjLabel = new javax.swing.JLabel();
        AddressL1jTextField = new JTextField("",26);
        AddressL2jTextField = new JTextField("",26);
        CityjTextField = new JTextField("",50);
        StatejComboBox = new javax.swing.JComboBox<>();
        RegisterUserjButton = new javax.swing.JButton();
        BookCheckoutjPanel = new javax.swing.JPanel();
        RegisterNewUserjLabel1 = new javax.swing.JLabel();
        SearchjTextField = new javax.swing.JTextField();
        SearchjTextField.setForeground(Color.GRAY);
        SearchjTextField.setFont(new Font("Tahoma",Font.ITALIC,11));
        SearchjTextField.setText("Enter ISBN, Book name, Author name");
        BCSearchjButton = new javax.swing.JButton();
        BCSearchjButton.setEnabled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 300, 300));
        setMaximumSize(new java.awt.Dimension(300, 300));
        setSize(new java.awt.Dimension(300, 300));

        AddUserTab.setMaximumSize(new java.awt.Dimension(300, 300));

        AddUserjPanel.setBackground(new java.awt.Color(255, 255, 255));
        AddUserjPanel.setMaximumSize(new java.awt.Dimension(300, 300));

        RegisterNewUserjLabel.setBackground(java.awt.Color.black);
        RegisterNewUserjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegisterNewUserjLabel.setForeground(new java.awt.Color(255, 255, 255));
        RegisterNewUserjLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        RegisterNewUserjLabel.setText("Register New User  ");
        RegisterNewUserjLabel.setOpaque(true);

        NamejLabel.setText("NAME");

        FirstNamejTextField.setToolTipText("First Name");
        FirstNamejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FirstNamejTextFieldKeyTyped(evt);
            }
        });

        LastNamejTextField.setToolTipText("Last Name");
        LastNamejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LastNamejTextFieldKeyTyped(evt);
            }
        });

        NamejLabel1.setText("SSN");

        PhonejLabel.setText("PHONE");

        PhonejFormattedTextField.setToolTipText("Phone Number");

        SSNjFormattedTextField.setToolTipText("SSN");

        AddressjLabel.setText("ADDRESS");

        AddressL1jTextField.setToolTipText("Address Line 1");
        AddressL1jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AddressL1jTextFieldKeyTyped(evt);
            }
        });

        AddressL2jTextField.setToolTipText("Address Line 2 (optional)");
        AddressL2jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AddressL2jTextFieldKeyTyped(evt);
            }
        });

        CityjTextField.setToolTipText("City");
        CityjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CityjTextFieldKeyTyped(evt);
            }
        });

        StatejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY" }));
        StatejComboBox.setToolTipText("State");

        RegisterUserjButton.setText("Register");
        RegisterUserjButton.setToolTipText("Register new user");
        RegisterUserjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterUserjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddUserjPanelLayout = new javax.swing.GroupLayout(AddUserjPanel);
        AddUserjPanel.setLayout(AddUserjPanelLayout);
        AddUserjPanelLayout.setHorizontalGroup(
            AddUserjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddUserjPanelLayout.createSequentialGroup()
                .addComponent(RegisterNewUserjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(AddUserjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddUserjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NamejLabel)
                    .addComponent(PhonejLabel)
                    .addComponent(NamejLabel1)
                    .addComponent(AddressjLabel))
                .addGap(18, 18, 18)
                .addGroup(AddUserjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RegisterUserjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SSNjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AddUserjPanelLayout.createSequentialGroup()
                        .addComponent(FirstNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LastNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PhonejFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddressL1jTextField)
                    .addComponent(AddressL2jTextField)
                    .addGroup(AddUserjPanelLayout.createSequentialGroup()
                        .addComponent(CityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StatejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddUserjPanelLayout.setVerticalGroup(
            AddUserjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddUserjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegisterNewUserjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(AddUserjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamejLabel)
                    .addComponent(FirstNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(AddUserjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamejLabel1)
                    .addComponent(SSNjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddUserjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhonejFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhonejLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddUserjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressL1jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddressjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddressL2jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddUserjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(RegisterUserjButton)
                .addGap(19, 19, 19))
        );

        AddUserTab.addTab("Add User", AddUserjPanel);

        BookCheckoutjPanel.setBackground(new java.awt.Color(255, 255, 255));

        RegisterNewUserjLabel1.setBackground(java.awt.Color.black);
        RegisterNewUserjLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegisterNewUserjLabel1.setForeground(new java.awt.Color(255, 255, 255));
        RegisterNewUserjLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        RegisterNewUserjLabel1.setText("Books Checkout  ");
        RegisterNewUserjLabel1.setOpaque(true);

        SearchjTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SearchjTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SearchjTextFieldFocusLost(evt);
            }
        });
        SearchjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchjTextFieldKeyReleased(evt);
            }
        });

        BCSearchjButton.setText("SEARCH");
        BCSearchjButton.setToolTipText("Search books");

        javax.swing.GroupLayout BookCheckoutjPanelLayout = new javax.swing.GroupLayout(BookCheckoutjPanel);
        BookCheckoutjPanel.setLayout(BookCheckoutjPanelLayout);
        BookCheckoutjPanelLayout.setHorizontalGroup(
            BookCheckoutjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookCheckoutjPanelLayout.createSequentialGroup()
                .addComponent(RegisterNewUserjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 178, Short.MAX_VALUE))
            .addGroup(BookCheckoutjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SearchjTextField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BCSearchjButton)
                .addContainerGap())
        );
        BookCheckoutjPanelLayout.setVerticalGroup(
            BookCheckoutjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookCheckoutjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegisterNewUserjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BookCheckoutjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BCSearchjButton))
                .addContainerGap(257, Short.MAX_VALUE))
        );

        AddUserTab.addTab("Books Checkout", BookCheckoutjPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddUserTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddUserTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        AddUserTab.getAccessibleContext().setAccessibleName("AddUserTab");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddressL1jTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddressL1jTextFieldKeyTyped
        char c = evt.getKeyChar();
        if((!(Character.isLetterOrDigit(c)||Character.isSpaceChar(c)))||(AddressL1jTextField.getText().length()>50))
            evt.consume();
    }//GEN-LAST:event_AddressL1jTextFieldKeyTyped

    private void AddressL2jTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddressL2jTextFieldKeyTyped
        char c = evt.getKeyChar();
        if((!(Character.isLetterOrDigit(c)||Character.isSpaceChar(c)))||(AddressL1jTextField.getText().length()>50))
            evt.consume();
    }//GEN-LAST:event_AddressL2jTextFieldKeyTyped

    private void CityjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CityjTextFieldKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isLetter(c))
            evt.consume();
    }//GEN-LAST:event_CityjTextFieldKeyTyped

    private void RegisterUserjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterUserjButtonActionPerformed
        //Insert values into db
        try{
            RegisterUserjButton.setEnabled(false);
            String insertUserString = "INSERT INTO BORROWER (SSN , BNAME , ADDRESS , PHONE) VALUES (?,?,?,?)";
            PreparedStatement insertUser = dbConnection.prepareStatement(insertUserString);
            insertUser.setString(0, SSNjFormattedTextField.getText());
            insertUser.setString(1, NamejLabel.getText()+" "+NamejLabel1.getText());
            if(AddressL2jTextField.getText().length()>0)
                insertUser.setString(2, AddressL1jTextField.getText()+","+AddressL2jTextField.getText()+","+CityjTextField.getText()+","+StatejComboBox.getSelectedItem().toString());
            else
                insertUser.setString(2, AddressL1jTextField.getText()+","+CityjTextField.getText()+","+StatejComboBox.getSelectedItem().toString());
            insertUser.setString(3, PhonejFormattedTextField.getText());
            
            insertUser.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Borrower successfully added to system.", "Success", JOptionPane.INFORMATION_MESSAGE);
            RegisterUserjButton.setEnabled(true);
        }catch(SQLException e){
            System.err.println("Inserting user into db failed!   ");
            if (e.getErrorCode()==MYSQL_DUPLICATE_PK_ERROR_CODE){
                JOptionPane.showMessageDialog(this, "Borrower with this SSN exists.", "Duplicate SSN Error", JOptionPane.ERROR_MESSAGE);
            }else{}
        }
    }//GEN-LAST:event_RegisterUserjButtonActionPerformed

    private void FirstNamejTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FirstNamejTextFieldKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isLetter(c) || c=='\'' || c=='-' || c=='-'))
            evt.consume();
    }//GEN-LAST:event_FirstNamejTextFieldKeyTyped

    private void LastNamejTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LastNamejTextFieldKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isLetter(c) || c=='\'' || c=='-' || c=='-'))
            evt.consume();
    }//GEN-LAST:event_LastNamejTextFieldKeyTyped

    private void SearchjTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchjTextFieldFocusGained
        if (SearchjTextField.getForeground()== Color.GRAY){
            SearchjTextField.setForeground(Color.BLACK);
            SearchjTextField.setFont(new Font("Tahoma",Font.PLAIN,11));
            SearchjTextField.setText("");
            BCSearchjButton.setEnabled(false);
        }else{}
    }//GEN-LAST:event_SearchjTextFieldFocusGained

    private void SearchjTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchjTextFieldFocusLost
        if (SearchjTextField.getText().length()== 0){
            SearchjTextField.setForeground(Color.GRAY);
            SearchjTextField.setFont(new Font("Tahoma",Font.ITALIC,11));
            SearchjTextField.setText("Enter ISBN, Book name, Author name");
            BCSearchjButton.setEnabled(false);
        }else{}
    }//GEN-LAST:event_SearchjTextFieldFocusLost

    private void SearchjTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchjTextFieldKeyReleased
        if(SearchjTextField.getText().length()==0)
            BCSearchjButton.setEnabled(false);
        else
            BCSearchjButton.setEnabled(true);
    }//GEN-LAST:event_SearchjTextFieldKeyReleased

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaseJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BaseJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane AddUserTab;
    private javax.swing.JPanel AddUserjPanel;
    private javax.swing.JTextField AddressL1jTextField;
    private javax.swing.JTextField AddressL2jTextField;
    private javax.swing.JLabel AddressjLabel;
    private javax.swing.JButton BCSearchjButton;
    private javax.swing.JPanel BookCheckoutjPanel;
    private javax.swing.JTextField CityjTextField;
    private javax.swing.JTextField FirstNamejTextField;
    private javax.swing.JTextField LastNamejTextField;
    private javax.swing.JLabel NamejLabel;
    private javax.swing.JLabel NamejLabel1;
    private javax.swing.JFormattedTextField PhonejFormattedTextField;
    private javax.swing.JLabel PhonejLabel;
    private javax.swing.JLabel RegisterNewUserjLabel;
    private javax.swing.JLabel RegisterNewUserjLabel1;
    private javax.swing.JButton RegisterUserjButton;
    private javax.swing.JFormattedTextField SSNjFormattedTextField;
    private javax.swing.JTextField SearchjTextField;
    private javax.swing.JComboBox<String> StatejComboBox;
    // End of variables declaration//GEN-END:variables
    private java.util.ResourceBundle reader = null;
    private java.sql.Connection dbConnection = null;

    private void createDBConnection() throws java.sql.SQLException, ClassNotFoundException{
        
        //System.out.println("Driver registered.");
        reader = java.util.ResourceBundle.getBundle("librarymanagement/dbconfig");
        Class.forName(reader.getString("db.driverClass"));
        //System.out.println(reader.getString("db.url"));
        //System.out.println(reader.getString("db.username"));
        //System.out.println(reader.getString("db.password"));
        dbConnection = java.sql.DriverManager.getConnection(reader.getString("db.url"),reader.getString("db.username"),reader.getString("db.password"));
        //dbConnection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/LIBRARY","librarian","booklover");
    }
    
    public static final int MYSQL_DUPLICATE_PK_ERROR_CODE = 1062;
}
