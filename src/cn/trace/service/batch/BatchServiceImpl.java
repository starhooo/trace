package cn.trace.service.batch;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;



import cn.trace.dao.batch.BatchMapper;
import cn.trace.pojo.Batch;

@Service
public class BatchServiceImpl implements BatchService{
	@Resource
	private BatchMapper mapper;
	private Logger logger = Logger.getLogger("BatchServiceImpl.class");

	public int addBatch(Batch batch) throws Exception {
		// TODO Auto-generated method stub
		return mapper.addBatch(batch);
	}

	public int delBatch(Batch batch) throws Exception {
		// TODO Auto-generated method stub
		return  mapper.delBatch(batch);
	}

	public int updateBatch(Batch batch) throws Exception {
		// TODO Auto-generated method stub
		return mapper.updateBatch(batch);
	}

	public Batch getBatch(Batch batch) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getBatch(batch);
	}

	public List<Batch> getBatchList(Batch batch) throws Exception {
		// TODO Auto-generated method stub
		logger.debug("++++++++BatchServiceImpl+++++BatchServiceImpl+++++++++++getBatchList++有没有进来");
		return  mapper.getBatchList(batch);
	}

	
	
}
