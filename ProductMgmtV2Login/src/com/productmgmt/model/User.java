/**
 * 
 */
package com.productmgmt.model;

import java.io.Serializable;

/**
 * @author jack
 *
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2243380517963287684L;

	/**
	 * 
	 */
	public User() {
		// TODO Auto-generated constructor stub
	}

	private Integer userId;
	private String username;
	private String password;
	private String createdDate;

	/**
	 * @param userId
	 * @param username
	 * @param password
	 * @param createdDate
	 */
	public User(Integer userId, String username, String password, String createdDate) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.createdDate = createdDate;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the createdDate
	 */
	public String getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", createdDate=" + createdDate + "]";
	}

}
