/**
 * 
 */
package com.productmgmt.service.impl;

import com.productmgmt.dao.UserDao;
import com.productmgmt.dao.impl.UserDaoImpl;
import com.productmgmt.model.User;
import com.productmgmt.service.UserService;

/**
 * @author jack
 *
 */
public class UserServiceImpl implements UserService {

	/**
	 * 
	 */
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	private UserDao userDao = new UserDaoImpl();

	@Override
	public User getUserById(Integer userId) {

		return this.userDao.getUserById(userId);
	}

	@Override
	public User findUserByUsername(String usrename) {

		return this.userDao.findUserByUsername(usrename);
	}

	@Override
	public User validateUser(String username, String password) {

		return this.userDao.validateUser(username, password);
	}

	@Override
	public String saveUser(User user) {

		return this.userDao.saveUser(user);
	}

	@Override
	public String updateUser(User user) {

		return this.userDao.updateUser(user);
	}

	@Override
	public String deleteUser(Integer userId) {

		return this.userDao.deleteUser(userId);
	}

}
