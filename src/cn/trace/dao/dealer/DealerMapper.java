package cn.trace.dao.dealer;

import java.util.List;

import cn.trace.pojo.Dealer;

public interface DealerMapper {
	  //增加经销商
		public int addDealer(Dealer dealer) throws Exception;
		//删除品牌
		public int delDealer(Dealer dealer) throws Exception;
		//修改品牌
		public int updateDealer(Dealer dealer) throws Exception;
		//查询单个品牌
		public Dealer getDealer(Dealer dealer) throws Exception; 
		//查询多个品牌
		public   List<Dealer> getDealerList(Dealer dealer) throws Exception; 
}
