<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Validation</title>
<spring:url value="/resources/test-main.css" var="testMainCSS" />
<link href="${testMainCSS}" rel="stylesheet" />
</head>
<body>
	<div align="center">
		<h1 class="ch1">Welcome to the Form Validation Test bed</h1>
		<hr />
		<h3>Please register yourself as your organization Representative.</h3>
		<form:form action="registerOrgRep" modelAttribute="orgrep">
			<table>
				<tr>
					<td><form:label path="firstName" cssClass="clabel">First Name:</form:label>
					</td>
					<td><form:input path="firstName"
							placeholder="Enter First Name" cssClass="cinput" /></td>
					<td><form:errors path="firstName" cssClass="cb" /></td>
				</tr>
				<tr>
					<td><form:label path="lastName" cssClass="clabel">Last Name:</form:label>
					</td>
					<td><form:input path="lastName" placeholder="Enter Sirname"
							cssClass="cinput" /></td>
					<td><form:errors path="lastName" cssClass="cb" /></td>
				</tr>
				<tr>
					<td><form:label path="age" cssClass="clabel">Age:</form:label>
					</td>
					<td><form:input path="age" placeholder="Enter your age"
							cssClass="cinput" /></td>
					<td><form:errors path="age" cssClass="cb" /></td>
				</tr>
				<tr>
					<td><form:label path="zipCode" cssClass="clabel">Zip Code:</form:label>
					</td>
					<td><form:input path="zipCode" placeholder="Enter Zip Code"
							cssClass="cinput" /></td>
					<td><form:errors path="zipCode" cssClass="cb" /></td>
				</tr>
				<tr>
					<td><form:label path="email" cssClass="clabel">Email:</form:label>
					</td>
					<td><form:input path="email" placeholder="Enter your email"
							cssClass="cinput" /></td>
					<td><form:errors path="email" cssClass="cb" /> <spring:hasBindErrors
							name="orgrep">
							<c:forEach items="${errors.globalErrors}" var="globalError">
								<c:if test="${fn:contains(globalError, Email)}">
									<c:out value="${globalError.defaultMessage}" />
								</c:if>
							</c:forEach>
						</spring:hasBindErrors></td>
				</tr>
				<tr>
					<td><form:label path="verifyEmail" cssClass="clabel">Verify Email:</form:label>
					</td>
					<td><form:input path="verifyEmail"
							placeholder="Confirm Your Email" cssClass="cinput" /></td>
					<td><form:errors path="verifyEmail" cssClass="cb" /></td>
				</tr>
				<tr>
					<td><form:label path="password" cssClass="clabel">Password:</form:label>
					</td>
					<td><form:input path="password" placeholder="Enter Your Password"
							cssClass="cinput" /></td>
					<td><form:errors path="password" cssClass="cb" /> 
					<spring:hasBindErrors name="orgrep">
							<c:forEach items="${errors.globalErrors}" var="globalError">
								<c:if test="${fn:contains(globalError, Password)}">
									<c:out value="${globalError.defaultMessage}" />
								</c:if>
							</c:forEach>
						</spring:hasBindErrors></td>
				</tr>
				<tr>
					<td align="center"><input type="submit" value="Submit"
						class="csubmit" /></td>
				</tr>
				<tr>
					<td><form:label path="verifyPassword" cssClass="clabel">Verify Password:</form:label>
					</td>
					<td><form:input path="verifyPassword"
							placeholder="Confirm Your Password" cssClass="cinput" /></td>
					<td><form:errors path="verifyPassword" cssClass="cb" /></td>
				</tr>
			</table>
			<hr />
			<c:set var="contextPath" value="${pageContext.request.contextPath}" />
			<c:if test="${formerrors ne null}">
				<a href="${contextPath}/formValidationDemo/home"
					style="font-size: 17px">Click here to start a fresh form</a>
			</c:if>
		</form:form>
	</div>
</body>
</html>