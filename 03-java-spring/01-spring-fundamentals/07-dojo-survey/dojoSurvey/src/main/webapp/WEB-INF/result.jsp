<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>After Result page</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<div class="wrapper">
		<h2>submitted Info</h2>
		<p>Name: <c:out value="${nameResult}"/></p>
		<p>Dojo Location: <c:out value="${locationResult}"/></p>
		<p>Favorite Language: <c:out value="${languageResult}"/></p>
		<p>Comment: <c:out value="${commentResult}"/></p>		
	</div>
</body>
</html>