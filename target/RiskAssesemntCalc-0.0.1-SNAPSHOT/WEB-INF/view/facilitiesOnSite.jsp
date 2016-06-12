<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="page" tagdir="/WEB-INF/tags" %>

<page:template>
	<jsp:attribute name="title">
     	Facilities on site
    </jsp:attribute>
<jsp:body>

<form:form commandName="facilitiesOnSite" method="post" id="facilities" >

<form:hidden path="id_facilities" id="idFacilities"/>

<form:hidden path="markFacilities" id="markFaci"/>

<br><br>

<div class="row">

<div class="col-md-offset-1">
<div class="col-md-1">

<h1><spring:message code="facilities"/></h1>

</div>
</div>

<!-- label for risk mark -->
<br>
<div class="col-md-offset-6">
<h4>
<c:set var="marker" value="${facilitiesOnSite.markFacilities}" />
<c:choose>
  <c:when test="${marker=='LOS'}">
      <span class="label label-danger"><c:out value="${facilitiesOnSite.markFacilities}" /></span>            
  </c:when>
  <c:when test="${marker=='OSREDNJI'}">
       <span class="label label-warning"><c:out value="${facilitiesOnSite.markFacilities}" /></span> 
  </c:when>
  <c:when test="${marker=='DOBAR'}">
      <span class="label label-success"><c:out value="${facilitiesOnSite.markFacilities}" /></span>
  </c:when>
  <c:otherwise>
    <span class="label label-default">OCENA</span>
</c:otherwise>
</c:choose> 
</h4>
</div>
</div>

<div class="row">

<div class="col-md-offset-1">
<div class="col-md-6 ">
<hr>
<div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="facilities.accesLocation"/> </label>
 <label class="radio-inline"><form:radiobutton  path="accessLocation" value="sa sve 4 strane" />sa sve 4 strane</label>
  <label class="radio-inline"><form:radiobutton  path="accessLocation" value="sa 3 strane" />sa 3 strane</label>
	<label class="radio-inline"><form:radiobutton  path="accessLocation" value="sa 2 strane" />sa 2 strane</label>
<form:errors path="accessLocation" cssClass="eror"></form:errors>
 </div>
 </div>
 
<div class="form-group" >

  <div class="panel panel-default">
  <div class="panel-heading">
    <h3 class="panel-title"><spring:message code="facilities.neighbor"/></h3>
  </div>
  <div class="panel-body" >
   <label ><spring:message code="facilities.neighborsPresence"/></label>
<label class="radio-inline"><form:radiobutton path="neighbor.neighborsPresence" id="neighborsPresenceYes" value="Da" name="neighborsPresence"/>Da</label>
<label class="radio-inline"><form:radiobutton path="neighbor.neighborsPresence" id="neighborsPresenceNo" value="Ne" name="neighborsPresence" />Ne</label>
<form:errors path="neighbor.neighborsPresence" cssClass="eror"></form:errors>
<br>
<label ><spring:message code="facilities.neighborsActivity"/></label>
<label class="radio-inline"><form:radiobutton path="neighbor.neighborsActivity" id="neighborsActivityYes" value="Da" name="neighborsActivity" />Da</label>
<label class="radio-inline"><form:radiobutton path="neighbor.neighborsActivity" id="neighborsActivityNo" value="Ne"  name="neighborsActivity"/>Ne</label>
<form:errors path="neighbor.neighborsActivity" cssClass="eror"></form:errors>

</div>
</div>
					
 <div class="form-group">
  <div class="well well-sm">
   <label ><spring:message code="facilities.construction"/></label>
<label class="radio-inline"><form:radiobutton path="objectConstruction" value="Betonska" id="constructionConcret" />Betonska</label>
<label class="radio-inline"><form:radiobutton path="objectConstruction" value="Celicna" id="cosntructionSteel" />Celicna</label>
<label class="radio-inline"><form:radiobutton path="objectConstruction" value="Drvena" id="constructionWood"/>Drvena</label>
<form:errors path="objectConstruction" cssClass="eror"></form:errors>
</div>
</div>
 
 <div class="form-group">
 <div class="well well-sm">
  <label><spring:message code="facilities.exteriorWalls"/></label>
  <label class="radio-inline"><form:radiobutton path="exteriorWalls" value="Cigla" id="wallsBrick" />Cigla</label>
<label class="radio-inline"><form:radiobutton path="exteriorWalls" value="Beton" id="wallsConcret" />Beton</label>
<label class="radio-inline"><form:radiobutton path="exteriorWalls" value="Paneli od straklene vune" id="wallsWoolsPanel" />Paneli od straklene vune</label>
<label class="radio-inline"><form:radiobutton path="exteriorWalls" value="Paneli od poliuretana" id="wallsUrethanPanel" />Paneli od poliuretana</label>
<label class="radio-inline"><form:radiobutton path="exteriorWalls" value="Drvene ploce" id="wallsWood" />Drvene ploce</label>
<form:errors path="exteriorWalls" cssClass="eror"></form:errors>
</div>
 </div>

 <div class="form-group">
 <div class="well well-sm">
  <label><spring:message code="facilities.roofConstruction"/></label>
<label class="radio-inline"><form:radiobutton path="roofConstruction" value="Betonska" id="roofConstConcret"/>Betonska</label>
<label class="radio-inline"><form:radiobutton path="roofConstruction" value="Celicna" id="roofConstSteel" />Celicna</label>
<label class="radio-inline"><form:radiobutton path="roofConstruction" value="Drvena" id="roofConstWood" />Drvena</label>
<form:errors path="roofConstruction" cssClass="eror"></form:errors>
</div>
 </div>
 
 <div class="form-group">
 <div class="well well-sm">
  <label><spring:message code="facilities.roofCover"/></label>
<label class="radio-inline"><form:radiobutton path="roofCover" value="Crep" id="roofCoverTile" />Betonska</label>
<label class="radio-inline"><form:radiobutton path="roofCover" value="Paneli od straklene vune" id="roofCoverWoolsPanel" />Paneli od straklene vune</label>
<label class="radio-inline"><form:radiobutton path="roofCover" value="Paneli od poliuretana" id="roofCoverUrethanPanel" />Paneli od straklene vune</label>
<label class="radio-inline"><form:radiobutton path="roofCover" value="Sendvic lim"  id="roofCoverTin"/>Paneli od straklene vune</label>
<form:errors path="roofCover" cssClass="eror"></form:errors>
</div>
 </div>
 
<div class="col-md-offset-11">
<div class="row">
<input type="submit" value="Snimi"/>
</div>
 </div>
</div>
</div>
</div>
</div>

</form:form>


</jsp:body>

</page:template>