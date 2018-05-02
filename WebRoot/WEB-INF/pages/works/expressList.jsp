<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>已发布物流信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="statics/css/bootstrap.min.css">
	
	<script type="text/javascript">
		function queryAllPerson(pageNum,pageSize){
			location.href="Issued.html?pageNum="+pageNum+"&pageSize="+pageSize;
		}
	</script>
  </head>
  <body>
  <h3>All Expresses</h3>
  		<div class="container">
  			<div class="row clearfix">
  				<div class="col-md-12 column">
  					<table class="table" id="personList_table">
  						<thead>
  							<tr>
  								<td>ID</td>
  								<td>快递编号</td>
  								<td>发布时间</td>
  								<td>配送地址</td>
  								<td>当前状态</td>
  							</tr>
  						</thead>
	  					<tbody>
							<c:forEach items="${pageInfo.list}" var="Express">
	
								<tr id="Express_tr_${Express.id }">
									<td><input type="text" id="id_${Express.id }" name="id"
										value="${Express.id }" disabled />
									</td>
									<td><input type="text" id="num_${Express.logistics_num }" name="num"
										value="${Express.logistics_num }" disabled />
									</td>
									<td><input type="text" id="time_${Express.issueDateStr}}" name="time"
										value="${Express.issueDateStr }" disabled />
										
									</td>
									<td>
										<input type="text" id="address_${Express.address }" name="num"
										value="${Express.address }" disabled />
									</td>
									<td>
										<c:if test="${Express.status==0}">
											<input type="text" id="status_${person.status}" name="status"  value="未配送" />
										</c:if>
										<c:if test="${Express.status==1}">
											<input type="text" id="status_${person.status}" name="status"  value="已配送" />
										</c:if>
									</td>
									
									<td>
										<a href="#">&gt;&gt;详细信息</a>
									</td>
								</tr>
	
							</c:forEach>
						</tbody>
					</table>
					<div id="page_div">
						 <%@ include file="../common/pagehelper.jsp" %>
					</div>
  				</div>
  			</div>
  		</div>
    
  </body>
</html>
