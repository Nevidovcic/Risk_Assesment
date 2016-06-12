<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="page" tagdir="/WEB-INF/tags" %>

<page:template>
	<jsp:attribute name="title">
     	Ex
    </jsp:attribute>
<jsp:body>

<form:form commandName="ex" method="post" id="ex"  >

<form:hidden path="id_ex" id="id_ex"/>

<form:hidden path="markEx" id="markEx"/>

<br><br>

<div class="row">

<div class="col-md-offset-1">
<div class="col-md-3">

<h1><spring:message code="ex"/></h1>

</div>
</div>

<!-- label for risk mark -->
<br>
<div class="col-md-offset-6">
<h4>
<c:set var="marker" value="${ex.markEx}" />
<c:choose>
  <c:when test="${marker=='LOS'}">
      <span class="label label-danger"><c:out value="${ex.markEx}" /></span>            
  </c:when>
  <c:when test="${marker=='OSREDNJI'}">
       <span class="label label-warning"><c:out value="${ex.markEx}" /></span> 
  </c:when>
  <c:when test="${marker=='DOBAR'}">
      <span class="label label-success"><c:out value="${ex.markEx}" /></span>
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
 <label ><spring:message code="ex.studyOfDangerosZone"/></label>
 <label class="radio-inline"><form:radiobutton path="studyOfDangerosZone"  id="studyOfDangerosZoneYes" value="Da" name="studyOfDangerosZone"/>Da</label>
  <label class="radio-inline"><form:radiobutton path="studyOfDangerosZone" id="studyOfDangerosZoneNo" value="Ne" name="studyOfDangerosZone" />Ne</label>
 <form:errors path="studyOfDangerosZone" cssClass="eror"></form:errors>
 </div>
 </div>
 <hr>
 <div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="ex.exCertificate"/></label>
 <label class="radio-inline"><form:radiobutton path="exCertificate"  id="exCertificateYes" value="Da" name="exCertificate"/>Da</label>
  <label class="radio-inline"><form:radiobutton path="exCertificate" id="exCertificateNo" value="Ne" name="exCertificate" />Ne</label>
 <form:errors path="exCertificate" cssClass="eror"></form:errors>
 </div>
 </div>
<hr>
<div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="ex.controlExEquipment"/></label>
 <label class="radio-inline"><form:radiobutton path="controlExEquipment"  id="controlExEquipmentYes" value="Da" name="controlExEquipment"/>Da</label>
  <label class="radio-inline"><form:radiobutton path="controlExEquipment" id="controlExEquipmentNo" value="Ne" name="controlExEquipment" />Ne</label>
 <form:errors path="controlExEquipment" cssClass="eror"></form:errors>
 </div>
 </div>
 <hr>
 <div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="ex.controlExInstalation"/></label>
 <label class="radio-inline"><form:radiobutton path="controlExInstalation"  id="controlExInstalationYes" value="Da" name="controlExInstalation"/>Da</label>
  <label class="radio-inline"><form:radiobutton path="controlExInstalation" id="controlExInstalationNo" value="Ne" name="controlExInstalation" />Ne</label>
 <form:errors path="controlExInstalation" cssClass="eror"></form:errors>
 </div>
 </div>
 <hr>
 <div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="ex.instalationExGasDetection"/></label>
 <label class="radio-inline"><form:radiobutton path="instalationExGasDetection"  id="instalationExGasDetectionYes" value="Da" name="instalationExGasDetection"/>Da</label>
  <label class="radio-inline"><form:radiobutton path="instalationExGasDetection" id="instalationExGasDetectionNo" value="Ne" name="instalationExGasDetection" />Ne</label>
 <form:errors path="instalationExGasDetection" cssClass="eror"></form:errors>
 </div>
 </div>
 <hr>
 <div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="ex.controlExGasDetection"/></label>
 <label class="radio-inline"><form:radiobutton path="controlExGasDetection"  id="controlExGasDetectionYes" value="Da" name="controlExGasDetection"/>Da</label>
  <label class="radio-inline"><form:radiobutton path="controlExGasDetection" id="controlExGasDetectionNo" value="Ne" name="controlExGasDetection" />Ne</label>
 <form:errors path="controlExGasDetection" cssClass="eror"></form:errors>
 </div>
 </div>
 <hr>
 <div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="ex.protectionOfElectricalOvervoltage"/></label>
 <label class="radio-inline"><form:radiobutton path="protectionOfElectricalOvervoltage"  id="protectionOfElectricalOvervoltageYes" value="Da" name="protectionOfElectricalOvervoltage"/>Da</label>
  <label class="radio-inline"><form:radiobutton path="protectionOfElectricalOvervoltage" id="protectionOfElectricalOvervoltageNo" value="Ne" name="protectionOfElectricalOvervoltage" />Ne</label>
 <form:errors path="protectionOfElectricalOvervoltage" cssClass="eror"></form:errors>
 </div>
 </div>
 

<div class="row">

<div class="col-md-offset-11">
<input type="submit" value="Snimi" id="submit" >
</div>
 </div>

 </div>
</div>
</div>



</form:form>

</jsp:body>

</page:template>