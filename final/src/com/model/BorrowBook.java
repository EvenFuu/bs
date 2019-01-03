package com.model;

public class BorrowBook {
	private String identityCard; // 读者编号
	private String ISBN; // 图书isbn编号
	
	
	public String getIdentityCard() 
	{
		return identityCard;
	}
	public void setIdentityCard(String identityCard) 
	{
		this.identityCard = identityCard;
	}
	public String getISBN() 
	{
		return ISBN;
	}
	public void setISBN(String ISBN) 
	{
		this.ISBN = ISBN;
	}
	
	
}