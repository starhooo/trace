
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	

	<head>
	<meta http-equiv="Content-Type" content="multipart/form-data; charset=utf-8" />
		<link href="statics/css/common.css" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" type="text/css" href="statics/css/jquery.selectlist.css">
		 <link rel="stylesheet" href="statics/css/jHsDate.css" />
		 <link rel="stylesheet" type="text/css" href="statics/css/public.css" />
         <script type="text/javascript" src="statics/js/jquery.min.js"></script>
	     <script type="text/javascript" src="statics/js/public.js"></script>
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


	<!-- 头部 -->
	<div class="head"  style="width:100%;height:100px;position:absolute;top:0;left:0;">
		<div class="headL">
			<!-- img class="headLogo" src="statics/image/logLOGO.png"/> -->
			
		</div>
		<div class="headR">
			<span style="color:#FFF">欢迎：admin</span> <a href="head2.html" rel="external">【退出】</a>
		</div>
	</div>
	
	<!-- 左边节点 -->
	<div class="container" style="width:220px;height:562px;position:absolute;top:100px;left:0px;float:left;">

		<div class="leftsidebar_box">
			<a href="main.html" target="main"><div class="line">
					<img src="statics/image/coin01.png" />&nbsp;&nbsp;首页
				</div></a>
			<dl class="system_log">
		
				<dt>
					<img class="icon1" src="statics/image/coin03.png" /><img class="icon2"
						src="statics/image/coin04.png" /> 企业基础管理<img class="icon3"
						src="statics/image/coin19.png" /><img class="icon4"
						src="statics/image/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="statics/image/coin111.png" /><img class="coin22"
						src="statics/image/coin222.png" /><a class="cks" href="cominfo.html"
						target="main">本企业信息</a><img class="icon5" src="statics/image/coin21.png" />
				</dd>

				<dd>
					<img class="coin11" src="statics/image/coin111.png" /><img class="coin22"
						src="statics/image/coin222.png" /><a class="cks" href="brand.html"
						target="main">品牌管理</a><img class="icon5" src="statics/image/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="statics/image/coin111.png" /><img class="coin22"
						src="statics/image/coin222.png" /><a class="cks" href="product.html"
						target="main">产品管理</a><img class="icon5" src="statics/image/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="statics/image/coin111.png" /><img class="coin22"
						src="statics/image/coin222.png" /><a class="cks" href="dealer.html"
						target="main">经销商管理</a><img class="icon5" src="statics/image/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="statics/image/coin111.png" /><img class="coin22"
						src="statics/image/coin222.png" /><a class="cks" href="optype.html"
						target="main">作业类型管理</a><img class="icon5" src="statics/image/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="statics/image/coin111.png" /><img class="coin22"
						src="statics/image/coin222.png" /><a class="cks" href="oparea.html"
						target="main">作业地管理</a><img class="icon5" src="statics/image/coin21.png" />
				</dd>
			</dl>
		
			<dl class="system_log">
				<dt>
					<img class="icon1" src="statics/image/coin15.png" /><img class="icon2"
						src="statics/image/coin16.png" /> 追溯管理<img class="icon3"
						src="statics/image/coin19.png" /><img class="icon4"
						src="statics/image/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="statics/image/coin111.png" /><img class="coin22"
						src="statics/image/coin222.png" /><a class="cks" href="batch.html"
						target="main">批次管理</a><img class="icon5" src="statics/image/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="statics/image/coin111.png" /><img class="coin22"
						src="statics/image/coin222.png" /><a class="cks">销售管理</a><img class="icon5"
						src="statics/image/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="statics/image/coin111.png" /><img class="coin22"
						src="statics/image/coin222.png" /><a class="cks">运输管理</a><img class="icon5"
						src="statics/image/coin21.png" />
				</dd>
			</dl>
			<dl class="system_log">
				<dt>
					<img class="icon1" src="statics/image/coin17.png" /><img class="icon2"
						src="statics/image/coin18.png" /> 标签管理<img class="icon3"
						src="statics/image/coin19.png" /><img class="icon4"
						src="statics/image/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="statics/image/coin111.png" /><img class="coin22"
						src="statics/image/coin222.png" /><a class="cks">企业编码管理</a><img class="icon5"
						src="statics/image/coin21.png" />
				</dd>
			</dl>
			
			<dl class="system_log">
				<dt>
					<img class="icon1" src="statics/image/coin11.png" /><img class="icon2"
						src="statics/image/coin12.png" /> 营销宣传管理<img class="icon3"
						src="statics/image/coin19.png" /><img class="icon4"
						src="statics/image/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="statics/image/coin111.png" /><img class="coin22"
						src="statics/image/coin222.png" /><a class="cks">新闻管理</a><img class="icon5" src="statics/image/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="statics/image/coin111.png" /><img class="coin22"
						src="statics/image/coin222.png" /><a class="cks">企业概况管理</a><img class="icon5" src="statics/image/coin21.png" />
				</dd>

			</dl>
			
			
			
			<dl class="system_log">
				<dt>
					<img class="icon1" src="statics/image/coinL1.png" /><img class="icon2"
						src="statics/image/coinL2.png" /> 系统管理<img class="icon3"
						src="statics/image/coin19.png" /><img class="icon4"
						src="statics/image/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="statics/image/coin111.png" /><img class="coin22"
						src="statics/image/coin222.png" /><a href="changepwd.html"
						target="main" class="cks">修改密码</a><img class="icon5"
						src="statics/image/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="statics/image/coin111.png" /><img class="coin22"
						src="statics/image/coin222.png" /><a class="cks">退出</a><img
						class="icon5" src="statics/image/coin21.png" />
				</dd>
			</dl>
			<dl class="system_log">
				<dt>
					<img class="icon1" src="statics/image/coin10.png" /><img class="icon2"
						src="statics/image/coin09.png" /> 其他管理<img class="icon3"
						src="statics/image/coin19.png" /><img class="icon4"
						src="statics/image/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="statics/image/coin111.png" /><img class="coin22"
						src="statics/image/coin222.png" /><a class="cks">其他</a><img class="icon5"
						src="statics/image/coin21.png" />
				</dd>
			
			</dl>

		</div>

	</div>
	<!-- right -->
	
	<div style="width:732px;height:562px;position:absolute;top:100px;left:220px;float:right">
	<table  width="100%" border="0" cellspacing="5" cellpadding="0">
		<thead>
			<tr><td style="center;"></td></tr>
		</thead>
		<form  action="addCheckDaily"   method="post">
		<tbody>
		<tr>
	
			        <td style="text-align:right;" ><span>巡检时间</span></td>
			        <td style="text-align:left;"><input type="date" id="ckdate"  name="ckdate" /></td>
	      
			<br/>
		</tr>	
			<tr>
				<td style="text-align:right;" >巡检内容</td>
				<td style="text-align:left;"><textarea id="ckcontent" name="ckcontent" rows="8" cols="30"></textarea></td>

			</tr>
			<br/>
			<tr>
				<td style="text-align:right;" >上传图片</td>
				<td style="text-align:left;"><input  enctype="multipart/form-data" type="file" name="pic"  id="pic" value=""/></td>
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
			
			<script type="text/javascript" src="statics/js/jquery.min.js"></script>
			<script type="text/javascript" src="statics/js/jHsDate.js"></script>
			<script type="text/javascript">
			$('#date').jHsDate();
			
		
			

			
			</script>
		</form>
	</table>
	</div>
</body>
</html>
