/**
 * 
 */
package com.struts.demo.service.impl;

import java.util.List;

import com.struts.demo.dao.EmployeeDao;
import com.struts.demo.dao.impl.EmployeeDaoImpl;
import com.struts.demo.model.Employee;
import com.struts.demo.service.EmployeeService;

/**
 * @author jack
 *
 */
public class EmployeeServiceImpl implements EmployeeService {

	/**
	 * 
	 */
	public EmployeeServiceImpl() {

	}

	private EmployeeDao employeeDao = new EmployeeDaoImpl();

	@Override
	public String saveEmployee(Employee employee) {

		return this.employeeDao.saveEmployee(employee);
	}

	@Override
	public String deleteEmployee(Long empId) {

		return this.employeeDao.deleteEmployee(empId);
	}

	@Override
	public Employee getEmployeeById(Long empId) {

		return this.employeeDao.getEmployeeById(empId);
	}

	@Override
	public List<Employee> getEployeeList() {

		return this.employeeDao.getEployeeList();
	}

	@Override
	public Employee getEmployeeInfo(Employee employee) {

		return this.employeeDao.getEmployeeInfo(employee);
	}

}
