<!DOCTYPE html>
<%@ include file="/WEB-INF/tags/taglib.jsp" %>
<%@taglib prefix="page" tagdir="/WEB-INF/tags" %>

<page:template>
	<jsp:attribute name="title">
     	Review
     	
     	</jsp:attribute>
<jsp:body>

<br><br>

<div class="panel panel-default" style="height: calc(100vh - 145px)" >

<div class="panel-body" >

<br>

  <h2>Pregled izvestaja po svim klijentima</h2>
  <br><br>
<c:url value="/reports" var="reportsReview" ></c:url>
<form method="get" action="${reportsReview}">
<table class="table table-condensed">
    <thead>
      <tr>
        <th>R.Br.</th>
        <th>Naziv klijenta</th>
        <th>Broj izvestaja</th>
        <th>Datum izrade</th>
        <th>Prikazi</th>
        <th>Stampaj</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${comAll}" var="comAll">
      <tr class="info">
      <td><c:out value="${comAll.id_comintents }"></c:out></td>
      <td><c:out value="${comAll.name}"></c:out></td>
    	<c:forEach items="${comAll.reportComintents}" var="reportComintents">
      <input type="hidden" value="${reportComintents.id_report}" name="reportNumS"/>
      <td ><c:out value="${reportComintents.toString()}"/></td>
      <input type="hidden" value="${reportComintents.toString()}" name="reportNumS"/>
      <td><c:out value="${reportComintents.dateAndTime}"></c:out></td>
      </c:forEach>

        <td><div class="form-group"> 
		<button type="submit" class="btn btn-info btn-sm" id="showReport"  name="showReport" value="Prikazi"><span class="glyphicon glyphicon-open" aria-hidden="true">Pregled</span></button>
		</div>  
		</td>
        <td><div class="form-group">
		<button type="submit" class="btn btn-info btn-sm" id="stampaj" name="stampaj" value="Stampaj" ><span class="glyphicon glyphicon-print" aria-hidden="true">Stampaj</span></button>
		</div>
		</td>
    
     </tr>
     </c:forEach>
    </tbody>
  </table>
  
  </form>
</div>
</div>

<%@ include file="/WEB-INF/tags/reviewPagination.jsp" %>

</jsp:body>

</page:template>