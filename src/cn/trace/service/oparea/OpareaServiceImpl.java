package cn.trace.service.oparea;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;


import cn.trace.dao.oparea.OpareaMapper;
import cn.trace.pojo.Oparea;
@Service
public class OpareaServiceImpl implements OpareaService{
	@Resource
	private OpareaMapper mapper;
	private Logger  logger  = Logger.getLogger(OpareaServiceImpl.class);
	public int addOparea(Oparea oparea) throws Exception {
		// TODO Auto-generated method stub
		return mapper.addOparea(oparea);
	}

	public int delOparea(Oparea oparea) throws Exception {
		// TODO Auto-generated method stub
		return mapper.delOparea(oparea);
	}

	public int updateOparea(Oparea oparea) throws Exception {
		// TODO Auto-generated method stub
		return mapper.updateOparea(oparea);
	}

	public Oparea getOparea(Oparea oparea) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getOparea(oparea);
	}

	public List<Oparea> getOpareaList(Oparea oparea) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getOpareaList(oparea);
	}

}
