<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Languages</title>
<!-- <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
 --></head>
<body>
	<div class="container">
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Language Name</th>
					<th>Creator</th>
					<th>Version</th>
					<th>Action</th>
				</tr>
			</thead>
			<c:forEach items="${allLanguages}" var="language">
				<tr>
				<td><a href="/languages/${language.id}">${language.name}</a></td>
				<td>${language.creator}</td>
				<td>${language.version}</td>
				<td><a href="/languages/${language.id}/delete">Delete</a>   <a href="/languages/${language.id}/edit">Edit</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
	<div class="container">
	<form:form action="/languages" method="post" modelAttribute="language">
		<div class="form-group">
		<h1>Add a New Language</h1>
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
	</div>
	
</body>
</html>