<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
        <link rel="stylesheet" href="statics/css/login.css" />
    </head>
    <body>
    <form>
        <div class="login">
            <h1>企业用户登录</h1>
            <div class="adminName">
              	<input type="text" id="usernum" name="usernum" placeholder="请输入用户名" class="phone-number"  value=""/>
                <input placeholder="请输入密码" class="password" name="password" id="password" type="password" value="" />
                
                <img src="statics/image/login/phone.png" class="phone-icon"/>
                <img  src="statics/image/login/password.png"  class="password-icon"/>
            </div>
            <div class="chooseForget">
                <input type="checkbox" class="notforget"/><span>记住密码</span>
            </div>  
            <ul id="formtip"></ul>        
            <button id="login-btn" type="button">登录</button>
            <a href="#" class="newAdmin">新用户注册</a>
            <a href="#" class="forget">忘记密码？</a>
        </div>

    </body>
     <script type="text/javascript" src="statics/js/common/jquery.min.js" ></script>
     <script type="text/javascript" src="statics/localjs/login.js"></script>
</html>
