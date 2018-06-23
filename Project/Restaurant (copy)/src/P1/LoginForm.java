/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

import javax.swing.JFrame;
import java.awt.*;
import java.sql.*;
import javax.swing.*;


public class LoginForm extends javax.swing.JFrame {
Connection con=null;
PreparedStatement pre=null;

    


    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        Min = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        passvar = new javax.swing.JLabel();
        uservar = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        pd = new javax.swing.JPasswordField();
        loginb = new javax.swing.JButton();
        cancelb = new javax.swing.JButton();
        accountl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(155, 89, 182));

        Min.setFont(new java.awt.Font("MathJax_SansSerif", 1, 18)); // NOI18N
        Min.setForeground(new java.awt.Color(31, 58, 147));
        Min.setText("__");
        Min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinMouseClicked(evt);
            }
        });

        login.setFont(new java.awt.Font("MathJax_SansSerif", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(31, 58, 147));
        login.setText("Login Form");

        Close.setFont(new java.awt.Font("MathJax_SansSerif", 1, 18)); // NOI18N
        Close.setForeground(new java.awt.Color(31, 58, 147));
        Close.setText("  X");
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(402, Short.MAX_VALUE)
                .addComponent(Min)
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(login)
                    .addContainerGap(355, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(435, Short.MAX_VALUE)
                    .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Min, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Close, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel2.setBackground(new java.awt.Color(228, 242, 242));

        passvar.setFont(new java.awt.Font("Noto Sans CJK SC Light", 1, 13)); // NOI18N
        passvar.setForeground(new java.awt.Color(149, 165, 166));
        passvar.setText("Password     :");

        uservar.setFont(new java.awt.Font("Noto Sans CJK TC Light", 1, 13)); // NOI18N
        uservar.setForeground(new java.awt.Color(149, 165, 166));
        uservar.setText("Username    :");

        un.setBackground(new java.awt.Color(218, 223, 225));
        un.setForeground(new java.awt.Color(103, 128, 159));

        pd.setBackground(new java.awt.Color(218, 223, 225));
        pd.setForeground(new java.awt.Color(103, 128, 159));
        pd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdActionPerformed(evt);
            }
        });

        loginb.setBackground(new java.awt.Color(31, 58, 147));
        loginb.setFont(new java.awt.Font("Ume P Gothic O5", 1, 13)); // NOI18N
        loginb.setForeground(new java.awt.Color(253, 251, 251));
        loginb.setText("Login");
        loginb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbActionPerformed(evt);
            }
        });

        cancelb.setBackground(new java.awt.Color(207, 0, 15));
        cancelb.setFont(new java.awt.Font("Ume UI Gothic O5", 1, 13)); // NOI18N
        cancelb.setForeground(new java.awt.Color(234, 225, 225));
        cancelb.setText("Cancel");
        cancelb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbActionPerformed(evt);
            }
        });

        accountl.setFont(new java.awt.Font("UnGungseo", 1, 12)); // NOI18N
        accountl.setForeground(new java.awt.Color(37, 116, 169));
        accountl.setText("        Click here to create a New  Account ?");
        accountl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountlMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passvar, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(uservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cancelb, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(loginb, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(un, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pd, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(accountl, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uservar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(accountl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pdActionPerformed

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        
        System.exit(0 );
    }//GEN-LAST:event_CloseMouseClicked

    private void MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinMouseClicked
   this.setState(JFrame.ICONIFIED);
        
    }//GEN-LAST:event_MinMouseClicked

    private void cancelbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbActionPerformed
   System.exit(0);
    }//GEN-LAST:event_cancelbActionPerformed

    private void accountlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountlMouseClicked
     Resigter reg=new Resigter();
     reg.jPanel21.setVisible(false);
     reg.setVisible(true);
     reg.setLocationRelativeTo(null);
     reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.dispose();
    }//GEN-LAST:event_accountlMouseClicked

    private void loginbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbActionPerformed

      String sql;
    
        try {
            //insert into userRecord value(1,'amarnath','amar','05-08-1998',1234);
           Class.forName("com.mysql.jdbc.Driver");
          
        Connection con;
        
          con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sam","root","dear");
          //select id from userRecord where username='amar' and passwd=1234;
          sql="select username,passwd from userRecord where username='"+un.getText()+"' and passwd="+pd.getText()+";";
         PreparedStatement  pt=con.prepareStatement(sql);
          ResultSet rt=pt.executeQuery();
          while(rt.next()){
     String gp= rt.getString("passwd");
       System.out.println(rt.getString(2));
    if(pd.getText().equals(gp)){   
         
         MainFrame m=new MainFrame();
       m.setVisible(true);
       this.dispose();
      }
      else{
      JOptionPane.showMessageDialog(null,"Incorrect data!");
      
      }
          }


       } catch(Exception e){
         JOptionPane.showMessageDialog(null,"Incorrect data!");
           e.printStackTrace();
          
        }  
        
        
   
    }//GEN-LAST:event_loginbActionPerformed

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
             
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Min;
    private javax.swing.JLabel accountl;
    private javax.swing.JButton cancelb;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel login;
    private javax.swing.JButton loginb;
    private javax.swing.JLabel passvar;
    private javax.swing.JPasswordField pd;
    private javax.swing.JTextField un;
    private javax.swing.JLabel uservar;
    // End of variables declaration//GEN-END:variables
}