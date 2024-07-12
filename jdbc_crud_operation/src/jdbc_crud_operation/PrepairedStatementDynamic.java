package jdbc_crud_operation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PrepairedStatementDynamic {
	private static final String DB_URL="jdbc:mysql://localhost:3306/advjdb";
	private static final String DB_UNAME="root";
	private static final String DB_PWD="root";
	private static final String INSERT_SQL="INSERT INTO BOOKS VALUES (?,?,?)";

	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter bookId:");
		int id = sc.nextInt();
		System.out.println("Enter bookName:");
		String bName = sc.next();
		System.out.println("Enter bookPrice");
		double bPrice = sc.nextDouble();
		
		//load driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		PreparedStatement stmt = con.prepareStatement(INSERT_SQL);
		stmt.setInt(1, id);
		stmt.setString(2,bName);
		stmt.setDouble(3, bPrice);
		
		int rowsEffected = stmt.executeUpdate();
		System.out.println("rowsEffected :"+rowsEffected);
		
		con.close();
	}

}
