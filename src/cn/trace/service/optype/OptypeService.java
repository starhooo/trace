package cn.trace.service.optype;

import java.util.List;

import cn.trace.pojo.Optype;

public interface OptypeService {
	//增加品牌
	public int addOptype(Optype optype) throws Exception;
	//删除品牌
	public int delOptype(Optype optype) throws Exception;
	//查询多个操纵
	public   List<Optype> getOptypeList() throws Exception; 
}
