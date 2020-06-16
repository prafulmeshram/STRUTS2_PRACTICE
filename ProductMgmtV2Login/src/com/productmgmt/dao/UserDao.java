/**
 * 
 */
package com.productmgmt.dao;

import com.productmgmt.model.User;

/**
 * @author jack
 *
 */
public interface UserDao {

	public User getUserById(Integer userId);

	public User findUserByUsername(String usrename);

	public User validateUser(String username, String password);

	public String saveUser(User user);

	public String updateUser(User user);

	public String deleteUser(Integer userId);

}
