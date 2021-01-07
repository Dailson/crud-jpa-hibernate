package br.com.dailson.jpa.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 
 * 
 * @author dailson
 *
 */
public class SingleConnection {

	private static String database = "jdbc:mysql://localhost:42333/jsp";
	private static String password = "root";
	private static String user = "root";
	private static Connection connection = null;

	static {
		connect();
	}

	public SingleConnection() {
		connect();
	}

	private static void connect() {
		if (connection == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(database, user, password);
				connection.setAutoCommit(false);

			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException("Error when try to connecto to the database");
			}
		}
	}

	public static Connection getConnection() {
		return connection;
	}
}
