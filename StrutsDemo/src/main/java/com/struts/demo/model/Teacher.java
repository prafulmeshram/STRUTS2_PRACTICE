/**
 * 
 */
package com.struts.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * @author jack
 *
 */
@Entity
@Table(name = "tab_teacher")
public class Teacher implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9097917914737443815L;

	/**
	 * 
	 */
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "teacher_id")
	private Long teacherId;

	@Column(name = "name")
	private String name;

	@Temporal(TemporalType.DATE)
	@Column(name = "dob")
	private Date dob;

	@Column(name = "email_id")
	private String emailId;
	@Column(name = "mobile_number")
	private String mobileNumber;

	@Column(name = "designation")
	private String designation;
	@Column(name = "department")
	private String department;

	@Column(name = "image_name")
	private String imageName;
	@Column(name = "image_path")
	private String imagePath;

	@OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REMOVE }, fetch = FetchType.EAGER, mappedBy = "teacher", orphanRemoval = true)
	@Fetch(FetchMode.SUBSELECT)
	private List<TeacherAddress> teacherAddresses;
	@OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REMOVE }, fetch = FetchType.EAGER, mappedBy = "teacher", orphanRemoval = true)
	@Fetch(FetchMode.SUBSELECT)
	private List<TeacherQualification> teacherQualifications;
	@OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REMOVE }, fetch = FetchType.EAGER, mappedBy = "teacher", orphanRemoval = true)
	@Fetch(FetchMode.SUBSELECT)
	private List<TeacherExperience> teacherExperiences;

	/**
	 * @param teacherId
	 * @param name
	 * @param dob
	 * @param emailId
	 * @param mobileNumber
	 * @param designation
	 * @param department
	 * @param imageName
	 * @param imagePath
	 * @param teacherAddresses
	 * @param teacherQualifications
	 * @param teacherExperiences
	 */
	public Teacher(Long teacherId, String name, Date dob, String emailId, String mobileNumber, String designation,
			String department, String imageName, String imagePath, List<TeacherAddress> teacherAddresses,
			List<TeacherQualification> teacherQualifications, List<TeacherExperience> teacherExperiences) {
		this.teacherId = teacherId;
		this.name = name;
		this.dob = dob;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.designation = designation;
		this.department = department;
		this.imageName = imageName;
		this.imagePath = imagePath;
		this.teacherAddresses = teacherAddresses;
		this.teacherQualifications = teacherQualifications;
		this.teacherExperiences = teacherExperiences;
	}

	/**
	 * @return the teacherId
	 */
	public Long getTeacherId() {
		return teacherId;
	}

	/**
	 * @param teacherId the teacherId to set
	 */
	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the imageName
	 */
	public String getImageName() {
		return imageName;
	}

	/**
	 * @param imageName the imageName to set
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	/**
	 * @return the imagePath
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * @param imagePath the imagePath to set
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	/**
	 * @return the teacherAddresses
	 */
	public List<TeacherAddress> getTeacherAddresses() {
		return teacherAddresses;
	}

	/**
	 * @param teacherAddresses the teacherAddresses to set
	 */
	public void setTeacherAddresses(List<TeacherAddress> teacherAddresses) {
		this.teacherAddresses = teacherAddresses;
	}

	/**
	 * @return the teacherQualifications
	 */
	public List<TeacherQualification> getTeacherQualifications() {
		return teacherQualifications;
	}

	/**
	 * @param teacherQualifications the teacherQualifications to set
	 */
	public void setTeacherQualifications(List<TeacherQualification> teacherQualifications) {
		this.teacherQualifications = teacherQualifications;
	}

	/**
	 * @return the teacherExperiences
	 */
	public List<TeacherExperience> getTeacherExperiences() {
		return teacherExperiences;
	}

	/**
	 * @param teacherExperiences the teacherExperiences to set
	 */
	public void setTeacherExperiences(List<TeacherExperience> teacherExperiences) {
		this.teacherExperiences = teacherExperiences;
	}

}
