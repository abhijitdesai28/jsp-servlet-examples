package jdbc_crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateBook {
	private static final String DB_URL="jdbc:mysql://localhost:3306/advjdb";
	private static final String DB_UNAME = "root";
	private static final String DB_PWD = "root";
	private static final String INSERT_SQL="UPDATE books SET Book_PRICE = 5200 WHERE BOOK_ID=102;";

	public static void main(String[] args) throws Exception {
		//load driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//get connection
		Connection con = DriverManager.getConnection(DB_URL,DB_UNAME , DB_PWD);
		
		//// Step-3 : Create Statement
        Statement stmt = con.createStatement();
        
     // Step-4 : Execute Query
        int rowsEffected = stmt.executeUpdate(INSERT_SQL);
        
     // Step-5 : Process Result
     	System.out.println("Record Updated Count :: " + rowsEffected);
     	
      // Step-6 : Close Connection
     	con.close();
		

	}

}
