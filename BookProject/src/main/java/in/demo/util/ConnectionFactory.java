package in.demo.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionFactory {
	private static DataSource ds=null;
	public static Connection getConnection() throws SQLException, IOException {
		if(ds==null) {
		File file=new File("G:\\_code-base\\new-eclipse-workspace\\BookProject\\src\\main\\java");
		FileInputStream fis=new FileInputStream(file);
		Properties p=new Properties();
		p.load(fis);
		
		String url = p.getProperty("db.url");
		String uname = p.getProperty("db.username");
		String pwd = p.getProperty("db.password");
		String driver = p.getProperty("db.driver");
		
		HikariConfig config=new HikariConfig();
		config.setJdbcUrl(url);
		config.setUsername(uname);
		config.setPassword(pwd);
		config.setDriverClassName(driver);
		
		ds=new HikariDataSource(config);
		}
		Connection connection = ds.getConnection();
		return connection;
		
		//alternate for above line : return ds.getConnection();
		
	}
}
