<!DOCTYPE html>
<%@ include file="/WEB-INF/tags/taglib.jsp" %>
<%@taglib prefix="page" tagdir="/WEB-INF/tags" %>

<page:template>
	<jsp:attribute name="title">
     	Review
     	
     	</jsp:attribute>
<jsp:body>

<br><br><br>

<spring:url value="/comintents/findComintents" var="findComintents"></spring:url>
<form  method="GET" action="${findComintents}" class="form-inline" id="fidComintF">

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
<div class="form-group">
    <label for="pib"><spring:message code="review.pib"/></label>
    <input class="form-control" id="pib" placeholder="PIB" name="reviewPib" id="reviewPib" value="" />
</div>
<div class="form-group">
    <label for="mb" ><spring:message code="review.mb"/></label>
    <input class="form-control" id="mb" placeholder="Maticni broj" name="reviewMb" id="reviewMb" value=""  />
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