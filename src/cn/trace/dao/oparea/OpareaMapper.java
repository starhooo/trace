package cn.trace.dao.oparea;



import java.util.List;

import cn.trace.pojo.Oparea;

public interface OpareaMapper {
	//增加操作地块
	public int addOparea(Oparea  oparea) throws Exception;
	//删除操作地块
	public int delOparea(Oparea oparea) throws Exception;
	//修改操作地块
	public int updateOparea(Oparea oparea) throws Exception;
	//查询单个操作地块
	public Oparea getOparea(Oparea oparea) throws Exception; 
	//查询多个操作地块
	public  List<Oparea> getOpareaList(Oparea oparea) throws Exception;
}
