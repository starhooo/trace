package cn.trace.service.optype;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.trace.dao.optype.OptypeMapper;
import cn.trace.pojo.Optype;
@Service
public class OptypeServiceImpl implements OptypeService{
	@Resource
	private OptypeMapper mapper;
	public int addOptype(Optype optype) throws Exception {
		// TODO Auto-generated method stub
		return mapper.addOptype(optype);
	}

	public int delOptype(Optype optype) throws Exception {
		// TODO Auto-generated method stub
		return mapper.delOptype(optype);
	}

	public List<Optype> getOptypeList() throws Exception {
		// TODO Auto-generated method stub
		return mapper.getOptypeList();
	}

}
