
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
		<link href="statics/css/common.css" rel="stylesheet" type="text/css" />
	</head>
<body>
	
	<table  width="100%" border="0" cellspacing="5" cellpadding="0">
		<thead>
			<tr><td style="center;">当前位置：修改品牌</td></tr>
		</thead>
		<form  action="${pageContext.request.contextPath}/brandUpdate?brandnum=${brand2.brandnum}"   method="post">
		<tbody>
			<tr>
				<td style="text-align:right;">品牌名称</td>
				<td style="text-align:left;"><input id="brandname"  type="text" name="brandname" value="${brand2.brandname}"/></td>
			</tr>
			<br/>
			<tr>
				<td style="text-align:right;" >品牌描述</td>
				<td style="text-align:left;"><textarea id="branddes" name="branddes" rows="8" cols="30">${brand2.branddes}</textarea></td>

			</tr>
			<br/>
			<tr>
				<td style="text-align:right;" >上传图片 </td>
				<td style="text-align:left;"><input type="file" name="picPath" value=""/></td>
			</tr>
			<tr>
				<td style="text-align:center;" colspan="2">
					<input type="submit"  value="保存 " onclick="this.form.submit()"></button>
					<button type="button" class="page-btn" name="return" onclick="javascript:location.href='newsDetailList.jsp'">返回</button>
				</td>
			</tr>
		</tbody>
		</form>
	</table>
	
</body>
</html>