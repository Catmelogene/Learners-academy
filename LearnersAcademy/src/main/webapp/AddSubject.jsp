<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Add Subject</title>
</head>
<body>

<%@ include file="Nav.jsp" %>

<form method="post" action="AddSubject" class="mb-3">
	
	<label for="txtSubjectName" class="form-control"> Subject Name</label>
	<input name="txtSubjectName" id="txtSubjectName" class="form-control" placeholder="Life Orientation">
	<br>
	<label for="txtcredits">Credits</label>
	<input type="number" name="txtcredits" id="txtcredits" class="form-control" placeholder="0...">
	<br><br>
	<input type="submit" value="Add" class="btn btn-primary btn-outline-success text-light">
</form>

</body>
<footer class="footer bg-dark-subtle fixed-bottom rounded">
<div class="cointainer text-center">
	<h5 >Designed by Mduduzi Matabane</h5>
	<a>Github.com/catmelogene</a>
</div>
</footer>
</html>