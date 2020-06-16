/**
 * 
 */
package com.struts.demo.actions;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts.demo.model.Employee;
import com.struts.demo.service.EmployeeService;
import com.struts.demo.service.impl.EmployeeServiceImpl;
import com.struts.demo.util.Constants;

/**
 * @author jack
 *
 */
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2673999765100414532L;

	/**
	 * 
	 */
	public EmployeeAction() {

	}

	private Employee employee = new Employee();
	private List<Employee> employees = new ArrayList<Employee>();
	private EmployeeService employeeService = new EmployeeServiceImpl();

	HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);

	public String employeeForm() {
		return Constants.SUCCESS;
	}

	public String employeeList() {
		this.employees = this.employeeService.getEployeeList();
		return Constants.SUCCESS;
	}

	public String updateEmployee() {
		try {
			this.employee = this.employeeService.getEmployeeById(employee.getEmpId());
			addActionMessage("Data Retrived Successfully");
			return Constants.SUCCESS;
		} catch (Exception e) {
			addActionError("Error Occured While Retrieving Data");
			e.printStackTrace();
			return Constants.ERROR;
		}

	}

	public String viewEmployee() {
		try {
			this.employee = this.employeeService.getEmployeeById(employee.getEmpId());
			addActionMessage("Data Retrieved Successfully");
			return Constants.SUCCESS;
		} catch (Exception e) {
			addActionError("Error Occured While Retrieving Data");
			e.printStackTrace();
			return Constants.ERROR;
		}
	}

	public String deleteEmployee() {
		try {
			this.employeeService.deleteEmployee(employee.getEmpId());
			this.employees = this.employeeService.getEployeeList();
			addActionMessage("Data Deleted Successfully");
			return Constants.SUCCESS;
		} catch (Exception e) {
			addActionError("Error Occured While Deleting Data");
			e.printStackTrace();
			return Constants.ERROR;
		}

	}

	public String saveEmployee() {
		String result = this.employeeService.saveEmployee(employee);
		if (result.equalsIgnoreCase(Constants.TARGET_SAVE)) {
			addActionMessage("Data Saved Successfully");
			return Constants.SUCCESS;
		} else if (result.equalsIgnoreCase(Constants.TARGET_UPDATE)) {
			addActionMessage("Data Updated Successfully");
			return Constants.SUCCESS;
		} else {
			addActionError("Error Occured While Transaction");
			return Constants.ERROR;
		}
	}

	@Override
	public Employee getModel() {
		return employee;
	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * @return the employees
	 */
	public List<Employee> getEmployees() {
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	/**
	 * @return the employeeService
	 */
	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	/**
	 * @param employeeService the employeeService to set
	 */
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

}
