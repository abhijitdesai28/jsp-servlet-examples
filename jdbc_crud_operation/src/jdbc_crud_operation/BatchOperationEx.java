package jdbc_crud_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchOperationEx {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/advjdb";

	private static final String DB_UNAME = "root";

	private static final String DB_PWD = "root";

	public static void main(String[] args) throws Exception {

		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		Statement stmt = con.createStatement();

		stmt.addBatch("INSERT INTO BOOKS VALUES(105, 'AI', 2800.00)");
		stmt.addBatch("INSERT INTO BOOKS VALUES(106, 'ML', 3800.00)");
		stmt.addBatch("INSERT INTO BOOKS VALUES(107, 'DS', 4800.00)");

		int[] count = stmt.executeBatch();

		System.out.println("Records Effected ::" + count.length);

		con.close();

		System.out.println("Execution Completed...");
	}
}
