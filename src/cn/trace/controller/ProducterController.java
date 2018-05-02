package cn.trace.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.miemiedev.mybatis.paginator.domain.Order;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.trace.common.Constants;
import cn.trace.pojo.Brand;
import cn.trace.pojo.Product;
import cn.trace.pojo.ProducterUser;
import cn.trace.service.brand.BrandService;
import cn.trace.service.product.ProductService;

@Controller
@Scope("prototype")
public class ProducterController {
	@Resource
	private  BrandService brandService;
	@Resource
	private  ProductService  productService;
	private Logger logger = Logger.getLogger(ProducterController.class);
	@RequestMapping(value="brand.html",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView getBrandList(HttpSession session,HttpServletRequest request,HttpServletResponse response){
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
		Brand brand = new Brand();
		//从登陆用户session中获取公司编号
		logger.debug("===========================");
		ProducterUser producterUser = (ProducterUser)session.getAttribute("producterUserSession");
		logger.debug("========================//从登陆用户session中获取公司编号"+producterUser);
		brand.setPronumber(producterUser.getPronumber());
		
		List<Brand>  brandList = null;
    	try {	
			brandList = brandService.getBrandList(brand);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Brand  brand1 : brandList) {
			logger.debug("======================================getBrandList  brand是否查到数据"+brand1.getBrandname());
		}
		ModelAndView model =new ModelAndView();
		PageInfo<Brand> pageinfo= new PageInfo<Brand>(brandList);
		model.addObject(pageinfo);
		model.setViewName("company/brandlist");
		
		return model;
	}
	@RequestMapping(value="brandcheck.html",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView  BrandCheck(HttpSession session,HttpServletRequest request,HttpServletResponse response,Model model){
		String brandnum = request.getParameter("brandnum");
		logger.debug("======================================= BrandCheck+request.getParameter  brand"+brandnum);
		Brand brand = new  Brand();
		
		try {
			int a = Integer.parseInt(brandnum);
			brand.setBrandnum(a);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.debug("======================================= BrandCheck+Integer.getInteger  brand"+brand.getBrandnum());
		Brand brand2 = new Brand();
		try {
			brand2 = brandService.getBrand(brand);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       model.addAttribute("brand2", brand2);
        logger.debug("=============================================================+brandcheck"+brand2.getBranddes());
        return new ModelAndView("company/brandcheck");
	}
	@RequestMapping(value="brandUpdate.html",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView  BrandUpdate(HttpSession session,HttpServletRequest request,HttpServletResponse response,Model model){
	 String brandnum = request.getParameter("brandnum");
	 Brand brand = new  Brand();
		
		try {
			int a = Integer.parseInt(brandnum);
			brand.setBrandnum(a);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.debug("======================================= BrandUpdate brand"+brand.getBrandnum());
		Brand brand2 = new Brand();
		try {
			brand2 = brandService.getBrand(brand);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    model.addAttribute("brand2", brand2);
     logger.debug("=============================================================+BrandUpdate"+brand2.getBranddes());
     return new ModelAndView("company/brandUpdate");
  }
	@RequestMapping(value="brandUpdate",method={RequestMethod.POST,RequestMethod.GET})
	public String  BrandUpdate(HttpSession session,HttpServletRequest request,HttpServletResponse response){
		logger.debug("===============提交表单了");
		String brandname = request.getParameter("brandname");
     	String branddes = request.getParameter("branddes");
     	String a = request.getParameter("brandnum");
     	
     	int b = Integer.parseInt(a);
		logger.debug("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuupdatebranddes"+branddes);
		Brand  brand = new Brand();
		brand.setBrandname(brandname);
		brand.setBranddes(branddes);
		brand.setBrandnum(b);
		try {
			brandService.updateBrand(brand);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
		return "company/comindex";
		
	}
	@RequestMapping(value="addbrand",method={RequestMethod.POST,RequestMethod.GET})
	public String  AddBrand(HttpSession session,HttpServletRequest request,HttpServletResponse response){
		String brandname = request.getParameter("brandname");
     	String branddes = request.getParameter("branddes");
     
		Brand  brand = new Brand();
		brand.setBrandname(brandname);
		brand.setBranddes(branddes);
		ProducterUser producterUser = (ProducterUser)session.getAttribute("producterUserSession");
		logger.debug("========================//从登陆用户session中获取公司编号"+producterUser);
		brand.setPronumber(producterUser.getPronumber());
		
		try {
			brandService.addBrand(brand);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return "company/comindex";
		
	}
	@RequestMapping(value="delbrand.html",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView DelBrand(HttpSession session,HttpServletRequest request,HttpServletResponse response){
		String brandnum = request.getParameter("brandnum");
		int a = Integer.parseInt(brandnum);
		Brand   brand3 = new Brand();
		brand3.setBrandnum(a);
		try {
			brandService.delBrand(brand3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		Brand brand = new Brand();
		//从登陆用户session中获取公司编号
		logger.debug("===========================");
		ProducterUser producterUser = (ProducterUser)session.getAttribute("producterUserSession");
		logger.debug("========================//从登陆用户session中获取公司编号"+producterUser);
		brand.setPronumber(producterUser.getPronumber());
		
		List<Brand>  brandList = null;
    	try {	
			brandList = brandService.getBrandList(brand);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Brand  brand1 : brandList) {
			logger.debug("======================================getBrandList  brand是否查到数据"+brand1.getBrandname());
		}
		ModelAndView model =new ModelAndView();
		PageInfo<Brand> pageinfo= new PageInfo<Brand>(brandList);
		model.addObject(pageinfo);
		model.setViewName("company/brandlist");
		
		return model;
		
	}
	
	  //产品controller开始处
	//=========================================================================================
	@RequestMapping(value="product.html",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView getProductList(HttpSession session,HttpServletRequest request,HttpServletResponse response){
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
		Order.formString(str);
		Product product = new Product();
		//从登陆用户session中获取公司编号
		logger.debug("===========================");
		ProducterUser producterUser = (ProducterUser)session.getAttribute("producterUserSession");
		logger.debug("product========================//从登陆用户session中获取公司编号"+producterUser.getPronumber());
		product.setProducternum(producterUser.getPronumber());
		
		List<Product>  productList = null;
    	try {
    		logger.debug("======================================product.setProducternum(producterUser.getPronumber())"+product.getProducternum());
    	     productList = productService.getProductList(product);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	logger.debug("======================================getProductList  product是否查到数据");
		
		ModelAndView model =new ModelAndView();
		PageInfo<Product> pageInfo= new PageInfo<Product>(productList);
		model.addObject(pageInfo);
		model.setViewName("company/productlist");
		
		return model;
	}
	@RequestMapping(value="productcheck.html",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView  ProductCheck(HttpSession session,HttpServletRequest request,HttpServletResponse response,Model model){
		String productnum = request.getParameter("productnum");
		logger.debug("=======================================ProductCheck+request.getParameter(productnum) "+productnum);
		Product product = new Product();
		Brand brand = new Brand();
		Brand brand2 = new Brand();
		
		try {
			int a = Integer.parseInt(productnum);
			product.setProductnum(a);
			logger.debug("============================ProductCheck==product.setProducternum+a:"+product.getProductnum());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		Product  product2 = new Product();
		try {
			product2 = productService.getProduct(product);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		brand.setBrandnum(product2.getBrandnum());
		try {
			brand2 = brandService.getBrand(brand);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        model.addAttribute("product2", product2);
        model.addAttribute("brand2",brand2);
        return new ModelAndView("company/productcheck");
	}
	//主要负责页面跳转以及下拉框的展示
	@RequestMapping(value="addproduct.html",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView  AddProductPage(HttpSession session,HttpServletRequest request,HttpServletResponse response,Model model){
		ProducterUser producterUser = (ProducterUser)session.getAttribute("producterUserSession");
		Brand brand = new Brand();
		brand.setPronumber(producterUser.getPronumber());
		List<Brand> brandList = null;
		try {
			brandList = brandService.getBrandList(brand);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("producterUser", producterUser);
		model.addAttribute("brandList",brandList);
		
		return new ModelAndView("company/addproduct");
	}
	@RequestMapping(value="addproduct",method={RequestMethod.POST,RequestMethod.GET})
	public String  AddProduct(HttpSession session,HttpServletRequest request,HttpServletResponse response){
		String productname = request.getParameter("productname");
     	String  brandnum = request.getParameter("brandnum");
     	logger.debug("wwwwwwwwwwwwwwwwwwwwww"+brandnum);
     	//int  a = Integer.parseInt(brandnum);
     	String  productdes = request.getParameter("productdes");
     	int  producternum = Integer.parseInt(request.getParameter("producternum"));
     	//logger.debug("^^^^^^^AddProduct^^^^^productname+brandnum+brandnum+^^^^^"+productname+brandnum+a+":"+producternum );
         
     	Product product = new Product();
     	product.setProductname(productname);
     	//product.setBrandnum(a);
     	product.setProductdes(productdes);
     	product.setProducternum(producternum);
		
		try {
			productService.addProduct(product);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return "company/comindex";
		
	}
}
	
	
	
	
	
	