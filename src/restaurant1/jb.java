/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant1;

/**
 *
 * @author DELL
 */
import javax.swing.*;
import java.awt.*;

import java.awt.event.*;
import java.io.*;
import java.sql.*;


import java.util.*;
import java.util.logging.*;

import javax.imageio.ImageIO;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import static sun.security.jgss.GSSUtil.login;
public class jb
{ 
        

  public jb(){
      
  
      JFrame jf = new JFrame("The Maverick Restaurant");
      JLabel Background;
      JLabel background;
      JLabel lforalreadyreg = new JLabel("Already Registered");
      lforalreadyreg.setBounds(250,600,250,70);
      lforalreadyreg.setFont(new Font("", Font.PLAIN, 25));
      lforalreadyreg.setForeground(Color.white);
      JTextField jtf_forusername = new JTextField();

        JTextField jtf_1forpassword = new JTextField();
        JLabel l = new JLabel("LOGIN OR REGISTER TO ORDER DELICIOUS FOOD");
        
        JButton jbt = new JButton("Login");
        jbt.setBounds(290,650,150,70);
      JButton jbforowndetails = new JButton("See your details");
      jbforowndetails.setBounds(100,100,150,30);
      JButton jbforlogout = new JButton("Log Out");
      jbforlogout.setBounds(100,150,150,30);
      //jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
      ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\Desktop\\north-indian-cuisine.jpg");
      Background = new JLabel("",icon,JLabel.CENTER);
      Background.setBounds(-10, -10, 1920,1080);
      Background.add(jbforlogout);
      ImageIcon img = new ImageIcon("C:\\Users\\DELL\\Desktop\\MAVERIC_RESTAURANT-removebg-preview.png");
      background = new JLabel("",img,JLabel.CENTER);
      background.setBounds(0, 0, 900,900);
      JPanel jp = new JPanel();
        
      jp.setBounds(500,60,900,900);


        JTextField text_Username = new JTextField();
        text_Username.setBounds(100, 100, 200, 50);
        JTextField jtfor_nameupdate = new JTextField();
        jtfor_nameupdate.setBounds(100,100,200,30);
        JTextField jtffor_Emailaddressupdate = new JTextField("");
        jtffor_Emailaddressupdate.setBounds(100,150,200,30);
        JTextField jtformobilenoupdate_ = new JTextField("");
        jtformobilenoupdate_.setBounds(100,200,200,30);
        JTextField jtforaddressupdate_ = new JTextField("");
        jtforaddressupdate_.setBounds(100,250,200,30);
        jbforowndetails.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e) {  
        //Create DataBase Coonection and Fetching Records  
        String userName = jtf_forusername.getText(); 
                   String password = jtf_1forpassword.getText();
        try {  
            String str = jtfor_nameupdate.getText();  
            //Class.forName("jdbc:mysql://localhost:3306/database_name", "root","12346789");  
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","root", "12346789");  
            /*PreparedStatement st = con.prepareStatement("select * from customer where name =?");  
            st.setString(1, str);  
            //Excuting Query  
            
            ResultSet rs = st.executeQuery();*/ 
            PreparedStatement st = (PreparedStatement) con.prepareStatement("Select * from customer where name=? and password = ?"); 
                //PreparedStatement st1 = (PreparedStatement) connection.prepareStatement("Select * from customer where password=?");
                       st.setString(1, userName); 
                       st.setString(2, password); 
                       ResultSet rs = st.executeQuery(); 
            if (rs.next()) {  
                String s = rs.getString(2);  
                String s1 = rs.getString(4);  
                String s2 = rs.getString(5);  
                String s3 = rs.getString(6);  
                //Sets Records in TextFields.  
                jtfor_nameupdate.setText(s);  
                jtffor_Emailaddressupdate.setText(s1);  
                jtforaddressupdate_.setText(s2);  
                jtformobilenoupdate_.setText(s3);  
            } else {  
                JOptionPane.showMessageDialog(null, "Name not Found");  
            }  
            //Create Exception Handler  
        } catch (Exception ex) {  
            System.out.println(ex);  
        }  
    }  
    }); 
       
        JTextField jtf_forsignupemailid = new JTextField();
        jtf_forsignupemailid.setBounds(100,175,200,50);
        
        JButton jbtnforsignup = new JButton();
        jbtnforsignup.setBounds(150,250,100,30);
        JLabel jlforemail_signup = new JLabel("Emailid:");
        jlforemail_signup.setBounds(20,100,70,30);
        
        JLabel jlforusername = new JLabel("UserName:");
        JLabel jlforpassword = new JLabel("Password:");
        jlforpassword.setFont(new Font("", Font.PLAIN, 20));
        background.add(lforalreadyreg);
       
        
        
         JLabel lforname_update = new JLabel("username");
         lforname_update.setBounds(30,100,100,30);
         JLabel lforEmail_update = new JLabel("Email");
         lforEmail_update.setBounds(30,150,100,30);
         JLabel lformobile_update = new JLabel("mobile");
         lformobile_update.setBounds(30,200,100,30);
         JLabel lforaddress_update = new JLabel("Address");
        lforaddress_update.setBounds(30,250,100,30);
        
        
        JLabel lblTime = new JLabel();
        lblTime.setBounds(120,300,300,100);
        lblTime.setFont(new Font("", Font.PLAIN, 60));
        jf.add(lblTime);
        lblTime.setForeground(Color.BLUE);
        lblTime.setLayout(null);
        l.setBounds(150,100,650,30);
        
        l.setFont(new Font("", Font.PLAIN, 25));
        jtf_forusername.setBounds(350, 150, 200, 50);
        jtf_1forpassword.setBounds(350, 250, 200, 50);
        jlforusername.setBounds(200,160,200,30);
        jlforpassword.setBounds(200,250,200,30);
        jlforpassword.setForeground(Color.white);
        jlforusername.setForeground(Color.white);
        jlforusername.setFont(new Font("", Font.PLAIN, 20));
        
        jbforowndetails.setVisible(false);
        l.setForeground(Color.white);
        
        JButton jbttoregister = new JButton("Sign Up Or register here:");
        jbttoregister.setBounds(500, 650, 150, 70);
        
        JPanel jpnew = new JPanel();
        jpnew.setBounds(500,60,900,400);
        jpnew.setLayout(null);
   jbforowndetails.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                jpnew.setVisible(true);
            }

          
        });
   jbt.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent e) { 
          
                   String userName = jtf_forusername.getText(); 
                   String password = jtf_1forpassword.getText(); 
                   try { 
               Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","root", ""); 
 
                PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select * from customer where name=? and password = ?"); 
                //PreparedStatement st1 = (PreparedStatement) connection.prepareStatement("Select * from customer where password=?");
                       st.setString(1, userName); 
                       st.setString(2, password); 
                       ResultSet rs = st.executeQuery(); 
                       //ResultSet rs1 = st1.executeQuery();
                       if (rs.next()) { 
 
                    JOptionPane.showMessageDialog(null,"Order Delicious Food","Login Successfully", JOptionPane.PLAIN_MESSAGE);
                    jp.setVisible(false); 
                    jbforlogout.setVisible(true);
                    jbforowndetails.setVisible(true);
                    JMenu m = new JMenu("About");
        
        JMenuBar mb = new JMenuBar();
        JMenuItem i1 = new JMenuItem("See Your Details");
        JMenuItem i2 = new JMenuItem("LogOut");
        JMenu sm  = new JMenu("Find");
        sm.add(i1);
        sm.add(i2);
        
        m.add(sm);
        mb.add(m);
        
        jf.setJMenuBar(mb);
        i2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                m.setVisible(false);
                jp.setVisible(true);
               jbforlogout.setVisible(false);
               jbforowndetails.setVisible(false);
               jpnew.setVisible(false);
            }
        });
        i1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        });
       } 
                       
                       else 
                       { 
                         
                        JOptionPane.showMessageDialog (null, "Invalid password or username","Login Failed",JOptionPane.ERROR_MESSAGE);
                        JOptionPane.showMessageDialog (null, "Reset Password or Retry Again Using correct password ","Login Failed",JOptionPane.ERROR_MESSAGE);
                        } 
                        
                   } catch (SQLException sqlException) { 
                       sqlException.printStackTrace(); 
                   } 
      }}); 
   jbforlogout.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               jp.setVisible(true);
               jbforlogout.setVisible(false);
               jbforowndetails.setVisible(false);
               jpnew.setVisible(false);
           }
       });
        Background.add(jpnew);
        jpnew.setVisible(false);
        
        //text.add(jp);
        jbt.setBackground(Color.white);
        jbttoregister.setBackground(Color.white);
        jbt.setForeground(Color.blue);
        jbttoregister.setForeground(Color.blue);
        jp.add(l);
        jp.add(jtf_forusername);
        
        jp.add(jlforusername);
        jp.add(jtf_1forpassword);
        jp.add(jlforpassword);
        jp.add(jbt);
        jp.add(jbttoregister);
        jp.add(background);
         jp.setLayout(null);
        jp.setVisible(true);
        
        
        jpnew.add(jtforaddressupdate_);
        jpnew.add(jtffor_Emailaddressupdate);
        jpnew.add(jtformobilenoupdate_);
        
        jpnew.add(jtfor_nameupdate);
    
        
        jpnew.add(lforname_update);
        jpnew.add(lforEmail_update);
        jpnew.add(lforaddress_update);
        jpnew.add(lformobile_update);
       
        
        /*jbforchangepass.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new ChangePassword();
            }
        });*/
        
    Background.add(jp);
    Background.add(lblTime);
    Background.add(jbforowndetails);
        Background.setVisible(true);
        Background.setLayout(null);
        
    jf.setSize(1920,1080);

      jf.setVisible(true);
        jf.add(Background);
        
        jf.setLayout(null);
