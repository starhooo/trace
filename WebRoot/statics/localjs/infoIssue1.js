$("#sub-btn").click(function(){
	var express = new Object();
	express.logistics_num = $.trim($("#logistics_num").val());
	
	express.address = $.trim($("#address").val());
	express.logistics_address = $.trim($("#logistics_address").val());
	express.phone = $.trim($("#phone").valueOf());
	alert(express.phone);
	
	express.status = 0;//快递当前状态的配送状态(0表示未配送，1表示已配送)
	if(express.logistics_num == "" || express.logistics_num == null){
		 $("#logistics_num").focus();
		 $("#formtip").css("color","red");
		 $("#formtip").html("对不起，快递编号不能为空。");
	}else if(express.address == "" || express.address == null){
		$("#express.address").focus();
		$("#formtip").css("color","red");
		$("#formtip").html("对不起，送达地点不能为空。");
	}else if(express.logistics_address == "" || express.logistics_address == null){
		$("#express.logistics_address").focus();
		$("#formtip").css("color","red");
		$("#formtip").html("对不起，物流点地址不能为空。");
	}else if(express.phone == "" || express.phone == null){
		$("#express.phone").focus();
		$("#formtip").css("color","red");
		$("#formtip").html("对不起，联系电话不能为空。");
	}else{
		$("#formtip").html("");
		$.ajax({
			url:'infoIssueDeal',
			type:'POST',
			data:{express:JSON.stringify(express)},
			timeout:1000,
			error:function(){
				$("#formtip").css("color","red");
				$("#formtip").html("发布失败，请重试。")
				
			},
			success:function(result){
				if(""!=result&& "success"==result){
					alert("已发布成功！")
					window.location.href='success.html';
				}else if("failed"==result){
					$("#formtip").css("color","red");
					$("#formtip").html("发布失败，请重试。")
					
				}else if("nodata"==result){
					$("#formtip").css("color","red");
					$("#formtip").html("没有数据可以处理！")
				}
			}
		});
		}
	
});