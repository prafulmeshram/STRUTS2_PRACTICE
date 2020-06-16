/**
 * 
 */
package com.productmgmt.actions;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.productmgmt.model.Product;
import com.productmgmt.service.ProductService;
import com.productmgmt.service.impl.ProductServiceImpl;
import com.productmgmt.util.Constants;

/**
 * @author jack
 *
 */
public class ProductRegistration extends ActionSupport implements ModelDriven<Product> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2090050124219021486L;

	/**
	 * 
	 */
	public ProductRegistration() {

	}

	private ProductService productService = new ProductServiceImpl();
	Product product = new Product();
	HttpServletRequest httpServletRequest = (HttpServletRequest) ActionContext.getContext()
			.get(ServletActionContext.HTTP_REQUEST);

	private List<Product> products = new ArrayList<Product>();

	public String renderForm() {

		return INPUT;
	}

	public String welcomeAction() {
		this.products = this.productService.listAllProducts();
		return SUCCESS;
	}

	public String execute() {

		String status = Constants.STATUS_FAILED;

		System.out.println(product.toString());
		status = productService.saveProduct(product);

		System.out.println("Status= " + status);
		if (status.equalsIgnoreCase(Constants.STATUS_SUCCESS)) {
			addActionMessage("Product Data Saved Successfully");
			return SUCCESS;
		} else {
			addActionError("Error Occured While Saving Product Data");
			return INPUT;
		}
	}

	public String updateForm() {

		String productId = httpServletRequest.getParameter("productId");
		product = this.productService.getProductById(productId);
		return INPUT;
	}

	public String update() {
		String status = Constants.STATUS_FAILED;
		System.out.println(product.toString());
		status = productService.updateProduct(product);
		System.out.println("Status= " + status);
		if (status.equalsIgnoreCase(Constants.STATUS_SUCCESS)) {
			addActionMessage("Product Data Saved Successfully");
			return SUCCESS;
		} else {
			addActionError("Error Occured While Saving Product Data");
			return INPUT;
		}
	}

	public String deleteProduct() {

		String status = Constants.STATUS_FAILED;
		String productId = httpServletRequest.getParameter("productId");
		status = this.productService.deleteProduct(productId);
		System.out.println("Status===" + status);
		if (status.equalsIgnoreCase(Constants.STATUS_SUCCESS)) {
			addActionMessage("Record Deleted Successfully");
			return SUCCESS;
		} else {
			addActionError("Error Occured While Deleting");
			return ERROR;
		}

	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public Product getModel() {

		return product;
	}

	/**
	 * @return the productService
	 */
	public ProductService getProductService() {
		return productService;
	}

	/**
	 * @param productService the productService to set
	 */
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
