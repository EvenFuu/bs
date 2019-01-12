package com.model;
//import java.sql.Date;
public class Reader {
	private String identityCard;//证件号
	private String cnumber;//借书证号
	private String mail;//邮箱
	private String password;
	//private String name;
	private String sex;
	private String xy;//学院
	private String zy;//专业
	private int book;//借阅数量
	private Float fine; // 罚金
	private String ifpay;//是否缴纳
	//private String age;
	
	//private Date date;
	//private String maxNum;
	//private String tel;
	//private Double keepMoney;//未交罚款
	//private int bn;//借书数量
	//private int type;//登录方式
	
	
	
	
	
	
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	
	public String getCnumber() {
		return cnumber;
	}
	public void setCnumber(String cnumber) {
		this.cnumber = cnumber;
	}
	
	/*public Double getKeepMoney() {
		return keepMoney;
	}
	public void setKeepMoney(Double keepMoney) {
		this.keepMoney = keepMoney;
	}
	public int getBn() {
		return bn;
	}
	public void setBn(int bn) {
		this.bn = bn;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	

	
	public String getZy() {
		return zy;
	}
	public void setZy(String zy) {
		this.zy = zy;
	}
	public String getXy() {
		return xy;
	}
	public void setXy(String xy) {
		this.xy = xy;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Float getFine() 
	{
		return fine;
	}
	public void setFine(Float fine)
	{
		this.fine = fine;
	}
	public int getBook() 
	{
		return book;
	}
	public void setBook(int book)
	{
		this.book = book;
	}
	public String getIfpay() 
	{
		return ifpay;
	}
	public void setIfpay(String ifpay) 
	{
		this.ifpay = ifpay;
	}
}



