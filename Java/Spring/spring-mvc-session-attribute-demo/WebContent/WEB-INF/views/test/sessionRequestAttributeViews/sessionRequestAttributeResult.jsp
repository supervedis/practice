<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
     <h1>@SessionAttribute Test Result</h1>
     <h3>Number of page visits in this session <c:out value="${visitorcount.count}"/></h3>
     <h3>${timeHeading}, ${durationHeading}</h3>
     <h3>List of visitors to this site</h3>
     <ul>
        <c:forEach var="visitor" items="${visitordata.visitors }">
           <ul>
             <li><b><c:out value="${visitor.name}"/> <c:out value="${visitor.email}"/> </b></li>
           </ul>
        </c:forEach>
     </ul>
     <br>
     <br>
     <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
     <a href="${contextPath}/visitorRegister/home" style="font-size: 20px">Go back</a><br/>
   </div>
</body>
</html>