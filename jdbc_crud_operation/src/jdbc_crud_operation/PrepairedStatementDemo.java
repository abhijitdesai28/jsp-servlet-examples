package jdbc_crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepairedStatementDemo {
	private static final String DB_URL="jdbc:mysql://localhost:3306/advjdb";
	private static final String DB_UNAME="root";
	private static final String DB_PWD="root";
	private static final String SELECT_SQL="INSERT INTO BOOKS VALUES (?,?,?)";

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		PreparedStatement pstmt = con.prepareStatement(SELECT_SQL);
		pstmt.setInt(1, 103);
		pstmt.setString(2,"aws");
		pstmt.setDouble(3, 1200.00);
		int rowsEffected = pstmt.executeUpdate();
		System.out.println("rowsEffected:"+rowsEffected);
		con.close();

	}

}
