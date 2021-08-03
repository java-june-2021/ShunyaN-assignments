<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Add A Dojo</h1>
		<form:form action="/dojo/new" method="POST" modelAttribute="dojo">
			<form:label path="name">Name:</form:label>
			<form:errors path="name"/>
			<form:input path="name"/>
			<button>Add Dojo</button>
		</form:form>
		<hr>
				<table class="table table-dark">
			<thead>
				<tr>
					<th>Name</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${allDojos}" var="dojo">
				<tr>
					<td><a href="/dojo/${dojo.id}">${dojo.name}</a></td>
				</tr>
			</c:forEach>
			</tbody>
			</table>
			<a href="/ninja/new">Add A Ninja</a>
	</div>
</body>
</html>