package cn.trace.service.batch;

import java.util.List;

import cn.trace.pojo.Batch;

public interface BatchService {
	        //增加批次
			public int addBatch(Batch batch) throws Exception;
			//删除批次
			public int delBatch(Batch batch) throws Exception;
			//修改批次
			public int updateBatch(Batch batch) throws Exception;
			//查询单个批次
			public Batch getBatch(Batch batch) throws Exception; 
			//查询多个批次
			public   List<Batch> getBatchList(Batch batch) throws Exception; 
}
