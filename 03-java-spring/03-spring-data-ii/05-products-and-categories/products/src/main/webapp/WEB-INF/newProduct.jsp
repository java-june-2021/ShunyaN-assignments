<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create New Product</title>
</head>
<body>

<h1>Create Product</h1>
<form method="POST" action="/newProd">

<p>
<label for="name">Name</label>
<input type="text" name="name">
</p>

<p>
<label for="description">Description</label>
<textarea name="desc"></textarea>
</p>

<p>
<label for="price">Price</label>
<input type="number" name="price" step="0.01">
</p>

<button>Create Product</button>

</form>

</body>
</html>