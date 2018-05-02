package cn.trace.service.product;

import java.util.List;

import cn.trace.pojo.Product;

public interface ProductService {
	//添加产品
		public int addProduct(Product product) throws Exception;
		//删除产品
		public int delProduct(Product product) throws Exception;
		//查询单个产品
		public Product getProduct(Product product)  throws Exception;
		//查询多个产品信息
		public List<Product> getProductList(Product product) throws Exception;
		//修改产品信息
		public int updateProduct(Product product)  throws Exception;
}
