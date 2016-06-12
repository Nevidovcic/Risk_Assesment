<%@ include file="/WEB-INF/tags/taglib.jsp" %>

<div class="panel panel-default">

<div class="panel-body">

<div class="row">

<div class="col-md-offset-1">

<div class="col-md-6 ">


<br><br>
<div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="controll.categoriesOfFireRisk"/></label>
 
 <label class="radio-inline"><form:radiobutton path="riskReport.categoriesOfFireRisk"  id="categoriesOfFireRiskI" value="I" name="categoriesOfFireRisk"/>I</label>
  <label class="radio-inline"><form:radiobutton path="riskReport.categoriesOfFireRisk" id="categoriesOfFireRiskII" value="II" name="categoriesOfFireRisk" />II</label>
    <label class="radio-inline"><form:radiobutton path="riskReport.categoriesOfFireRisk" id="categoriesOfFireRiskIII" value="III" name="categoriesOfFireRisk" />II</label>
 <form:errors path="riskReport.categoriesOfFireRisk" cssClass="eror"></form:errors>
 </div>
 </div>
 
 <div class="form-group">
   <div class="well well-sm">
   <label ><spring:message code="controll.planOfFireProtec"/></label>
 <label class="radio-inline"><form:radiobutton path="riskReport.planOfFireProtec" id="planOfFireProtecYes" value="Da" name="planOfFireProtec" />Da</label>
  <label class="radio-inline"><form:radiobutton path="riskReport.planOfFireProtec" id="planOfFireProtecNo" value="Ne" name="planOfFireProtec"/>Ne</label>
  <form:errors path="riskReport.planOfFireProtec" cssClass="eror"></form:errors>
 </div>
 </div>
 
 <div class="form-group">
  <div class="well well-sm">
 <label ><spring:message code="controll.regulationOfFelding"/></label>
<label class="radio-inline"><form:radiobutton path="riskReport.regulationOfFelding" id="regulationOfFeldingYes" value="Da" name="regulationOfFelding" />Da</label>
<label class="radio-inline"><form:radiobutton path="riskReport.regulationOfFelding" id="regulationOfFeldingNo" value="Ne" name="regulationOfFelding"/>Ne</label>
<form:errors path="riskReport.regulationOfFelding" cssClass="eror"></form:errors>
 </div>
 </div>

 <div class="form-group">
  <div class="well well-sm">
   <label ><spring:message code="controll.trainingEmployers"/></label>
<label class="radio-inline"><form:radiobutton path="riskReport.trainingEmployers" id="trainingEmployersYes" value="Da" name="trainingEmployers" />Da</label>
<label class="radio-inline"><form:radiobutton path="riskReport.trainingEmployers" id="trainingEmployersNo" value="Ne" name="trainingEmployers" />Ne</label>
<form:errors path="riskReport.trainingEmployers" cssClass="eror"></form:errors>
</div>
</div>

							
<div class="form-group">
 <div class="well well-sm">
  <label><spring:message code="controll.storageBottleUnderPress"/></label>
  <label class="radio-inline"><form:radiobutton path="riskReport.storageBottleUnderPress" id="storageBottleUnderPressYes" value="Da" name="storageBottleUnderPress" />Da</label>
<label class="radio-inline"><form:radiobutton path="riskReport.storageBottleUnderPress" id="storageBottleUnderPressNo" value="Ne" name="storageBottleUnderPress" />Ne</label>
<form:errors path="riskReport.storageBottleUnderPress" cssClass="eror"></form:errors>
</div>
 </div>
 
<div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="controll.forklift"/></label>
<label class="radio-inline"><form:radiobutton path="riskReport.forklift" id="forkliftYes" value="Da" name="forklift" />Da</label>
<label class="radio-inline"><form:radiobutton path="riskReport.forklift" id="forkliftNo" value="Ne" name="forklift" />Ne</label>
 <form:errors path="riskReport.forklift" cssClass="eror"></form:errors>
 </div>
 </div>

 <div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="controll.smokingProhibition"/></label>
<label class="radio-inline"><form:radiobutton path="riskReport.smokingProhibition" id="smokingProhibitionYes" value="Da" name="smokingProhibition" />Da</label>
<label class="radio-inline"><form:radiobutton path="riskReport.smokingProhibition" id="smokingProhibitionNo" value="Ne" name="smokingProhibition" />Ne</label>
 <form:errors path="riskReport.smokingProhibition" cssClass="eror"></form:errors>
 </div>
 </div>
 
  <div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="controll.cleanliness"/></label>
