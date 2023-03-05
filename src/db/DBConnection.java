package db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{

static Connection conn=null;
    
    public static Connection createConnection() throws SQLException, ClassNotFoundException
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
        return conn;
    }
    
    
    public static void closeConnection()
    {
        if(conn!=null)
        {
            try 
            {
                conn.close();
            } 
            catch (SQLException e) 
            {
                
                System.out.println("Something went wrong!!");
            }
        }
    }

}
