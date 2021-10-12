package Project;
import java.sql.*;

public class ConnectionProvider {

    public static Connection getCon()
    {
	try
	{
	    Class.forName("oracle.jdbc.OracleDriver");     
	    
	    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-6VPNB7HE:1521/xe", "student_result", "oracle");
 	    return con;
	}
	catch(ClassNotFoundException cnfe)                               // when class path is not set this will run..
	{
	    System.out.println("Cannot load the driver class");
            cnfe.printStackTrace();
	    return null;
	}
	catch(SQLException ex)                                          // when connection is not done properly this will run...
	{
	    System.out.println("Error in DB");
	    ex.printStackTrace();   
	    return null;
	}
    }
}