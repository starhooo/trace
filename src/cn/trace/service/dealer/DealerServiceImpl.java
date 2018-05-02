package cn.trace.service.dealer;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.trace.dao.dealer.DealerMapper;
import cn.trace.pojo.Dealer;
@Service
public class DealerServiceImpl implements DealerService{
	@Resource
	private DealerMapper mapper;
	
	public int addDealer(Dealer dealer) throws Exception {
		// TODO Auto-generated method stub
		return mapper.addDealer(dealer);
	}

	public int delDealer(Dealer dealer) throws Exception {
		// TODO Auto-generated method stub
		return mapper.delDealer(dealer);
	}

	public int updateDealer(Dealer dealer) throws Exception {
		// TODO Auto-generated method stub
		return mapper.updateDealer(dealer);
	}

	public Dealer getDealer(Dealer dealer) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getDealer(dealer);
	}

	public List<Dealer> getDealerList(Dealer dealer) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getDealerList(dealer);
	}
   
}
