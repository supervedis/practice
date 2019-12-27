<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listing organization using JSTL SQL tags</title>
</head>
<body>

  <h1>Organization list</h1>
  <sql:query var="rs" dataSource="jdbc/spring">
     SELECT * FROM organization
  </sql:query>
  
  <c:forEach var="row" items="${rs.rows}">
    Name: ${row.company_name}<br>
    Year: ${row.year_of_incorporation}<br>
	Zip: ${row.postal_code}<br>
	Emp Count:${row.employee_count}<br>
	Slogan: ${row.slogan}<br><br>
  </c:forEach>
</body>
</html>