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
@Table(name = "tab_teacher_qual")
public class TeacherQualification implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7138250780813279286L;

	/**
	 * 
	 */
	public TeacherQualification() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tq_id")
	private Long tqId;

	@Column(name = "exam")
	private String exam;
	@Column(name = "board")
	private String board;
	@Column(name = "year")
	private String year;
	@Column(name = "subject")
	private String subject;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE }, fetch = FetchType.EAGER)
	@JoinColumn(name = "teacher_id", insertable = true, nullable = true, unique = false, updatable = true)
	private Teacher teacher;

	/**
	 * @param tqId
	 * @param exam
	 * @param board
	 * @param year
	 * @param subject
	 * @param teacher
	 */
	public TeacherQualification(Long tqId, String exam, String board, String year, String subject, Teacher teacher) {
		this.tqId = tqId;
		this.exam = exam;
		this.board = board;
		this.year = year;
		this.subject = subject;
		this.teacher = teacher;
	}

	/**
	 * @return the tqId
	 */
	public Long getTqId() {
		return tqId;
	}

	/**
	 * @param tqId the tqId to set
	 */
	public void setTqId(Long tqId) {
		this.tqId = tqId;
	}

	/**
	 * @return the exam
	 */
	public String getExam() {
		return exam;
	}

	/**
	 * @param exam the exam to set
	 */
	public void setExam(String exam) {
		this.exam = exam;
	}

	/**
	 * @return the board
	 */
	public String getBoard() {
		return board;
	}

	/**
	 * @param board the board to set
	 */
	public void setBoard(String board) {
		this.board = board;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
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
