package br.com.fiapchallenge.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private ConnectionFactory(){}

	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/TesteDB", "root", "123");
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}

	
}
