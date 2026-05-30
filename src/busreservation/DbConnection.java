package busreservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private static final String url =
			"jdbc:mysql://localhost:3306/busresv";
	private static final String user = "root";
	private static final String password = "lohesh";
	
	
	
	public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(url,user,password);
	}

	public static void main(String[] args) {
		

	}

}
