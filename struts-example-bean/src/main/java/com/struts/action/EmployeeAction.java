package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.Employee;

public class EmployeeAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String execute() {
		if(employee.getEmployeeName().equals("sukanth"))
			return "success";
		else if(employee.getEmployeeName().equals(""))
			throw new NumberFormatException();
		else
			return  "error";
		
	}
	

}
