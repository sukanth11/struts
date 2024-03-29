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
	<s:url action="empform" var="vempform"/>
	<s:a href="%{vempform}">Show Employee Form</s:a>
	<br>
	<s:a href="studform"><s:url value="Show Student Form"/></s:a>
	<br>
</body>
</html>