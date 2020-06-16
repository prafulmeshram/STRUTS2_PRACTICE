/**
 * 
 */
package com.struts.tags.actions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author jack
 *
 */
public class RegisterAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5337344694108213965L;

	/**
	 * 
	 */
	public RegisterAction() {

	}

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String dob;
	private Integer age;

	private String gender;
	private String country;
	private String hobbies;

	private String description;

	private List<String> genderList;
	private List<String> countryList;
	private List<String> hobbyList;

	private void initializeGenderList() {
		genderList = new ArrayList<String>();
		genderList.add("Male");
		genderList.add("Female");
		genderList.add("Transgender");
	}

	private void initializeCountryList() {
		countryList = new ArrayList<String>();
		countryList.add("India");
		countryList.add("UK");
		countryList.add("USA");
		countryList.add("Australia");
	}

	private void initializeHobbyList() {
		hobbyList = new ArrayList<String>();
		hobbyList.add("Coding");
		hobbyList.add("Debugging");
		hobbyList.add("Cricket");
		hobbyList.add("Chess");
	}

	public String registerForm() {
		initializeCountryList();
		initializeGenderList();
		initializeHobbyList();
		return INPUT;
	}

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

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the hobbies
	 */
	public String getHobbies() {
		return hobbies;
	}

	/**
	 * @param hobbies the hobbies to set
	 */
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the genderList
	 */
	public List<String> getGenderList() {
		return genderList;
	}

	/**
	 * @param genderList the genderList to set
	 */
	public void setGenderList(List<String> genderList) {
		this.genderList = genderList;
	}

	/**
	 * @return the countryList
	 */
	public List<String> getCountryList() {
		return countryList;
	}

	/**
	 * @param countryList the countryList to set
	 */
	public void setCountryList(List<String> countryList) {
		this.countryList = countryList;
	}

	/**
	 * @return the hobbyList
	 */
	public List<String> getHobbyList() {
		return hobbyList;
	}

	/**
	 * @param hobbyList the hobbyList to set
	 */
	public void setHobbyList(List<String> hobbyList) {
		this.hobbyList = hobbyList;
	}

}
