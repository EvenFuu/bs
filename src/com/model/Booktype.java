package com.model;

public class Booktype {
	private String id; // 图书索引号
	private String typename;// 图书类型名称
	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getTypename() 
	{
		return typename;
	}
	public void setTypename(String typename) 
	{
		this.typename = typename;
	}
	public String toString() {
		return "BookType [id=" + id + ", typename=" + typename + "]";
	}
	
	
}
