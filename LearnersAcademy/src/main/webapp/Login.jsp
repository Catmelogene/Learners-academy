<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Login</title>
</head>
<body style="Background-image:url('images/learning-4264032_1280.jpg');">

<div class="bg-info" style="height:50;">
<nav class="navbar navbar-expand-lg bg-info bg-body-tertiary ">
  <div class="container-fluid ">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="Index.jsp">Learners Academy</a>
  </div>
</nav>
</div>

	<br><br>
	
	<div class=" container-fluid bg-light rounded border border-warning" style="Width:350px; height:350px;">
	<br><br>
	<h3 class="tetxt-align-center">Login </h3>
	<br>
<form method="post" action="Login" class="bg-light form-control" >
	<p style="text-align: center;">
	<label>Username</label>
		<input type="text"  name="txtUserName"  placeholder="UserName " required />
		<br /><br />
		<label>Password</label>
		<input type="password"  name="txtPassword"  placeholder="Password " required />
		<br /><br />
		<input type="submit"  value="Login" />
	</p>
</form>
</div>
</body>
<footer class="footer bg-dark-subtle fixed-bottom rounded">
<div class="cointainer text-center">
	<h5 >Designed by Mduduzi Matabane</h5>
	<p>Github.com/catmelogene</p>
</div>
</footer>
</html>