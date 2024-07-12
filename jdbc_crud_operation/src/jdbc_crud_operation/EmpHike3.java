package jdbc_crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpHike3 {
	private static final String DB_URL="jdbc:mysql://localhost:3306/advjdb";
	private static final String DB_UNAME="root";
	private static final String DB_PWD="root";
	private static final String SELECT_SQL="SELECT * FROM EMPLOYEE";

	public static void main(String[] args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Hike For HR DEPARTMENT:");
        double hrHike = sc.nextDouble();
        
        System.out.println("Enter Employee Hike For SALES DEPARTMENT:");
        double salesHike = sc.nextDouble();
        
        System.out.println("Enter Employee Hike For ADMIN DEPARTMENT:");
        double adminHike = sc.nextDouble();
        
        System.out.println("Enter Employee Hike For SECURITY DEPARTMENT:");
        double securityHike = sc.nextDouble();
        
        Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
        
        String UPDATE_SAL_SQL = "UPDATE EMPLOYEE SET EMP_SALARY=EMP_SALARY + (EMP_SALARY * ?) / 100 WHERE EMP_DEPT= ?";
        
        PreparedStatement pstmt = con.prepareStatement(UPDATE_SAL_SQL);
        
        //here below lines each time java code will communicate with database
        //to avoid this we use 'STORED PROCEDURES'
        //to call the procedure we use 'callable statement'
        //procedure is nothing but collection of sql statement
        //procedures are equal to our java method
        //procedure will have name/it may take input,give input 
        //for procedures input and output is not compulsory
        //solution for this program look program:  ProcedureCall
        
        pstmt.setDouble(1,hrHike);
        pstmt.setString(2,"HR");
        pstmt.executeUpdate();
        
        pstmt.setDouble(1,adminHike);
        pstmt.setString(2,"Admin");
        pstmt.executeUpdate();
        
        pstmt.setDouble(1,salesHike);
        pstmt.setString(2,"Sales");
        pstmt.executeUpdate();
        
        pstmt.setDouble(1,securityHike);
        pstmt.setString(2,"Security");
        pstmt.executeUpdate();
        
        System.out.println("Update completed....");
		con.close();
	}

}
