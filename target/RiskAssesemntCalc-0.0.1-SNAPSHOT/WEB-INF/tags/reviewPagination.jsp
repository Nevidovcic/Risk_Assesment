<%@ include file="/WEB-INF/tags/taglib.jsp" %>

<div class="row">
<div class="col-md-offset-4">
<div class="col-md-9 ">
 <ul class="pagination">
 <spring:url value="/reviewComin" var="reviewComintent"></spring:url>
  <li><a href="${reviewComintent}">Stampaj izvestaj</a></li>
  <li><a href="#">Po sifri komintenta</a></li>
  <spring:url value="/reviewReportPass" var="reviewsReportPass"></spring:url>
  <li><a href="${reviewsReportPass}">Izvstaji po komintentu</a></li>
  <spring:url value="/comintents/reviewAllComintents" var="reviewsAllComintents"></spring:url>
  <li><a href="${reviewsAllComintents}">Pregled komintenata</a></li>
</ul>
</div>
</div>
</div>