<%@ include file="/WEB-INF/tags/taglib.jsp" %>
<div id="showComin">
 <table class="table table-condensed">
    <thead>
      <tr>
        <th>R.Br.</th>
         <th>Sifra komintenta</th>
        <th>Naziv komintenta</th>
        <th>PIB</th>
        <th>Maticni broj </th>
        <th>Delatnost komintenta</th>
      </tr>
    </thead>
    <tbody>
   
      <tr class="info">
      <td><c:out value="${findByNameComin.id_comintents }"></c:out></td>
      <td><c:out value="${findByNameComin.password}"></c:out></td>
      <td><c:out value="${findByNameComin.name}"></c:out></td>
       <td><c:out value="${findByNameComin.pib}"></c:out></td>
       <td><c:out value="${findByNameComin.mb}"></c:out></td>
      <td><c:out value="${findByNameComin.activityOfCompany}"></c:out></td>
      </tr>
 <%--     </c:forEach> --%>
    </tbody>
  </table>