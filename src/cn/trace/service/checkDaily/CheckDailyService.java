package cn.trace.service.checkDaily;

import java.util.List;

import cn.trace.pojo.CheckDaily;

public interface CheckDailyService {
	
		//查询多个巡检
		public   List<CheckDaily> getCheckDailyList(CheckDaily checkDaily) throws Exception; 
}
