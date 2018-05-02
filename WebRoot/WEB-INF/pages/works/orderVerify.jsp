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
		<p>
			<label>请输入订单序号：</label>
			<input id="id" type="text"><br/>
			<label>请输入订单验证码：</label>
			<input id="verification_code"  type="text">
		</p>
		<ul id="formtip" ></ul>
		<button id="sub-btn">验证</button>
	</div>
	<script type="text/javascript" src="statics/js/common/jquery.min.js" ></script>
	<script type="text/javascript" src="statics/localjs/orderVerify1.js"></script>
</body>
</html>