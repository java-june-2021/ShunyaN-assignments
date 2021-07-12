<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Counter</title>
</head>
<body>
	<p> You have visited <a href=http://localhost8080>Your server</a> <c:out value="${count}"/> Times.</p>
	<p><a href=http://localhost8080>Test another visit?</a></p>
	
</body>
</html>