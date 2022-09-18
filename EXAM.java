package MyMiniProject;
import java.sql.*;
import javax.swing.JOptionPane;

public class EXAM extends javax.swing.JFrame {

    String mode,pattern;
    public EXAM() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 120, 40));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 170, 250));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 470, 460));

        jComboBox2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ONLINE MODE", "OFFLINE MODE", "ORAL", "PRACTICAL", "" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 220, 50));

        jComboBox1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ORAL EXAM", "MCQ'S", "TRUE/FALSE", "MATCHING", "SHORT QUESTION", "LONG QUESTIONS", "" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 220, 50));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("EXAM PATTERN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 200, 40));

        jButton2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 120, 40));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 520));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 520));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\VEDANTI\\Downloads\\WhatsApp Unknown 2020-12-14 at 11.34.23 AM\\exam1.jpeg")); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 450));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\VEDANTI\\Downloads\\WhatsApp Unknown 2020-12-14 at 11.34.23 AM\\exam2.jpeg")); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 320, 260));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\VEDANTI\\Downloads\\lemon-yellow.jpg")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         DASHBOARD db1 = new DASHBOARD();
	db1.main(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getSelectedIndex()==0)
        {
            pattern = "oral";
        }
        if(jComboBox1.getSelectedIndex()==1)
        {
            pattern = "MCQ's";
        }
        if(jComboBox1.getSelectedIndex()==2)
        {
            pattern = "TRUE/FALSE";
        }
        if(jComboBox1.getSelectedIndex()==3)
        {
            pattern = "Matching";
        }
        if(jComboBox1.getSelectedIndex()==4)
        {
            pattern = "Short Questions";
        }
        if(jComboBox1.getSelectedIndex()==5)
        {
            pattern = "Long Questions";
        }
     //------------------------------------------------------------------------------------
     if(jComboBox2.getSelectedIndex()==0)
        {
            mode = "Online";
        }
     if(jComboBox2.getSelectedIndex()==1)
        {
            mode = "Offline";
        }
     if(jComboBox2.getSelectedIndex()==2)
        {
            mode = "Oral";
        }
     if(jComboBox2.getSelectedIndex()==3)
        {
            mode = "Practical";
        }
        try{
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","vedanti");
            
            
            PreparedStatement stmt = con.prepareStatement
                 ("insert into Exam values(?,?)");
            stmt.setString(1,pattern);
            stmt.setString(2,mode);
                  
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this,"Saved Successfully");
          
            con.close();
        }

        catch(ClassNotFoundException c)
        {
            System.out.println("Driver not Loaded");
        }//end of catch
        catch(SQLException s)
        {
            System.out.println(s.getMessage());
        }//end of catch
    }//GEN-LAST:event_jButton2ActionPerformed
     public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EXAM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
