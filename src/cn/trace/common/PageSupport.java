package cn.trace.common;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.IfInstruction;

public class PageSupport {
	private Integer totalCount = 0;//信息总记录数
	private Integer  pageCount;//总页数
	private Integer pageSize = 10;//每页显示记录数
	private  Integer page = 1;//当前页
	private Integer num = 3;//当前页之前和之后显示的页数个数和
	private List items = new ArrayList();//当前页记录内容集合
	
	
	//计算总页数
	public void getTotalPage(Integer totalCount){
		if(totalCount>0){
			this.totalCount = totalCount;
			this.pageCount = (totalCount+pageSize-1)/pageSize;
		}
	}
	//获取前一页
	public Integer getPrev(){
		return page-1;
	}
	//获取后一页
	public Integer getNext(){
		return page+ 1;
	}
	//获取最后一页
	public Integer getLast(){
		return pageCount;
	}
	//判断是否有前一页
	public boolean getIsPrev(){
		if(page>1){
			return true;
		}
		return false;
	}
	//判断是否有后一页
	public boolean getIsNext(){
		if(pageCount!=null&&page<pageCount){
			return true;
		}
		return false;
	}
	//当前页的前num条页
	public List<Integer> getPrevPages(){
		List<Integer> list = new ArrayList<Integer>();
		Integer startPage = 1;
		if(page>num){
			startPage = page -num;
		}
		for (int i = 0; i < page; i++) {
			list.add(i);
		}
		return list;
	}
	//当前页的后num条页
	public List<Integer> getNextPages(){
		List<Integer> list = new ArrayList<Integer>();
		Integer endPage = 1;
		if(pageCount!=null&&(page+num)<pageCount){
			endPage = page+num;
		}
		for(Integer i = page+1;i<=endPage;i++){
			list.add(i);
		}
		return list;
	}
	//获取每页显示记录数
	public Integer getPageSize(){
		return pageSize;
	}
	//设置每页显示记录数
	public void setPageSize(){
		this.pageSize = pageSize;
	}
	//得到当前页数
	public Integer getPage(){
		return page;
	}
	//设置当前页数
	public void setPage(){
		this.page = page;
	}
	//设置当前页之前或之后显示的页数个数
	public void setNum(Integer num) {
		this.num = num;
	}
	//获取当前页记录内容集合
	public List getItems(){
		return items;
	}
	//设置当前页记录内容集合
	public void setItems(List items){
		this.items = items;
	}
	//获取总记录数
	public Integer getTotalCount() {
		return totalCount;
	}
	//得到总页数
	public Integer getPageCount() {
		return pageCount;
	}
}
