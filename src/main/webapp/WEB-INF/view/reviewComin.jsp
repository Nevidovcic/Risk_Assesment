<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/tags/taglib.jsp" %>
<%@taglib prefix="page" tagdir="/WEB-INF/tags" %>

<page:template>
	<jsp:attribute name="title">
     	Pregled izvestaja po broju izvestaja
    </jsp:attribute>
<jsp:body>
<br><br>

<div class="panel panel-default" style="height: calc(100vh - 145px)" >

<div class="panel-body" >

<br><br><br>

   <c:url value="/reports" var="reports" ></c:url>
<form class="form-inline" role="form" method="GET" action="${reports}" >

<div class="form-group inline">
  <label for="reportNumS">Broj izvestaja:</label>
  <input type="text" class="form-control" id="reportNumS" name="reportNumS">
</div>
   
<div class="form-group"> 
<button type="submit" class="btn btn-info btn-sm" id="showReport"  name="showReport" value="Prikazi">Prikazi</button>
</div>  

<div class="form-group">
<div class="col-md-offset-1">
<button type="submit" class="btn btn-info btn-sm" id="print" name="print" value="Stampaj" target="_blank" >Stampaj</button><!-- target="_blank" otvaranje novog prozora -->
</div>
</div>
<hr>
 </form>
 
</div>
</div>
</div>

</jsp:body>

</page:template>