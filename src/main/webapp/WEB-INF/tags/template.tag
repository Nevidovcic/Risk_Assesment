<!DOCTYPE html>
<%@tag description="Template Site Tag" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/tags/taglib.jsp" %>
<%@ attribute name="title" fragment="true" %>

<html lang="en">
<head>

    <title><jsp:invoke fragment="title"/></title>

	<spring:url value="/resource/css/bootstrap.css" var="bootstrap" />
	<spring:url value="/resource/css/bootstrap-theme.min.css" var="boots" />
	<spring:url value="/resource/css/sidebar.css" var="sidebar" />
	<spring:url value="/resource/css/main.css" var="main" />

	<link href="${bootstrap}" rel="stylesheet" />
	<link href="${boots}" rel="stylesheet" />
	<link href="${sidebar}" rel="stylesheet"/>
	<link href="${main}" rel="stylesheet"/>
	
	<spring:url value="/resource/js/jquery-1.11.1.js" var="jqueries" />
	<script src="${jqueries}" type="text/javascript" ></script>
	
	<spring:url value="/resource/js/jquery.validate.js" var="validate" />
	<script src="${validate}" type="text/javascript" ></script>
	
	<spring:url value="/resource/js/jquery.form.js" var="jform" />
	<script src="${jform}" type="text/javascript" ></script>
	
	<spring:url value="/resource/js/ajaxSubmit.js" var="ajaxSubmit" />
	<script src="${ajaxSubmit}" type="text/javascript" ></script>
	
	<spring:url value="/resource/js/additional-methods.js" var="additional" />
	<script src="${additional}" type="text/javascript" ></script>
	
	<spring:url value="/resource/js/mainPage.js" var="main" />
	<script src="${main}" type="text/javascript" ></script>
	
	<spring:url value="/resource/js/firePro.js" var="firepro" />
	<script src="${firepro}" type="text/javascript" ></script>
	
	<spring:url value="/resource/js/comintent.js" var="comintent" />
	<script src="${comintent}" type="text/javascript" ></script>
	
	
	<spring:url value="/resource/js/bootstrap.min.js" var="js" />
	<script src="${js}" type="text/javascript"></script>

  </head>
  

  <body>

  <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
           
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="${pageContext.request.contextPath}">Risk Assesment Calculator</a>
			</div>
			
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		 <ul class="nav navbar-nav">
		  <li class="dropdown">
		  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Komintenti <span class="caret"></span></a>
          <ul class="dropdown-menu">
          <spring:url value="/comintents" var="comintents"/>
            <li><a href="${comintents}">Unos komintenta</a></li>
             <spring:url value="/review" var="review"/>
            <li><a href="${review}">Pretraga komintenta</a></li>
		  </ul>
        </li>
        <li ><a href="<c:url value="/logout"/>">Logout<span class="sr-only">(current)</span></a></li>
        </ul>

		
		<ul class="nav navbar-nav navbar-right">	
		<li>
		<p class="navbar-text">
		<label style="color:white">Welcome, <security:authentication property="name"/></label>
		<spring:message code="risk.assesment"/>
        <span class="label label-danger"><spring:message code="bad"/></span>
        <span class="label label-warning"><spring:message code="medium"/></span>
        <span class="label label-success"><spring:message code="good"/></span>
        <span class="label"><a href="<%=request.getContextPath()%>?language=sr">Srb</a> | <a href="<%=request.getContextPath()%>?language=en">Eng</a></span>
        </p>
		</li>	
        </ul>
		</div>

	 </nav>


<!-- Sidebar -->
<div id="sidebar-wrapper">
<ul class="sidebar-nav">
<br><br><br>

<ul class="dropdown"  style=" position: static; margin-bottom: 5px; *width: 180px;">
  <spring:url value="/reports" var="report"/>
  <li><a href="${report}" >Izvestaj</a></li>
  <li class="dropdown-submenu">
  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Pregled izvestaja  <span class="caret"></span></a>
  <ul class="dropdown-menu">
    <spring:url value="/reviewComin" var="reviewComin"/>
    <a tabindex="-1" href="${reviewComin}">Stampaj</a>
   <spring:url value="/reports/reviewReportPass" var="reviewReportPass"/>
    <li><a href="${reviewReportPass}" tabindex="-1">Po komintentu</a></li>
    <spring:url value="/comintents/reviewAllComintents" var="reviewAllComintents"/>
      <li><a href="${reviewAllComintents}">svi komintenti</a></li>
    </ul>
  </li>
</ul>

    </ul>
  </ul>  
</div>
</div>


<div id="wrapper">
			<div class="main-admin">
				<jsp:doBody/>
			</div>
</div>
 			
 			<footer class="footer">
 			
 			</footer>

</body>

</html>