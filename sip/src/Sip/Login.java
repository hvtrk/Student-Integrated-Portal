package Sip;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import sip.registerstudent.view.RegisterStudentView;

/*
*@author Rahul
 */
public class Login extends javax.swing.JFrame {

    public String user55;
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        log = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        user_label = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass_label = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        showpass = new javax.swing.JRadioButton();
        login = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Login");
        setBounds(new java.awt.Rectangle(350, 200, 600, 400));
        setUndecorated(true);

        log.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        log.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        log.setText("Login");

        user_label.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        user_label.setText("Username");
        user_label.setAutoscrolls(true);

        user.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        user.setToolTipText("Username");

        pass_label.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        pass_label.setText("Password");
        pass_label.setAutoscrolls(true);

        pass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        showpass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        showpass.setText("Show Password");
        showpass.setAutoscrolls(true);
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });

        login.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        login.setText("Login");
        login.setAutoscrolls(true);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        reset.setText("Reset");
        reset.setAutoscrolls(true);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close.setForeground(new java.awt.Color(204, 0, 51));
        close.setText("X");
        close.setAutoscrolls(true);
        close.setMaximumSize(new java.awt.Dimension(13, 23));
        close.setMinimumSize(new java.awt.Dimension(13, 23));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(user_label)
                .addGap(47, 47, 47)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(pass_label, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(showpass))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user_label)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pass_label)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(showpass)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
         if(showpass.isSelected())
            {
                pass.setEchoChar((char) 0);
            }
            else
            {
                pass.setEchoChar('•');
            }
    }//GEN-LAST:event_showpassActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
            String userid,passid;
            
            char[] pas;
            userid=user.getText();
            passid=new String(pass.getPassword());
            
            if(userid.contentEquals("1")&&passid.contentEquals("1"))
            {   
                setVisible(false);
               new academic().setVisible(true);
            }
            
            else if(userid.contentEquals("2")&&passid.contentEquals("2"))
            {
                setVisible(false);
                new update_attend().setVisible(true);
            }
            
            else if(validate_login(userid,passid))
            {
                setVisible(false);
                student_1 er=new student_1(userid);
                us=getName(userid);
                String as=disp(userid);
                er.name.setText("Welcome "+us);
                er.current.setText(as);
                er.setTitle(userid);
                er.setVisible(true);
            }
            
            else
            {
                user.setText("");
                pass.setText("");
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
    }//GEN-LAST:event_loginActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
            user.setText("");
            pass.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeActionPerformed
        
    public void run () {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel log;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel pass_label;
    private javax.swing.JButton reset;
    private javax.swing.JRadioButton showpass;
    public javax.swing.JTextField user;
    private javax.swing.JLabel user_label;
    // End of variables declaration//GEN-END:variables
    public String us;
    private boolean validate_login(String user, String pass) 
    {
    try
    {           
       Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sliet","username","password");     
       PreparedStatement pst = conn.prepareStatement("Select * from ug14 where regno=? and pass=?");
       pst.setString(1, user); 
       pst.setString(2, pass);
       ResultSet rs = pst.executeQuery();                        
       if(rs.next())
       {
           return true;
           
       }
       else
           return false;            
    }
    catch(Exception e)
    {
       e.printStackTrace();
       return false;
    }       
    }

        private String getName(String userid) 
        {
        try
        {           
            Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sliet","username","password");     
            PreparedStatement pst = conn.prepareStatement("Select name from ug14 where regno=?");
            pst.setString(1, userid); 
            ResultSet rs = pst.executeQuery();                        
            while(rs.next())
            {
                return rs.getString("name");
            }            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
        }
        
        public String disp(String userid)
    {    
        try
        {           
            Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sliet","username","password");     
            PreparedStatement pst = conn.prepareStatement("Select semester from ug14 where regno=?");
            pst.setString(1, userid); 
            ResultSet rs = pst.executeQuery();                        
            while(rs.next())
            {
                
                return rs.getString("semester");
            }            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
    }

