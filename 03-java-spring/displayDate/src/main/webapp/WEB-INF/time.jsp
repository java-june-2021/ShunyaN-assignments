<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="js/date.js"></script> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Current Time</title>
</head>
<body>
	<div id= wrapper>
		<a href="/">Go Back</a>
		<h1>Current Time: <c:out value= "${time}"/></h1>
	</div>
</body>
</html>