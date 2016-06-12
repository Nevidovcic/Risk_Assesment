<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/tags/taglib.jsp" %>
<%@taglib prefix="page" tagdir="/WEB-INF/tags" %>

<page:template>
	<jsp:attribute name="title">
     	Report
    </jsp:attribute>
<jsp:body>

  <c:url value="/reports" var="reports" ></c:url>
<form:form commandName="report" method="post" id="reportF" name="reportF" action="${reports }">
<form:hidden path="id_report" id="id_report"/>
<form:hidden path="numbReport" id="numberReport"/>
<form:hidden path="year" id="year"/>
<br><br><br>


  <ul class="nav nav-tabs">
    <li class="active"><a data-toggle="tab" href="#zastita">Protivpozarna zastita</a></li>
    <li><a data-toggle="tab" href="#objekti">Objekti</a></li>
    <li><a data-toggle="tab" href="#upravljanje">Upravljanje rizicima</a></li>
    <li><a data-toggle="tab" href="#ex">Ex izvedba</a></li>
   <jsp:include page="markReport.jsp" flush="true"></jsp:include>
  </ul>

<div class="tab-content">
    <div id="zastita" class="tab-pane fade in active">
	<jsp:include page="fireProtection2.jsp" flush="true"></jsp:include>
      </div>
    <div id="objekti" class="tab-pane fade">
      <jsp:include page="facilitiesOnSite2.jsp" flush="true"></jsp:include>
    </div>
    <div id="upravljanje" class="tab-pane fade">
      <jsp:include page="riskControll2.jsp" flush="true"></jsp:include>
    </div>
    <div id="ex" class="tab-pane fade">
       <jsp:include page="ex2.jsp" flush="true"></jsp:include>
    </div>
</div>


 <div class="row">

<div class="col-md-1 col-md-offset-1">
<c:url value="/pdfReport/${report.id_report}" var="PDFControll" ></c:url>
<a href="${PDFControll}" class="btn btn-info btn-sm" role="button" target="_blank" >Stampaj</a>
</div>
<div class=" col-md-offset-10">
<c:url value="/reports/${report.id_report}" var="updateReport" ></c:url>

<a class="btn btn-info btn-sm" href="${updateReport}" role="button">Prikazi</a>

<c:url value="/reports/delete/${report.id_report}" var="deleteReport" ></c:url>

<a class="btn btn-info btn-sm" href="${deleteReport}" role="button">Obrisi</a>
<!-- data-toggle="modal" data-target="reportModal" -->
<button type="submit" class="btn btn-info btn-sm" id="reportSub" >Snimi</button>
</div>
</div>

</form:form>
<!-- 
Modal 
  <div class="modal fade " id="reportModal" role="dialog">
    <div class="modal-dialog modal-sm">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title"></h4>
        </div>
        <div class="modal-body">
          <p>Da li ste sigurni da zelite da snimite izvestaj?</p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Ne</button>
          <button type="button" class="btn btn-default" id="SubForm" >Da</button>
        </div>
      </div>
    </div>
  </div>  -->

</jsp:body>
</page:template>