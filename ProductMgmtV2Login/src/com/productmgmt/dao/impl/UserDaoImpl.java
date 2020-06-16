/**
 * 
 */
package com.productmgmt.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.productmgmt.dao.UserDao;
import com.productmgmt.jdbc.JDBCUtil;
import com.productmgmt.jdbc.QueryMaker;
import com.productmgmt.model.User;
import com.productmgmt.util.Constants;

/**
 * @author jack
 *
 */
public class UserDaoImpl implements UserDao {

	/**
	 * 
	 */
	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public User getUserById(Integer userId) {
		User user = null;
		try {
			Connection connection = JDBCUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(QueryMaker.USER_GET);
			preparedStatement.setInt(1, userId);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				user = new User((int) resultSet.getInt("user_id"), resultSet.getString("username"),
						resultSet.getString("password"), resultSet.getString("created_date"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User findUserByUsername(String usrename) {
		User user = null;
		try {
			Connection connection = JDBCUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(QueryMaker.USER_GET_USERNAME);
			preparedStatement.setString(1, usrename);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				user = new User((int) resultSet.getInt("user_id"), resultSet.getString("username"),
						resultSet.getString("password"), resultSet.getString("created_date"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User validateUser(String username, String password) {
		User user = null;
		try {
			Connection connection = JDBCUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(QueryMaker.USER_VALIDATE);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				user = new User((int) resultSet.getInt("user_id"), resultSet.getString("username"),
						resultSet.getString("password"), resultSet.getString("created_date"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return user;
	}

	@Override
	public String saveUser(User user) {

		String status = Constants.STATUS_FAILED;
		try {
			Connection connection = JDBCUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(QueryMaker.USER_INSERT);
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, new SimpleDateFormat("dd-MMM-yyyy").format(new Date()));
			preparedStatement.execute();
			status = Constants.STATUS_SUCCESS;
			return status;
		} catch (SQLException e) {

			e.printStackTrace();
			return status;
		}
	}

	@Override
	public String updateUser(User user) {

		String status = Constants.STATUS_FAILED;
		try {
			Connection connection = JDBCUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(QueryMaker.USER_UPDATE);

			preparedStatement.setString(1, user.getPassword());
			preparedStatement.setInt(2, user.getUserId());
			preparedStatement.executeUpdate();
			status = Constants.STATUS_SUCCESS;
			return status;
		} catch (SQLException e) {

			e.printStackTrace();
			return status;
		}
	}

	@Override
	public String deleteUser(Integer userId) {

		String status = Constants.STATUS_FAILED;
		try {
			Connection connection = JDBCUtil.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(QueryMaker.USER_INSERT);
			preparedStatement.setInt(1, userId);
			preparedStatement.executeUpdate();
			status = Constants.STATUS_SUCCESS;
			return status;
		} catch (SQLException e) {
			e.printStackTrace();
			return status;
		}

	}

}