<label class="radio-inline"><form:radiobutton path="riskReport.cleanliness" id="cleanlinessYes" value="Da" name="cleanliness" />Da</label>
<label class="radio-inline"><form:radiobutton path="riskReport.cleanliness" id="cleanlinessNo" value="Ne" name="cleanliness" />Ne</label>
 <form:errors path="riskReport.cleanliness" cssClass="eror"></form:errors>
 </div>
 </div>

<!-- Silotermometer -->
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
<label class="radio-inline"><form:radiobutton path="riskReport.silotermometer.siloThermometer" id="siloThermometerYes" value="Da" name="siloThermometer"/>Da</label>
<label class="radio-inline"><form:radiobutton path="riskReport.silotermometer.siloThermometer" id="siloThermometerNo" value="Ne" name="siloThermometer" />Ne</label>
<form:errors path="riskReport.silotermometer.siloThermometer" cssClass="eror"></form:errors>
<br>

<label ><spring:message code="silotermometer.readingSiloThermometer"/></label>
<label class="radio-inline"><form:radiobutton path="riskReport.silotermometer.readingSiloThermometer" id="silotermometer.readingSiloThermometerHand" value="Rucno"  name="readingSiloThermometer" />Rucno</label>
<label class="radio-inline"><form:radiobutton path="riskReport.silotermometer.readingSiloThermometer" id="silotermometer.readingSiloThermometerComp" value="Racunar"  name="readingSiloThermometer"/>Racunar</label>
<form:errors path="riskReport.silotermometer.readingSiloThermometer" cssClass="eror"></form:errors>
<br>
 
 <label ><spring:message code="silotermometer.controlSiloThermometer"/></label>
<label class="radio-inline"><form:radiobutton path="riskReport.silotermometer.controlSiloThermometer" id="controlSiloThermometerYes" value="Da"  name="controlSiloThermometer" />Da</label>
<label class="radio-inline"><form:radiobutton path="riskReport.silotermometer.controlSiloThermometer" id="controlSiloThermometerNo" value="Ne"  name="controlSiloThermometer"/>Ne</label>
<form:errors path="riskReport.silotermometer.controlSiloThermometer" cssClass="eror"></form:errors>
<br>

<label ><spring:message code="silotermometer.controlSiloThermometerSatisfies"/></label>
<label class="radio-inline"><form:radiobutton path="riskReport.silotermometer.controlSiloThermometerSatisfies" id="controlSiloThermometerSatisfiesYes" value="Da"  name="controlSiloThermometerSatisfies" />Da</label>
<label class="radio-inline"><form:radiobutton path="riskReport.silotermometer.controlSiloThermometerSatisfies" id="controlSiloThermometerSatisfiesNo" value="Ne"  name="controlSiloThermometerSatisfies"/>Ne</label>
<form:errors path="riskReport.silotermometer.controlSiloThermometerSatisfies" cssClass="eror"></form:errors>
<br>
 
</div>
</div>
</div>
</div>


</div>

<!-- div for class="col-md-6 -->

<div class="col-md-6 ">
<br><br>


<!-- Controlls -->

<div class="form-group" >

  <div class="panel panel-default">
  
  <div class="panel-heading">
    <h3 class="panel-title"><spring:message code="control.controlls"/></h3>
  </div>
  
<div class="panel-body" >
   <label ><spring:message code="controls.controlOfElectrInst"/></label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfElectrInst" id="controlOfElectrInstYes" value="Da" name="controlOfElectrInst"/>Da</label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfElectrInst" id="controlOfElectrInstNo" value="Ne" name="controlOfElectrInst" />Ne</label>
