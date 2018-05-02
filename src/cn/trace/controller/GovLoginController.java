package cn.trace.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.trace.common.Constants;
import cn.trace.pojo.Goverment;
import cn.trace.service.goverment.GovermentService;

@Controller
@Scope("prototype")
public class GovLoginController {
	private Logger logger = Logger.getLogger("GovLoginController.class");
	@Resource
	private GovermentService  govermentService;
	@RequestMapping("govlogin")
	public  String  loginPage(){
		return "govlogin";
		
	}
	@RequestMapping("govlogin.html")
	@ResponseBody
	public String login(HttpSession session,@RequestParam("goverment")  String goverment){
		logger.debug("============>进来了登陆验证");
		if(null==goverment || "".equals( goverment)){
			return "nodata";
		}else{
			JSONObject  govermentObject = JSONObject.fromObject( goverment);
			logger.debug("==========="+ govermentObject);
			Goverment govermentObj = (Goverment)JSONObject.toBean( govermentObject, Goverment.class);
		
			try {
//				return "success";
				Goverment _goverment =govermentService.getGoverment(govermentObj);
				//logger.debug("//////////////////////////////////////////////////////////////_producterUser"+_producterUser.getUsernum());
				if(_goverment!=null){
					session.setAttribute(Constants.SESSION_GOVERMENT, _goverment);
					return "success";
				}else{
					return "pwderror";
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "failed";
			}
		}
	} 
	@RequestMapping(value="govsuccess.html")
	
	public String loginSuccess(HttpSession session){
		logger.debug("+++++++++++++++++++++++++++登陆成功进行跳转！");
		return "works_home";
	}
	
}
