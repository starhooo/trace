
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
			<tr><td style="center;">当前位置：新增批次</td></tr>
		</thead>
		<form  action="${pageContext.request.contextPath}/addBatchSub"   method="post">
		<tbody>
			<tr>
				<td style="text-align:right;">生产批次</td>
				<td style="text-align:left;"><input id="batchnumber"  type="text" name="batchnumber" value=""  style="width:245px;height:25px;"></td>
			</tr>
			<br/>
			<br/>
			<br/>
			<br/>
			<tr>
				<td style="text-align:right;">生产产品</td>
				<td >
					    <select id="productname"  name="productname" class="select">
					        <option value="1">贵阳</option>
					        <option value="2">六盘水</option>
					        <option value="3">都匀</option>
					        <option value="4">福泉</option>
					        <option value="5">遵义</option>
					        <option value="6">兴义</option>
					        
					    </select>

				</td>
			</tr>
			
			<tr>
				<td style="text-align:center;" colspan="2">
				    <input type="submit"  value="提交 " onclick="this.form.submit()"></button>
					<button type="button" class="page-btn" name="return" onclick="javascript:location.href='newsDetailList.jsp'">返回</button>
				</td>
			</tr>
		</tbody>
			<script type="text/javascript">
				$(function(){
					$('product').selectlist({
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