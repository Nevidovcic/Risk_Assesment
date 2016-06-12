<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="page" tagdir="/WEB-INF/tags" %>

<page:template>
	<jsp:attribute name="title">
     	Risk Controll
    </jsp:attribute>
<jsp:body>


<form:form commandName="riskControll" method="post" id="riskCont" >

<form:hidden path="id_riskControll" id="id_riskControll"/>

<form:hidden path="markRiskControls" id="markRiskControls"/>

<div class="row">

<div class="col-md-offset-1">

<div class="col-md-6 ">

<br><br>
<h1><spring:message code="controll"/></h1>
<hr>

<div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="controll.categoriesOfFireRisk"/></label>
 
 <label class="radio-inline"><form:radiobutton path="categoriesOfFireRisk"  id="categoriesOfFireRiskI" value="I" name="categoriesOfFireRisk"/>I</label>
  <label class="radio-inline"><form:radiobutton path="categoriesOfFireRisk" id="categoriesOfFireRiskII" value="II" name="categoriesOfFireRisk" />II</label>
    <label class="radio-inline"><form:radiobutton path="categoriesOfFireRisk" id="categoriesOfFireRiskIII" value="III" name="categoriesOfFireRisk" />II</label>
 <form:errors path="categoriesOfFireRisk" cssClass="eror"></form:errors>
 </div>
 </div>
 
 <div class="form-group">
   <div class="well well-sm">
   <label ><spring:message code="controll.planOfFireProtec"/></label>
 <label class="radio-inline"><form:radiobutton path="planOfFireProtec" id="planOfFireProtecYes" value="Da" name="planOfFireProtec" />Da</label>
  <label class="radio-inline"><form:radiobutton path="planOfFireProtec" id="planOfFireProtecNo" value="Ne" name="planOfFireProtec"/>Ne</label>
  <form:errors path="planOfFireProtec" cssClass="eror"></form:errors>
 </div>
 </div>
 
 <div class="form-group">
  <div class="well well-sm">
 <label ><spring:message code="controll.regulationOfFelding"/></label>
<label class="radio-inline"><form:radiobutton path="regulationOfFelding" id="regulationOfFeldingYes" value="Da" name="regulationOfFelding" />Da</label>
<label class="radio-inline"><form:radiobutton path="regulationOfFelding" id="regulationOfFeldingNo" value="Ne" name="regulationOfFelding"/>Ne</label>
<form:errors path="regulationOfFelding" cssClass="eror"></form:errors>
 </div>
 </div>

 <div class="form-group">
  <div class="well well-sm">
   <label ><spring:message code="controll.trainingEmployers"/></label>
<label class="radio-inline"><form:radiobutton path="trainingEmployers" id="trainingEmployersYes" value="Da" name="trainingEmployers" />Da</label>
<label class="radio-inline"><form:radiobutton path="trainingEmployers" id="trainingEmployersNo" value="Ne" name="trainingEmployers" />Ne</label>
<form:errors path="trainingEmployers" cssClass="eror"></form:errors>
</div>
</div>

							
<div class="form-group">
 <div class="well well-sm">
  <label><spring:message code="controll.storageBottleUnderPress"/></label>
  <label class="radio-inline"><form:radiobutton path="storageBottleUnderPress" id="storageBottleUnderPressYes" value="Da" name="storageBottleUnderPress" />Da</label>
<label class="radio-inline"><form:radiobutton path="storageBottleUnderPress" id="storageBottleUnderPressNo" value="Ne" name="storageBottleUnderPress" />Ne</label>
<form:errors path="storageBottleUnderPress" cssClass="eror"></form:errors>
</div>
 </div>
 
<div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="controll.forklift"/></label>
<label class="radio-inline"><form:radiobutton path="forklift" id="forkliftYes" value="Da" name="forklift" />Da</label>
<label class="radio-inline"><form:radiobutton path="forklift" id="forkliftNo" value="Ne" name="forklift" />Ne</label>
 <form:errors path="forklift" cssClass="eror"></form:errors>
 </div>
 </div>

 <div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="controll.smokingProhibition"/></label>
<label class="radio-inline"><form:radiobutton path="smokingProhibition" id="smokingProhibitionYes" value="Da" name="smokingProhibition" />Da</label>
<label class="radio-inline"><form:radiobutton path="smokingProhibition" id="smokingProhibitionNo" value="Ne" name="smokingProhibition" />Ne</label>
 <form:errors path="smokingProhibition" cssClass="eror"></form:errors>
 </div>
 </div>
 
  <div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="controll.cleanliness"/></label>
<label class="radio-inline"><form:radiobutton path="cleanliness" id="cleanlinessYes" value="Da" name="cleanliness" />Da</label>
<label class="radio-inline"><form:radiobutton path="cleanliness" id="cleanlinessNo" value="Ne" name="cleanliness" />Ne</label>
 <form:errors path="cleanliness" cssClass="eror"></form:errors>
 </div>
 </div>




  <div class="panel-group">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" href="#collapse1"><b><spring:message code="silotermometer"/></b></a>
        </h4>
      </div>
      <div id="collapse1" class="panel-collapse collapse">
