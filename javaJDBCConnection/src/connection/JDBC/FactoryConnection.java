package connection.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FactoryConnection {
	
	private final String url = "jdbc:mysql://localhost/classicmodels";
//	jdbc:mysql or jdbc:mariadb
	private final String user = "root";
	private final String pass = "root";
	private static FactoryConnection factoryConnection = null;

	public FactoryConnection() {
		Connection conn = null;
		final String url = this.url;
		final String user = this.user;
		final String pwd = this.pass;
		final String query = "SELECT * FROM Employees";

		try {
			conn = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println("Successfully connected to database.");
		System.out.println("Keep going and do something with our database.");

		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println("Full Name: " + rs.getString(3) +" " + rs.getString(2));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public Connection getConnection() throws SQLException {
		Connection conn;
		conn = DriverManager.getConnection(url, user, pass);
		return conn;
	}

	public static FactoryConnection getInstance() {
		if (factoryConnection == null) {
			factoryConnection = new FactoryConnection();
		}

		return factoryConnection;

	}

}
