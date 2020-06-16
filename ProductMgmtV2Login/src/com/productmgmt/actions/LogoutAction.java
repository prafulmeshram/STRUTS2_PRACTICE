/**
 * 
 */
package com.productmgmt.actions;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author jack
 *
 */
public class LogoutAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4943804068302858073L;

	/**
	 * 
	 */
	public LogoutAction() {
		// TODO Auto-generated constructor stub
	}

	public String execute() {
		ServletActionContext.getRequest().getSession().invalidate();
		return INPUT;
	}

}
