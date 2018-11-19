<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Scheduled Sessions</h1>
<table>
<tr>
<td><b>SessionName</b></td>
<td><b>Duration(Days)</b></td>
<td><b>Faculty</b></td>
<td><b>Mode</b></td>
</tr>
<a:forEach var="clt" items="${data}">
<tr>
<td>${clt.name}</td>
<td>${clt.dur}</td>
<td>${clt.fac}</td>
<td>${clt.mode}</td>
<td><a href="Enroll Me?name=${clt.name}">Enroll Me</a></td>
</a:forEach>

</table>
</body>
</html>