<%@ include file="/WEB-INF/tags/taglib.jsp" %>

<div class="panel panel-default">

<div class="panel-body">
<div class="row">

<div class="col-md-offset-1">
<div class="col-md-6 ">
<br><br>
<div class="form-group">

 <div class="well well-sm">
 <label ><spring:message code="ex.studyOfDangerosZone"/></label>
 <label class="radio-inline"><form:radiobutton path="exReport.studyOfDangerosZone"  id="studyOfDangerosZoneYes" value="Da" name="studyOfDangerosZone"/>Da</label>
  <label class="radio-inline"><form:radiobutton path="exReport.studyOfDangerosZone" id="studyOfDangerosZoneNo" value="Ne" name="studyOfDangerosZone" />Ne</label>
 <form:errors path="exReport.studyOfDangerosZone" cssClass="eror"></form:errors>
 </div>
 </div>

 <div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="ex.exCertificate"/></label>
 <label class="radio-inline"><form:radiobutton path="exReport.exCertificate"  id="exCertificateYes" value="Da" name="exCertificate"/>Da</label>
  <label class="radio-inline"><form:radiobutton path="exReport.exCertificate" id="exCertificateNo" value="Ne" name="exCertificate" />Ne</label>
 <form:errors path="exReport.exCertificate" cssClass="eror"></form:errors>
 </div>
 </div>

<div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="ex.controlExEquipment"/></label>
 <label class="radio-inline"><form:radiobutton path="exReport.controlExEquipment"  id="controlExEquipmentYes" value="Da" name="controlExEquipment"/>Da</label>
  <label class="radio-inline"><form:radiobutton path="exReport.controlExEquipment" id="controlExEquipmentNo" value="Ne" name="controlExEquipment" />Ne</label>
 <form:errors path="exReport.controlExEquipment" cssClass="eror"></form:errors>
 </div>
 </div>
 
 <div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="ex.controlExInstalation"/></label>
 <label class="radio-inline"><form:radiobutton path="exReport.controlExInstalation"  id="controlExInstalationYes" value="Da" name="controlExInstalation"/>Da</label>
  <label class="radio-inline"><form:radiobutton path="exReport.controlExInstalation" id="controlExInstalationNo" value="Ne" name="controlExInstalation" />Ne</label>
 <form:errors path="exReport.controlExInstalation" cssClass="eror"></form:errors>
 </div>
 </div>

 <div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="ex.instalationExGasDetection"/></label>
 <label class="radio-inline"><form:radiobutton path="exReport.instalationExGasDetection"  id="instalationExGasDetectionYes" value="Da" name="instalationExGasDetection"/>Da</label>
  <label class="radio-inline"><form:radiobutton path="exReport.instalationExGasDetection" id="instalationExGasDetectionNo" value="Ne" name="instalationExGasDetection" />Ne</label>
 <form:errors path="exReport.instalationExGasDetection" cssClass="eror"></form:errors>
 </div>
 </div>
 
 <div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="ex.controlExGasDetection"/></label>
 <label class="radio-inline"><form:radiobutton path="exReport.controlExGasDetection"  id="controlExGasDetectionYes" value="Da" name="controlExGasDetection"/>Da</label>
  <label class="radio-inline"><form:radiobutton path="exReport.controlExGasDetection" id="controlExGasDetectionNo" value="Ne" name="controlExGasDetection" />Ne</label>
 <form:errors path="exReport.controlExGasDetection" cssClass="eror"></form:errors>
 </div>
 </div>

 <div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="ex.protectionOfElectricalOvervoltage"/></label>
 <label class="radio-inline"><form:radiobutton path="exReport.protectionOfElectricalOvervoltage"  id="protectionOfElectricalOvervoltageYes" value="Da" name="protectionOfElectricalOvervoltage"/>Da</label>
  <label class="radio-inline"><form:radiobutton path="exReport.protectionOfElectricalOvervoltage" id="protectionOfElectricalOvervoltageNo" value="Ne" name="protectionOfElectricalOvervoltage" />Ne</label>
 <form:errors path="exReport.protectionOfElectricalOvervoltage" cssClass="eror"></form:errors>
 </div>
 </div>

</div>
</div>
</div>
</div>
</div>
    