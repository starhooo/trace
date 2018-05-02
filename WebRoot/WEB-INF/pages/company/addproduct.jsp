
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
		<link href="statics/css/common.css" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" type="text/css" href="statics/css/jquery.selectlist.css">
		<style type="text/css">
			body {
				padding: 10px;
			}
			
			.item {
				width: 180px;
				height: 32px;
				margin: 100px auto;
			}
		</style>

	</head>
<body>
	
	<table  width="100%" border="0" cellspacing="5" cellpadding="0">
		<thead>
			<tr><td style="center;">当前位置：添加产品</td></tr>
		</thead>
		<form  action="${pageContext.request.contextPath}/addproduct?producternum=${producterUser.pronumber}"   method="post">
		<tbody>
			<tr>
				<td style="text-align:right;">产品名称</td>
				<td style="text-align:left;"><input id="productname"  type="text" name="productname" value=""  style="width:245px;height:25px;"></td>
			</tr>
			<br/>
			<tr>
				<td style="text-align:right;">产品品牌</td>
				<td >
					   <select id="brandnum" name="brandnum">
						<c:forEach items="${brandList}" var="Brand" >  
					           <option value="${Brand.brandnum}">${Brand.brandname}</option>  
					    </c:forEach>
						</select>
				</td>
			</tr>
			<tr>
				<td style="text-align:right;" >产品描述</td>
				<td style="text-align:left;"><textarea id="productdes" name="productdes" rows="8" cols="30"></textarea></td>

			</tr>
			<br/>
			<tr>
				<td style="text-align:right;" >上传图标 </td>
				<td style="text-align:left;"><input type="file" name="picPath" value=""/></td>
			</tr>
			<tr>
				<td style="text-align:center;" colspan="2">
				    <input type="submit"  value="提交 " onclick="this.form.submit()"></button>
					<button type="button" class="page-btn" name="return" onclick="javascript:location.href='newsDetailList.jsp'">返回</button>
				</td>
			</tr>
		</tbody>
			<script src="statics/js/jquery-1.9.1.min.js"></script>
			<script src="statics/js/jquery.selectlist.js"></script>
			<script type="text/javascript">
				$(function(){
					$('select').selectlist({
						zIndex: 10,
						width: 250,
						height: 30
					});		
				})
				
			</script>

		</form>
	</table>
	
</body>
</html>