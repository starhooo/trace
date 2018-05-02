package cn.trace.pojo;

public class ProducterUser {
	Integer id;//id
    String usernum;//员工编号，用于登陆
    String  password;//密码
    String username;//用户姓名
    String phone;//用户电话
    Integer pronumber;//隶属企业编号
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsernum() {
		return usernum;
	}
	public void setUsernum(String usernum) {
		this.usernum = usernum;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getPronumber() {
		return pronumber;
	}
	public void setPronumber(Integer pronumber) {
		this.pronumber = pronumber;
	}
    
    
    
}
