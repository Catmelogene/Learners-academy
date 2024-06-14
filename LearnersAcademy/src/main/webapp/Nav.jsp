<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="bg-info" style="height:50;">
<nav class="navbar navbar-expand-lg bg-info bg-body-tertiary ">
  <div class="container-fluid ">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="Index.jsp">Learners Academy</a>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="Subjects.jsp">Subjects</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="Classes.jsp">Classes</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="Teachers.jsp">Teachers</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="Students.jsp">Students</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="Allocations.jsp">Allocations</a>
        </li>
      </ul>
    </div>
    <div class="container d-flex justify-content-end">        
        <a class="btn btn-outline-success" href="Login.jsp">Logout<span class="fa fa-fa-sign-out"></span></a>
      </div>
    </div>
  </div>
</nav>
</div>
</body>
</html>