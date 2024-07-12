package jdbc_crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpHike2 {
	private static final String DB_URL="jdbc:mysql://localhost:3306/advjdb";
	private static final String DB_UNAME="root";
	private static final String DB_PWD="root";
	private static final String SELECT_SQL="SELECT * FROM EMPLOYEE";

	public static void main(String[] args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Hike::");
        double hike = sc.nextDouble();
      //  Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
        String UPDATE_SAL_SQL = "UPDATE EMPLOYEE SET EMP_SALARY=EMP_SALARY + (EMP_SALARY * ?) / 100 ";
        PreparedStatement pstmt = con.prepareStatement(UPDATE_SAL_SQL);
        pstmt.setDouble(1,hike);
        pstmt.executeUpdate();
        System.out.println("Update completed....");
		con.close();
	}

}
