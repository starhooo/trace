package cn.trace.service.producterUser;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import cn.trace.dao.producterUser.ProducterUserMapper;
import cn.trace.pojo.ProducterUser;

@Service
public class ProducterUserServiceImpl implements ProducterUserService{
    @Resource
    private ProducterUserMapper mapper;
    private Logger logger = Logger.getLogger(ProducterUserServiceImpl.class);
    public ProducterUser seleProducterUser(ProducterUser producterUser)
		throws Exception {
	// TODO Auto-generated method stub
	 logger.debug("====================ProducterUserServiceImpl"+producterUser.getUsernum());
	 return mapper.selectProducterUser(producterUser);
   }
   
   
}
