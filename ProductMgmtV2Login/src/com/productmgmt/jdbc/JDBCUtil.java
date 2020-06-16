/**
 * 
 */
package com.productmgmt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author jack
 *
 */
public class JDBCUtil {

	/**
	 * 
	 */
	public JDBCUtil() {

	}

	static Connection connection = null;
	private static final String url = "jdbc:mysql://localhost:3306/db_product_mgmt?createDatabaseIfNotExist=true";
	private static final String user = "root";
	private static final String password = "Root@123";

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeConnestion(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
