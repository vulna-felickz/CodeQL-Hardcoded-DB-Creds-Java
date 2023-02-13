package com.example.demo.CodeQL.Hardcoded.DB.Creds;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class CredentialsTestMariaDB {

	private static final String password = "pass-mariadb"; // hard-coded credential (flow source)

	public void test(String url, String v, String q) throws SQLException {
		try (Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test", "hardcodeduser", password)) {
			try (Statement stmt = connection.createStatement()) {
				stmt.executeUpdate("CREATE TABLE a (id int not null primary key, value varchar(20))");
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
