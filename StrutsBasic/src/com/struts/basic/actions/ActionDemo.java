/**
 * 
 */
package com.struts.basic.actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author jack
 *
 */
public class ActionDemo extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4898449662249956883L;

	/**
	 * 
	 */
	public ActionDemo() {

	}

	private String status;

	public String execute() {

		status = "Success Message";
		return SUCCESS;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
