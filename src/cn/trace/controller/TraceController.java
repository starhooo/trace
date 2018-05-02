package cn.trace.controller;

import java.io.File;
import java.io.IOException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.miemiedev.mybatis.paginator.domain.Order;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.trace.pojo.Batch;
import cn.trace.pojo.Brand;
import cn.trace.pojo.CheckDaily;
import cn.trace.pojo.Product;
import cn.trace.pojo.ProducterUser;
import cn.trace.service.batch.BatchService;
import cn.trace.service.brand.BrandService;
import cn.trace.service.checkDaily.CheckDailyService;
import cn.trace.service.product.ProductService;
@Controller
@Scope("prototype")
public class TraceController {
	@Resource
	private BatchService batchService;
	@Resource
	private ProductService productService;
	@Resource
	private BrandService brandService;
	@Resource
	private CheckDailyService checkDailyService;
	private Logger logger = Logger.getLogger("TraceController.class");
	  //查询batchlist
			@RequestMapping(value="batch.html",method={RequestMethod.POST,RequestMethod.GET})
			public ModelAndView getBatchList(HttpSession session,HttpServletRequest request,HttpServletResponse response){
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
				Batch batch = new Batch();
				//从登陆用户session中获取公司编号
				
				ProducterUser producterUser = (ProducterUser)session.getAttribute("producterUserSession");
				
				//brand.setPronumber(producterUser.getPronumber());
				
				batch.setProducternum(producterUser.getPronumber());
				List<Batch>  batchList = null;
				//Batch batch2 = new Batch();
				
				
		    	try {	
		    		batchList = brandService.getBatchList(batch);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    
		        
		    	for(Batch batch2 : batchList){
			    	  int a  = 	batch2.getProductnum();
			    	  Product p1 = new Product();
			    	  Product p2 = new Product();
			    	  p1.setProductnum(a);
			    	  
			    	  try {
					    p2 = productService.getProduct(p1);
					  } catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					  }
			    	  batch2.setProductname(p2.getProductname());
		    	}
				
     			ModelAndView model =new ModelAndView();
				PageInfo<Batch> pageinfo= new PageInfo<Batch>(batchList);
				model.addObject(pageinfo);
				model.setViewName("company/batchList");
				
				return model;
			
			}
			
			@RequestMapping(value="addBatchSub",method={RequestMethod.POST,RequestMethod.GET})
			public ModelAndView  AddBrand(HttpSession session,HttpServletRequest request,HttpServletResponse response,Model model){
				String batchnumber = request.getParameter("batchnumber");
				String productname = request.getParameter("productname");
				logger.debug("=+++++++++++++++++++@RequestMapping(value=addBatchSub++++batchnumber"+batchnumber);
				
				logger.debug("=+++++++++++++++++++@RequestMapping(value=addBatchSub++++productname"+productname);
				
				Batch batch = new Batch();
				batch.setBatchnumber(batchnumber);
				
				int a = Integer.parseInt(productname);
				batch.setProductnum(a);
				
				ProducterUser producterUser = (ProducterUser)session.getAttribute("producterUserSession");
				logger.debug("========================//从登陆用户session中获取公司编号"+producterUser);
				batch.setProducternum(producterUser.getPronumber());
				
				try {
					brandService.addBatch(batch);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				model.addAttribute(session);
				return new ModelAndView("redirect:batch.html");
				
			}
			//查询巡检内容
			@RequestMapping(value="checkinfo.html",method={RequestMethod.POST,RequestMethod.GET})
			public ModelAndView  CheckInfo(HttpSession session,HttpServletRequest request,HttpServletResponse response,Model model){
				
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
				String batchnumber = request.getParameter("batchnumber");

				logger.debug("=+++++++++++++++++++@RequestMapping(vvalue=checkinfo.html++++batchnumber"+batchnumber);
				ProducterUser producterUser = (ProducterUser)session.getAttribute("producterUserSession");
				
				CheckDaily cd = new CheckDaily();
				cd.setBatchnumber(batchnumber);
				cd.setProducternum(producterUser.getPronumber());
				
				List<CheckDaily> cdList = null;
				
				try {
					cdList = checkDailyService.getCheckDailyList(cd);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for(CheckDaily  cd1 : cdList){
					  logger.debug("HAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
					  Batch batch = new Batch();
					  Batch batch1 = new Batch();
					  Product p = new Product();
					  Product p1 = new Product();
			    	  String bn  = cd1.getBatchnumber();
			    	  batch.setBatchnumber(bn);
			    	  try {
						batch1 =  brandService.getBatch(batch);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    	  p.setProductnum(batch1.getProductnum());
			    	  try {
						p1 = productService.getProduct(p);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    	  cd1.setProductname(p1.getProductname());
		    	}
				PageInfo<CheckDaily> pageinfo= new PageInfo<CheckDaily>(cdList);
				model.addAttribute(pageinfo);
				model.addAttribute(session);
				
				return new ModelAndView("company/checkInfo");
				
			}	
			//新增巡检内容
			@RequestMapping(value="addCheckDaily",method={RequestMethod.POST})
			public ModelAndView AddProduct(HttpSession session,HttpServletRequest request,HttpServletResponse response){
				logger.debug("===============addCheckDaily==================================进来了");
				String ckdate = request.getParameter("ckdate");
				logger.debug("datedatedatedat^^^^^^^^^^^^^^datedatedatedate"+ckdate);
		     	String  ckcontent = request.getParameter("ckcontent");
		     	logger.debug("wwckcontentwwwwwwwwckcontentwwwwwwwwwwwwckcontent"+ckcontent);
		     	String batchnumber = request.getParameter("batchnumber");
		     	logger.debug("wwckcontentwwwwwwwwckcontentwwwwwwwwwwwwbatchnumber"+batchnumber);
		     	CheckDaily cd = new CheckDaily();
		     	cd.setCheckdate(ckdate);
		     	cd.setCheckcontent(ckcontent);
			
		     	return new ModelAndView("redirect:checkinfo.html");
				
			}
}
