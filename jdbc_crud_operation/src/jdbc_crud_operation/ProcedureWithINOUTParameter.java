package jdbc_crud_operation;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class ProcedureWithINOUTParameter {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/advjdb";

	private static final String DB_UNAME = "root";

	private static final String DB_PWD = "root";

	private static final String PROCEDURE = "call getBookNameByPrice(?,?);";

	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter book price:");
		double bprice = sc.nextDouble();
		
		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		CallableStatement cstmt = con.prepareCall(PROCEDURE);
		cstmt.setDouble(1, bprice);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		ResultSet rs = cstmt.executeQuery();
		
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}
		con.close();
		

	}

}
