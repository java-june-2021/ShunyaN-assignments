<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Lookify</title>
</head>
<body>
<div class="container">
	<a href="/new">Let's Add A Song!</a>
	<a href="/topTen">Check Out Top Songs Here</a>
			<div class="navbar navbar-expand-lg navbar-light bg-light">
				<form class="d-flex" action="/search" method="GET">
					<input class="form-control me-2" type="text" name="artist">
					<button class="btn btn-outline-success" type="submit">Search Artist</button>
					
				</form>
			</div>
	<table class="table table-light">
		<thead>
			<tr>
				<th>Title</th>
				<th>Artist</th>
				<th>Rating</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${allSong}" var="song">
			<tr>
				<td> <a href="/song/${song.id }">${song.title}</a></td>
				<td>${song.artist}</td>
				<td>${song.rating}</td>
				<td> <a href="/delete/{song.id}">Delete</a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>