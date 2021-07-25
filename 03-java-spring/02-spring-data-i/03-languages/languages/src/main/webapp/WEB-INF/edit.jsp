<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Language</title>
<!-- <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
 --></head>
<body>
	<div class="container">
	<form:form action="/languages/${languageFind.id}/edit" method="post" modelAttribute="languageFind">
		<div class="form-group">
		<h1>Edit this Language</h1>
		<hr>
		<form:label path="name">Language Name:</form:label>
		<form:errors path="name"/>
		<form:input path="name"/>
		</div>
		<div class="form-group">
		<form:label path="creator">Language Creator:</form:label>
		<form:errors path="creator"/>
		<form:input path="creator"/>
		</div>
		<div class="form-group">
		<form:label path="version">Version:</form:label>
		<form:errors path="version"/>
		<form:input path="version"/>
		</div>
		<button>Submit Language</button>
	</form:form>
	<p><a href="/languages/${languageFind.id}/delete">Delete</a></p>
	<p><a href="/languages">Go Back to Dashboard</a></p>
	</div>
</body>
</html>