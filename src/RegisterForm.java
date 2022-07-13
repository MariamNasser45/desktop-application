import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARIAM NASSER
 */
public class RegisterForm extends javax.swing.JFrame {

      Connection conn=null;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
        int primkey=1;
        public void Count_Users()
    {
        // to increment primary key in DB
        try
        {
          //  JOptionPane.showMessageDialog(null,"this username is already exist");
             Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/midcare","root","");
            st=(Statement) conn.createStatement();
            rs=st.executeQuery("Select Max(USID) from useres");
            rs.next();
            primkey=rs.getInt(1)+1;
        }
        catch(Exception ex)
        {
            
        }
    }

    public RegisterForm() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addres = new javax.swing.JTextArea();
        password = new javax.swing.JPasswordField();
        repassword = new javax.swing.JPasswordField();
        register = new javax.swing.JButton();
        haveaccount = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1250, 850));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("First Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 54, 200, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Last Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 133, 200, 46));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Repassword");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 353, 200, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 276, 200, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("User Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 202, 200, 41));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 457, 200, 48));
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 54, 270, 42));
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 133, 270, 36));
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 206, 270, 41));

        addres.setColumns(20);
        addres.setRows(5);
        jScrollPane1.setViewportView(addres);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 440, 675, -1));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 285, 270, 41));

        repassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repasswordActionPerformed(evt);
            }
        });
        getContentPane().add(repassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 353, 270, 50));

        register.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        getContentPane().add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 630, 120, 50));

        haveaccount.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        haveaccount.setText("Already have an account");
        haveaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haveaccountActionPerformed(evt);
            }
        });
        getContentPane().add(haveaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, 270, 48));

        close.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 630, 120, 49));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/join-us-concept-with-globe-on-blue-background-drawings_csp20710592.jpg"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(1250, 850));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -240, 1340, 1190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void haveaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_haveaccountActionPerformed
        // TODO add your handling code here:
        LoginForm lf=new LoginForm();
        lf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_haveaccountActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
          //define variables to store input values for checkin them in database
        String first_name=fname.getText();
        String last_name=lname.getText();
        String user_name=uname.getText();
        String pass=String.valueOf(password.getPassword());
        String re_pass=String.valueOf(repassword.getPassword());
        String address=this.addres.getText();
        
        // if user not enter som information show warn message
        if (first_name.equals(""))
        {
            JOptionPane.showMessageDialog(null,"first name is required");
        }
           else if (pass.equals(""))
        {
            JOptionPane.showMessageDialog(null,"last nameis required");
        }
        else if (pass.equals(""))
        {
            JOptionPane.showMessageDialog(null,"password is required");
        }
        else if (re_pass.equals(""))
        {
            JOptionPane.showMessageDialog(null,"re-password also is required");
        }
        
        // check if input user name already exist
        else if (chk_username(user_name))
        {
            JOptionPane.showMessageDialog(null,"this username is already exist");
        }
        else
        {
         Count_Users();
         //System.out.print(primkey);
        PreparedStatement ps;
        String query;
        query = "insert into useres (USFNAME, USLNAME, UNAME, PASS, USADDRESS,USID) VALUES (?,?,?,?,?,?)";
        try{
        ps=MyConnection.getConnection().prepareStatement(query);
        ps.setInt(6,primkey);
        ps.setString(1,fname.getText());
        ps.setString(2,lname.getText());
        ps.setString(3,uname.getText());
        ps.setString(4,password.getText());
        ps.setString(5,addres.getText());
        if(ps.executeUpdate()>0)
        {JOptionPane.showMessageDialog(null,"New record Added");
        }
        } 
        catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
         LoginForm lg =new LoginForm();
          lg.setVisible(true);
          this.setVisible(false);
    } 
   
   
    }                                        

    // creat function of cheching if user name is exist 
       public boolean chk_username(String username)
{
    PreparedStatement ps;
    ResultSet rs;
    boolean checkuser=false;
        String query;
        query = "SELECT * FROM useres WHERE UNAME=?";
        try{
            ps=MyConnection.getConnection().prepareStatement(query);
        ps.setString(1,username);
        rs=ps.executeQuery();
        
        if(rs.next())
        {
            checkuser=true;
        }
        } 
        catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);       
        }
        return checkuser;
}                              

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }//GEN-LAST:event_registerActionPerformed

    private void repasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repasswordActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addres;
    private javax.swing.JButton close;
    private javax.swing.JTextField fname;
    private javax.swing.JButton haveaccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton register;
    private javax.swing.JPasswordField repassword;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
