<%@ include file="/WEB-INF/tags/taglib.jsp" %>

<div class="panel panel-default">

<div class="panel-body">

<div class="row">

<div class="col-md-offset-1">
<div class="col-md-6 ">

<br>
<div style="width: 600px">
<label for="numberRepo">Broj izvestaja:</label>
<input  type="text" class="coll-md-3" id="numberRepo" style="width:80px" name="numberRepo" disabled="disabled" value="" />
</div>
<hr>
<input type="text" id="hiddenRepoNamb" name="hiddenRepoNamb" value="${report.toString()}" hidden="true" />


<div style="width: 600px"> 
  <label for="passReport">Unesite sifru komintenta:</label>
<input type="text" class="coll-md-3" id="passReport"  style="width:50px" name="passReport" autofocus="autofocus" value="" />
<button type="submit" class="btn btn-info btn-sm"  id="reportPass" value="Prikazi" name="reportPass" formnovalidate="formnovalidate" >Prikazi</button>
</div>
<table class="table table-condensed" id="cominTable" >
 <thead>
      <tr>
        <th>Naziv komintenta</th>
        <th>PIB</th>
        <th>Maticni broj </th>
      </tr>
    </thead>
 <tbody>
 <tr class="active">
      <td><c:out value="${comintents.name }"></c:out></td>
      <td><c:out value="${comintents.pib}"></c:out></td>
       <td><c:out value="${comintents.mb}"></c:out></td>
</tr>
 </tbody>
</table>
<hr>
<br>
<div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="firepro.fenced"/></label>
 
 <label class="radio-inline"><form:radiobutton path="protectionReport.fenced"  id="fencedYes" value="Da" name="fenced"/>Da</label>
  <label class="radio-inline"><form:radiobutton path="protectionReport.fenced" id="fencedNo" value="Ne" name="fenced" />Ne</label>
 <form:errors path="protectionReport.fenced" cssClass="eror"></form:errors>
 </div>
 </div>
 
 <div class="form-group">
   <div class="well well-sm">
   <label ><spring:message code="firepro.illuminated"/></label>
 <label class="radio-inline"><form:radiobutton path="protectionReport.illuminated" id="illuminatedYes" value="Da" name="illuminated" />Da</label>
  <label class="radio-inline"><form:radiobutton path="protectionReport.illuminated" id="illuminatedNo" value="Ne" name="illuminated"/>Ne</label>
  <form:errors path="protectionReport.illuminated" cssClass="eror"></form:errors>
 </div>
 </div>
 
 <div class="form-group">
  <div class="well well-sm">
 <label ><spring:message code="firepro.fireBrigade"/></label>
<label class="radio-inline"><form:radiobutton path="protectionReport.fireBrigade" id="fireBrigadeYes" value="Da" name="fireBrigade" />Da</label>
<label class="radio-inline"><form:radiobutton path="protectionReport.fireBrigade" id="fireBrigadeNo" value="Ne" name="fireBrigade"/>Ne</label>
<form:errors path="protectionReport.fireBrigade" cssClass="eror"></form:errors>
 </div>
 </div>

 <div class="form-group">
  <div class="well well-sm">
   <label ><spring:message code="firepro.security"/></label>
<label class="radio-inline"><form:radiobutton path="protectionReport.security" id="securityYes" value="Da" name="security" />Da</label>
<label class="radio-inline"><form:radiobutton path="protectionReport.security" id="securityNo" value="Ne" name="security" />Ne</label>
<form:errors path="protectionReport.security" cssClass="eror"></form:errors>
</div>
</div>
							
<div class="form-group">
 <div class="well well-sm">
  <label><spring:message code="firepro.fireProtectionMan"/></label>
  <label class="radio-inline"><form:radiobutton path="protectionReport.fireProtectionMan" id="fireProtectionManYes" value="Da" name="fireMan"  />Da</label>
