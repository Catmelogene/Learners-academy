<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page import="com.Operations.*" %>
    <%@ page import="com.Entities.*" %>
    <%@ page import="com.Connections.*" %>
    <%@ page import="java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Students</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body style="Background-image:url('images/learning-4264032_1280.jpg')">

<%@ include file="Nav.jsp" %>

<div class="container-fluid">

<% 
StudentService stuServ = new StudentService();
List<Student>  list = stuServ.ShowAll();
%>


<h1 style="text-align: center;">Students</h1>
<hr />
<table class="table table-striped table-bordered caption-top rounded">
<caption class="blockquote">List of Students</caption>
<tr>
<th>Name</th>
<th>Contact</th>
<th>Email</th>

</tr>

<%
for(Student S : list)
{	
%>

<tr>
<td><%=S.getFirstName()+" "+S.getLastName() %>  </td>
<td><%=S.getEmail() %>  </td>
<td><%=S.getContactNumber() %>  </td>
</tr>

<%
}
%>

</table>
<br>

<a type="submit" class="btn btn-outline-warning-subttle bg-success-subtle text-dark border-warning rounded-pill" href="AddStudent.jsp">AddStudent</a>

</div>
</body>
<footer class="footer bg-dark-subtle fixed-bottom rounded">
<div class="cointainer text-center">
	<h5 >Designed by Mduduzi Matabane</h5>
	<a>Github.com/catmelogene</a>
</div>
</footer>
</html>