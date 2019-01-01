package com.model;
import java.util.Date;
public class Book {
	private String ISBN; // 图书isbn号
	private String bookname; // 图书名
	private String gcd;//馆藏地
	private String sre;//个人责任者
	private String ssre;//个人次要责任者
	private String publish; // 出版社
	private Date publishdate; // 出版日期
	private Double price; // 图书单价
	private String typename;//图书类型
	private String brief;//内容简介
	private String catalog;//目录
	private String zyf;//中医法分类
	private String theme;//学科主题
	private String zaiti;//载体动态项
	private String tel;//光盘服务联系方法
	private String marc;//MARC
	private String typefile;//文献类型
	private int    view;//浏览次数
	private int    borrow;//借阅次数
	public String getISBN() 
	{
		return ISBN;
	}
	public void setISBN(String ISBN) 
	{
		this.ISBN = ISBN;
	}
	public String getTypename() 
	{
		return typename;
	}
	public void setTypename(String typename) 
	{
		this.typename = typename;
	}
	public String getBookname() 
	{
		return bookname;
	}
	public void setBookname(String bookname) 
	{
		this.bookname = bookname;
	}
	public String getGcd() 
	{
		return gcd;
	}
	public void setGcd(String gcd) 
	{
		this.gcd = gcd;
	}
	public String getSre() 
	{
		return sre;
	}
	public void setSre(String sre) 
	{
		this.sre = sre;
	}
	public String  getSsre() 
	{
		return ssre;
	}
	public void setSsre(String ssre) 
	{
		this.ssre = ssre;
	}
	public String getPublish() 
	{
		return publish;
	
	}
	public void setPublish(String publish) 
	{
		this.publish = publish;
	}
	public Date getPublishdate() 
	{
		return publishdate;
	}
	public void setPublishdate(Date date) 
	{
		this.publishdate = date;
	}
	public Double getPrice() 
	{
		return price;
	}
	public void setPrice(Double price) 
	{
		this.price = price;
	}
	public String getBrief() 
	{
		return brief;
	}
	public void setBrief(String brief) 
	{
		this.brief = brief;
	}
	public String getCatalog() 
	{
		return catalog;
	}
	public void setCatalog(String catalog) 
	{
		this.catalog = catalog;
	}
	public String getTheme() 
	{
		return theme;
	}
	public void setTheme(String theme) 
	{
		this.theme = theme;
	}
	public String getZyf() 
	{
		return zyf;
	}
	public void setZyf(String zyf) 
	{
		this.zyf = zyf;
	}
	public String getZati( ) 
	{
		return zaiti;
	}
	public void setZati(String zaiti ) 
	{
		this.zaiti = zaiti;
	}
	public String getTel() 
	{
		return tel;
	}
	public void setTel(String tel) 
	{
		this.tel = tel;
	}
	public String getMarc() 
	{
		return marc;
	}
	public void setMarc(String marc) 
	{
		this.marc = marc;
	}
	public String getTypefile() 
	{
		return typefile;
	}
	public void setTypefile(String typefile) 
	{
		this.typefile= typefile;
	}
	public int getView() 
	{
		return view ;
	}
	public void setView(int view) 
	{
		this.view = view;
	}
	public int getBorrow() 
	{
		return borrow;
	}
	public void setBorrow(int borrow ) 
	{
		this.borrow = borrow;
	}
}
