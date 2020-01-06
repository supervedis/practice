<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form tags test result</title>
<spring:url value="/resources/test-main.css" var="testMainCSS" />
<link href="${testMainCSS}" rel="stylesheet" />
</head>
<body>
  <div align="center">
    <h1>Congratulations you have registered your organization.</h1>
    <h2>Details below...</h2>
    <br>
    <h3>Organization name: ${orgreg.orgName}</h3>
    <h3>Organization country: ${orgreg.country}</h3>
    <h3>Turnover:
       <c:forEach var="entry" items="${turnoverList}">
         <c:if test="${orgreg.turnover eq entry.key}">
           <b>${entry.value}</b>
         </c:if>
       </c:forEach>
    </h3>
    <h3>Type:
       <c:forEach var="entry" items="${typeList}">
         <c:if test="${orgreg.type eq entry.key}">
           <b>${entry.value}</b>
         </c:if>
       </c:forEach>
    </h3>
    <h3>Service Length:
       <c:forEach var="entry" items="${serviceLength}">
         <c:if test="${orgreg.serviceLength eq entry.key}">
           <b>${entry.value}</b>
         </c:if>
       </c:forEach>
    </h3>
    <h3>Registered Previously:
       <c:forEach var="entry" items="${registerEarlyList}">
         <c:if test="${orgreg.registeredPreviously eq entry.key}">
           <b>${entry.value}</b>
         </c:if>
       </c:forEach>
    </h3>
    <h3>Overseas operation:
       <b>${orgreg.overseasOperation}</b>
    </h3>
  </div>
</body>
</html>