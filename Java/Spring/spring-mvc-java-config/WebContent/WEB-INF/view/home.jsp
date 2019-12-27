<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Organization home page</title>
</head>
<body>

  <h2 align="center" style="color: #DF0101"><c:out value="${greeting}"></c:out></h2>
  <hr/>
  <h1>Organization details</h1>
  <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
  <div style="text-align: center">
    <a href="${contextPath}/location" style="font-size: 30px">Click here to get organization details for your location</a>
  </div>
</body>
</html>