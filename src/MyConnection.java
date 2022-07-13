
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


///////////////////////////////////// MAKING CONNECTION WITH DATABASE
public class MyConnection {
     ////////////////////////////////CREAT FUNCTION FOR MAKING CONNECTION
 void createConnection(){
    try{
        //////////////"com.mysql.jdbc.Driver" id driver which contain mysql
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/midcare","root","");
        java.sql.Statement stmt= con.createStatement();
        /////////////////////////////////////////////////////////////////////reading data from database
        
        ResultSet rs= stmt.executeQuery("SELECT * FROM useres WHERE USFNAME like 'A%'");
        while (rs.next()){
            String name= rs.getString("USFNAME");
            System.out.println(name);
        }


        System.out.println("connection successfuly");
    }catch(ClassNotFoundException ex){
        Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE,null,ex);
    }
    catch(SQLException ex){
        Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE,null,ex);
    }
    }
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
