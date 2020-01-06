<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test bed</title>
<spring:url value="/resources/test-main.css" var="testMainCSS" />
<link href="${testMainCSS}" rel="stylesheet" />
</head>
<body>
	<div align="center">
		<h1>@SessionAttribute Test Bed</h1>
		<hr>
		<form:form action="visitor" modelAttribute="visitorstats">
			<table>
				<tr>
					<td><form:label path="currentVisitorName">Name:</form:label></td>
					<td><form:input path="currentVisitorName" /></td>
				</tr>
				<tr>
					<td><form:label path="currentVisitorEmail">Email:</form:label></td>
					<td><form:input path="currentVisitorEmail" /></td>
				</tr>
				<tr align="center">
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>