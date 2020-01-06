<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Validation Result</title>
<spring:url value="/resources/test-main.css" var="testMainCSS" />
<link href="${testMainCSS}" rel="stylesheet" />
</head>
<body>
	<h1 class="ch1">Congratulations. You are now a registered
		representative of your organization.</h1>
	<h2 class="ch2">Details are below...</h2>
	<hr />
	<div style="margin-left: 600px; width: auto">
		<h3>
			Name: <b class="cb">${orgrep.firstName} ${orgrep.lastName}</b>
		</h3><br/>
		<h3>
			Age: <b class="cb">${orgrep.age}</b>
		</h3>
		<h3>
			Zip Code: <b class="cb">${orgrep.zipCode}</b>
		</h3>
		<h3>
			Email: <b class="cb">${orgrep.email}</b>
		</h3>
	</div>
	<hr />
	<div align="center">
		<c:set var="contextPath" value="${pageContext.request.contextPath}" />
		<c:if test="${formerrors ne null}">
			<a href="${contextPath}/formValidationDemo/home"
				style="font-size: 17px">Click here to start a fresh form</a>
		</c:if>
	</div>
</body>
</html>