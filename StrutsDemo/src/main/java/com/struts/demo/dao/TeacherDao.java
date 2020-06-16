/**
 * 
 */
package com.struts.demo.dao;

import java.util.List;

import com.struts.demo.model.Teacher;

/**
 * @author jack
 *
 */
public interface TeacherDao {

	public List<Teacher> getTeacherList();

	public String saveTeacher(Teacher teacher);

	public Teacher getTeacherById(Long id);

	public String deleteTeacher(Long id);

}
