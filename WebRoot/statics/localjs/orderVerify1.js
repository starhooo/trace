$("#sub-btn").click(function(){
	var orderInfo = new Object();
	orderInfo.id = $.trim($("#id").val());
	orderInfo.verification_code = $.trim($("#verification_code").val());
	alert(orderInfo.id );
	alert(orderInfo.verification_code);
	if(orderInfo.id==""||orderInfo.id==null){
		$("#id").focus();
		$("#formtip").css("color","red");
		$("#formtip").html("对不起，订单序号不能为空！");
	}else if(orderInfo.verification_code==""||orderInfo.verification_code==null){
		$("#verification_code").focus();
		$("#formtip").css("color","red");
		$("#formtip").html("对不起,验证码不能为空！")
	}else{
		$("#formtip").html("");
		$.ajax({
			url:'verify.html',
			type:'POST',
			data:{orderInfo:JSON.stringify(orderInfo)},
			timeout:1000,
			error:function(){
				$("#formtip").css("color","red");
				$("#formtip").html("验证失败！请重试。")
			},
			success:function(result){
				if(result!=" "&&"success"==result){
					alert("验证成功,请及时取走快递！");
					window.location.href = 'success.html';
				}else if("failed" == result){
					$("#formtip").css("color","red");
					$("#formtip").html("您的验证信息有误，该订单不存在,验证失败！");
					$("#id").val('');
					$("#verification_code").val('');
				}else if("nodata" == result){
					$("#formtip").css("color","red");
					$("#formtip").html("对不起，没有任何数据需要处理！请重试。");
				}
			}
		});
	}
});