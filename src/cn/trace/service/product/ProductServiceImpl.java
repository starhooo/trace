package cn.trace.service.product;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import cn.trace.dao.product.ProductMapper;
import cn.trace.pojo.Product;
@Service
public class ProductServiceImpl implements ProductService{
	
	@Resource
	private ProductMapper mapper;
	private Logger logger = Logger.getLogger(ProductServiceImpl.class);

	public int addProduct(Product product) throws Exception {
		
		return mapper.addProduct(product);
	}

	public int delProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		return mapper.delProduct(product);
	}

	public Product getProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getProduct(product);
	}

	public List<Product> getProductList(Product product) throws Exception {
		// TODO Auto-generated method stub
		logger.debug("======================#######################进入ProductServiceImpl implements ProductService+getProductList");
		return mapper.getProductList(product);
	}

	public int updateProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		return mapper.updateProduct(product);
	}
	
}
