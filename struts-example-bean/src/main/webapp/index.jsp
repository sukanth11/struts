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
	<s:form action="show">
		<s:textfield name="employee.employeeName" label="employeeName"></s:textfield>
		<s:textfield name="employee.employeeId" label="employeeId"></s:textfield>
		<s:textfield name="employee.salary" label="salary"></s:textfield>
		<s:submit value="submit"></s:submit>
	</s:form>
</body>
</html>