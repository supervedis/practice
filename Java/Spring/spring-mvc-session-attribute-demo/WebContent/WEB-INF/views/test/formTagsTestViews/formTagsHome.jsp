<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Tags</title>
<spring:url value="/resources/test-main.css" var="testMainCSS" />
<link href="${testMainCSS}" rel="stylesheet" />
</head>
<body>
   <div align="center">
     <h1>Welcome to the form tags test bed</h1>
     <hr/>
     <h3>Register Your organization with us</h3>
     <form:form action="registerOrg" modelAttribute="orgRegistration">
     <table>
       <tr>
          <td><form:label path="orgName">Organization Name:</form:label></td>
          <td><form:input path="orgName" placeholder="Organization name"/></td>
       </tr>
       <tr>
         <td><form:label path="country">Country</form:label></td>
         <td>
            <form:select path="country">
               <form:option value="NONE">--------SELECT------</form:option>
               <form:option value="Australia">Australia</form:option>
               <form:option value="Kenya">Kenya</form:option>
               <form:option value="Norway">Norway</form:option>
               <form:option value="United States">United States</form:option>
               <form:option value="Canada">Canada</form:option>
               <form:option value="Sweden">Sweden</form:option>
            </form:select>
       </tr>
       <tr>
          <td><form:label path="turnover">Organization Turnover:</form:label></td>
          <td><form:select path="turnover" items="${turnoverList}"/></td>
       </tr>
       <tr>
          <td><form:label path="type">Organization Type:</form:label></td>
          <td><form:select path="type">
             <form:option value="none">---------SELECT------</form:option>
             <form:options items="${typeList}"/>
          </form:select>
          </td>
       </tr>
       <tr>
          <td><form:label path="serviceLength">Organization Service Length:</form:label></td>
          <td><form:select path="serviceLength" items="${serviceLength}"/></td>
       </tr>
       <tr>
          <td><form:label path="registeredPreviously">Previously Registered:</form:label></td>
          <td><form:checkbox path="registeredPreviously" items="${registerEarlyList}"/></td>
       </tr>
       <tr>
          <td><form:label path="overseasOperation">Overseas operation?</form:label></td>
          <td>
              <form:radiobutton path="overseasOperation" value="Yes"/> Yes
              <form:radiobutton path="overseasOperation" value="No"/> No
          </td>
       </tr>
       <tr>
          <td align="center">
            <input type="submit" value="Submit"/>
          </td>
       </tr>
       </table>
     </form:form>
   </div>
</body>
</html>