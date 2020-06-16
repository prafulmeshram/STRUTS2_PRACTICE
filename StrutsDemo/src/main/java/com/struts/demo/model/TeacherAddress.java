/**
 * 
 */
package com.struts.demo.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author jack
 *
 */
@Entity
@Table(name = "tab_teacher_address")
public class TeacherAddress implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5718975993066722455L;

	/**
	 * 
	 */
	public TeacherAddress() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "add_Id")
	private Long addId;

	@Column(name = "add_type")
	private String addType;
	@Column(name = "address")
	private String address;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "zipcode")
	private Integer zipcode;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE }, fetch = FetchType.EAGER)
	@JoinColumn(name = "teacher_id", insertable = true, nullable = true, unique = false, updatable = true)
	private Teacher teacher;

	/**
	 * @param addId
	 * @param addType
	 * @param address
	 * @param city
	 * @param state
	 * @param zipcode
	 * @param teacher
	 */
	public TeacherAddress(Long addId, String addType, String address, String city, String state, Integer zipcode,
			Teacher teacher) {
		this.addId = addId;
		this.addType = addType;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.teacher = teacher;
	}

	/**
	 * @return the addId
	 */
	public Long getAddId() {
		return addId;
	}

	/**
	 * @param addId the addId to set
	 */
	public void setAddId(Long addId) {
		this.addId = addId;
	}

	/**
	 * @return the addType
	 */
	public String getAddType() {
		return addType;
	}

	/**
	 * @param addType the addType to set
	 */
	public void setAddType(String addType) {
		this.addType = addType;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zipcode
	 */
	public Integer getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * @return the teacher
	 */
	public Teacher getTeacher() {
		return teacher;
	}

	/**
	 * @param teacher the teacher to set
	 */
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}
