/**
 * 
 */
package com.interceptor.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * @author jack
 *
 */
public class TestInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8044096442682749293L;

	/**
	 * 
	 */
	public TestInterceptor() {

	}

	@Override
	public void destroy() {
		System.out.println("Test Interceptor destroy() called");

	}

	@Override
	public void init() {
		System.out.println("Test Interceptor init() called");

	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("Preprocessing");
		String result = ai.invoke();
		System.out.println("Post Processing");
		return result;
	}

}
