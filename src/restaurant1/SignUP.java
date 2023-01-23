/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant1;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author DELL
 */
public class SignUP {
    public static void main(String args[]) 
  { 
      new SignUP();
    
        
        

    }

    public SignUP() {
        JFrame jf = new JFrame("The maverick Restaurant");
        
        JLabel jlforname = new JLabel("Name");
        jlforname.setFont(new Font("", Font.PLAIN, 20));
        JLabel jlforcnfrmname = new JLabel(" Confirm Name");
        jlforcnfrmname.setFont(new Font("", Font.PLAIN, 20));
        JLabel jlforpopofsignup = new JLabel("SUCCESSFULLY REGISTERED");
        jlforpopofsignup.setFont(new Font("", Font.PLAIN, 20));
        jlforpopofsignup.setBounds(350,700,400,50);
        JLabel jlforemailid = new JLabel("Email Id");
        jlforemailid.setFont(new Font("", Font.PLAIN, 20));
        JLabel jlforaddress = new JLabel("Address");
        jlforaddress.setFont(new Font("", Font.PLAIN, 20));
        JLabel jlformobile = new JLabel("Mobile Number");
        jlformobile.setFont(new Font("", Font.PLAIN, 20));
        JLabel jlforPass = new JLabel("Password");
        jlforPass.setFont(new Font("", Font.PLAIN, 20));
        JLabel jlforcnfmpass = new JLabel("Confirm Password");
         jlforcnfmpass.setFont(new Font("", Font.PLAIN, 20));
        JLabel jlforsecurityque = new JLabel("Security Question");
        jlforsecurityque.setFont(new Font("", Font.PLAIN, 20));
        JLabel jlforsecurityans = new JLabel("Security answer");
        jlforsecurityans.setFont(new Font("", Font.PLAIN, 20));
        
        JButton jbforlogin = new JButton("← BACK TO LOGIN");
        jbforlogin.setBounds(300, 750, 250, 70);
        jbforlogin.setFont(new Font("", Font.PLAIN, 20));
        
        
        jlforname.setBounds(200,50,150, 50);
        jlforcnfrmname.setBounds(200,120,150, 50);
        jlforemailid.setBounds(200,190,150, 50);
        jlforaddress.setBounds(200,260,150, 50);
        jlformobile.setBounds(200,330,100+50, 50);
        jlforPass.setBounds(200,400,150, 50);
        jlforcnfmpass.setBounds(200,470,150, 50);
        jlforsecurityque.setBounds(200,540,100+50, 50);
        jlforsecurityans.setBounds(200,610,100+50, 50);
       
        
        
        
                
        JPanel panel_sign_up = new JPanel();
        panel_sign_up.setBounds(450,0,1000,1000);
        
        JTextField text_Username = new JTextField("Name");
        text_Username.setBounds(350, 50, 300, 50);
        
        JTextField text_cnfrmname = new JTextField("Confirm Name");
        text_cnfrmname.setBounds(350, 120, 300, 50);

        //panel_sign_up.setBackground(Color.yellow);
        JTextField jtf_forsignupemailid = new JTextField("Email ID");
        jtf_forsignupemailid.setBounds(350,190,300,50);
        
        JTextField jtf_forAddress = new JTextField("Address");
        jtf_forAddress.setBounds(350, 260,300, 50);
        
        JTextField jtf_formobile = new JTextField("Mobile");
        jtf_formobile.setBounds(350, 330, 300, 50);
        
        JButton jbtnforsignup = new JButton();
        jbtnforsignup.setBounds(150,850,100,30);
        
        JLabel jlforemail_signup = new JLabel("Emailid:");
        jlforemail_signup.setBounds(20,100,70,30);
        
        JTextField jtf_forsignuppassword = new JTextField("Password");
        jtf_forsignuppassword.setBounds(350,400,300,50);
        
        JTextField jtf_forsignupcnfrmpass = new JTextField("Confirm Password");
        jtf_forsignupcnfrmpass.setBounds(350,470,300,50);
         
        Choice jtf_forsecurityque = new Choice();
       jtf_forsecurityque.setBounds(350,540,300,50);
        
        JTextField jtf_forsecurityans = new JTextField("Security Answer");
        jtf_forsecurityans.setBounds(350,610,300,50);
        //JTextField jtf_forsignupemailid = new JTextField();
        //jtf_forsignupemailid.setBounds(100,175,200,50);

       
        JButton jbttoregister = new JButton("SIGN UP");
        jbttoregister.setBounds(650, 750, 250, 70);
        jbttoregister.setFont(new Font("", Font.PLAIN, 20));
        JLabel background;
        ImageIcon ii = new ImageIcon("C:\\Users\\DELL\\Desktop\\MAVERIC_RESTAURANT-remove.png");
        background = new JLabel("",ii,JLabel.CENTER);

        background.setBounds(0, 0, 1000,1000);

        panel_sign_up.add(background);
        background.add(text_Username);
        background.add(jtf_forsignupemailid);
        background.add(jtf_forAddress);
        background.add(jtf_formobile);
        background.add(jtf_forsecurityque);
        jtf_forsecurityque.add("---Select---");
        jtf_forsecurityque.add("In what city were you born?");
        jtf_forsecurityque.add("What is the name of your favorite pet?");
        jtf_forsecurityque.add("What high school did you attend?");
        jtf_forsecurityque.add("What was the name of your elementary school?");
        jtf_forsecurityque.add("What was the make of your first car?");
        jtf_forsecurityque.add("What was your favorite food as a child?");
        
        background.add(jtf_forsignupcnfrmpass);
        background.add(jtf_forsignuppassword);
        background.add(jbttoregister);
        background.add(jlforsecurityque);
        background.add(jlforPass);
        background.add(jlforcnfmpass);
        background.add(jlforaddress);
        background.add(jlforemailid);
        background.add(jlforname);
        background.add(jtf_forsecurityans);
         background.add(text_cnfrmname);
        background.add(jbforlogin);
        background.add(jlforpopofsignup);
        background.add(jlforsecurityans);
        background.add(jlformobile);
        background.add(jlforcnfrmname);
        jlforpopofsignup.setVisible(false);
        jtf_forsignupcnfrmpass.setVisible(true);
        panel_sign_up.setLayout(null);
        jf.setSize(1920,1080);
        

        jf.setVisible(true);
        jf.setLayout(null);
        JLabel Background;
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\Desktop\\north-indian-cuisine.jpg");
        Background = new JLabel("",icon,JLabel.CENTER);
        jf.add(Background);
        Background.setBounds(0, 0, 1920,1080);
        Background.add(panel_sign_up);
        Background.setVisible(true);
        Background.setLayout(null);
        jbforlogin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new jb();
            }
            
        });
        jbttoregister.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        
        Connection conn=CustomerDAO.getConnect();
        try {
        String sql = "INSERT INTO customer (name,confirm_name,email,address,mobile,password,confirm_password,security_question,answer) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, text_Username.getText());
        statement.setString(2, text_cnfrmname.getText());
        statement.setString(3, jtf_forsignupemailid.getText());
        statement.setString(4, jtf_forAddress.getText());
        statement.setString(5, jtf_formobile.getText());
        statement.setString(6, jtf_forsignuppassword.getText());
        statement.setString(7, jtf_forsignupcnfrmpass.getText());
        statement.setString(8, jtf_forsecurityque.getItem(jtf_forsecurityque.getSelectedIndex()));
        statement.setString(9, jtf_forsecurityans.getText());
        
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
          text_Username.setText("");
          text_cnfrmname.setText("");
          jtf_forsignupemailid.setText("");
          jtf_forAddress.setText("");
          jtf_formobile.setText("");
          jtf_forsignuppassword.setText("");
          jtf_forsignupcnfrmpass.setText("");
          String j = jtf_forsecurityque.getItem(jtf_forsecurityque.getSelectedIndex());
          j.replace(jtf_forsecurityque.getItem(jtf_forsecurityque.getSelectedIndex()), " ");
          jtf_forsecurityans.setText("");
          jlforpopofsignup.setVisible(true);
            System.out.println("A new user was inserted successfully!");
        }
        }
        catch(SQLException ex)
        {
          System.out.println(ex);
        }
      }
          
        });
      
    }

    public static class CustomerDAO {

        public static Connection getConnect()
     {
        Connection conn=null;
       try {
       conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name", "root","");
           
        
           
      } catch (SQLException ex) {
          ex.printStackTrace();
      }
       
       return conn;
     }
     public static void main(String args[])
     {
       Connection con=CustomerDAO.getConnect();
       if(con !=null)
       {
         System.out.println("Connection Successfull");
       }
       else
       {
         System.out.println("Connection Failed");
       }
         
     }
    }
}
