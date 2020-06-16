/**
 * 
 */
package com.struts.demo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.struts.demo.dao.TeacherDao;
import com.struts.demo.model.Teacher;
import com.struts.demo.util.Constants;
import com.struts.demo.util.HibernateUtil;

/**
 * @author jack
 *
 */
public class TeacherDaoImpl implements TeacherDao {

	/**
	 * 
	 */
	public TeacherDaoImpl() {

	}

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@SuppressWarnings("unchecked")
	@Override
	public List<Teacher> getTeacherList() {
		Session session = this.sessionFactory.openSession();
		try {
			List<Teacher> teachers = session.createQuery("from Teacher").list();
			return teachers;
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Teacher>();
		} finally {
			session.close();
		}
	}

	@Override
	public String saveTeacher(Teacher teacher) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Long id = teacher.getTeacherId();
		String result = Constants.TARGET_FAILED;
		try {
			session.saveOrUpdate(teacher);
			transaction.commit();
			if (id == null) {
				return Constants.TARGET_SAVE;
			} else {
				return Constants.TARGET_UPDATE;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		} finally {
			session.close();
		}
	}

	@Override
	public Teacher getTeacherById(Long id) {

		Session session = this.sessionFactory.openSession();
		try {
			Teacher teacher = session.get(Teacher.class, id);
			return teacher;
		} catch (Exception e) {

			e.printStackTrace();
			return new Teacher();
		} finally {
			session.close();
		}
	}

	@Override
	public String deleteTeacher(Long id) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.delete(this.getTeacherById(id));
			transaction.commit();
			return Constants.TARGET_DELETE;
		} catch (Exception e) {
			e.printStackTrace();
			return Constants.TARGET_DELETE;
		} finally {
			session.close();
		}
	}
}
