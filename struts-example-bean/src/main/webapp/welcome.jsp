<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Employee Details</h3><br>
<s:property value="employee.employeeName"/><br>
<s:property value="employee.employeeId"/><br>
<s:property value="employee.salary"/>
</body>
</html>