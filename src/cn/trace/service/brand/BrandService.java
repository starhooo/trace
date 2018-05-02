package cn.trace.service.brand;

import java.util.List;

import cn.trace.pojo.Batch;
import cn.trace.pojo.Brand;

public interface BrandService {
	//增加品牌
		public int addBrand(Brand brand) throws Exception;
		//删除品牌
		public int delBrand(Brand brand) throws Exception;
		//修改品牌
		public int updateBrand(Brand brand) throws Exception;
		//查询单个品牌
		public Brand getBrand(Brand brand) throws Exception; 
		//查询多个品牌
		public   List<Brand> getBrandList(Brand brand) throws Exception; 
		//----------------
		//查询多个批次
		public List<Batch> getBatchList(Batch batch) throws Exception;
		//增加批次
	    public int addBatch(Batch batch) throws Exception;
	    //查询单个批次
	  	public  Batch getBatch(Batch batch) throws Exception; 
}
