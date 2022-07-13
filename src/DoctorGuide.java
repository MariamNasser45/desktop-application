
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARIAM NASSER SAYED
 */
public class DoctorGuide extends javax.swing.JFrame {

    Connection conn=null;
    PreparedStatement ps;
    Statement st=null;
    ResultSet rs=null;
    
        int primkey=1;
        public void Count_patient()
  {
        // to increment primary key in DB
        try
        {
             Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/midcare","root","");
            st=(Statement) conn.createStatement();
            st=(Statement) conn.createStatement();
            rs=st.executeQuery("select Max(id) from appointements");
            rs.next();
            primkey=rs.getInt(1)+1;
        }
        catch(Exception ex)
        {
            
        }
  }


    public DoctorGuide() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        specialis = new javax.swing.JTextField();
        doc = new javax.swing.JTextField();
        type = new javax.swing.JTextField();
        hosp = new javax.swing.JTextField();
        pname = new javax.swing.JTextField();
        specialist = new javax.swing.JComboBox<>();
        hospital = new javax.swing.JComboBox<>();
        apptype = new javax.swing.JComboBox<>();
        doctor = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1250, 850));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Patient Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 190, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose Requirement Specialist");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 400, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Choose From Available Hospital");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 400, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Choose Doctor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 240, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Appointement Type");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 290, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 640, 80, -1));

        specialis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialisActionPerformed(evt);
            }
        });
        getContentPane().add(specialis, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 270, 40));
        getContentPane().add(doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, 260, 40));
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 260, 40));
        getContentPane().add(hosp, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 260, 40));
        getContentPane().add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 470, 50));

        specialist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "eyes", "The Women’s section ", "Intensive care departm", "Department of Surgery", "Departmentof Nephrolog", "Department of Nose ", "Department of Allergy ", " " }));
        specialist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialistActionPerformed(evt);
            }
        });
        getContentPane().add(specialist, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 290, 40));

        hospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalActionPerformed(evt);
            }
        });
        getContentPane().add(hospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 290, 40));

        apptype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Check Up", "Sergury" }));
        apptype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apptypeActionPerformed(evt);
            }
        });
        getContentPane().add(apptype, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 300, 40));

        doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorActionPerformed(evt);
            }
        });
        getContentPane().add(doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 300, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("Restart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 220, 100, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 370, 100, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton3.setText("Book");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 290, 100, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 450, 100, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(1250, 850));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorActionPerformed
        // TODO add your handling code here:
                //get selected value
        
        String selectedValue4=doctor.getSelectedItem().toString();
        
        //set selected value into text field
        doc.setText(selectedValue4);

    }//GEN-LAST:event_doctorActionPerformed

    private void specialisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialisActionPerformed
        // TODO add your handling code here:
       

        
    }//GEN-LAST:event_specialisActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        HomePage hp =new HomePage();
                hp.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        try{
         Count_patient();
        PreparedStatement ps;
        String query;
        query = "insert into appointements (id, date , appointment_type, patient_name, hosp_name,doc_name) VALUES (?,?,?,?,?,?)";
        ps=MyConnection.getConnection().prepareStatement(query);
        ps.setInt(1,primkey);
        ps.setString(2, ((JTextField) date.getDateEditor().getUiComponent()).getText());
        ps.setString(3,type.getText());
        ps.setString(4,pname.getText());
        ps.setString(5,hosp.getText());
        ps.setString(6,doc.getText());
        if(ps.executeUpdate()>0)
        {JOptionPane.showMessageDialog(null,"Appointement Booked");
        }
        } 
        catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void specialistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialistActionPerformed
        // TODO add your handling code here:
          //get selected value
        String selectedValue=specialist.getSelectedItem().toString();
        
        //set selected value into text field
        specialis.setText(selectedValue);
        
          if(specialist.getSelectedItem().equals("eyes"))
        {
            
            hospital.addItem("Coptic Hospital");
            doctor.addItem(" Ali Mostafa ");

        }
          
          
          
       else  if(specialist.getSelectedItem().equals("The Women’s section "))
        {
           
        
            hospital.addItem("Dar Al Fouad");
            doctor.addItem(" Ahmed ali");

       
        }
         else  if(specialist.getSelectedItem().equals("Intensive care department"))
        {
            
          
            hospital.addItem("Agouza Hospital");
            doctor.addItem(" mahmoud adel");

        }
        else if(specialist.getSelectedItem().equals("Department of Surgery"))
        {
            hospital.addItem("Burj Al Arab");
            doctor.addItem("  Adel Mohamed");

         
        }
   

       else if(specialist.getSelectedItem().equals("Department of Allergy "))
        {
            hospital.addItem("thoracic lesion");
            doctor.addItem(" nour naser");

         
        }
       else if(specialist.getSelectedItem().equals("Orthopedic department"))
        {
            hospital.addItem("German Hospital");
            doctor.addItem("MOHAMED  Hamed");

        }
              else if(specialist.getSelectedItem().equals("Departmentof Nephrolog"))
        {
            
            hospital.addItem("Dar Al Fouad");
            doctor.addItem(" Ashraf Mahmoud");
            
        }
                 else if(specialist.getSelectedItem().equals("Department of Nose "))
        {
            
            hospital.addItem("ELFAED");
            doctor.addItem("Menna Ashraf");

        }
               
        
      

    }//GEN-LAST:event_specialistActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        specialis.setText("");
       hosp.setText("");
       doc.setText("");
       type.setText("");
       pname.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void hospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalActionPerformed
        // TODO add your handling code here:
       String selectedValue1=hospital.getSelectedItem().toString();
        
       hosp.setText(selectedValue1);

    }//GEN-LAST:event_hospitalActionPerformed

    private void apptypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apptypeActionPerformed
        // TODO add your handling code here:
       String selectedValue2=apptype.getSelectedItem().toString();
       type.setText(selectedValue2);

    }//GEN-LAST:event_apptypeActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorGuide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorGuide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorGuide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorGuide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorGuide().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> apptype;
    private javax.swing.JTextField doc;
    private javax.swing.JComboBox<String> doctor;
    private javax.swing.JTextField hosp;
    private javax.swing.JComboBox<String> hospital;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField specialis;
    private javax.swing.JComboBox<String> specialist;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}