<label class="radio-inline"><form:radiobutton path="protectionReport.fireProtectionMan" id="fireProtectionManNo" value="Ne" name="fireMan" />Ne</label>
<form:errors path="protectionReport.fireProtectionMan" cssClass="eror"></form:errors>
</div>
 </div>
 
   <!--  hidrantska -->
   
 <div class="form-group" >

  <div class="panel panel-default">
  <div class="panel-heading">
    <h3 class="panel-title"><spring:message code="firepro.hydrant"/></h3>
  </div>
  <div class="panel-body" >
   <label ><spring:message code="firepro.hydrants"/></label>
<label class="radio-inline"><form:radiobutton path="protectionReport.hydrant.hydrants" id="hydrantsYes" value="Da" name="hydrants"/>Da</label>
<label class="radio-inline"><form:radiobutton path="protectionReport.hydrant.hydrants" id="hydrantsNo" value="Ne" name="hydrants" />Ne</label>
<form:errors path="protectionReport.hydrant.hydrants" cssClass="eror"></form:errors>
<br>
<label ><spring:message code="firepro.hydrantsPressure"/></label>
<label class="radio-inline"><form:radiobutton path="protectionReport.hydrant.hydrantsPressure" id="hydrantsPressureYes" value="Da" disabled="true" name="hydranstPressure" />Da</label>
<label class="radio-inline"><form:radiobutton path="protectionReport.hydrant.hydrantsPressure" id="hydrantsPressureNo" value="Ne" disabled="true" name="hydranstPressure"/>Ne</label>
<form:errors path="protectionReport.hydrant.hydrantsPressure" cssClass="eror"></form:errors>
 <br>
  <label ><spring:message code="firepro.hydrantsCabAffordable"/></label>
 <label class="radio-inline"><form:radiobutton path="protectionReport.hydrant.hydrantsCabAffordable" id="hydrantsCabAffordableYes" value="Da" disabled="true" name="hydrantsCabAffordable" />Da</label>
<label class="radio-inline"><form:radiobutton path="protectionReport.hydrant.hydrantsCabAffordable" id="hydrantsCabAffordableNo" value="Ne" disabled="true" name="hydrantsCabAffordable" />Ne</label>
 <form:errors path="protectionReport.hydrant.hydrantsCabAffordable" cssClass="eror"></form:errors>
 <br>
  <label ><spring:message code="firepro.hydrantsCabEqquiped"/></label>
 <label class="radio-inline"><form:radiobutton path="protectionReport.hydrant.hydrantsCabEqquiped" id="hydrantsCabEqquipedYes" value="Da" disabled="true" name="hydrantsCabEqquiped" />Da</label>
<label class="radio-inline"><form:radiobutton path="protectionReport.hydrant.hydrantsCabEqquiped" id="hydrantsCabEqquipedNo" value="Ne" disabled="true" name="hydrantsCabEqquiped"/>Ne</label>
 <form:errors path="protectionReport.hydrant.hydrantsCabEqquiped" cssClass="eror"></form:errors>
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
<label class="radio-inline"><form:radiobutton  path="protectionReport.fireExtinguisher.fireExting" id="fireExtingYes" value="Da" name="fireExting" />Da</label>
<label class="radio-inline"><form:radiobutton path="protectionReport.fireExtinguisher.fireExting" id="fireExtingNo" value="Ne" name="fireExting" />Ne</label>
 <form:errors path="protectionReport.fireExtinguisher.fireExting" cssClass="eror"></form:errors>
<br>
<label ><spring:message code="firepro.fireExtingNumb"/></label>
<label class="radio-inline"><form:radiobutton path="protectionReport.fireExtinguisher.fireExtingNumb" id="fireExtingNumbYes" value="Da" disabled="true" name="fireExtingNumb"/>Da</label>
<label class="radio-inline"><form:radiobutton path="protectionReport.fireExtinguisher.fireExtingNumb" id="fireExtingNumbNo" value="Ne" disabled="true" name="fireExtingNumb" />Ne</label>
 <form:errors path="protectionReport.fireExtinguisher.fireExtingNumb" cssClass="eror"></form:errors>
