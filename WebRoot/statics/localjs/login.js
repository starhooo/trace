
$("#login-btn").click(function(){
	
	var producterUser  = new Object();
	producterUser.usernum = $.trim($("#usernum").val());
	producterUser.password = $.trim($("#password").val());
	if(producterUser.usernum == "" || producterUser.usernum == null){
		 $("#usernum").focus();
		 $("#formtip").css("color","red");
		 $("#formtip").html("对不起，登录账号不能为空。");
	}else if(producterUser.password == "" || producterUser.password == null){
		$("#password").focus();
		$("#formtip").css("color","red");
		$("#formtip").html("对不起，登录密码不能为空。");
	}else{
		$("#formtip").html("");
		
		$.ajax({
			url: 'login.html',
			type: 'POST',
			data:{producterUser:JSON.stringify(producterUser)},
			timeout: 1000,
			error: function(){
				$("#formtip").css("color","red");
				$("#formtip").html("登录失败！请重试error。");
			},
			success: function(result){
				if(result != "" && "success" == result){
					window.location.href='success.html';
				}else if("failed" == result){
					$("#formtip").css("color","red");
					$("#formtip").html("登陆失败！请重试。");
					$("#usernum").val('');
					$("#password").val('');
				}
				else if("nophone" == result){
					$("#formtip").css("color","red");
					$("#formtip").html("登录账号不存在，请重试。");
				}else if("nodata" == result){
					$("#formtip").css("color","red");
					$("#formtip").html("对不起，没有任何数据需要处理！请重试。");
				}else if("pwderror" == result){
					$("#formtip").css("color","red");
					$("#formtip").html("登录密码错误，请重试。");
				}
			}
			});
	}
});














//<!--let urlRequestPrefix = 'http://192.168.124.22:8090/ubangdi/login';//登陆url
////点击登陆按钮
//$('#login-btn').click(function(){
//	var works = new Object();
//    works.hone = $('.phone-number').val();
//    works.password = $('.password').val();
//    $.ajax({
//    	url: '/login.html',
//		type: 'POST',
//    	data:{works:JSON.stringify(works)},
//    	#login-btn)
//    	timeout: 1000,
//    	error: function(){
//			$("#formtip").css("color","red");
//			$("#formtip").html("登录失败！请重试。");
//    	},
//    	success: function(result){
//			if(result != "" && "success" == result){
//				window.location.href='/main.html';
//			}else if("failed" == result){
//				$("#formtip").css("color","red");
//				$("#formtip").html("登陆失败！请重试。");
//				$("#logincode").val('');
//				$("#password").val('');
//			}
//			else if("nologincode" == result){
//				$("#formtip").css("color","red");
//				$("#formtip").html("登录账号不存在，请重试。");
//			}else if("nodata" == result){
//				$("#formtip").css("color","red");
//				$("#formtip").html("对不起，没有任何数据需要处理！请重试。");
//			}else if("pwderror" == result){
//				$("#formtip").css("color","red");
//				$("#formtip").html("登录密码错误，请重试。");
//			}
//		}
//		
//});
//-->
