<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Add Class</title>
</head>
<body style="Background-image:url('images/learning-4264032_1280.jpg')">

<%@ include file="Nav.jsp" %>
<div class="container">
<form method="post" action="AddClass" class="mb-3">
	<label>Stream</label>
	<select name="txtDesignation" class="form-select" aria-label="Default select example">
		<option selected>Choose Stream...</option>
		<option value="1">Science</option>
		<option value="2">Humanities</option>
		<option value="3">Commerce</option>
	</select>
	
	<br>
	<label for="txtGrade">Grade</label>
	<input type="number" name="txtGrade" id="txtGrade" class="form-control" placeholder="10">
	
	<br>
	<label for="txtRoomNO">Room number</label>
	<input name="txtRoomNO" id="txtRoomNO" class="form-control" placeholder="H101">
	
	<br><br>
	<input type="submit" value="AddClass" class="btn btn-outline-primary-subttle bg-success-subtle text-dark border-warning rounded-pill">
</form>
</div>
</body>
<footer class="footer bg-dark-subtle fixed-bottom rounded">
<div class="cointainer text-center">
	<h5 >Designed by Mduduzi Matabane</h5>
	<a>Github.com/catmelogene</a>
</div>
</footer>
</html>