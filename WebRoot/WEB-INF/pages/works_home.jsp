<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<ul><a href="#">欢迎您，${worksSession.phone}</a></ul>
		<ul><a href="#">注销</a></ul>
	</div>
	<a  href="infoIssue.html">发布信息</a><br/>
	<a href="Issued.html?pageNum=1&pageSize=2">已发布</a>
	<a  href="orderVerify.html">订单验证</a>
	<a href="track.html">历史足迹</a>
	
</body>
</html>