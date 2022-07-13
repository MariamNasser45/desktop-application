
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARIAM NASSER
 */
public class Main {
      ///////////////////////////////////////main class must be exist to run project
    public static void main(String[] args)
    {
       MyConnection conn=new MyConnection();
       conn.createConnection();
  
    };
      public static Connection getConnection(){
        Connection con=null;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/midcare","root","");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
    
}
