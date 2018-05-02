package cn.trace.pojo;

public class Brand {
	Integer id;//id
	String brandname;//品牌名称
	String branddes;//品牌描述
	String brandpicture;//品牌商标
	Integer pronumber;//企业编号
	Integer brandnum;//品牌编号
	String comname;//NULL企业名称
	public Integer getId(){
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getBranddes() {
		return branddes;
	}
	public void setBranddes(String branddes) {
		this.branddes = branddes;
	}
	public String getBrandpicture() {
		return brandpicture;
	}
	public void setBrandpicture(String brandpicture) {
		this.brandpicture = brandpicture;
	}
	public Integer getPronumber() {
		return pronumber;
	}
	public void setPronumber(Integer pronumber) {
		this.pronumber = pronumber;
	}
	public Integer getBrandnum() {
		return brandnum;
	}
	public void setBrandnum(Integer brandnum) {
		this.brandnum = brandnum;
	}
	public String getComname(){
		return comname;
	}
	public void setComname(String comname){
		this.comname = comname;
	}
	
	
}
