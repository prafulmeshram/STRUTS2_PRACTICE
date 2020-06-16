/**
 * 
 */
package com.productmgmt.service.impl;

import java.util.List;

import com.productmgmt.dao.ProductDao;
import com.productmgmt.dao.impl.ProductDaoImpl;
import com.productmgmt.model.Product;
import com.productmgmt.service.ProductService;

/**
 * @author jack
 *
 */
public class ProductServiceImpl implements ProductService {

	/**
	 * 
	 */
	public ProductServiceImpl() {

	}

	private ProductDao productDao = new ProductDaoImpl();

	@Override
	public String saveProduct(Product product) {

		return this.productDao.saveProduct(product);
	}

	@Override
	public String updateProduct(Product product) {

		return this.productDao.updateProduct(product);
	}

	@Override
	public String deleteProduct(String productId) {

		return this.productDao.deleteProduct(productId);
	}

	@Override
	public List<Product> listAllProducts() {

		return this.productDao.listAllProducts();
	}

	@Override
	public Product getProductById(String productId) {

		return this.productDao.getProductById(productId);
	}

}
