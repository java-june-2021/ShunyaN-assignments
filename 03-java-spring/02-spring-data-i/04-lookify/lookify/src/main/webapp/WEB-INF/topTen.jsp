<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- <meta charset="ISO-8859-1">
 --><title>TopTenSong</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
	<a href="/new">Add a Song</a>]
	<a href="/dashboard">Dashboard</a>
	<div class="navbar navbar-expand-lg navbar-light bg-light">
		    <form class="d-flex" action="/search" method="GET">
        		<input class="form-control me-2" type="text" name="artist">
        		<button class="btn btn-outline-success" type="submit">Search</button>
		    </form>
    	</div>
		<h1>Top Ten Songs</h1>
		<c:forEach items="${songs}" var="song">
		<ul>
			<li>${song.rating} <a href="/song/${song.id}">${song.title}</a> - ${song.artist}</li>
		
		
		</ul>
		</c:forEach>
</div>
</body>
</html>