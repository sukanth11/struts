package com.struts.action;

import java.util.Arrays;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.Student;
@ResultPath(value = "/WEB-INF/content/")

public class StudentAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private Student student;
	private List<String> hobbies;

	public StudentAction() {
		hobbies=Arrays.asList("sports","music","travaling");
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = Arrays.asList("sports","music","travaling");
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Action(value = "/register",results = {
			@Result(name="success" ,location = "studsuccess.jsp"),
			@Result(name="input" ,location = "studform.jsp"),
			@Result(name="error" ,location = "studform.jsp")
	})
	public String execute() throws Exception {
		return "success";
	}
	
	@Action(value = "/studform",results= {
			@Result(name = "none" ,location = "studform.jsp")
	})
	public String studform() {
		return "none";
	}

	@Override
	public void validate() {
		if(student!=null)
			if(student.getName().length()<=0)
				addFieldError("student.name", "name is required");
			if(student.getAge()<14 || student.getAge()>35)
				addFieldError("student.age", "age should be between 14 and 35");
			if(student.getCity().length()<=0)
				addFieldError("student.city", "city is required");
			if(student.getAllowance()<=0)
				addFieldError("student.allowance", "allowance is required");
			if(student.getEmail().length()<=0)
				addFieldError("student.email", "email is required");
			else
				if(!student.getEmail().contains("@"))
				addFieldError("student.email", "email is  not valid");
			if(student.getCourse().length()<=0)
				addFieldError("student.course", "course is required");
//			if(student.getGender())
//				addFieldError("student.gender", "gender is required");
//			if(student.getHobby().)
//				addFieldError("student.hobby" "hobby is required");
		
	}
	
	

}
