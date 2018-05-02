<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>主要内容区main</title>
<link href="statics/css/brand.css" type="text/css" rel="stylesheet" />
<link href="statics/css/brandmain.css" type="text/css" rel="stylesheet" />
<link rel="shortcut icon" href="images/main/favicon.ico" />
<style>
body{overflow-x:hidden; background:#f2f0f5; padding:15px 0px 10px 5px;}
#searchmain{ font-size:12px;}
#search{ font-size:12px; background:#548fc9; margin:10px 10px 0 0; display:inline; width:100%; color:#FFF; float:left}
#search form span{height:40px; line-height:40px; padding:0 0px 0 10px; float:left;}
#search form input.text-word{height:24px; line-height:24px; width:180px; margin:8px 0 6px 0; padding:0 0px 0 10px; float:left; border:1px solid #FFF;}
#search form input.text-but{height:24px; line-height:24px; width:55px; background:url(images/main/list_input.jpg) no-repeat left top; border:none; cursor:pointer; font-family:"Microsoft YaHei","Tahoma","Arial",'宋体'; color:#666; float:left; margin:8px 0 0 6px; display:inline;}
#search a.add{ background:url(images/main/add.jpg) no-repeat -3px 7px #548fc9; padding:0 10px 0 26px; height:40px; line-height:40px; font-size:14px; font-weight:bold; color:#FFF; float:right}
#search a:hover.add{ text-decoration:underline; color:#d2e9ff;}
#main-tab{ border:1px solid #eaeaea; background:#FFF; font-size:12px;}
#main-tab th{ font-size:12px; background:url(images/main/list_bg.jpg) repeat-x; height:32px; line-height:32px;}
#main-tab td{ font-size:12px; line-height:40px;}
#main-tab td a{ font-size:12px; color:#548fc9;}
#main-tab td a:hover{color:#565656; text-decoration:underline;}
.bordertop{ border-top:1px solid #ebebeb}
.borderright{ border-right:1px solid #ebebeb}
.borderbottom{ border-bottom:1px solid #ebebeb}
.borderleft{ border-left:1px solid #ebebeb}
.gray{ color:#dbdbdb;}
td.fenye{ padding:10px 0 0 0; text-align:right;}
.bggray{ background:#f9f9f9}
</style>
<link rel="stylesheet" href="statics/css/bootstrap.min.css">
<script type="text/javascript">
		function queryAllPerson(pageNum,pageSize){
			location.href="batch.html?pageNum="+pageNum+"&pageSize="+pageSize;
		}
</script>
</head>
<body>
<!--main_top-->
<table width="99%" border="0" cellspacing="0" cellpadding="0" id="searchmain">
  <tr>
    <td width="99%" align="left" valign="top">您的位置：批次管理</td>
  </tr>
  <tr>
    <td align="left" valign="top">
    <table width="100%" border="0" cellspacing="0" cellpadding="0" id="search">
  		<tr>
   		 <td width="90%" align="left" valign="middle">
	         <form method="post" action="">
	         <span>产品号码：</span>
	         <input type="text" name="" value="" class="text-word">
	         <input name="" type="button" value="查询" class="text-but">
	         </form>
         </td>
  		  <td width="10%" align="center" valign="middle" style="text-align:right; width:150px;"><a href="addBatch.html" target="mainFrame" onFocus="this.blur()" class="add">新增批次</a></td>
  		</tr>
	</table>
    </td>
  </tr>
  <tr>
    <td align="left" valign="top">
    
    <table width="100%" border="0" cellspacing="0" cellpadding="0" id="main-tab">
      <tr>
        <th align="center" valign="middle" style="text-align:center;"  class="borderright">生产批号</th>
        <th align="center" valign="middle" style="text-align:center;" class="borderright">产品名称</th>
        <th align="center" valign="middle" style="text-align:center;" class="borderright">操作</th>
        
      </tr>
      <tbody>
    	<c:forEach  items="${pageInfo.list}" var="Batch">
      <tr onMouseOut="this.style.backgroundColor='#ffffff'" onMouseOver="this.style.backgroundColor='#edf5ff'">
        <td align="center" valign="middle" class="borderright borderbottom">${Batch.batchnumber}</td>
        <td align="center" valign="middle" class="borderright borderbottom">${Batch.productname}</td>
         <td align="center" valign="middle" class="borderbottom">
        <a href="productcheck.html?" target="mainFrame" onFocus="this.blur()" class="add">查看</a>
        <span class="gray">&nbsp;|&nbsp;</span>
        <a href="brandUpdate.html?" target="mainFrame" onFocus="this.blur()" class="add">修改</a>
        <span class="gray">&nbsp;|&nbsp;</span>
        <a href="delbrand.html?" target="mainFrame" onFocus="this.blur()" class="add">删除</a>
         <span class="gray">&nbsp;|&nbsp;</span>
        <a href="checkinfo.html?batchnumber=${Batch.batchnumber}" target="mainFrame" onFocus="this.blur()" class="add">巡检信息管理</a>
         <span class="gray">&nbsp;|&nbsp;</span>
        <a href="delbrand.html?" target="mainFrame" onFocus="this.blur()" class="add">作业信息管理</a>
         <span class="gray">&nbsp;|&nbsp;</span>
        <a href="delbrand.html?" target="mainFrame" onFocus="this.blur()" class="add">绑定作业地</a>
        </td>
      </tr>
       </c:forEach>
      </tbody>
    </table>
    </td>
    </tr>
</table>
     <div id="page_div">
	   <%@ include file="../common/pagehelper.jsp" %>
	</div>
</body>
</html>