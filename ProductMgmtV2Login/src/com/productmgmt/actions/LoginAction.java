/**
 * 
 */
package com.productmgmt.actions;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.productmgmt.model.User;
import com.productmgmt.service.UserService;
import com.productmgmt.service.impl.UserServiceImpl;

/**
 * @author jack
 *
 */
public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 422304100415632107L;

	/**
	 * 
	 */
	public LoginAction() {

	}

	private String username;
	private String password;

	private User user = new User();
	private UserService userService = new UserServiceImpl();

	public String execute() {

		user = this.userService.validateUser(username, password);
		if (user != null) {
			ServletActionContext.getRequest().getSession().setAttribute("loggedUser", user.getUsername());
			return SUCCESS;
		} else {
			addActionError("Please Enter Valid Credentials");
			return INPUT;
		}
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
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

}
