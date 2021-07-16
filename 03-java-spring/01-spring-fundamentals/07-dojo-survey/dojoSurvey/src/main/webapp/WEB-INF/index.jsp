<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="wrapper">
	<form method="POST" action="/result">
	<p>
		<label for="name">Your Name:</label>
		<input type="text" id="name" name="name">
	</p>
	
	<p>
		<label for="location">Dojo Location:</label>
		<select id="location" name="location">
			<option value="San Jose">San Jose</option>
			<option value="Tokyo">Tokyo</option>	
			<option value="Dallas">Dallas</option>	
			<option value="Chicago">Chicago</option>							
		</select>
	
	
	<p>
		<label for="language">Your Favorite Language:</label>
		<select id="language" name="language">
					
				<option value="Python">Python</option>
  				<option value="JavaScript">JavaScript</option>
  				<option value="Java">Java</option>
  				<option value="HTML">HTML</option>
  				<option value="CSS">CSS</option>
  				<%-- 	Another way of doing it
  				<div class="form-group">
			<label for="language">Favorite Language</label>
			<select name="language" id="location">
			<c:forEach items="${ languages }" var="lang">
				<option value="<c:out value='${ lang }'/>"><c:out value='${ lang }'/></option>
			</c:forEach>
			</select>
		</div> --%>
		</select>
	</p>
	
	<p>Leave a comment: (optional)</p>
	<p>
		<label for="comment"></label>
		<textarea id="comment" name="comment" rows="5" cols="50"></textarea>
	
	</p>
		<button>Send</button>
	</form>
</div>
</body>
</html>