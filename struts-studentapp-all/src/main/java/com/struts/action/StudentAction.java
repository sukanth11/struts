package com.struts.action;

import java.util.Arrays;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.Student;

public class StudentAction extends ActionSupport{
	
	private Student student;
	
	
	public StudentAction() {
		hobbies=Arrays.asList("sports","travel","dance","singing");
	}

	private List<String> hobbies;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	
	public String  showStudForm() {
		return "none";
	}
	
	public String execute() {
		if(student.getName().equals("sukanth"))
			return "success";
		return "error";
	}
}
