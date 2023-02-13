package com.example.demo.CodeQL.Hardcoded.DB.Creds;

import java.sql.DriverManager;
import java.sql.SQLException;

public class CredentialsTestMySql {
    private static final String p = "123456"; // hard-coded credential (flow source)

	public CredentialsTestMySql() {
    }

    public static void testhardcoded() throws SQLException {
		String url = "jdbc:mysql://localhost/test";
		String u = "admin"; // hard-coded credential (flow source)

		DriverManager.getConnection(url, u, p); // $ HardcodedCredentialsApiCall
		test(url, u, p);
	}

	public static void test(String url, String v, String q) throws SQLException {
		DriverManager.getConnection(url, v, q); // $ HardcodedCredentialsApiCall
	}
}
