<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninja Gold</title>
<Link rel="stylesheet" href="/css/style.css">
</head>
<body>

	
	<p>Your Gold: <c:out value="${totalGold }"/></p>
	<div class="building">
	<form method="POST" action="/findGold">
	<h3>Farm</h3>
	<p>Earns 10-20 Gold</p>
	<input type="hidden" value="farm" name="building">
	<button>Find Gold</button>
	</form>
	</div>
	
	<div class="building">
	<form method="POST" action="/findGold">
	<h3>Cave</h3>
	<p>Earns 5-10 Gold</p>
	<input type="hidden" value="cave" name="building">
	<button>Find Gold</button>
	</form>
	</div>
	
	
	<div class="building">
	<form method="POST" action="/findGold">
	<h3>House</h3>
	<p>Earns 2-5 Gold</p>
	<input type="hidden" value="house" name="building">
	<button>Find Gold</button>
	</form>
	</div>
	
	<div class="building">
	<form method="POST" action="/findGold">
	<h3>Casino</h3>
	<p>Earns / Loses 0-50 Gold</p>
	<input type="hidden" value="casino" name="building">
	<button>Find Gold</button>
	</form>
	</div>
	
	
	<h2>Activities will go here</h2>
	<div class="activities">
<!-- 	<p> Current Activity </p> -->
	<c:forEach items="${activity}" var="singleAct">
	<p class='${singleAct.contains("bitter")? "red" : "green"}'>${singleAct }</p>
	</c:forEach>
	</div>

</body>
</html>