<br>
<label ><spring:message code="firepro.fireExtingProbe"/></label>
<label class="radio-inline"><form:radiobutton path="protectionReport.fireExtinguisher.fireExtingProbe" id="fireExtingProbeYes" value="Da" disabled="true" name="fireExtingProbe"/>Da</label>
<label class="radio-inline"><form:radiobutton path="protectionReport.fireExtinguisher.fireExtingProbe" id="fireExtingProbeNo" value="Ne" disabled="true" name="fireExtingProbe" />Ne</label>
 <form:errors path="protectionReport.fireExtinguisher.fireExtingProbe" cssClass="eror"></form:errors>
</div>
</div>
</div>
</div>
</div> 

<div class="col-md-6">


<br>

<!-- Gomobranska -->

<div class="form-group">
  <div class="panel panel-default">
  <div class="panel-heading">
    <h3 class="panel-title"><spring:message code="firepro.lightningRods"/></h3>
  </div>
  <div class="panel-body">
<label ><spring:message code="firepro.lightningRod"/></label>
<label class="radio-inline"><form:radiobutton path="protectionReport.lightningConductor.lightningRod" id="lightningRodYes" value="Da" name="lightningRod" />Da</label>
<label class="radio-inline"><form:radiobutton path="protectionReport.lightningConductor.lightningRod" id="lightningRodNo" value="Ne" name="lightningRod" />Ne</label>
 <form:errors path="protectionReport.lightningConductor.lightningRod" cssClass="eror"></form:errors>
 <br>
<label ><spring:message code="firepro.lightningRodProbe"/></label>
<label class="radio-inline"><form:radiobutton path="protectionReport.lightningConductor.lightningRodProbe" id="lightningRodProbeYes" value="Da" disabled="true" name="lightningRodProbe" />Da</label>
<label class="radio-inline"><form:radiobutton path="protectionReport.lightningConductor.lightningRodProbe" id="lightningRodProbeNo" value="Ne" disabled="true" name="lightningRodProbe" />Ne</label>
 <form:errors path="protectionReport.lightningConductor.lightningRodProbe" cssClass="eror"></form:errors>
 <br>
  <label ><spring:message code="firepro.lightningRodFunct"/></label>
<label class="radio-inline"><form:radiobutton path="protectionReport.lightningConductor.lightningRodFunct" id="lightningRodFunctYes" value="Da" disabled="true" name="lightningRodFunct"/>Da</label>
<label class="radio-inline"><form:radiobutton path="protectionReport.lightningConductor.lightningRodFunct" id="lightningRodFunctNo" value="Ne" disabled="true" name="lightningRodFunct"/>Ne</label>
 <form:errors path="protectionReport.lightningConductor.lightningRodFunct" cssClass="eror"></form:errors>
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
<label class="radio-inline"><form:radiobutton path="protectionReport.fireAlarm.fireReport" id="fireReportYes" value="Da" name="fireReport" />Da</label>
<label class="radio-inline"><form:radiobutton path="protectionReport.fireAlarm.fireReport" id="fireReportNo" value="Ne" name="fireReport" />Ne</label>
  <form:errors path="protectionReport.fireAlarm.fireReport" cssClass="eror"></form:errors>
 <br>
<label ><spring:message code="firepro.fireReportProbe"/></label>
<label class="radio-inline"><form:radiobutton path="protectionReport.fireAlarm.fireReportProbe" id="fireReportProbeYes" value="Da" disabled="true" name="fireReportProbe" />Da</label>
<label class="radio-inline"><form:radiobutton path="protectionReport.fireAlarm.fireReportProbe" id="fireReportProbeNo" value="Ne" disabled="true" name="fireReportProbe" />Ne</label>
 <form:errors path="protectionReport.fireAlarm.fireReportProbe" cssClass="eror"></form:errors>
 <br>
  <label ><spring:message code="firepro.fireReportMonitord"/></label>
