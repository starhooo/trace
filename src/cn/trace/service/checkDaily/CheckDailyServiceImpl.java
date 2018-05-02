package cn.trace.service.checkDaily;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.trace.dao.checkDaily.CheckDailyMapper;
import cn.trace.pojo.CheckDaily;
@Service
public class CheckDailyServiceImpl implements CheckDailyService{
	@Resource
	private CheckDailyMapper mapper;
	public List<CheckDaily> getCheckDailyList(CheckDaily checkDaily)
			throws Exception {
		// TODO Auto-generated method stub
		return mapper.getCheckDailyList(checkDaily);
	}

}
