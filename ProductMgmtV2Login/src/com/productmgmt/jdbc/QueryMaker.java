/**
 * 
 */
package com.productmgmt.jdbc;

/**
 * @author jack
 *
 */
public class QueryMaker {

	/**
	 * 
	 */
	public QueryMaker() {

	}

	public static final String PRODUCT_TAB_CREATE = "CREATE TABLE [IF NOT EXISTS] tab_product(product_id varchar(10) PRIMARY KEY, product_name varchar(50), quantity int(10), category varchar(50)";
	public static final String USER_TAB_CREATE = "CREATE TABLE tab_user(user_id int(10) PRIMARY KEY AUTO_INCREMENT, username varchar(100), password varchar(20), created_date varchar(20), CONSTRAINT username_unique UNIQUE (username) )";

	public static final String PRODUCT_INSERT = "insert into tab_product(product_id, product_name, quantity, category)values(?,?,?,?)";
	public static final String PRODUCT_UPDATE = "update tab_product set product_name=? , quantity=?, category=? where product_id=?";
	public static final String PRODUCT_DELETE = "delete from tab_product where product_id = ?";
	public static final String PRODUCT_LISTALL = "select * from tab_product";
	public static final String PRODUCT_GET = "select * from tab_product where product_id = ?";

	public static final String USER_INSERT = "insert into tab_user(username, password, created_date)values(?,?,?)";
	public static final String USER_UPDATE = "update tab_user set password=? where user_id=?";
	public static final String USER_DELETE = "delete from tab_user where user_id=?";
	public static final String USER_GET = "select * from tab_user where user_id=?";
	public static final String USER_GET_USERNAME = "select * from tab_user where username=?";
	public static final String USER_VALIDATE = "select * from tab_user where username = ? and password=?";

}
