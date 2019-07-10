<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>WELCOME TO EMPLOYEE DATA</h3>
<table>
	<tr>
		<th>  ID   </th>   
		<th>  NAME </th>   
		<th>  SAL  </th>   
		<th>  DEPT </th>   
		<th>  ADDR </th>   
		<th>  OPERATIONS </th>
	</tr>
	
	<c:forEach items="${list}" var="ob">
		<tr>
			<td><c:out value="${ob.id}"/> </td>
			<td><c:out value="${ob.empName}"/> </td>
			<td><c:out value="${ob.empSal}"/> </td>
			<td><c:out value="${ob.empDept}"/> </td>
			<td><c:out value="${ob.empAddr}"/> </td>
			<td>
				<a href="delete?id=${ob.id}">DELETE</a>
			</td>
			<td>
				<a href="Edit?id=${ob.id}">EDIT</a>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>




