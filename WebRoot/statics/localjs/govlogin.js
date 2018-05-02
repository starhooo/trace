
$("#login-btn").click(function(){
	
	var goverment  = new Object();
	goverment.govuser = $.trim($("#usernum").val());
	goverment.govpassword = $.trim($("#password").val());
	
	
	if(goverment.govuser == "" || goverment.govuser == null){
		 $("#usernum").focus();
		 $("#formtip").css("color","red");
		 $("#formtip").html("对不起，登录账号不能为空。");
	}else if(goverment.govpassword == "" || goverment.govpassword == null){
		$("#password").focus();
		$("#formtip").css("color","red");
		$("#formtip").html("对不起，登录密码不能为空。");
	}else{
		$("#formtip").html("");
		
		$.ajax({
			url: 'govlogin.html',
			type: 'POST',
			data:{goverment:JSON.stringify(goverment)},
			timeout: 1000,
			error: function(){
				$("#formtip").css("color","red");
				$("#formtip").html("登录失败！请重试error。");
			},
			success: function(result){
				if(result != "" && "success" == result){
					window.location.href='govsuccess.html';
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


