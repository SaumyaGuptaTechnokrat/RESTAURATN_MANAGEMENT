/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;

import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author DELL
 */
public class LoginPage{
    public LoginPage() throws SQLException{
        JFrame jf = new JFrame();
        JLabel jlforname = new JLabel("Name");
        jlforname.setFont(new Font("", Font.PLAIN, 20));
        JLabel jlforcnfrmname = new JLabel(" Confirm Name");
       
      
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
        
        jlforname.setBounds(200,50,150, 50);
        jlforcnfrmname.setBounds(200,120,150, 50);
        jlforemailid.setBounds(200,190,150, 50);
        jlforaddress.setBounds(200,260,150, 50);
        jlformobile.setBounds(200,330,100+50, 50);
        jlforPass.setBounds(200,400,150, 50);
        jlforcnfmpass.setBounds(200,470,150, 50);
        jlforsecurityque.setBounds(200,540,100+50, 50);
        jlforsecurityans.setBounds(200,610,100+50, 50);
        
        
        JPanel jp = new JPanel();
        jp.setBounds(-10,300,900,800);
        jp.setBackground(Color.CYAN);
        jf.add(jp);
        JTextField jtf_1forpassword = new JTextField();
        JLabel l = new JLabel("LOGIN OR REGISTER TO ORDER DELICIOUS FOOD");
        JPanel panel_sign_up = new JPanel();
        panel_sign_up.setBounds(450,0,1000,1000);
        
        JTextField text_Username = new JTextField();
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
        
        JButton jbtnforsignup = new JButton("Edit Details");
        jbtnforsignup.setBounds(150,850,100,30);
        
        JTextField jtf_forsignuppassword = new JTextField("Password");
        jtf_forsignuppassword.setBounds(350,400,300,50);
        
        JTextField jtf_forsignupcnfrmpass = new JTextField("Confirm Password");
        jtf_forsignupcnfrmpass.setBounds(350,470,300,50);
         
        Choice jtf_forsecurityque = new Choice();
       jtf_forsecurityque.setBounds(350,540,300,50);
        
        JTextField jtf_forsecurityans = new JTextField("Security Answer");
        jtf_forsecurityans.setBounds(350,610,300,50);
      
        
        l.setForeground(Color.red);
        

       
        jp.add(l);
        jp.add(jlforname);
        jp.add(text_Username);
        
        jp.add(text_cnfrmname);
        jp.add(jtf_forsignupemailid);
        jp.add(jtf_forAddress);
        jp.add(jbtnforsignup);jp.add(jtf_formobile);
        jp.add(jtf_forsignuppassword);
        jp.add(jtf_forsignupcnfrmpass);
        jp.add(jtf_forsecurityque);
        jp.add(jtf_forsecurityans);
        
        jp.add(jlforcnfrmname);
      
        jp.add(jlforemailid);
        jp.add(jlforaddress);
        jp.add(jlformobile);
        jp.add(jlforPass);
        jp.add(jlforcnfmpass);
        jp.add(jlforsecurityque);
        jp.add(jlforsecurityans);
 
        
        
        jp.setVisible(true);
        jp.setLayout(new BorderLayout());
        jf.setSize(1900,1080);
        jp.setSize(1000,1000);
        jf.setVisible(true);
        jf.setLayout(null);
     
                  initComponents();
                  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name", "root","12346789");
                   jbtnforsignup.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            String user = text_Username.getText();
                            String email = jtf_forsignupemailid.getText();
                            try{
                                String query ="Update customer set name = '"+text_Username.getText()+"' , confirm_name = '"+text_cnfrmname.getText()+"',email= '"+jtf_forsignupemailid.getText()+"',address= '"+jtf_forAddress.getText()+"',mobile= '"+jtf_formobile.getText()+"' where name = '"+jtf_formobile.getText()+"'";
                                Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","root", "12346789");
                                PreparedStatement st = (PreparedStatement) connection.prepareStatement(query);
                                st.execute();
                            }
                            catch(SQLException sqlException){
                                
                            }
                        }
                    });
        
    }

    public static void main(String[] args) throws SQLException{
        new LoginPage();
        
    } 

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
