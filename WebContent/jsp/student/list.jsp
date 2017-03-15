<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath }/student/preSave.do">add
		student</a>
	<table>
		<tr>
			<th>No</th>
			<th>Name</th>
			<th>Age</th>
			<th>Operation</th>
		</tr>
		<c:forEach var="student" items="${studentList }">
			<tr>
				<td>${student.id }</td>
				<td>${student.name }</td>
				<td>${student.age }</td>
				<td><a
					href="${pageContext.request.contextPath }/student/preSave.do?id=${student.id}">modify</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>