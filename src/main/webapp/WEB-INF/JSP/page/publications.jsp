<%@ page contentType="text/html; UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="publicationList" data-page-count="${pageCount}" data-page-number="1">
	<div class="row">
		<jsp:include page="../fragment/publication-list.jsp" />
	</div>
	<c:if test="${pageCount > 1 }">
		<div class="text-center hidden-print">
				 <a class="btn btn-success"	id="loadMorePublications" href="#">Load more publications</a>
		</div>
	</c:if>
</div>
<tags:subscribe-publication-popup/>