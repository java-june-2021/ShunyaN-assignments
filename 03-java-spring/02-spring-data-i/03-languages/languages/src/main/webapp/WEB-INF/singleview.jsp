<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Language</title>
<!-- <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
 --></head>
<body>
<div class="container">
	<h1>Programming Language: <c:out value="${oneLanguage.name}"/></h1>
	<h4>Creator: <c:out value="${oneLanguage.creator}"/></h4>
	<h4>version: <c:out value="${oneLanguage.version}"/></h4>
	<p><a href="/languages/${oneLanguage.id}/edit">Edit</a></p>
	<p><a href="/languages/${oneLanguage.id}/delete">Delete</a></p>
	<p><a href="/languages">Go Back to Dashboard</a></p>
</div>
</body>
</html>