<label class="radio-inline"><form:radiobutton path="protectionReport.fireAlarm.fireReportMonitord" id="fireReportMonitordYes" value="Da" disabled="true" name="fireReportMonitord" />Da</label>
<label class="radio-inline"><form:radiobutton path="protectionReport.fireAlarm.fireReportMonitord" id="fireReportMonitordNo" value="Ne" disabled="true" name="fireReportMonitord" />Ne</label>
<form:errors path="protectionReport.fireAlarm.fireReportMonitord" cssClass="eror"></form:errors> 
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
<label class="radio-inline"><form:radiobutton path="protectionReport.fireFightingIns.fireFigtingInstal" id="fireFigtingInstalYes" value="Da" name="fireFigtingInstal" />Da</label>
<label class="radio-inline"><form:radiobutton path="protectionReport.fireFightingIns.fireFigtingInstal" id="fireFigtingInstalNo" value="Ne" name="fireFigtingInstal" />Ne</label>
 <form:errors path="protectionReport.fireFightingIns.fireFigtingInstal" cssClass="eror"></form:errors> 
 <br>
<label ><spring:message code="firepro.fireFigtingInstProbe"/></label>
<label class="radio-inline"><form:radiobutton path="protectionReport.fireFightingIns.fireFigtingInstProbe" id="fireFigtingInstProbeYes" value="Da" disabled="true" name="fireFigtingInstProbe" />Da</label>
<label class="radio-inline"><form:radiobutton path="protectionReport.fireFightingIns.fireFigtingInstProbe" id="fireFigtingInstProbeNo" value="Ne" disabled="true" name="fireFigtingInstProbe"  />Ne</label>
 <form:errors path="protectionReport.fireFightingIns.fireFigtingInstProbe" cssClass="eror"></form:errors> 
 <br>
  <label ><spring:message code="firepor.fireFigtingInstFunct"/></label>
<label class="radio-inline"><form:radiobutton path="protectionReport.fireFightingIns.fireFigtingInstFunct" id="fireFigtingInstFunctYes" value="Da" disabled="true" name="fireFigtingInstFunct" />Da</label>
<label class="radio-inline"><form:radiobutton path="protectionReport.fireFightingIns.fireFigtingInstFunct" id="fireFigtingInstFunctNo" value="Ne" disabled="true" name="fireFigtingInstFunct"/>Ne</label>
  <form:errors path="protectionReport.fireFightingIns.fireFigtingInstFunct" cssClass="eror"></form:errors>
 <br>
    </div>
</div>
</div>


<!-- protivprovalni sistem -->

<div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="firepro.theftSystem"/></label>
<label class="radio-inline"><form:radiobutton path="protectionReport.theftSystem" id="theftSystemYes" value="Da" name="theftSystem" />Da</label>
<label class="radio-inline"><form:radiobutton path="protectionReport.theftSystem" id="theftSystemNo" value="Ne" name="theftSystem" />Ne</label>
 <form:errors path="protectionReport.theftSystem" cssClass="eror"></form:errors>
 </div>
 </div>
 
 <!-- video nadzor -->
 
 <div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="firepro.videoSurve"/></label>
<label class="radio-inline"><form:radiobutton path="protectionReport.videoSurve" id="videoSurveYes" value="Da" name="videoSurve" />Da</label>
<label class="radio-inline"><form:radiobutton path="protectionReport.videoSurve" id="videoSurveNo" value="Ne" name="videoSurve" />Ne</label>
 <form:errors path="protectionReport.videoSurve" cssClass="eror"></form:errors>
 </div>
 </div>
 </div>
 </div>
 </div>
 
 </div>
 </div>