<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Form</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css" />
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">

		<div id="content">

			<form:form action="saveCustomer" modelAttribute="customer" method="POST">
			<form:hidden path="id"/>
				<table>
					<tr>
						<td><label>First Name:</label></td>
						<td><form:input path="firstName" placeholder="First Name" /></td>
					</tr>
					<tr>
						<td><label>Last Name:</label></td>
						<td><form:input path="lastName" placeholder="Last Name" /></td>
					</tr>
					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" placeholder="Enter Your Email" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save"/></td>
					</tr>
				</table>
			</form:form>
		</div>
	</div>
</body>
</html>