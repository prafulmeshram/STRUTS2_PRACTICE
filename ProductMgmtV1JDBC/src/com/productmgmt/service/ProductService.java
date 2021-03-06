/**
 * 
 */
package com.productmgmt.service;

import java.util.List;

import com.productmgmt.model.Product;

/**
 * @author jack
 *
 */
public interface ProductService {

	public String saveProduct(Product product);

	public String updateProduct(Product product);

	public String deleteProduct(String productId);

	public List<Product> listAllProducts();

	public Product getProductById(String productId);

}
