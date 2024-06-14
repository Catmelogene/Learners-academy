<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Add Student</title>
</head>
<body style="Background-image:url('images/learning-4264032_1280.jpg')">

<%@ include file="Nav.jsp" %>

<div class="container-sm">
<form method="post" action="AddStudent" class="mb-3">
	
	<label for="txtFirstName">FirstName</label>
	<input name="txtFirstName" id="txtFirstName" class="form-control" placeholder="Luna">
	<br>
	<label for="txtLastName">LastName</label>
	<input name="txtLastName" id="txtLastName" class="form-control" placeholder="Bonjour">
	<br>
	<label for="txtOffice">Office</label>
	<input name="txtOffice" id="txtOffice" class="form-control" placeholder="D011">
	<br>
	<label for="txtEmail">Contact Number</label>
	<input  type="tel" name="txtEmail" id="txtEmail" class="form-control" placeholder="+2730461578">
	<br>
	<label for="txtLastContactNumber">Email</label>
	<input type="email" name="txtLastContactNumber" id="txtLastContactNumber" class="form-control" placeholder="@learnersacademy.com">
	<br><br>
	<input type="submit" value="AddStudent" class="btn btn-outline-primary-subttle bg-success-subtle text-dark border-warning rounded-pill">
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