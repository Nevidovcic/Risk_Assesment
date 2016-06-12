<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="page" tagdir="/WEB-INF/tags" %>

<page:template>
	<jsp:attribute name="title">
     	Fire Protection
    </jsp:attribute>
    <jsp:body>


<form:form commandName="protection" method="post" id="firePro" >

<form:hidden path="id_protection" id="id"/>

<form:hidden path="mark" id="mark"/>

<div class="row">

<div class="col-md-offset-1">
<div class="col-md-6 ">

<br><br>
<h1><spring:message code="firepro"/></h1>
<hr>

<div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="firepro.fenced"/></label>
 
 <label class="radio-inline"><form:radiobutton path="fenced"  id="fencedYes" value="Da" name="fenced"/>Da</label>
  <label class="radio-inline"><form:radiobutton path="fenced" id="fencedNo" value="Ne" name="fenced" />Ne</label>
 <form:errors path="fenced" cssClass="eror"></form:errors>
 </div>
 </div>
 
 <div class="form-group">
   <div class="well well-sm">
   <label ><spring:message code="firepro.illuminated"/></label>
 <label class="radio-inline"><form:radiobutton path="illuminated" id="illuminatedYes" value="Da" name="illuminated" />Da</label>
  <label class="radio-inline"><form:radiobutton path="illuminated" id="illuminatedNo" value="Ne" name="illuminated"/>Ne</label>
  <form:errors path="illuminated" cssClass="eror"></form:errors>
 </div>
 </div>
 
 <div class="form-group">
  <div class="well well-sm">
 <label ><spring:message code="firepro.fireBrigade"/></label>
<label class="radio-inline"><form:radiobutton path="fireBrigade" id="fireBrigadeYes" value="Da" name="fireBrigade" />Da</label>
<label class="radio-inline"><form:radiobutton path="fireBrigade" id="fireBrigadeNo" value="Ne" name="fireBrigade"/>Ne</label>
<form:errors path="fireBrigade" cssClass="eror"></form:errors>
 </div>
 </div>

 <div class="form-group">
  <div class="well well-sm">
   <label ><spring:message code="firepro.security"/></label>
<label class="radio-inline"><form:radiobutton path="security" id="securityYes" value="Da" name="security" />Da</label>
<label class="radio-inline"><form:radiobutton path="security" id="securityNo" value="Ne" name="security" />Ne</label>
<form:errors path="security" cssClass="eror"></form:errors>
</div>
</div>
							
<div class="form-group">
 <div class="well well-sm">
  <label><spring:message code="firepro.fireProtectionMan"/></label>
  <label class="radio-inline"><form:radiobutton path="fireProtectionMan" id="fireProtectionManYes" value="Da" name="fireMan"  />Da</label>
<label class="radio-inline"><form:radiobutton path="fireProtectionMan" id="fireProtectionManNo" value="Ne" name="fireMan" />Ne</label>
<form:errors path="fireProtectionMan" cssClass="eror"></form:errors>
</div>
 </div>
 
   <!--  hidrantska -->
   
 <div class="form-group" >

  <div class="panel panel-default" >
  <div class="panel-heading">
    <h3 class="panel-title"><spring:message code="firepro.hydrant"/></h3>
  </div>
  <div class="panel-body" >
   <label ><spring:message code="firepro.hydrants"/></label>
