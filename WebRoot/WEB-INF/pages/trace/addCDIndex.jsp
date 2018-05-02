<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>
</head>
<frameset rows="100,*" cols="*" scrolling="No" framespacing="0"
	frameborder="no" border="0"> <frame src="head"
	name="headmenu" id="mainFrame" title="mainFrame"><!-- 引用头部 -->
<!-- 引用左边和主体部分 --> 
<frameset rows="100*" cols="220,*" scrolling="No"
	framespacing="0" frameborder="no" border="0"> 
<frame src="left" name="leftmenu" id="mainFrame" title="mainFrame">
<frame src="addCheckDaily.html" name="main" scrolling="yes" noresize="noresize"
	id="rightFrame" title="rightFrame">
</frameset>

</frameset>
</html>

