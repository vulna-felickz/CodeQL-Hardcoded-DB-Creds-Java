package com.example.demo.CodeQL.Hardcoded.DB.Creds;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// https://jdbc.postgresql.org/documentation/use/
public class CredentialsTestPgSql {
    private static final String p = "123456"; // hard-coded credential (flow source)

	public CredentialsTestPgSql() {
    }

    public static void testhardcoded() throws SQLException {
        String url = "jdbc:postgresql://localhost/test";
        Properties props = new Properties();
        props.setProperty("user", "user-pgsql");
        props.setProperty("password", "secret-pgsql");
        props.setProperty("ssl", "true");
        Connection conn = DriverManager.getConnection(url, props);
	}

    public static void testhardcoded1() throws SQLException {
        String url = "jdbc:postgresql://localhost/test?ssl=true";
        Connection conn = DriverManager.getConnection(url, "user-pgsql-1", "secret-pgsql-1");
	}

    public static void testhardcoded2() throws SQLException {
        String url = "jdbc:postgresql://localhost/test?user=user-pgsql-2&password=secret-pgsql2&ssl=true";
        Connection conn = DriverManager.getConnection(url);
	}

}
