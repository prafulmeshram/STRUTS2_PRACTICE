/**
 * 
 */
package com.struts.demo.dao;

import java.util.List;

import com.struts.demo.model.Employee;

/**
 * @author jack
 *
 */
public interface EmployeeDao {

	public String saveEmployee(Employee employee);

	public Employee getEmployeeInfo(Employee employee);

	public String deleteEmployee(Long empId);

	public Employee getEmployeeById(Long empId);

	public List<Employee> getEployeeList();

}
