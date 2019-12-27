<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
input[type=text] {
	padding: 10px;
	margin: 10px;
	font-size: 20px
}

input[type=submit] {
	border: none;
	background-color: #4CAf50;
	color: white;
	padding: 16px;
	margin: 16px;
	cursor: pointer;
	font-size: 20px
}

h2 {
	color: #08298A;
	text-align: center
}
</style>
</head>
<body>
	<h2 style="color: #DF0101">
		<c:out value="${greeting}"></c:out>
	</h2>
	<hr />

	<form action="listOrgs">
		<input type="text" name="locationName"></br> 
		<input type="submit" value="Get Organizations"></br>
	</form>
</body>
</html>