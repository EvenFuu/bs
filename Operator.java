package com.model;


public class Operator {
	private String id;//登录名
	private String password;//口令
	private String idencard;//工号
	private String type;//身份
	private String name;
	private String sex;
	private String tel;
	
	
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIdencard() {
		return idencard;
	}
	public void setIdencard(String idencard) {
		this.idencard = idencard;
	}
}
