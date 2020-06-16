/**
 * 
 */
package com.productmgmt.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.productmgmt.dao.ProductDao;
import com.productmgmt.jdbc.JDBCUtil;
import com.productmgmt.jdbc.QueryMaker;
import com.productmgmt.model.Product;
import com.productmgmt.util.Constants;

/**
 * @author jack
 *
 */
public class ProductDaoImpl implements ProductDao {

	/**
	 * 
	 */
	public ProductDaoImpl() {

	}

	@Override
	public String saveProduct(Product product) {
		String status = Constants.STATUS_FAILED;
		Connection connection = JDBCUtil.getConnection();
		if (connection != null) {
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(QueryMaker.PRODUCT_INSERT);
				preparedStatement.setString(1, product.getProductId());
				preparedStatement.setString(2, product.getProductName());
				preparedStatement.setInt(3, product.getQuantity());
				preparedStatement.setString(4, product.getCategory());
				preparedStatement.execute();

				status = Constants.STATUS_SUCCESS;

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return status;
		} else {
			return status;
		}
	}

	@Override
	public String updateProduct(Product product) {
		String status = Constants.STATUS_FAILED;
		Connection connection = JDBCUtil.getConnection();
		if (connection != null) {
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(QueryMaker.PRODUCT_UPDATE);

				preparedStatement.setString(1, product.getProductName());
				preparedStatement.setInt(2, product.getQuantity());
				preparedStatement.setString(3, product.getCategory());
				preparedStatement.setString(4, product.getProductId());
				preparedStatement.executeUpdate();
				status = Constants.STATUS_SUCCESS;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return status;
		} else {
			return status;
		}
	}

	@Override
	public String deleteProduct(String productId) {
		String status = Constants.STATUS_FAILED;
		Connection connection = JDBCUtil.getConnection();
		if (connection != null) {
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(QueryMaker.PRODUCT_DELETE);
				preparedStatement.setString(1, productId);
				preparedStatement.execute();
				status = Constants.STATUS_SUCCESS;
			} catch (SQLException e) {
				status = Constants.STATUS_FAILED;
				e.printStackTrace();
			}
			return status;
		} else {
			return status;
		}
	}

	@Override
	public List<Product> listAllProducts() {
		List<Product> products = new ArrayList<Product>();
		Connection connection = JDBCUtil.getConnection();
		if (connection != null) {
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(QueryMaker.PRODUCT_LISTALL);
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					Product product = new Product(resultSet.getString("product_id"),
							resultSet.getString("product_name"), resultSet.getInt("quantity"),
							resultSet.getString("category"));
					products.add(product);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return products;
		} else {
			return products;
		}
	}

	@Override
	public Product getProductById(String productId) {
		Product product = new Product();
		Connection connection = JDBCUtil.getConnection();
		if (connection != null) {
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(QueryMaker.PRODUCT_GET);
				preparedStatement.setString(1, productId);
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					product = new Product(resultSet.getString("product_id"), resultSet.getString("product_name"),
							resultSet.getInt("quantity"), resultSet.getString("category"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return product;
		} else {
			return product;
		}
	}

}
