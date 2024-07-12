package jdbc_crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EmpHike1 {
	private static final String DB_URL="jdbc:mysql://localhost:3306/advjdb";
	private static final String DB_UNAME="root";
	private static final String DB_PWD="root";
	private static final String SELECT_SQL="SELECT * FROM EMPLOYEE";
	private static final String UPDATE_SAL_SQL = "UPDATE EMPLOYEE SET EMP_SALARY=? WHERE EMP_ID=?";

	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee hike: ");
		double hike = s.nextDouble();
		
		Connection con= DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SELECT_SQL);
		PreparedStatement pstmt= con.prepareStatement(UPDATE_SAL_SQL);
		while(rs.next()) {
			int empId = rs.getInt("EMP_ID");
			double currentSal = rs.getDouble("EMP_SALARY");
			double newSal=currentSal + (currentSal*hike)/100;
			pstmt.setDouble(1, newSal);
			pstmt.setInt(2, empId);
			pstmt.executeUpdate();
		}
		System.out.println("Update completed....");
		con.close();
		}

}
