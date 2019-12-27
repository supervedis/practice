<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listing organization using JSTL SQL tags</title>
</head>
<body>

  <h1>Organization list</h1>
  <c:forEach var="row" items="${orgList}">
    Name: ${row.companyName}<br>
    Year: ${row.yearOfIncorporation}<br>
	Zip: ${row.postalCode}<br>
	Emp Count:${row.employeeCount}<br>
	Slogan: ${row.slogan}
  </c:forEach>
</body>
</html>