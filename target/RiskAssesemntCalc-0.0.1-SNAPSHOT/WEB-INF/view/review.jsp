<!DOCTYPE html>
<%@ include file="/WEB-INF/tags/taglib.jsp" %>
<%@taglib prefix="page" tagdir="/WEB-INF/tags" %>

<page:template>
	<jsp:attribute name="title">
     	Review
     	
     	</jsp:attribute>
<jsp:body>

<br><br><br>

<!-- //napraviti GET method sa @PathParam -->
<form  method="POST" action="${PDFControll}" target="_blank">

<div class="panel panel-default" style="height: calc(100vh - 145px)" >

<div class="panel-body" >

<div class="row" >
 <div class="col-md-4 col-md-offset-1">
<div class="panel panel-default">

  <div class="panel-body">
  
<div class="form-group">
    <label for=numReport><spring:message code="review.numReport"/></label>
    <input id="numReport" placeholder="Broj izvestaja" class="form-control" name="numReport"/>
</div>
<div class="form-group">
 <label for="reviewPass" ><spring:message code="review.password"/></label>
 <input type="text" placeholder="Sifra komintenta" style="width:110px" id="reviewPass" name="reviewPass" >
</div>
<div class="form-group">
    <label for="nameCompany"><spring:message code="review.name"/></label>
    <input id="nameCompany" placeholder="Naziv preduzeca" class="form-control" name="reviewNameCompany" />
</div>
<div class="form-group">
    <label for="pib"><spring:message code="review.pib"/></label>
    <input class="form-control" id="pib" placeholder="PIB" name="reviewPib"/>
</div>
<div class="form-group">
    <label for="mb" ><spring:message code="review.mb"/></label>
    <input class="form-control" id="mb" placeholder="Maticni broj" name="reviewMb" />
</div>

<button type="button" class="btn btn-default" id="comintButton">Prikazi</button>

</div>
</div>
</div>
</div>

</div>
</div>


<%@ include file="/WEB-INF/tags/reviewPagination.jsp" %>
</form>
</jsp:body>

</page:template>