<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/student/save.do" method="get">
		<table>
			<tr>
				<th colspan="2">Student Modify</th>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="text" name="name" value="${student.name }" /></td>
			</tr>
			<tr>
				<td>age</td>
				<td><input type="text" name="age" value="${student.age }" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="submit" type /><input
					type="hidden" name="id" value="${student.id }" /></td>
			</tr>

		</table>
	</form>
</body>
</html>