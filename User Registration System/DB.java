package project;
import java.sql.*;
import javax.swing.table.*;
import com.mysql.jdbc.ResultSetMetaData;

public class DB {
		Connection con=null;
		PreparedStatement pst;
		public static Connection dbConnect() {
		try{  
			//step1 load the driver class  
			Class.forName("com.mysql.jdbc.Driver");  
			  
			//step2 create  the connection object  
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root",""); 
			return conn;
		  
		}catch(Exception e){ 
			System.out.println(e);
			return null;
		}    

	}

}

