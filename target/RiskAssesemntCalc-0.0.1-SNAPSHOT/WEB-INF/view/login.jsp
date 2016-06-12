<!DOCTYPE html>
<%@ include file="/WEB-INF/tags/taglib.jsp" %>
<html>
	<head>
		<meta charset="utf-8">
		<title>Login</title>		
		<spring:url value="/resource/css/bootstrap.css" var="boot" />
		<spring:url value="/resource/css/signin.css" var="signin" />
		<link href="${boot}" rel="stylesheet" />
		<link href="${signin}" rel="stylesheet" />
	</head> 
	<body>
	
	<div class="container">
<spring:url value="j_spring_security_check" var="loginUrl"></spring:url>
	<form name="form" action="${loginUrl }" method="post" class="form-signin">
	<security:authorize access="hasRole('ROLE_USER')" var="isUSer"/>
	<font size="2" color="red">
			<c:if test="${not isUSer}">
				<c:if test="${empty param.error}">
					You are not logged in
				</c:if>
			</c:if>
	</font>
							
	<font size="2" color="green">
			<c:if test="${isUSer}">You are logged in as 
				<security:authentication property="name"/> 
			</c:if>
	</font>
	<br/>
	<c:if test="${not empty param.error}">
    		<font size="2" color="red"><b>Either your username or password is wrong</b></font>
	</c:if>
	
	<h2 class="form-signin-heading">Please sign in</h2>
		
		<label for="inputEmail" class="sr-only"><spring:message code="email" text="User name"/></label>
		<input type="text" id="inputEmail" class="form-control" name="j_username" value="" required autofocus/>
			
		<label for="inputPassword" class="sr-only"><spring:message code="pass" text="Password"/></label>
		<input type="password" id="inputPassword" class="form-control" name="j_password" value="" required/>
		
		<div class="checkbox">
			<label>	
				<input type="checkbox" id="rememberme"  name="_spring_security_remember_me"/>Remember me
			</label>
		</div>   			
				<input type="submit" value="Submit" class="btn btn-lg btn-primary btn-block" >					
		
	</form>    
	</div>
	</body>
</html>