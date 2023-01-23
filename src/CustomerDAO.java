
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class CustomerDAO {
    public static Connection getConnect()
     {
        Connection conn=null;
       try {
       conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name", "root","12346789");
           
        
           
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
