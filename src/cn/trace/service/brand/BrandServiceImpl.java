package cn.trace.service.brand;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import cn.trace.dao.brand.BrandMapper;
import cn.trace.pojo.Batch;
import cn.trace.pojo.Brand;
@Service
public class BrandServiceImpl implements BrandService{
	@Resource
	private BrandMapper mapper;
	private Logger logger = Logger.getLogger(BrandServiceImpl.class);
	public int addBrand(Brand brand) throws Exception {
		// TODO Auto-generated method stub
		return mapper.addBrand(brand);
	}

	public int delBrand(Brand brand) throws Exception {
		// TODO Auto-generated method stub
		return mapper.delBrand(brand);
	}

	public int updateBrand(Brand brand) throws Exception {
		// TODO Auto-generated method stub
		return mapper.updateBrand(brand);
	}

	public Brand getBrand(Brand brand) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getBrand(brand);
	}

	public List<Brand> getBrandList(Brand brand) throws Exception {
		// TODO Auto-generated method stub
		logger.debug("################# BrandServiceImpl##############getBrandList");
		return mapper.getBrandList(brand);
	}

	public List<Batch> getBatchList(Batch batch) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getBatchList(batch);
	}

	public int addBatch(Batch batch) throws Exception {
		// TODO Auto-generated method stub
		return mapper.addBatch(batch);
	}

	public Batch getBatch(Batch batch) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getBatch(batch);
	}

}
