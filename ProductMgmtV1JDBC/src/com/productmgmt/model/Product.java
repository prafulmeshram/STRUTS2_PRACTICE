/**
 * 
 */
package com.productmgmt.model;

import java.io.Serializable;

/**
 * @author jack
 *
 */
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6312363024547880516L;

	/**
	 * 
	 */
	public Product() {

	}

	private String productId;
	private String productName;
	private Integer quantity;
	private String category;

	/**
	 * @param productId
	 * @param productName
	 * @param quantity
	 * @param category
	 */
	public Product(String productId, String productName, Integer quantity, String category) {
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.category = category;
	}

	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
				+ ", category=" + category + "]";
	}

}
