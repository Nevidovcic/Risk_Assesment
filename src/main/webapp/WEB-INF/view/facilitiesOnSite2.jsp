<%@ include file="/WEB-INF/tags/taglib.jsp" %>

<div class="panel panel-default">

<div class="panel-body">

<div class="row">

<div class="col-md-offset-1">
<div class="col-md-6 ">
<br><br>
<div class="form-group">
 <div class="well well-sm">
 <label ><spring:message code="facilities.accesLocation"/> </label>
 <label class="radio-inline"><form:radiobutton  path="facilitiesReport.accessLocation" value="sa sve 4 strane" />sa sve 4 strane</label>
  <label class="radio-inline"><form:radiobutton  path="facilitiesReport.accessLocation" value="sa 3 strane" />sa 3 strane</label>
	<label class="radio-inline"><form:radiobutton  path="facilitiesReport.accessLocation" value="sa 2 strane" />sa 2 strane</label>
<form:errors path="facilitiesReport.accessLocation" cssClass="eror"></form:errors>
 </div>
 </div>
 
<div class="form-group" >

  <div class="panel panel-default">
  <div class="panel-heading">
    <h3 class="panel-title"><spring:message code="facilities.neighbor"/></h3>
  </div>
  <div class="panel-body" >
   <label ><spring:message code="facilities.neighborsPresence"/></label>
<label class="radio-inline"><form:radiobutton path="facilitiesReport.neighbor.neighborsPresence" id="neighborsPresenceYes" value="Da" name="neighborsPresence"/>Da</label>
<label class="radio-inline"><form:radiobutton path="facilitiesReport.neighbor.neighborsPresence" id="neighborsPresenceNo" value="Ne" name="neighborsPresence" />Ne</label>
<form:errors path="facilitiesReport.neighbor.neighborsPresence" cssClass="eror"></form:errors>
<br>
<label ><spring:message code="facilities.neighborsActivity"/></label>
<label class="radio-inline"><form:radiobutton path="facilitiesReport.neighbor.neighborsActivity" id="neighborsActivityYes" value="Da" name="neighborsActivity" />Da</label>
<label class="radio-inline"><form:radiobutton path="facilitiesReport.neighbor.neighborsActivity" id="neighborsActivityNo" value="Ne"  name="neighborsActivity"/>Ne</label>
<form:errors path="facilitiesReport.neighbor.neighborsActivity" cssClass="eror"></form:errors>

</div>
</div>
					
 <div class="form-group">
  <div class="well well-sm">
   <label ><spring:message code="facilities.construction"/></label>
<label class="radio-inline"><form:radiobutton path="facilitiesReport.objectConstruction" value="Betonska" id="constructionConcret" />Betonska</label>
<label class="radio-inline"><form:radiobutton path="facilitiesReport.objectConstruction" value="Celicna" id="cosntructionSteel" />Celicna</label>
<label class="radio-inline"><form:radiobutton path="facilitiesReport.objectConstruction" value="Drvena" id="constructionWood"/>Drvena</label>
<form:errors path="facilitiesReport.objectConstruction" cssClass="eror"></form:errors>
</div>
</div>
 
 <div class="form-group">
 <div class="well well-sm">
  <label><spring:message code="facilities.exteriorWalls"/></label>
  <label class="radio-inline"><form:radiobutton path="facilitiesReport.exteriorWalls" value="Cigla" id="wallsBrick" />Cigla</label>
<label class="radio-inline"><form:radiobutton path="facilitiesReport.exteriorWalls" value="Beton" id="wallsConcret" />Beton</label>
<label class="radio-inline"><form:radiobutton path="facilitiesReport.exteriorWalls" value="Paneli od straklene vune" id="wallsWoolsPanel" />Paneli od straklene vune</label>
<label class="radio-inline"><form:radiobutton path="facilitiesReport.exteriorWalls" value="Paneli od poliuretana" id="wallsUrethanPanel" />Paneli od poliuretana</label>
<label class="radio-inline"><form:radiobutton path="facilitiesReport.exteriorWalls" value="Drvene ploce" id="wallsWood" />Drvene ploce</label>
<form:errors path="facilitiesReport.exteriorWalls" cssClass="eror"></form:errors>
</div>
 </div>

 <div class="form-group">
 <div class="well well-sm">
  <label><spring:message code="facilities.roofConstruction"/></label>
<label class="radio-inline"><form:radiobutton path="facilitiesReport.roofConstruction" value="Betonska" id="roofConstConcret"/>Betonska</label>
<label class="radio-inline"><form:radiobutton path="facilitiesReport.roofConstruction" value="Celicna" id="roofConstSteel" />Celicna</label>
<label class="radio-inline"><form:radiobutton path="facilitiesReport.roofConstruction" value="Drvena" id="roofConstWood" />Drvena</label>
<form:errors path="facilitiesReport.roofConstruction" cssClass="eror"></form:errors>
</div>
 </div>
 
 <div class="form-group">
 <div class="well well-sm">
  <label><spring:message code="facilities.roofCover"/></label>
<label class="radio-inline"><form:radiobutton path="facilitiesReport.roofCover" value="Crep" id="roofCoverTile" />Betonska</label>
<label class="radio-inline"><form:radiobutton path="facilitiesReport.roofCover" value="Paneli od straklene vune" id="roofCoverWoolsPanel" />Paneli od straklene vune</label>
<label class="radio-inline"><form:radiobutton path="facilitiesReport.roofCover" value="Paneli od poliuretana" id="roofCoverUrethanPanel" />Paneli od straklene vune</label>
<label class="radio-inline"><form:radiobutton path="facilitiesReport.roofCover" value="Sendvic lim"  id="roofCoverTin"/>Paneli od straklene vune</label>
<form:errors path="facilitiesReport.roofCover" cssClass="eror"></form:errors>
</div>
 </div>

</div>
</div>
</div>
</div>
</div>
</div>