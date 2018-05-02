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

	<div>
		<p>
			<label>快递编号：</label>
			<input  id="logistics_num"  type="text"><br/> 
			<label>详细地址：</label>
			<input  id="address"  type="text"><br/>
			<label>物流网点地址：</label>
			<input  id="logistics_address"  type="text"><br/>
			<label>电话：</label>
			<input  id="phone"  type="text"><br/>
		</p>
	</div>
	<ul id="formtip"></ul>
	<button  id="sub-btn">提交</button>
</div>
	<script type="text/javascript" src="statics/js/common/jquery.min.js" ></script>
	<script type="text/javascript" src="statics/js/common/jquery-1.7.2.js"></script> 
	<script type="text/javascript" src="statics/localjs/infoIssue.js"></script>
	
</body>
</html>