<div class="panel-body" >

<label ><spring:message code="silotermometer.siloThermometer"/></label>
<label class="radio-inline"><form:radiobutton path="silotermometer.siloThermometer" id="siloThermometerYes" value="Da" name="siloThermometer"/>Da</label>
<label class="radio-inline"><form:radiobutton path="silotermometer.siloThermometer" id="siloThermometerNo" value="Ne" name="siloThermometer" />Ne</label>
<form:errors path="silotermometer.siloThermometer" cssClass="eror"></form:errors>
<hr>
<br>

<label ><spring:message code="silotermometer.readingSiloThermometer"/></label>
<label class="radio-inline"><form:radiobutton path="silotermometer.readingSiloThermometer" id="silotermometer.readingSiloThermometerHand" value="Rucno"  name="readingSiloThermometer" />Rucno</label>
<label class="radio-inline"><form:radiobutton path="silotermometer.readingSiloThermometer" id="silotermometer.readingSiloThermometerComp" value="Racunar"  name="readingSiloThermometer"/>Racunar</label>
<form:errors path="silotermometer.readingSiloThermometer" cssClass="eror"></form:errors>
<hr>
<br>
 
 <label ><spring:message code="silotermometer.controlSiloThermometer"/></label>
<label class="radio-inline"><form:radiobutton path="silotermometer.controlSiloThermometer" id="controlSiloThermometerYes" value="Da"  name="controlSiloThermometer" />Da</label>
<label class="radio-inline"><form:radiobutton path="silotermometer.controlSiloThermometer" id="controlSiloThermometerNo" value="Ne"  name="controlSiloThermometer"/>Ne</label>
<form:errors path="silotermometer.controlSiloThermometer" cssClass="eror"></form:errors>
<hr>
<br>

<label ><spring:message code="silotermometer.controlSiloThermometerSatisfies"/></label>
<label class="radio-inline"><form:radiobutton path="silotermometer.controlSiloThermometerSatisfies" id="controlSiloThermometerSatisfiesYes" value="Da"  name="controlSiloThermometerSatisfies" />Da</label>
<label class="radio-inline"><form:radiobutton path="silotermometer.controlSiloThermometerSatisfies" id="controlSiloThermometerSatisfiesNo" value="Ne"  name="controlSiloThermometerSatisfies"/>Ne</label>
<form:errors path="silotermometer.controlSiloThermometerSatisfies" cssClass="eror"></form:errors>
<hr>
<br>
 
</div>
</div>
</div>
</div>


</div>

<!-- div for class="col-md-6 -->

<div class="col-md-6 ">
<br><br><br>

<!-- label for risk mark -->

<div class="col-md-offset-10">
<h4>
<c:set var="marker" value="${riskControll.markRiskControls}" />
<c:choose>
  <c:when test="${marker=='LOS'}">
      <span class="label label-danger"><c:out value="${riskControll.markRiskControls}" /></span>            
  </c:when>
  <c:when test="${marker=='OSREDNJI'}">
       <span class="label label-warning"><c:out value="${riskControll.markRiskControls}" /></span> 
  </c:when>
  <c:when test="${marker=='DOBAR'}">
      <span class="label label-success"><c:out value="${riskControll.markRiskControls}" /></span>
  </c:when>
  <c:otherwise>
    <span class="label label-default">OCENA</span>
</c:otherwise>
</c:choose> 
</h4>
</div>

<br><br>
<!-- Controlls -->

<div class="form-group" >

  <div class="panel panel-default">
  
  <div class="panel-heading">
    <h3 class="panel-title"><spring:message code="control.controlls"/></h3>
  </div>
  
<div class="panel-body" >
   <label ><spring:message code="controls.controlOfElectrInst"/></label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfElectrInst" id="controlOfElectrInstYes" value="Da" name="controlOfElectrInst"/>Da</label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfElectrInst" id="controlOfElectrInstNo" value="Ne" name="controlOfElectrInst" />Ne</label>
