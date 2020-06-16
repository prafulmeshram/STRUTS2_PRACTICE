/**
 * 
 */
package com.struts.demo.model;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "tab_teacher_exp")
public class TeacherExperience implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5036619450991386463L;

	/**
	 * 
	 */
	public TeacherExperience() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "te_id")
	private Long teId;
	@Column(name = "inst_name")
	private String instName;
	@Column(name = "from_date")
	private Date fromDate;
	@Column(name = "to_date")
	private Date toDate;
	@Column(name = "post")
	private String post;
	@Column(name = "dept")
	private String department;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE }, fetch = FetchType.EAGER)
	@JoinColumn(name = "teacher_id", insertable = true, nullable = true, unique = false, updatable = true)
	private Teacher teacher;

	/**
	 * @param teId
	 * @param instName
	 * @param fromDate
	 * @param toDate
	 * @param post
	 * @param department
	 * @param teacher
	 */
	public TeacherExperience(Long teId, String instName, Date fromDate, Date toDate, String post, String department,
			Teacher teacher) {
		this.teId = teId;
		this.instName = instName;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.post = post;
		this.department = department;
		this.teacher = teacher;
	}

	/**
	 * @return the teId
	 */
	public Long getTeId() {
		return teId;
	}

	/**
	 * @param teId the teId to set
	 */
	public void setTeId(Long teId) {
		this.teId = teId;
	}

	/**
	 * @return the instName
	 */
	public String getInstName() {
		return instName;
	}

	/**
	 * @param instName the instName to set
	 */
	public void setInstName(String instName) {
		this.instName = instName;
	}

	/**
	 * @return the fromDate
	 */
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * @return the toDate
	 */
	public Date getToDate() {
		return toDate;
	}

	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	/**
	 * @return the post
	 */
	public String getPost() {
		return post;
	}

	/**
	 * @param post the post to set
	 */
	public void setPost(String post) {
		this.post = post;
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
