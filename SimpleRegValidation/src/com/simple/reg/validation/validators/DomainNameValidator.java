/**
 * 
 */
package com.simple.reg.validation.validators;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

/**
 * @author jack
 *
 */
public class DomainNameValidator extends FieldValidatorSupport {

	/**
	 * 
	 */
	public DomainNameValidator() {

	}

	private String validDomain = null;

	@Override
	public void validate(Object obj) throws ValidationException {
		System.out.println("Doamin Name Vaidator Called");

		String fieldName = getFieldName();
		String email = (String) getFieldValue(fieldName, obj);

		if (!email.endsWith(validDomain)) {
			addFieldError(fieldName, obj);
		}
	}

	/**
	 * @return the validDomain
	 */
	public String getValidDomain() {
		return validDomain;
	}

	/**
	 * @param validDomain the validDomain to set
	 */
	public void setValidDomain(String validDomain) {
		this.validDomain = validDomain;
	}

}
