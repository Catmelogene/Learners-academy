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
<title>Subjects</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body class="" style="Background-image:url('images/learning-4264032_1280.jpg')">

<%@ include file="Nav.jsp" %> 

<div class="container-fluid">

<% 
SubjectClassesService subclssServ = new SubjectClassesService();
List<Subject_Classes>  subclsslist = subclssServ.ShowAll();
%>


<h1 style="text-align: center;">Subjects</h1>
<br />
<table class="table table-striped table-bordered caption-top rounded">
<caption class="blockquote">List of Subjects</caption>
<thead class="">
<tr>
<th>Period</th>
<th>Subject</th>
<th>Class</th>
</tr>
</thead>
<tbody class="table-group-divider">
<%
for(Subject_Classes C : subclsslist)
{	
%>

<tr>
<td><%=C.getId() %>  </td>
<td><%=subclssServ.getSubject(C.getSubjectId()).getSubjectName()  %>  </td>
<td><%=subclssServ.getClass(C.getClassesId()).getClassDesignation() %> </td>
</tr>

<%
}
%>
</tbody>

</table>
<br>

<a type="submit" class="btn btn-outline-warning-subttle bg-success-subtle text-dark border-warning rounded-pill" href="PairSubjectClass.jsp">Allocate</a>

</div>
</body>
<footer class="footer bg-dark-subtle fixed-bottom rounded">
<div class="cointainer text-center">
	<h5 >Designed by Mduduzi Matabane</h5>
	<a>Github.com/catmelogene</a>
</div>
</footer>
</html>