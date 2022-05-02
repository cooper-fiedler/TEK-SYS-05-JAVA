package connection.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {

	Connection cn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public EmployeeDAO() {

	}

	public Connection getConnection() throws SQLException {
		Connection conn;
		conn = FactoryConnection.getInstance().getConnection();
		return conn;
	}

	public EmployeeModel getEmployee() throws SQLException {

		EmployeeModel employee = new EmployeeModel();

		try {
			String query = "SELECT * FROM employee";
			cn = getConnection();
			ps = cn.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println("Employee Number: " + rs.getInt("employeeNumber") + "\nFirst Name: "
						+ rs.getString("firstName") + "\nLast Name: " + rs.getString("lastName") + "\nJob Title: "
						+ rs.getString("jobTitle"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employee;
	}

}
