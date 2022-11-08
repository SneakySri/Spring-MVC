<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
</head>
<body>
	<table style="border: solid 1px red">
		<thead style="border: solid 1px red">
			<tr style="border: solid 1px red">
				<th>Id</th>
				<th>Name</th>
				<th>Salary</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="e">
				<tr style="border: solid 1px red">
					<td>${e.id}</td>
					<td>${e.name}</td>
					<td>${e.salary}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>