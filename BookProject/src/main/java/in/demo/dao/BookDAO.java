package in.demo.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.demo.dto.BookDTO;
import in.demo.util.ConnectionFactory;

public class BookDAO {
	private static final String INSERT_SQL="INSERT INTO BOOKS VALUES(?,?,?)";
	public boolean saveBook(BookDTO dto) throws SQLException, IOException {
		Connection connection = ConnectionFactory.getConnection();
		PreparedStatement stmt = connection.prepareStatement(INSERT_SQL);
		stmt.setInt(1,dto.getBookId());
		stmt.setString(2,dto.getBookName());
		stmt.setDouble(3, dto.getBookPrice());
		int count = stmt.executeUpdate();
		connection.close();
		if(count>0) {
			return true;
		}else {
			return false;
		}
		//alernate for above return count>0;
		
	}
}
