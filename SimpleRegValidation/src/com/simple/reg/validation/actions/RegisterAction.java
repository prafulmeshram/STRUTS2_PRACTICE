/**
 * 
 */
package com.simple.reg.validation.actions;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author jack
 *
 */
public class RegisterAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3457029835689347008L;

	/**
	 * 
	 */
	public RegisterAction() {

	}

	private String firstName;
	private String lastName;
	private Integer age;
	private String gender;
	private String dob;
	private String email;

	public String execute() throws ParseException {
		dob = new SimpleDateFormat("dd-MMM-yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(dob));
		return SUCCESS;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * public void validate() {
	 * 
	 * if (firstName.equals("")) { addFieldError("firstName",
	 * "Please Enter First Name"); }
	 * 
	 * if (lastName.equals("")) { addFieldError("lastName",
	 * "Please Enter Last Name"); }
	 * 
	 * if (age == null) { addFieldError("age", "Please Enter First Age"); } else if
	 * (age < 18) { addFieldError("age", "Please Enter Valid Age Above 18"); }
	 * 
	 * if (gender == null) { addFieldError("gender", "Please Select Gender"); }
	 * 
	 * if (dob.equals("")) { addFieldError("dob", "Please Select DOB"); }
	 * 
	 * if (email.equals("")) { addFieldError("email", "Please Enter Email Id"); }
	 * 
	 * }
	 */
}
