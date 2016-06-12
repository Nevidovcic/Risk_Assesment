<!DOCTYPE html>
<%@ include file="/WEB-INF/tags/taglib.jsp" %>
<%@taglib prefix="page" tagdir="/WEB-INF/tags" %>

<page:template>
	<jsp:attribute name="title">
     	Comintents
    </jsp:attribute>
<jsp:body>

<form:form commandName="comintent" method="post" id="comintentsF" name="comintentsF" action="" >
<form:hidden path="id_comintents" id="id_comintent"/>
<br><br><br><br><br>

<div class="row" >
 <div class="col-md-4 col-md-offset-1">
<div class="panel panel-default">

  <div class="panel-body">
<div class="row">
 <label ><spring:message code="comint"/></label>
 <input type="text" disabled="disabled" value="${comintent.password}" style="width:40px" name="password" id="password" >
</div>
<hr>
<br>
<div id="sPhoneFromResponse" value="uspesno ste snimili "></div>  
<div class="form-group">
    <label for="nameCompany"><spring:message code="comint.name"/></label>
    <form:input path="name" id="nameCompany" placeholder="Naziv preduzeca" class="form-control"  />
    <form:errors path="name" cssClass="eror"></form:errors>
</div>
<div class="form-group">
    <label for="pib"><spring:message code="comint.pib"/></label>
    <form:input path="pib" class="form-control" id="pib" placeholder="PIB" name="pib"/>
     <form:errors path="pib" cssClass="eror"></form:errors>
</div>
<div class="form-group">
    <label for="mb" ><spring:message code="comint.mb"/></label>
    <form:input path="mb" class="form-control" id="mb" placeholder="Maticni broj" name="mb"/>
    <form:errors path="mb" cssClass="eror"></form:errors>
</div>
<div class="form-group">
    <label for="activity"><spring:message code="comint.activity"/></label>
    <form:input path="activityOfCompany" class="form-control" id="activity" name="activity" placeholder="Delatnost preduzeca"/>
    <form:errors path="activityOfCompany" cssClass="eror"></form:errors>
</div>

<button type="submit" class="btn btn-default" id="comintButton" name="comintButton" >Snimi</button>
<button type="button" class="btn btn-default" id="comintButtonChange" name="comintButtonChange">Izmeni</button>

</div>
</div>
</div>
</div>

</form:form>
</jsp:body>
</page:template>