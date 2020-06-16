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
	public static final String PRODUCT_INSERT = "insert into tab_product(product_id, product_name, quantity, category)values(?,?,?,?)";
	public static final String PRODUCT_UPDATE = "update tab_product set product_name=? , quantity=?, category=? where product_id=?";
	public static final String PRODUCT_DELETE = "delete from tab_product where product_id = ?";
	public static final String PRODUCT_LISTALL = "select * from tab_product";
	public static final String PRODUCT_GET = "select * from tab_product where product_id = ?";

}