jbforowndetails.setVisible(false);
jbforlogout.setVisible(false);
        jbttoregister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SignUP();
                    /*jp.setVisible(false);
                    panel_sign_up.setVisible(true);*/
            }            
        });
          /*jbtfor_update.addActionListener(new ActionListener(){
              @Override
            public void actionPerformed(ActionEvent e) { 
                String password  = jtf_1forpassword.getText();
                    String User = jtf_forusername.getText();
                    
                    String Mobile = jtformobilenoupdate_.getText();
                    String Email = jtffor_Emailaddressupdate.getText();
                try {
                    
                   
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","root", "");
                   
                    
                    PreparedStatement pst=connection.prepareStatement("Update customer set password=? where name =?");
                    pst.setString(1,password);
                    pst.setString(2,User);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(jbtfor_update,"password has been successfully changed");
                    
            }catch(SQLException ex) {
                ex.printStackTrace();
            }
            }

    });*/
                      
    

    new Thread()
    {
        public void run()
        {
            while(true) 
            {
                Calendar cal = new GregorianCalendar();
                int hour = cal.get(Calendar.HOUR_OF_DAY);
                int min = cal.get(Calendar.MINUTE);
                int sec = cal.get(Calendar.SECOND);

                String time = String.format("%02d",hour) + ":" + String.format("%02d",min) + ":" + String.format("%02d",sec);

                lblTime.setText(time);
            }
        }
    }.start();
        
    /**
     *
     * @param args
     */
   

}
    public static void main(String args[])
  {
    new jb();
    
        
    }
}
