<%@ include file="/WEB-INF/tags/taglib.jsp" %>

<!-- label for risk mark -->

<div class="col-md-offset-11">
<h4>
<c:set var="marker" value="${report.markReport}" />
<c:choose>
  <c:when test="${marker=='LOS'}">
      <span class="label label-danger"><c:out value="${report.markReport}" /></span>            
  </c:when>
  <c:when test="${marker=='OSREDNJI'}">
       <span class="label label-warning"><c:out value="${report.markReport}" /></span> 
  </c:when>
  <c:when test="${marker=='DOBAR'}">
      <span class="label label-success"><c:out value="${report.markReport}" /></span>
  </c:when>
  <c:otherwise>
    <span class="label label-default">OCENA</span>
</c:otherwise>
</c:choose> 
</h4>
</div>