<label class="radio-inline"><form:radiobutton path="hydrant.hydrants" id="hydrantsYes" value="Da" name="hydrants"/>Da</label>
<label class="radio-inline"><form:radiobutton path="hydrant.hydrants" id="hydrantsNo" value="Ne" name="hydrants" />Ne</label>
<form:errors path="hydrant.hydrants" cssClass="eror"></form:errors>
<br>
<label ><spring:message code="firepro.hydrantsPressure"/></label>
<label class="radio-inline"><form:radiobutton path="hydrant.hydrantsPressure" id="hydrantsPressureYes" value="Da" disabled="true" name="hydranstPressure" />Da</label>
<label class="radio-inline"><form:radiobutton path="hydrant.hydrantsPressure" id="hydrantsPressureNo" value="Ne" disabled="true" name="hydranstPressure"/>Ne</label>
<form:errors path="hydrant.hydrantsPressure" cssClass="eror"></form:errors>
 <br>
  <label ><spring:message code="firepro.hydrantsCabAffordable"/></label>
 <label class="radio-inline"><form:radiobutton path="hydrant.hydrantsCabAffordable" id="hydrantsCabAffordableYes" value="Da" disabled="true" name="hydrantsCabAffordable" />Da</label>
<label class="radio-inline"><form:radiobutton path="hydrant.hydrantsCabAffordable" id="hydrantsCabAffordableNo" value="Ne" disabled="true" name="hydrantsCabAffordable" />Ne</label>
 <form:errors path="hydrant.hydrantsCabAffordable" cssClass="eror"></form:errors>
 <br>
  <label ><spring:message code="firepro.hydrantsCabEqquiped"/></label>
 <label class="radio-inline"><form:radiobutton path="hydrant.hydrantsCabEqquiped" id="hydrantsCabEqquipedYes" value="Da" disabled="true" name="hydrantsCabEqquiped" />Da</label>
<label class="radio-inline"><form:radiobutton path="hydrant.hydrantsCabEqquiped" id="hydrantsCabEqquipedNo" value="Ne" disabled="true" name="hydrantsCabEqquiped"/>Ne</label>
 <form:errors path="hydrant.hydrantsCabEqquiped" cssClass="eror"></form:errors>
</div>
</div>
</div>


<!-- PP aparati -->

<div class="form-group">
  <div class="panel panel-default">
  <div class="panel-heading">
    <h3 class="panel-title"><spring:message code="firepro.fireExtings"/></h3>
  </div>
<div class="panel-body">
<div class="right hydrant-group">
<label ><spring:message code="firepro.fireExting"/></label>
<label class="radio-inline"><form:radiobutton  path="fireExtinguisher.fireExting" id="fireExtingYes" value="Da" name="fireExting" />Da</label>
<label class="radio-inline"><form:radiobutton path="fireExtinguisher.fireExting" id="fireExtingNo" value="Ne" name="fireExting" />Ne</label>
 <form:errors path="fireExtinguisher.fireExting" cssClass="eror"></form:errors>
<br>
<label ><spring:message code="firepro.fireExtingNumb"/></label>
<label class="radio-inline"><form:radiobutton path="fireExtinguisher.fireExtingNumb" id="fireExtingNumbYes" value="Da" disabled="true" name="fireExtingNumb"/>Da</label>
<label class="radio-inline"><form:radiobutton path="fireExtinguisher.fireExtingNumb" id="fireExtingNumbNo" value="Ne" disabled="true" name="fireExtingNumb" />Ne</label>
 <form:errors path="fireExtinguisher.fireExtingNumb" cssClass="eror"></form:errors>
<br>
<label ><spring:message code="firepro.fireExtingProbe"/></label>
<label class="radio-inline"><form:radiobutton path="fireExtinguisher.fireExtingProbe" id="fireExtingProbeYes" value="Da" disabled="true" name="fireExtingProbe"/>Da</label>
<label class="radio-inline"><form:radiobutton path="fireExtinguisher.fireExtingProbe" id="fireExtingProbeNo" value="Ne" disabled="true" name="fireExtingProbe" />Ne</label>
 <form:errors path="fireExtinguisher.fireExtingProbe" cssClass="eror"></form:errors>
</div>
</div>
</div>
</div>
</div> 

<div class="col-md-6">
<br><br><br>

<!-- label for risk mark -->

