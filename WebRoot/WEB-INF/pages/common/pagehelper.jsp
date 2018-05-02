<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div  class="message">
	共<i class="blue">${pageInfo.total}</i>条记录，当前显示第&nbsp;<i
	class="blue">${pageInfo.pageNum}/${pageInfo.pages}</i>&nbsp;页
</div>
<div style="text-align:center;">
	<ul class="pagination">
		<!-- <li><a href="#">&laquo;</a></li> -->
		<c:if test="${!pageInfo.isFirstPage}">
			<li><a href="javascript:queryAllPerson(${pageInfo.firstPage}, ${pageInfo.pageSize});">&lt;&lt;</a></li>
			<li><a href="javascript:queryAllPerson(${pageInfo.prePage}, ${pageInfo.pageSize});">&lt;</a></li>
		</c:if>
		<c:forEach items="${pageInfo.navigatepageNums}" var="navigatepageNum">
		
			<c:if test="${navigatepageNum==pageInfo.pageNum}">
				<li class="active"><a href="javascript:queryAllPerson(${navigatepageNum}, ${pageInfo.pageSize});">${navigatepageNum}</a></li>
			</c:if>
			<c:if test="${navigatepageNum!=pageInfo.pageNum}">
				<li><a href="javascript:queryAllPerson(${navigatepageNum}, ${pageInfo.pageSize});">${navigatepageNum}</a></li>
			</c:if>
		</c:forEach>
		<c:if test="${!pageInfo.isLastPage}">
			<li><a href="javascript:queryAllPerson(${pageInfo.nextPage}, ${pageInfo.pageSize});">&gt;</a></li>
			<li><a href="javascript:queryAllPerson(${pageInfo.lastPage}, ${pageInfo.pageSize});">&gt;&gt;</a></li>
		</c:if>
		<!-- <li><a href="#">&raquo;</a></li> -->
	</ul>
</div>
