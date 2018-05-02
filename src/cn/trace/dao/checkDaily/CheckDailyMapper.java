package cn.trace.dao.checkDaily;

import java.util.List;

import cn.trace.pojo.CheckDaily;



public interface CheckDailyMapper{
	//增加巡检
	public int addCheckDaily(CheckDaily checkDaily) throws Exception;
	//删除巡检
	public int delCheckDaily(CheckDaily checkDaily) throws Exception;
	//修改巡检
	public int updateCheckDaily(CheckDaily checkDaily) throws Exception;
	//查询巡检
	public CheckDaily  getCheckDaily(CheckDaily checkDaily) throws Exception; 
	//查询多个巡检
	public   List<CheckDaily> getCheckDailyList(CheckDaily checkDaily) throws Exception; 
}
