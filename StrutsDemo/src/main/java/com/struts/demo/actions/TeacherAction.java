/**
 * 
 */
package com.struts.demo.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts.demo.model.Teacher;
import com.struts.demo.service.TeacherService;
import com.struts.demo.service.impl.TeacherServiceImpl;
import com.struts.demo.util.Constants;

/**
 * @author jack
 *
 */
public class TeacherAction extends ActionSupport implements ModelDriven<Teacher> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3870652504867132125L;

	/**
	 * 
	 */
	public TeacherAction() {

	}

	private Teacher teacher = new Teacher();
	private List<Teacher> teachers = new ArrayList<>();
	private TeacherService teacherService = new TeacherServiceImpl();
	private List<String> addTypeList = new ArrayList<>();

	public String teacherList() {
		try {
			this.teachers = this.teacherService.getTeacherList();
			addActionMessage("Teacher List Fetched Successfully");
			return Constants.SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			addActionError("Error Occured While Fetching List");
			return Constants.ERROR;
		}

	}

	public String teacherForm() {
		addTypeList.add("Permanant");
		addTypeList.add("Local");
		return Constants.SUCCESS;
	}

	@Override
	public Teacher getModel() {
		return teacher;
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

	/**
	 * @return the teachers
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}

	/**
	 * @param teachers the teachers to set
	 */
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	/**
	 * @return the teacherService
	 */
	public TeacherService getTeacherService() {
		return teacherService;
	}

	/**
	 * @param teacherService the teacherService to set
	 */
	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	/**
	 * @return the addTypeList
	 */
	public List<String> getAddTypeList() {
		return addTypeList;
	}

	/**
	 * @param addTypeList the addTypeList to set
	 */
	public void setAddTypeList(List<String> addTypeList) {
		this.addTypeList = addTypeList;
	}

}
