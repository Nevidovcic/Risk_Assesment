<!DOCTYPE html >
<%@ include file="/WEB-INF/tags/taglib.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logout</title>
</head>
<body>
<h3>Logoout page</h3>

<h1>You have logdout from application Risk Controll Assesment</h1>
</br></br>
<p>Go back to login page</p>
<spring:url value="/login" var="login" />
<a class="btn btn-default" href="${login }" role="button">Login</a>
</body>
</html>