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
<title>Classes</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body style="Background-image:url('images/learning-4264032_1280.jpg')">

<%@ include file="Nav.jsp" %> 

<div class="container-fluid">

<% 
ClassService clssServ = new ClassService();
List<Classes>  clsslist = clssServ.ShowAll();
%>


<h1 style="text-align: center;">Classes</h1>
<br />
<table class="table table-striped table-bordered caption-top rounded">
<caption class="blockquote">List of Classes</caption>
<tr>
<th>Stream</th>
<th>Grade</th>
<th>Room Number</th>

</tr>

<%
for(Classes C : clsslist)
{	
%>

<tr>
<td><%=C.getClassDesignation() %>  </td>
<td><%=C.getGrade() %>  </td>
<td><%=C.getRoomNo() %>  </td>
</tr>

<%
}
%>

</table>

<a type="submit" class="btn btn-outline-warning-subttle bg-success-subtle text-dark border-warning rounded-pill" href="AddClass.jsp">AddClass</a>

</div>
</body>
<footer class="footer bg-dark-subtle fixed-bottom rounded">
<div class="cointainer text-center">
	<h5 >Designed by Mduduzi Matabane</h5>
	<a>Github.com/catmelogene</a>
</div>
</footer>
</html>