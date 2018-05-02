package cn.trace.pojo;

import java.util.Date;





public class CheckDaily {
	private Integer id;//id
	private String batchnumber;//批次号码
	private String checkpicture;//图片路径
	private String  checkdate;//巡检时间
	private String checkcontent;//巡检内容
	private Integer producternum;//所属企业
	private String productname;//产品名称
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBatchnumber() {
		return batchnumber;
	}
	public void setBatchnumber(String batchnumber) {
		this.batchnumber = batchnumber;
	}
	public String getCheckpicture() {
		return checkpicture;
	}
	public void setCheckpicture(String checkpicture) {
		this.checkpicture = checkpicture;
	}
	
	public String getCheckdate() {
		return checkdate;
	}
	public void setCheckdate(String checkdate) {
		this.checkdate = checkdate;
	}
	public String getCheckcontent() {
		return checkcontent;
	}
	public void setCheckcontent(String checkcontent) {
		this.checkcontent = checkcontent;
	}
	public Integer getProducternum() {
		return producternum;
	}
	public void setProducternum(Integer producternum) {
		this.producternum = producternum;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	
	
}
