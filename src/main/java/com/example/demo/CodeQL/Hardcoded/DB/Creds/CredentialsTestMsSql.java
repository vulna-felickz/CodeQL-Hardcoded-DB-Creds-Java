package com.example.demo.CodeQL.Hardcoded.DB.Creds;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Driver;
import java.util.Properties;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

// https://learn.microsoft.com/en-us/sql/connect/jdbc/working-with-a-connection?view=sql-server-ver16
public class CredentialsTestMsSql {
    private static final String sensitive = "pass-mssql"; // hard-coded credential (flow source)

	public CredentialsTestMsSql() {
    }

	// Driver Manager: https://learn.microsoft.com/en-us/sql/connect/jdbc/working-with-a-connection?view=sql-server-ver16#creating-a-connection-by-using-the-drivermanager-class
	public static void testhardcoded() throws Exception {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
		String connectionUrl = "jdbc:sqlserver://localhost;encrypt=true;database=AdventureWorks";
		Connection con = DriverManager.getConnection(connectionUrl, "user-mssql", sensitive); 
	}

	// SQLServerDriver https://learn.microsoft.com/en-us/sql/connect/jdbc/working-with-a-connection?view=sql-server-ver16#creating-a-connection-by-using-the-sqlserverdriver-class
	public static void testhardcoded0() throws Exception {
		Driver d = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();  
		String connectionUrl = "jdbc:sqlserver://localhost;encrypt=true;database=AdventureWorks;user=user-mssql-0;password=password";  
		Connection con = d.connect(connectionUrl, new Properties());
	}

	// SQLServerDataSource: https://learn.microsoft.com/en-us/sql/connect/jdbc/working-with-a-connection?view=sql-server-ver16#creating-a-connection-by-using-the-sqlserverdatasource-class
    public static void testhardcoded1() throws SQLException {
		SQLServerDataSource ds = new SQLServerDataSource();  
		ds.setUser("MyUserName-mssql-1");  
		ds.setPassword(sensitive);  
		ds.setServerName("localhost");  
		ds.setPortNumber(1433);
		ds.setDatabaseName("AdventureWorks");  
		Connection con = ds.getConnection();
	}

	public static void testhardcoded2() throws SQLException {
		SQLServerDataSource ds = new SQLServerDataSource();  
		ds.setServerName("localhost");  
		ds.setPortNumber(1433);
		ds.setDatabaseName("AdventureWorks");  
		Connection con = ds.getConnection("user-mssql-2", sensitive);		
	}

	public static void test(String url, String u, String p) throws SQLException {
		DriverManager.getConnection(url, u, p); // $ HardcodedCredentialsApiCall
	}
}
