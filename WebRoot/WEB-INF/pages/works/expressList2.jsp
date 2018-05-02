<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>快递信息</title>
</head>
<body>
	<div>
		<form action="expressList.html" method="post">
		<div>
			状态：
			<select name="status" id="status"  name="status"  style="width:100px:">
				<option value="" selected="selected">--请选择--</option>
				<option value="" selected="selected">--已配送--</option>
				<option value="" selected="selected">--未配送--</option>
			</select>
			快递编号：<input type="text" id="logistics_num">
			<button type="button" id="btn">查询</button>
			<table cellpadding="1" cellspacing="10" >
				<tr>
					<th>快递编号</th>
					<th width="80px">发布时间</th>
					<th width="300px">配送地点</th>
					<th>当前状态</th>
				</tr>
				<tr>
					<td>kkkk</td>
					<td>kkkk</td>
					<td>jjjj</td>
					<td>klll</td>
					<td><a href="#">更多>></a></td>
				</tr>
			</table>
		</div>
		</form>
	</div>
	<div >
					  <ul>
					  <c:choose>
					  	<c:when test="${page.page == 1}">
					  	<li ><a href="javascript:void();" title="首页">首页</a></li>
					  	</c:when>
					  	<c:otherwise>
					  	<li><a href="expressList.html?currentpage=1&s_loginCode=${s_loginCode}&s_referCode=${s_referCode}&s_roleId=${s_roleId}&s_isStart=${s_isStart}" title="首页">首页</a></li>
					  	</c:otherwise>
					  </c:choose>
						<c:if test="${page.prevPages!=null}">
							<c:forEach items="${page.prevPages}" var="num">
								<li><a href="/backend/userlist.html?currentpage=${num}&s_loginCode=${s_loginCode}&s_referCode=${s_referCode}&s_roleId=${s_roleId}&s_isStart=${s_isStart}"
									class="number" title="${num}">${num}</a></li>
							</c:forEach>
						</c:if>
						<li class="active">
						  <a href="#" title="${page.page}">${page.page}</a>
						</li>
						<c:if test="${page.nextPages!=null}">
							<c:forEach items="${page.nextPages}" var="num">
								<li><a href="/backend/userlist.html?currentpage=${num}&s_loginCode=${s_loginCode}&s_referCode=${s_referCode}&s_roleId=${s_roleId}&s_isStart=${s_isStart}" title="${num}">
								${num} </a></li>
							</c:forEach>
						</c:if>
						<c:if test="${page.pageCount !=null}">
							<c:choose>
						  	<c:when test="${page.page == page.pageCount}">
						  	<li class="active"><a href="javascript:void();" title="尾页">尾页</a></li>
						  	</c:when>
						  	<c:otherwise>
						  	<li><a href="/backend/userlist.html?currentpage=${page.pageCount}&s_loginCode=${s_loginCode}&s_referCode=${s_referCode}&s_roleId=${s_roleId}&s_isStart=${s_isStart}" title="尾页">尾页</a></li>
						  	</c:otherwise>
						    </c:choose>
					    </c:if>
						<c:if test="${page.pageCount == null}">
						<li class="active"><a href="javascript:void();" title="尾页">尾页</a></li>
					  	</c:if>
						
					  </ul>
				  </div>
</body>
</html>