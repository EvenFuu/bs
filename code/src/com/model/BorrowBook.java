package com.model;
import java.util.Date;
public class BorrowBook {
	private String readerid; // 读者编号
	private String ISBN; // 图书isbn编号
	private Date borrowdate; // 借书日期
	private Date returndate; // 还书日期
	private int fine; // 罚金
	private String bookname;
	//private String publish;
	//private Date publishDate;
	private String typename;
	private Double price;//书的价钱
	private int publishtime;//超的天数
	private String author;
	public int getPublishtime() 
	{
		return publishtime;
	}
	public void setPublishtime(int publishtime)
	{
		this.publishtime = publishtime;
	}
	public String getTypename() 
	{
		return typename;
	}
	public void setTypename(String typename) 
	{
		this.typename = typename;
	}
	public String getReaderid() 
	{
		return readerid;
	}
	public void setReaderid(String readerid) 
	{
		this.readerid = readerid;
	}public String getISBN() 
	{
		return ISBN;
	}
	public void setISBN(String ISBN) 
	{
		this.ISBN = ISBN;
	}
	public Date getBorrowdate() 
	{
		return borrowdate;
	}
	public void setBorrowdate(Date borrowdate) 
	{
		this.borrowdate = borrowdate;
	}
	public Date getReturndate() 
	{
		return returndate;
	
	}
	public void setReturndate(Date returndate) 
	{
		this.returndate = returndate;
	}
	
	public int getFine() 
	{
		return fine;
	}
	public void setFine(int fine)
	{
		this.fine = fine;
	}
	public String getBookname() 
	{
		return bookname;
	}
	public void setBookname(String bookname) 
	{
		this.bookname = bookname;
	}
	public String getAuthor() 
	{
		return author;
	}
	public void setAuthor(String author) 
	{
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) 
	{
		this.price = price;
	}
	@Override
	public String toString() 
	{
		return 
			"BorrowBook [readerid=" + readerid + ", ISBN=" + ISBN + ", borrowdate=" + borrowdate + ", returndate="+ returndate + ", fine=" + fine + "]";
	}
	
	
}