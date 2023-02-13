package com.example.demo.CodeQL.Hardcoded.DB.Creds;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

// https://learn.microsoft.com/en-us/sql/connect/jdbc/working-with-a-connection?view=sql-server-ver16
public class CredentialsTestMsSql {
    private static final String sensitive = "pass-mssql"; // hard-coded credential (flow source)

	public CredentialsTestMsSql() {
    }

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