<div class="col-md-offset-10">
<h4>
<c:set var="marker" value="${protection.mark}" />
<c:choose>
  <c:when test="${marker=='LOS'}">
      <span class="label label-danger"><c:out value="${protection.mark}" /></span>            
  </c:when>
  <c:when test="${marker=='OSREDNJI'}">
       <span class="label label-warning"><c:out value="${protection.mark}" /></span> 
  </c:when>
  <c:when test="${marker=='DOBAR'}">
      <span class="label label-success"><c:out value="${protection.mark}" /></span>
  </c:when>
  <c:otherwise>
    <span class="label label-default">OCENA</span>
</c:otherwise>
</c:choose> 
</h4>
</div>

<br><br>

<!-- Gomobranska -->

<div class="form-group">
  <div class="panel panel-default">
  <div class="panel-heading">
    <h3 class="panel-title"><spring:message code="firepro.lightningRods"/></h3>
  </div>
  <div class="panel-body">
<label ><spring:message code="firepro.lightningRod"/></label>
<label class="radio-inline"><form:radiobutton path="lightningConductor.lightningRod" id="lightningRodYes" value="Da" name="lightningRod" />Da</label>
<label class="radio-inline"><form:radiobutton path="lightningConductor.lightningRod" id="lightningRodNo" value="Ne" name="lightningRod" />Ne</label>
 <form:errors path="lightningConductor.lightningRod" cssClass="eror"></form:errors>
 <br>
<label ><spring:message code="firepro.lightningRodProbe"/></label>
<label class="radio-inline"><form:radiobutton path="lightningConductor.lightningRodProbe" id="lightningRodProbeYes" value="Da" disabled="true" name="lightningRodProbe" />Da</label>
<label class="radio-inline"><form:radiobutton path="lightningConductor.lightningRodProbe" id="lightningRodProbeNo" value="Ne" disabled="true" name="lightningRodProbe" />Ne</label>
 <form:errors path="lightningConductor.lightningRodProbe" cssClass="eror"></form:errors>
 <br>
  <label ><spring:message code="firepro.lightningRodFunct"/></label>
<label class="radio-inline"><form:radiobutton path="lightningConductor.lightningRodFunct" id="lightningRodFunctYes" value="Da" disabled="true" name="lightningRodFunct"/>Da</label>
<label class="radio-inline"><form:radiobutton path="lightningConductor.lightningRodFunct" id="lightningRodFunctNo" value="Ne" disabled="true" name="lightningRodFunct"/>Ne</label>
 <form:errors path="lightningConductor.lightningRodFunct" cssClass="eror"></form:errors>
 <br>
    </div>
</div>
</div>

<!-- instalacija za dojavu pozara -->

<div class="form-group">
<div class="panel panel-default">
  <div class="panel-heading">
    <h3 class="panel-title"><spring:message code="firepro.fireReports"/></h3>
  </div>
  <div class="panel-body">
<label ><spring:message code="firepro.fireReport"/></label>
<label class="radio-inline"><form:radiobutton path="fireAlarm.fireReport" id="fireReportYes" value="Da" name="fireReport" />Da</label>
<label class="radio-inline"><form:radiobutton path="fireAlarm.fireReport" id="fireReportNo" value="Ne" name="fireReport" />Ne</label>
  <form:errors path="fireAlarm.fireReport" cssClass="eror"></form:errors>
 <br>
<label ><spring:message code="firepro.fireReportProbe"/></label>
<label class="radio-inline"><form:radiobutton path="fireAlarm.fireReportProbe" id="fireReportProbeYes" value="Da" disabled="true" name="fireReportProbe" />Da</label>
<label class="radio-inline"><form:radiobutton path="fireAlarm.fireReportProbe" id="fireReportProbeNo" value="Ne" disabled="true" name="fireReportProbe" />Ne</label>
 <form:errors path="fireAlarm.fireReportProbe" cssClass="eror"></form:errors>
 <br>
  <label ><spring:message code="firepro.fireReportMonitord"/></label>
