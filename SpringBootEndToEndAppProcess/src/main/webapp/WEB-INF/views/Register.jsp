<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"
    %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>WELCOME TO PRODUCT REGISTER</h3>
<form:form action="save" method="POST" modelAttribute="emplyee" enctype="multipart/form-data">
<pre>
<c:if test="${'EDIT' eq Mode }">
ID:<form:input path="id" readOnly="true"/>
</c:if>
 NAME  : <form:input path="empName"/>
 SAL  : <form:input path="empSal"/>
 ADDR  : <form:input path="empAddr"/>
 DEPT   : <form:select path="empDept">
 			<form:option value="QA">QA</form:option>
 			<form:option value="DEV">DEV</form:option>
 			<form:option value="TEST">TEST</form:option>
 			<form:option value="ANALYST">ANALYST</form:option>
 		</form:select> 
 EMAIL:<form:input path="email"/>
 DOCUMENT:<input type="file" name="fileOb"/>		
</pre>
 <c:choose>
<c:when test="${'EDIT' eq Mode }">
 <input type="submit" value="UPDATE EMPLOYEEE"/> 	
</c:when>
<c:otherwise> 	
<input type="submit" value="CREATE EMPLOYEEE"/> 
 </c:otherwise>
</c:choose>


</form:form>
${message}
</body>
</html>