<form:errors path="controls.controlOfElectrInst" cssClass="eror"></form:errors>
<label ><spring:message code="controls.controlOfElectrInstSatisfies"/></label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfElectrInstSatisfies" id="controlOfElectrInstSatisfiesYes" value="Da" name="controlOfElectrInstSatisfies"/>Da</label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfElectrInstSatisfies" id="controlOfElectrInstSatisfiesNo" value="Ne" name="controlOfElectrInstSatisfies" />Ne</label>
<form:errors path="controls.controlOfElectrInstSatisfies" cssClass="eror"></form:errors>
<hr>
<label ><spring:message code="controls.controlOfPropanButanInst"/></label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfPropanButanInst" id="controlOfPropanButanInstYes" value="Da"  name="controlOfPropanButanInst" />Da</label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfPropanButanInst" id="controlOfPropanButanInstNo" value="Ne"  name="controlOfPropanButanInst"/>Ne</label>
<form:errors path="controls.controlOfPropanButanInst" cssClass="eror"></form:errors>
<label ><spring:message code="controls.controlOfPropanButanInstSatisfies"/></label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfPropanButanInstSatisfies" id="controlOfPropanButanInstSatisfiesYes" value="Da"  name="controlOfPropanButanInstSatisfies" />Da</label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfPropanButanInstSatisfies" id="controlOfPropanButanInstSatisfiesNo" value="Ne"  name="controlOfPropanButanInstSatisfies"/>Ne</label>
<form:errors path="controls.controlOfPropanButanInstSatisfies" cssClass="eror"></form:errors>
<hr>
<label ><spring:message code="controls.controlOfGasInst"/></label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfGasInst" id="controlOfGasInstYes" value="Da"  name="controlOfGasInst" />Da</label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfGasInst" id="controlOfGasInstNo" value="Ne"  name="controlOfGasInst"/>Ne</label>
<form:errors path="controls.controlOfGasInst" cssClass="eror"></form:errors>
<label ><spring:message code="controls.controlOfGasInstSatisfies"/></label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfGasInstSatisfies" id="controlOfGasInstSatisfiesYes" value="Da"  name="controlOfGasInstSatisfies" />Da</label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfGasInstSatisfies" id="controlOfGasInstSatisfiesNo" value="Ne"  name="controlOfGasInstSatisfies"/>Ne</label>
<form:errors path="controls.controlOfGasInstSatisfies" cssClass="eror"></form:errors>
<hr>
<label ><spring:message code="controls.controlOfPressureVessel"/></label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfPressureVessel" id="controlOfPressureVesselYes" value="Da"  name="controlOfPressureVessel" />Da</label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfPressureVessel" id="controlOfPressureVesselNo" value="Ne"  name="controlOfPressureVessel"/>Ne</label>
<form:errors path="controls.controlOfPressureVessel" cssClass="eror"></form:errors>
<label ><spring:message code="controls.controlOfPressureVesselSatisfies"/></label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfPressureVesselSatisfies" id="controlOfPressureVesselSatisfiesYes" value="Da"  name="controlOfPressureVesselSatisfies" />Da</label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfPressureVesselSatisfies" id="controlOfPressureVesselSatisfiesNo" value="Ne"  name="controlOfPressureVesselSatisfies"/>Ne</label>
<form:errors path="controls.controlOfPressureVesselSatisfies" cssClass="eror"></form:errors>
<hr>
<label ><spring:message code="controls.controlOfBoilerUnderPress"/></label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfBoilerUnderPress" id="controlOfBoilerUnderPressYes" value="Da"  name="controlOfBoilerUnderPress" />Da</label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfBoilerUnderPress" id="controlOfBoilerUnderPressNo" value="Ne"  name="controlOfBoilerUnderPress"/>Ne</label>
<form:errors path="controls.controlOfBoilerUnderPress" cssClass="eror"></form:errors>
<label ><spring:message code="controls.controlOfBoilerUnderPressSatisfies"/></label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfBoilerUnderPressSatisfies" id="controlOfBoilerUnderPressSatisfiesYes" value="Da"  name="controlOfBoilerUnderPressSatisfies" />Da</label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfBoilerUnderPressSatisfies" id="controlOfBoilerUnderPressSatisfiesNo" value="Ne"  name="controlOfBoilerUnderPressSatisfies"/>Ne</label>
<form:errors path="controls.controlOfBoilerUnderPressSatisfies" cssClass="eror"></form:errors>
<hr>
<label ><spring:message code="controls.controlOfSafteyValves"/></label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfSafteyValves" id="controlOfSafteyValvesYes" value="Da"  name="controlOfSafteyValves" />Da</label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfSafteyValves" id="controlOfSafteyValvesNo" value="Ne"  name="controlOfSafteyValves"/>Ne</label>
<form:errors path="controls.controlOfSafteyValves" cssClass="eror"></form:errors>
<label ><spring:message code="controls.controlOfSafteyValvesSatisfies"/></label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfSafteyValvesSatisfies" id="controlOfSafteyValvesSatisfiesYes" value="Da"  name="controlOfSafteyValvesSatisfies" />Da</label>
<label class="radio-inline"><form:radiobutton path="controls.controlOfSafteyValvesSatisfies" id="controlOfSafteyValvesSatisfiesNo" value="Ne"  name="controlOfSafteyValvesSatisfies"/>Ne</label>
<form:errors path="controls.controlOfSafteyValvesSatisfies" cssClass="eror"></form:errors>
<hr>
</div>
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