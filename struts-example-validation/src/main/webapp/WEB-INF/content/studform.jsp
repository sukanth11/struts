<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="register">
		<s:textfield name="student.name" label="Name"></s:textfield>
		<s:textfield name="student.city" label="City"></s:textfield>
		<s:textfield name="student.age" label="Age"></s:textfield>
		<s:textfield name="student.allowance" label="Allowance"></s:textfield>
		<s:textfield name="student.email" label="Email"></s:textfield>
		<s:select name="student.course" list="{'java','spring','angular'}"
			label="Course"></s:select>
		<s:radio name="student.gender" label="Gender" list="{'male','female'}"></s:radio>
		<s:checkboxlist name="student.hobby" list="hobbies" label="Hobbies"></s:checkboxlist>
		<s:submit value="submit"></s:submit>
	</s:form>
</body>
</html>