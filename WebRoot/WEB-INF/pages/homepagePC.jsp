<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    
   <%    
    String path = request.getContextPath();    
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
   
   	 %>   
   	
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<link rel="stylesheet" href="statics/css/swiper-3.4.2.min.css" />
<link rel="stylesheet" href="statics/css/homepagePC.css" />
<body>
    <header>
        <ul class="nav clearfix">
            <li><a href="#">首页</a></li>
            <li><a href="helpBuy.html">我要送</a></li>
            <li><a href="#">我要寄</a></li>
            <li><a href="#">物流网点</a></li>
            <li><a href="#">关于我们</a></li>
        </ul>
        <ul class="login">
        
            <li><a href="login" class="login-a">登录</a></li>
            <li class="btn-login"><a href="#">注册</a></li>
        </ul>
    </header>
    <!--轮播图-->
    <div class="swiper-container">
        <div class="swiper-wrapper">
            <div class="swiper-slide" style="background-image:url(statics/image/homepagePC/banner-2.jpg)"></div>
            <div class="swiper-slide" style="background-image:url(statics/image/homepagePC/banner-3.jpg)"></div>
            <div class="swiper-slide" style="background-image:url(statics/image/homepagePC/banner-5.jpg)"></div>
            <div class="swiper-slide" style="background-image:url(statics/image/homepagePC/banner-7.jpg)"></div>
        </div>
        <!-- Add Pagination -->
        <div class="swiper-pagination swiper-pagination-white swiper-pagination-clickable swiper-pagination-bullets">
            <span class="swiper-pagination-bullet swiper-pagination-bullet-active"></span>
            <span class="swiper-pagination-bullet"></span>
            <span class="swiper-pagination-bullet"></span>
            <span class="swiper-pagination-bullet"></span>
        </div>
        <!-- Add Arrows -->
        <div class="swiper-button-next swiper-button-white"></div>
        <div class="swiper-button-prev swiper-button-white"></div>
    </div>
    <ul class="introduce clearfix">
        <li class="clearfix">
            <div class="icon-h1 clearfix">
                <img  src="statics/image/homepagePC/fangkuang.png" alt="平台" />
                <h1>30+物流合作企业</h1>
            </div>
            <p class="title-first">和众多物流企业建立合作关系</p>
            <p class="title-second">包括圆通，中通，顺丰等</p>
        </li>
        <li class="clearfix">
            <div class="icon-h1 clearfix">
                <img src="statics/image/homepagePC/point.png" alt="坐标" />
                <h1>覆盖大中小县城村镇</h1>
            </div>
            <p class="title-first">覆盖省内大多数县城村镇</p>
            <p class="title-second">包括渭南，宝鸡等周边城镇</p>
        </li>
        <li class="clearfix">
            <div class="icon-h1 clearfix">
                <img src="statics/image/homepagePC/people.png" alt="用户" />
                <h1>拥有庞大的用户群</h1>
            </div>
            <p class="title-first">包括在校大学生</p>
            <p class="title-second">以及各行各业的从业人员</p>
        </li>
    </ul>
    <div class="erweima">
        <img src="statics/image/homepagePC/banner-4.jpeg"/>
    </div>
    <div class="free-people">
        <h1 class="free-people-title">自由快递人</h1>
        <img class="free-people-img" src="statics/image/homepagePC/people.jpg"/>
    </div>
    <div class="operator">
        <h1 class="operator-title">运营产品</h1>
        <div class="operator-background">
            <img class="operator-img" src="statics/image/homepagePC/app show.jpg">
        </div>        
    </div>
    <div class="cooperation">
        <h1 class="cooperation-title">合作平台</h1>
        <div class="cooperation-backgroundImg">
            <ul class="clearfix">
                <li>顺丰速运</li>
                <li>顺丰速运</li>
                <li>顺丰速运</li>
                <li>顺丰速运</li>
                <li>顺丰速运</li>
                <li>顺丰速运</li>
                <li>顺丰速运</li>
                <li>顺丰速运</li>
                <li>顺丰速运</li>
                <li>顺丰速运</li>
                <li>顺丰速运</li>
                <li>顺丰速运</li>
                <li>顺丰速运</li>
                <li>顺丰速运</li>
                <li>顺丰速运</li>
            </ul>
        </div>
    </div>
    <footer class="clearfix">
        <div class="friend">
            <h1>友情链接</h1>
        </div>
        <div class="service">
            <h1>客服热线</h1>
            <p class="phone-number">400-400-400</p>
            <p class="time">24 x 7小时&nbsp;&nbsp;&nbsp;全天服务</p>
        </div>
        <ul class="share clearfix">
            <li><img src="statics/image/homepagePC/weibo.png" alt="微博" ></li>
            <li><img src="statics/image/homepagePC/weixin.png" alt="微信"></li>
            <li><img src="statics/image/homepagePC/QQ.png" alt="QQ" /></li>
        </ul>
    </footer>
</body>
<script type="text/javascript" src="statics/js/common/swiper-3.4.2.min.js"></script>
<script type="text/javascript" src="statics/js/homepagePC.js"></script>
</html>
