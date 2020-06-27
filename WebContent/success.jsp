<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="org.abhishek.mvc.dto.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
	<h3>login Successful!!!</h3>
	<%-- <%
		User user = (User) request.getAttribute("user");
	%> --%>

	<!-- Here id is the attribute which we want to retrieve, class is the Model and scope is from where we want to retrieve -->
	<jsp:useBean id="user" class="org.abhishek.mvc.dto.User"
		scope="request">
		<!-- The below code will be executed if jsp couldn't find the user attribute in the request scope and if it finds this code will be ignored -->
		<jsp:setProperty property="username" name="user" value="NewUser" />
	</jsp:useBean>
	<br> Welcome
	<%-- <%=user.getUsername()%>!!! --%>
	<jsp:getProperty property="username" name="user" />
</body>
</html>