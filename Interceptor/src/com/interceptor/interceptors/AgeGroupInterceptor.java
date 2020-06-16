/**
 * 
 */
package com.interceptor.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * @author jack
 *
 */
public class AgeGroupInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6739537468809757544L;

	/**
	 * 
	 */
	public AgeGroupInterceptor() {

	}

	@Override
	public void destroy() {

	}

	@Override
	public void init() {

	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		String ageGroup = null;
		ValueStack stack = ai.getStack();
		Integer age = (Integer) stack.findValue("age");

		if (age < 18) {
			ageGroup = "Children";
		} else if (age > 18 && age < 50) {
			ageGroup = "Adult";
		} else if (age > 50) {
			ageGroup = "Senior Citizen";
		}

		stack.set("age", age + "(" + ageGroup + ")");
		String result = ai.invoke();

		return result;
	}

}