<form:errors path="riskReport.controls.controlOfElectrInst" cssClass="eror"></form:errors>
<label ><spring:message code="controls.controlOfElectrInstSatisfies"/></label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfElectrInstSatisfies" id="controlOfElectrInstSatisfiesYes" value="Da" name="controlOfElectrInstSatisfies"/>Da</label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfElectrInstSatisfies" id="controlOfElectrInstSatisfiesNo" value="Ne" name="controlOfElectrInstSatisfies" />Ne</label>
<form:errors path="riskReport.controls.controlOfElectrInstSatisfies" cssClass="eror"></form:errors>
<hr>
<label ><spring:message code="controls.controlOfPropanButanInst"/></label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfPropanButanInst" id="controlOfPropanButanInstYes" value="Da"  name="controlOfPropanButanInst" />Da</label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfPropanButanInst" id="controlOfPropanButanInstNo" value="Ne"  name="controlOfPropanButanInst"/>Ne</label>
<form:errors path="riskReport.controls.controlOfPropanButanInst" cssClass="eror"></form:errors>
<label ><spring:message code="controls.controlOfPropanButanInstSatisfies"/></label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfPropanButanInstSatisfies" id="controlOfPropanButanInstSatisfiesYes" value="Da"  name="controlOfPropanButanInstSatisfies" />Da</label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfPropanButanInstSatisfies" id="controlOfPropanButanInstSatisfiesNo" value="Ne"  name="controlOfPropanButanInstSatisfies"/>Ne</label>
<form:errors path="riskReport.controls.controlOfPropanButanInstSatisfies" cssClass="eror"></form:errors>
<hr>
<label ><spring:message code="controls.controlOfGasInst"/></label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfGasInst" id="controlOfGasInstYes" value="Da"  name="controlOfGasInst" />Da</label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfGasInst" id="controlOfGasInstNo" value="Ne"  name="controlOfGasInst"/>Ne</label>
<form:errors path="riskReport.controls.controlOfGasInst" cssClass="eror"></form:errors>
<label ><spring:message code="controls.controlOfGasInstSatisfies"/></label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfGasInstSatisfies" id="controlOfGasInstSatisfiesYes" value="Da"  name="controlOfGasInstSatisfies" />Da</label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfGasInstSatisfies" id="controlOfGasInstSatisfiesNo" value="Ne"  name="controlOfGasInstSatisfies"/>Ne</label>
<form:errors path="riskReport.controls.controlOfGasInstSatisfies" cssClass="eror"></form:errors>
<hr>
<label ><spring:message code="controls.controlOfPressureVessel"/></label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfPressureVessel" id="controlOfPressureVesselYes" value="Da"  name="controlOfPressureVessel" />Da</label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfPressureVessel" id="controlOfPressureVesselNo" value="Ne"  name="controlOfPressureVessel"/>Ne</label>
<form:errors path="riskReport.controls.controlOfPressureVessel" cssClass="eror"></form:errors>
<label ><spring:message code="controls.controlOfPressureVesselSatisfies"/></label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfPressureVesselSatisfies" id="controlOfPressureVesselSatisfiesYes" value="Da"  name="controlOfPressureVesselSatisfies" />Da</label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfPressureVesselSatisfies" id="controlOfPressureVesselSatisfiesNo" value="Ne"  name="controlOfPressureVesselSatisfies"/>Ne</label>
<form:errors path="riskReport.controls.controlOfPressureVesselSatisfies" cssClass="eror"></form:errors>
<hr>
<label ><spring:message code="controls.controlOfBoilerUnderPress"/></label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfBoilerUnderPress" id="controlOfBoilerUnderPressYes" value="Da"  name="controlOfBoilerUnderPress" />Da</label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfBoilerUnderPress" id="controlOfBoilerUnderPressNo" value="Ne"  name="controlOfBoilerUnderPress"/>Ne</label>
<form:errors path="riskReport.controls.controlOfBoilerUnderPress" cssClass="eror"></form:errors>
<label ><spring:message code="controls.controlOfBoilerUnderPressSatisfies"/></label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfBoilerUnderPressSatisfies" id="controlOfBoilerUnderPressSatisfiesYes" value="Da"  name="controlOfBoilerUnderPressSatisfies" />Da</label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfBoilerUnderPressSatisfies" id="controlOfBoilerUnderPressSatisfiesNo" value="Ne"  name="controlOfBoilerUnderPressSatisfies"/>Ne</label>
<form:errors path="riskReport.controls.controlOfBoilerUnderPressSatisfies" cssClass="eror"></form:errors>
<hr>
<label ><spring:message code="controls.controlOfSafteyValves"/></label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfSafteyValves" id="controlOfSafteyValvesYes" value="Da"  name="controlOfSafteyValves" />Da</label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfSafteyValves" id="controlOfSafteyValvesNo" value="Ne"  name="controlOfSafteyValves"/>Ne</label>
<form:errors path="riskReport.controls.controlOfSafteyValves" cssClass="eror"></form:errors>
<label ><spring:message code="controls.controlOfSafteyValvesSatisfies"/></label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfSafteyValvesSatisfies" id="controlOfSafteyValvesSatisfiesYes" value="Da"  name="controlOfSafteyValvesSatisfies" />Da</label>
<label class="radio-inline"><form:radiobutton path="riskReport.controls.controlOfSafteyValvesSatisfies" id="controlOfSafteyValvesSatisfiesNo" value="Ne"  name="controlOfSafteyValvesSatisfies"/>Ne</label>
<form:errors path="riskReport.controls.controlOfSafteyValvesSatisfies" cssClass="eror"></form:errors>
<hr>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>