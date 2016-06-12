<!DOCTYPE html>
<%@ include file="/WEB-INF/tags/taglib.jsp" %>
<%@taglib prefix="page" tagdir="/WEB-INF/tags" %>

<page:template>
	<jsp:attribute name="title">
     	Review
     	
     	</jsp:attribute>
<jsp:body>

<br><br><br>

<spring:url value="/reports/betweenDate" var="betweenDate"></spring:url>
<form  method="GET" action="${betweenDate}" class="form-inline" id="fidComintF">

<div class="panel panel-default" style="height: calc(100vh - 145px)" >

<div class="panel-body" >

<div class="row" >

<div class="panel panel-default">

  <div class="panel-body">

<div class="form-group">
 <label for="reviewPass" ><spring:message code="review.password"/></label>
 <input class="form-control" placeholder="Sifra komintenta" style="width:130px" id="reviewPass" name="reviewPass" value="" >
</div>
<div class="form-group">
    <label for="nameCompany"><spring:message code="review.name"/></label>
    <input id="rewienameCompany" placeholder="Naziv preduzeca" class="form-control" name="rewienameCompany" value=""  />
</div>


<button type="submit" class="btn btn-default" id="comintButton">Prikazi</button>
<br><br><br>
<%@ include file="/WEB-INF/tags/tableComintents.jsp" %>

</div>
</div>
</div>
</div>
</div>

</form>


</jsp:body>

</page:template>