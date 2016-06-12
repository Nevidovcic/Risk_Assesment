<!DOCTYPE html>
<%@ include file="/WEB-INF/tags/taglib.jsp" %>
<%@taglib prefix="page" tagdir="/WEB-INF/tags" %>

<page:template>
	<jsp:attribute name="title">
     	Review commintents
     	
     	</jsp:attribute>
<jsp:body>

<br><br>

<div class="panel panel-default" style="height: calc(100vh - 145px)" >

<div class="panel-body" >

<br>

  <h2>Pregled svih klijenata</h2>
  <br><br>

<table class="table table-condensed">
    <thead>
      <tr>
        <th>R.Br.</th>
        <th>Naziv komintenta</th>
        <th>PIB</th>
        <th>Maticni broj </th>
        <th>Delatnost komintenta</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${comintentsAll}" var="allComintents">
      <tr class="info">
      <td><c:out value="${allComintents.id_comintents }"></c:out></td>
      <td><c:out value="${allComintents.name}"></c:out></td>
       <td><c:out value="${allComintents.pib}"></c:out></td>
         <td><c:out value="${allComintents.mb}"></c:out></td>
      <td><c:out value="${allComintents.activityOfCompany}"></c:out></td>
      </tr>
     </c:forEach>
    </tbody>
  </table>
</div>
</div>

<%@ include file="/WEB-INF/tags/reviewPagination.jsp" %>

</jsp:body>

</page:template>