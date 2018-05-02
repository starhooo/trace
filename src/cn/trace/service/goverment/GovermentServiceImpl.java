package cn.trace.service.goverment;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.trace.dao.goverment.GovermentMapper;
import cn.trace.pojo.Goverment;
@Service
public class GovermentServiceImpl implements GovermentService{
	@Resource
	private GovermentMapper mapper;
	public Goverment getGoverment(Goverment goverment) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getGoverment(goverment);
	}

}
