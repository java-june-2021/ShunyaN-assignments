<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>home page/ return error here</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<form method="POST" action="/login">
	<label>UserName: <input type="text" name="username"></label>
	<label>Password: <input type="password" name="password"></label>
	<button>Login</button>
	<a href="/">Home Page</a>
	<a href="/code">Code Result</a>
	<p>"Unleash the ancient power"</p>
</form>
</body>
</html>