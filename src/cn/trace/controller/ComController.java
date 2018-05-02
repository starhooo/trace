package cn.trace.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.github.miemiedev.mybatis.paginator.domain.Order;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.trace.common.Constants;
import cn.trace.dao.oparea.OpareaMapper;
import cn.trace.pojo.Batch;
import cn.trace.pojo.Brand;
import cn.trace.pojo.Dealer;
import cn.trace.pojo.Oparea;
import cn.trace.pojo.Optype;
import cn.trace.pojo.Product;
import cn.trace.pojo.ProducterUser;
import cn.trace.service.batch.BatchService;
import cn.trace.service.dealer.DealerService;
import cn.trace.service.oparea.OpareaService;
import cn.trace.service.optype.OptypeService;
import cn.trace.service.product.ProductService;



@Controller
@Scope("prototype")
public class  ComController {
	@Resource
	private  DealerService   dealerService;
	@Resource 
	private OptypeService optypeService;
	@Resource
	private OpareaService opareaService;
	
	private Logger logger = Logger.getLogger(ProducterController.class);
	@RequestMapping(value="dealer.html",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView getDealerList(HttpSession session,HttpServletRequest request,HttpServletResponse response){
		int num = 1;
		int size = 5;
		String pageNum = request.getParameter("pageNum");
		String pageSize = request.getParameter("pageSize");
		if(pageNum!=null&&!"".equals(pageNum)){
			num = Integer.parseInt(pageNum);
		}
		if(pageSize!=null&&!"".equals(pageSize)){
			size = Integer.parseInt(pageSize);
		}
		PageHelper.startPage(num, size);
		String str = "id.desc";
		Order.formString(str);
		Dealer dealer = new Dealer();
		//从登陆用户session中获取公司编号
		logger.debug("==============getDealerList=============");
		ProducterUser producterUser = (ProducterUser)session.getAttribute("producterUserSession");
		logger.debug("===============getDealerList=========//从登陆用户session中获取公司编号"+producterUser);
		//brand.setPronumber(producterUser.getPronumber());
		
		dealer.setProducternum(producterUser.getPronumber());
		List<Dealer>  dealerList = null;
    	try {	
    		dealerList = dealerService.getDealerList(dealer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Dealer  dealer1 : dealerList) {
			logger.debug("======================================getDealerList是否查到数据"+dealer1.getDealername());
		}
		ModelAndView model =new ModelAndView();
		PageInfo<Dealer> pageinfo= new PageInfo<Dealer>(dealerList);
		model.addObject(pageinfo);
		model.setViewName("company/dealerList");
		
		return model;
	}
	@RequestMapping(value="optype.html",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView getOptypeList(HttpSession session,HttpServletRequest request,HttpServletResponse response){
		int num = 1;
		int size = 5;
		String pageNum = request.getParameter("pageNum");
		String pageSize = request.getParameter("pageSize");
		if(pageNum!=null&&!"".equals(pageNum)){
			num = Integer.parseInt(pageNum);
		}
		if(pageSize!=null&&!"".equals(pageSize)){
			size = Integer.parseInt(pageSize);
		}
		PageHelper.startPage(num, size);
		String str = "id.desc";
		Order.formString(str);
		
		
		List<Optype>  optypeList = null;
    	try {	
    		optypeList = optypeService.getOptypeList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		ModelAndView model =new ModelAndView();
		PageInfo<Optype> pageinfo= new PageInfo<Optype>(optypeList);
		model.addObject(pageinfo);
		model.setViewName("company/optypeList");
		
		return model;
	}
	//删除optyPe
	@RequestMapping(value="deloptype.html",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView DelOptype(HttpSession session,HttpServletRequest request,HttpServletResponse response,Model model){
		//Map<String,Object> baseModel= (Map<String,Object>)session.getAttribute(Constants.SESSION_PRODUCTERUSER);
		String oprationnum = request.getParameter("oprationnum");
		int a = Integer.parseInt(oprationnum);
		Optype optype = new Optype();
		optype.setOprationnum(a);
		
		try {
			optypeService.delOptype(optype);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		model.addAttribute(session);
		return new ModelAndView("company/comoptypeList");
		
		
	}
	//查询地块
	@RequestMapping(value="oparea.html",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView getOpaereaList(HttpSession session,HttpServletRequest request,HttpServletResponse response){
		int num = 1;
		int size = 5;
		String pageNum = request.getParameter("pageNum");
		String pageSize = request.getParameter("pageSize");
		if(pageNum!=null&&!"".equals(pageNum)){
			num = Integer.parseInt(pageNum);
		}
		if(pageSize!=null&&!"".equals(pageSize)){
			size = Integer.parseInt(pageSize);
		}
		PageHelper.startPage(num, size);
		String str = "id.desc";
		Order.formString(str);
		ProducterUser producterUser = (ProducterUser)session.getAttribute("producterUserSession");
		Oparea oparea = new Oparea();
		oparea.setPronumber(producterUser.getPronumber());
		
		List<Oparea> opareaList = null;
    	try {	
    		opareaList = opareaService.getOpareaList(oparea);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	ModelAndView model =new ModelAndView();
		PageInfo<Oparea> pageinfo= new PageInfo<Oparea>(opareaList);
		model.addObject(pageinfo);
		model.setViewName("company/opareaList");
		
		return model;
	
        }
	
	  
}