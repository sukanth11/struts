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
<h2>Student details</h2><br>
<s:property value="student.studentName"/><br>
<s:property value="student.studentId"/><br>
<s:property value="student.department"/><br>
<s:property value="student.city"/>
</body>
</html>