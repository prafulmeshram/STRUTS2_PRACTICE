/**
 * 
 */
package com.productmgmt.interceptors;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.productmgmt.actions.LoginAction;

/**
 * @author jack
 *
 */
public class LoginInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2674881042061549394L;

	/**
	 * 
	 */
	public LoginInterceptor() {

	}

	@Override
	public void destroy() {

	}

	@Override
	public void init() {

	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		Object username = ServletActionContext.getRequest().getSession().getAttribute("loggedUser");
		if (username == null) {
			if (ai.getAction().getClass().equals(LoginAction.class)) {
				return ai.invoke();
			}
			return "input";
		}
		return ai.invoke();
	}

}