<label class="radio-inline"><form:radiobutton path="fireAlarm.fireReportMonitord" id="fireReportMonitordYes" value="Da" disabled="true" name="fireReportMonitord" />Da</label>
<label class="radio-inline"><form:radiobutton path="fireAlarm.fireReportMonitord" id="fireReportMonitordNo" value="Ne" disabled="true" name="fireReportMonitord" />Ne</label>
<form:errors path="fireAlarm.fireReportMonitord" cssClass="eror"></form:errors> 
 <br>
    </div>
</div>
</div>


<!-- instalacija za gasenje pozara -->

<div class="form-group">
<div class="panel panel-default" id="panel">
  <div class="panel-heading">
    <h3 class="panel-title"><spring:message code="firepro.fireFigtingInstals"/></h3>
  </div>
  <div class="panel-body">
<label ><spring:message code="firepro.fireFigtingInstal"/></label>
<label class="radio-inline"><form:radiobutton path="fireFightingIns.fireFigtingInstal" id="fireFigtingInstalYes" value="Da" name="fireFigtingInstal" />Da</label>
<label class="radio-inline"><form:radiobutton path="fireFightingIns.fireFigtingInstal" id="fireFigtingInstalNo" value="Ne" name="fireFigtingInstal" />Ne</label>
 <form:errors path="fireFightingIns.fireFigtingInstal" cssClass="eror"></form:errors> 
 <br>
<label ><spring:message code="firepro.fireFigtingInstProbe"/></label>
<label class="radio-inline"><form:radiobutton path="fireFightingIns.fireFigtingInstProbe" id="fireFigtingInstProbeYes" value="Da" disabled="true" name="fireFigtingInstProbe" />Da</label>
<label class="radio-inline"><form:radiobutton path="fireFightingIns.fireFigtingInstProbe" id="fireFigtingInstProbeNo" value="Ne" disabled="true" name="fireFigtingInstProbe"  />Ne</label>
 <form:errors path="fireFightingIns.fireFigtingInstProbe" cssClass="eror"></form:errors> 
 <br>
  <label ><spring:message code="firepor.fireFigtingInstFunct"/></label>
<label class="radio-inline"><form:radiobutton path="fireFightingIns.fireFigtingInstFunct" id="fireFigtingInstFunctYes" value="Da" disabled="true" name="fireFigtingInstFunct" />Da</label>
<label class="radio-inline"><form:radiobutton path="fireFightingIns.fireFigtingInstFunct" id="fireFigtingInstFunctNo" value="Ne" disabled="true" name="fireFigtingInstFunct"/>Ne</label>
  <form:errors path="fireFightingIns.fireFigtingInstFunct" cssClass="eror"></form:errors>
 <br>
    </div>
</div>
</div>


<!-- protivprovalni sistem -->

<div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="firepro.theftSystem"/></label>
<label class="radio-inline"><form:radiobutton path="theftSystem" id="theftSystemYes" value="Da" name="theftSystem" />Da</label>
<label class="radio-inline"><form:radiobutton path="theftSystem" id="theftSystemNo" value="Ne" name="theftSystem" />Ne</label>
 <form:errors path="theftSystem" cssClass="eror"></form:errors>
 </div>
 </div>
 
 <!-- video nadzor -->
 
 <div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="firepro.videoSurve"/></label>
<label class="radio-inline"><form:radiobutton path="videoSurve" id="videoSurveYes" value="Da" name="videoSurve" />Da</label>
<label class="radio-inline"><form:radiobutton path="videoSurve" id="videoSurveNo" value="Ne" name="videoSurve" />Ne</label>
 <form:errors path="videoSurve" cssClass="eror"></form:errors>
 </div>
 </div>
 
<div class="col-md-offset-11">
<div class="row">

<input type="submit" value="Snimi" id="submit" >
</div>
 </div>
 </div>
</div>
</div>

</form:form>

</jsp:body>

</page:template>