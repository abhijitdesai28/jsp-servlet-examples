package jdbc_crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectOneBook {
	private static final String DB_URL="jdbc:mysql://localhost:3306/advjdb";
	private static final String DB_UNAME = "root";
	private static final String DB_PWD = "root";
	private static final String SELECT_SQL="SELECT * FROM books WHERE BOOK_ID=101;";

	public static void main(String[] args)throws Exception {
		//LOAD DRIVER
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//get connection
		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		
		//create statement
		Statement stmt= con.createStatement();
		
		//execute 
		ResultSet rs = stmt.executeQuery(SELECT_SQL);
		
		//Print statement
		//note:here we retrieve only one record thats why we use here if
		if(rs.next()) {
			int bookId = rs.getInt("Book_ID");
			String name = rs.getString("BOOK_NAME");
			double price = rs.getDouble("BOOK_PRICE");
			System.out.println(bookId);
			System.out.println(name);
			System.out.println(price);
		}else {
			System.out.println("NO RECORED FOUND");
		}
		
		//close the connection
		con.close();
	}

}
