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
	<h2>employee details</h2>
	<s:property value="employee.name" />
	<br>
	<s:property value="employee.city" />
	<br>
	<s:property value="employee.age" />
	<br>
	<s:property value="employee.salary" />
	<br>
	<s:property value="employee.email" />
	<br>
</body>
</html>