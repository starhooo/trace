package cn.trace.controller;

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

import cn.trace.pojo.Optype;

@Controller
@Scope("prototype")
public class PageController {
	@RequestMapping("left")
	public  String  leftPage(){
		return "company/left";
	}
	@RequestMapping("main")
	public  String  mainPage(){
		return "company/main";
	}
	@RequestMapping("head")
	public  String  headPage(){
		return "company/head";
	}
	@RequestMapping("cominfo.html")
	public  String  cominfoPage(){
		return "company/cominfo";
	}
	@RequestMapping("addBrand.html")
	public String  addBrandPage(){
		return "company/addBrand";
	}
	@RequestMapping(value="addBatch.html",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView AddBatch(HttpSession session,HttpServletRequest request,HttpServletResponse response,Model model){
		
		model.addAttribute(session);
		return new ModelAndView("company/addBatchIndex");
	}
	@RequestMapping(value="addBatch",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView  addBatchPage(HttpSession session,HttpServletRequest request,HttpServletResponse response,Model model){
		model.addAttribute(session);

		return new ModelAndView("company/addBatch");
	}
	@RequestMapping(value="ckinfo1.html",method={RequestMethod.POST,RequestMethod.GET})
	public String  checkInfoPage(HttpSession session,HttpServletRequest request,HttpServletResponse response,Model model){
		String batchnumber = request.getParameter("batchnumber");
		model.addAttribute("batchnumber", batchnumber);
		return ("company/checkInfoIndex");
	}
	@RequestMapping("addCheckDaily.html")
	public String  addCheckDailyPage(){
		return "trace/addCheckDaily";
	}
	@RequestMapping(value="addCDIndex.html",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView  addCDIndexPage(HttpSession session,HttpServletRequest request,HttpServletResponse response,Model model){
		model.addAttribute(session);
	    String batchnumber = request.getParameter("batchnumber");
	    System.out.println("=================================================ModelAndView  addCDIndexPage"+batchnumber);
	    model.addAttribute("batchnumber", batchnumber);
		return new ModelAndView("trace/addCDIndex");
	}
	
}
