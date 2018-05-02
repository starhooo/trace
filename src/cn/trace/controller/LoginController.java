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
import cn.trace.pojo.ProducterUser;
import cn.trace.service.producterUser.ProducterUserService;



@Controller
@Scope("prototype")
public class LoginController {
	private Logger logger = Logger.getLogger("LoginController.class");
	@Resource
	private ProducterUserService producterUserService;
	@RequestMapping("login")
	public  String  loginPage(){
		return "login";
		
	}
	@RequestMapping("login.html")
	@ResponseBody
	public String login(HttpSession session,@RequestParam("producterUser")  String producterUser){
		logger.debug("============>进来了登陆验证");
		if(null==producterUser || "".equals( producterUser)){
			return "nodata";
		}else{
			JSONObject  producterUserObject = JSONObject.fromObject( producterUser);
			logger.debug("==========="+ producterUserObject);
			ProducterUser producterUserObj = (ProducterUser)JSONObject.toBean( producterUserObject, ProducterUser.class);
			logger.debug("producterUser.getPhone()++++++++++++++++++++++++"+producterUserObj.getPhone());
			logger.debug("producterUserObj================================================="+producterUserObj);
			try {
//				return "success";
				ProducterUser _producterUser = producterUserService.seleProducterUser(producterUserObj);
				//logger.debug("//////////////////////////////////////////////////////////////_producterUser"+_producterUser.getUsernum());
				if(_producterUser!=null){
					session.setAttribute(Constants.SESSION_PRODUCTERUSER, _producterUser);
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
	@RequestMapping(value="success.html")
	
	public String loginSuccess(HttpSession session){
		logger.debug("+++++++++++++++++++++++++++登陆成功进行跳转！");
		return "company/comindex";
	}
	
}
