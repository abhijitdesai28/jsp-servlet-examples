package jdbc_crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteBook {
	private static final String DB_URL="jdbc:mysql://localhost:3306/advjdb";
	private static final String DB_UNAME = "root";
	private static final String DB_PWD = "root";
	private static final String INSERT_SQL="DELETE FROM books WHERE BOOK_ID=103;";

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
     	System.out.println("Record Deleted Count :: " + rowsEffected);
     	
      // Step-6 : Close Connection
     	con.close();
		

	}

}
