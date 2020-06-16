/**
 * 
 */
package com.struts.demo.service.impl;

import java.util.List;

import com.struts.demo.dao.TeacherDao;
import com.struts.demo.dao.impl.TeacherDaoImpl;
import com.struts.demo.model.Teacher;
import com.struts.demo.service.TeacherService;

/**
 * @author jack
 *
 */
public class TeacherServiceImpl implements TeacherService {

	/**
	 * 
	 */
	public TeacherServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	private TeacherDao teacherDao = new TeacherDaoImpl();

	@Override
	public List<Teacher> getTeacherList() {

		return this.teacherDao.getTeacherList();
	}

	@Override
	public String saveTeacher(Teacher teacher) {

		return this.teacherDao.saveTeacher(teacher);
	}

	@Override
	public Teacher getTeacherById(Long id) {

		return this.teacherDao.getTeacherById(id);
	}

	@Override
	public String deleteTeacher(Long id) {

		return this.teacherDao.deleteTeacher(id);
	}

}
