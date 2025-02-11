package com.struts.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.Employee;

@ResultPath(value = "/WEB-INF/content/")
@Namespace("/")
public class EmloyeeAction extends ActionSupport{
	
	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Action(value = "empregister",results = {
			@Result(name="success", location = "empsuccess.jsp"),
			@Result(name="input", location = "empform.jsp"),
			@ExceptionMapping
	})
	@Override
	public String execute() throws Exception {
		if(employee.getName().equals("sukanth"))
			return "success";
		return "input";

	}

	@Override
	public void validate() {
		if(employee.getName().length()<=0)
			addFieldError("employee.name", "name is required");
		if(employee.getAge()<20 || employee.getAge()>70)
			addFieldError("employee.age", "age should be between 21 and 70");
		if(employee.getCity().length()<=0)
			addFieldError("employee.city", "city is required");
		if(employee.getSalary()<=0)
			addFieldError("employee.salary", "salary is required");
		if(employee.getEmail().length()<=0)
			addFieldError("employee.email", "email is required");
		else
			if(!employee.getEmail().contains("@"))
			addFieldError("employee.email", "email is  not valid");
	}
	

}
