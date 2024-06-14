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
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Add Subject to Class</title>
</head>
<body style="Background-image:url('images/learning-4264032_1280.jpg')">


<% 
ClassService clssServ=new ClassService();
List<Classes> clist=clssServ.ShowAll();

SubjectService subServ=new SubjectService();
List<Subject> slist=subServ.ShowAll();

/* SubjectClassesService subclssServ = new SubjectClassesService();
List<Subject_Classes>  list = subclssServ.ShowAll(); */
%>

<%@ include file="Nav.jsp" %>

<div class="container">
<br><br>
<form method="post" action="Subject_Class" class="mb-3">
	
	<label for="txtClassId" >Class</label>
    <select id="txtClassId" name="txtClassId" class="form-control">
    	<option class="dropdown-item disabled">Select Class...</option>
        <%
        	for(Classes c: clist){
        		out.println("<option value=\""+c.getClassID()+ "\">"+c.getClassDesignation()+"</option>");
        	}
        %>
    </select>
    <br>
    <label for="txtSubjectId" class="">Subject</label>
    <select id="txtSubjectId" name="txtSubjectId" class="form-control">
    <option class="dropdown-item disabled">Select Subject...</option>
        <%
        	for(Subject s: slist){
        		out.println("<option value=\"" +s.getSubjectID()+ "\" >"+s.getSubjectName()+"</option>");
        	}
        %>
    </select>
	<br><br>
	<input type="submit" value="Allocate" class="btn btn-outline-primary-subttle bg-success-subtle text-dark border-warning rounded-pill">
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