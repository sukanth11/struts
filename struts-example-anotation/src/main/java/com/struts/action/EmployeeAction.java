package com.struts.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.Employee;

@Namespace("/")
@ResultPath(value = "/WEB-INF/content/")
@Action(value = "show", results = { @Result(name = "success", location = "welcome.jsp"),
		  							 @Result(name = "error", location = "/index.jsp") })

public class EmployeeAction extends ActionSupport {

	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String execute() {
		if (employee.getEmployeeName().equals("sukanth"))
			return "success";
		return "error";
	}

}
