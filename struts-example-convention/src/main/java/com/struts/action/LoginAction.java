package com.struts.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.struts.model.User;
@Namespace("/")
@ResultPath(value = "/WEB-INF/content/")
@Action(value = "login", results = { @Result(name = "success", location = "login-success.jsp"),
		  							 @Result(name = "error", location = "/index.jsp") })
public class LoginAction {
	
	private  String username;
	private  String city;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String execute() {
		if(username.equals("sukanth"))
			return "success";
		return "error";
	}





	
}
