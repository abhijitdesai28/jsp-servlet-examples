package jdbc_crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectAllandUpdate {

	private static final String DB_URL="jdbc:mysql://localhost:3306/advjdb";
	private static final String DB_UNAME="root";
	private static final String DB_PWD="root";
	private static final String SELECT_SQL="SELECT * FROM BOOKS";

	public static void main(String[] args)throws Exception {
		//LOAD DRIVER
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//get connection
		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		
		//create statement
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
		//execute stmt
		ResultSet rs = stmt.executeQuery(SELECT_SQL);
		
		rs.absolute(2);
		rs.updateDouble(3, 2050.00);
		rs.updateRow();
		
		System.out.println(rs.getInt("BOOK_ID"));
		System.out.println(rs.getString("BOOK_NAME"));
		System.out.println(rs.getDouble("BOOK_PRICE"));
		
		rs.previous();
		
		System.out.println(rs.getInt("BOOK_ID"));
		System.out.println(rs.getString("BOOK_NAME"));
		System.out.println(rs.getDouble("BOOK_PRICE"));
		
		//CLOSE CONNECTION
		con.close();
	}

}

