/**
 * 
 */
package com.struts.demo.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.struts.demo.dao.EmployeeDao;
import com.struts.demo.model.Employee;
import com.struts.demo.util.Constants;
import com.struts.demo.util.HibernateUtil;

/**
 * @author jack
 *
 */
public class EmployeeDaoImpl implements EmployeeDao {

	/**
	 * 
	 */
	public EmployeeDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String saveEmployee(Employee employee) {
		Long id = employee.getEmpId();
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.saveOrUpdate(employee);
			transaction.commit();
			if (id == null) {
				return Constants.TARGET_SAVE;
			} else {
				return Constants.TARGET_UPDATE;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Constants.TARGET_FAILED;
		} finally {
			session.close();
		}

	}

	@Override
	public Employee getEmployeeInfo(Employee employee) {

		return this.getEmployeeById(employee.getEmpId());
	}

	@Override
	public String deleteEmployee(Long empId) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(this.getEmployeeById(empId));
		transaction.commit();
		session.close();
		return Constants.SUCCESS;
	}

	@Override
	public Employee getEmployeeById(Long empId) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = session.get(Employee.class, empId);

		transaction.commit();
		session.close();
		return employee;
	}

	@Override
	public List<Employee> getEployeeList() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Employee> employees = session.createQuery("from Employee").list();
		transaction.commit();
		session.close();
		return employees;

	}

}
