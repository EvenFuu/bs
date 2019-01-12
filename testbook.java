package conn.Test;
//import java.awt.List;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.*;
import javax.print.DocFlavor.STRING;
import javax.swing.text.DefaultEditorKit.InsertBreakAction;
import org.omg.CORBA.PUBLIC_MEMBER;

import com.model.Book;

import conn.DAO.BookDAO;

public class testbook {
	public static void insert() throws Exception {
		Book book=new Book();
		BookDAO dao=new BookDAO();
		int res;
		
		book.setBookname("时间简史");
		book.setBorrow(1);
		book.setBrief("简介");
		book.setCatalog("目录");
		book.setGcd("图书馆");
		book.setId("1234");
		book.setISBN("23456");
		book.setMarc("marc");
		book.setPrice(10.21F);
		book.setPublish("人民出版社");
		book.setPublishdate(new java.sql.Date((new SimpleDateFormat("yyyy-MM-dd").parse("1977-03-05")).getTime()));
		book.setSre("个人负责者");
		book.setSsre("次要负责者");
		book.setState("可借");
		book.setTel("光盘");
		book.setTheme("时间");
		book.setTypefile("小说");
		book.setTypename("sfjvid");
		book.setView(233);
		book.setZati("载体");
		book.setZyf("中图法");
		book.setBorrowdate(new java.sql.Date((new SimpleDateFormat("yyyy-MM-dd").parse("2018-03-05")).getTime()));
		book.setReturndate(new java.sql.Date((new SimpleDateFormat("yyyy-MM-dd").parse("2018-04-05")).getTime()));
		res=dao.insertBook(book);
	}
	
	public static void all() {
		List<Book> list = new ArrayList<Book>();
		BookDAO dao=new BookDAO();
		String sql="select * from 书籍";
		list=dao.selectBook(sql);
		Book book=null;
		for (int i = 0; i < list.size(); i++) {
            book = list.get(i);
            System.out.println(book.getISBN()			
			+book.getBookname()	+		
			book.getBorrow()+
			book.getBrief()+
			book.getCatalog()+
			book.getGcd()+
			book.getMarc()+
			book.getPrice()+
			book.getView()+
			book.getSre()+
			book.getSsre()+
			book.getTel()+
			book.getTheme()+
			book.getTypefile()+
			book.getTypename()+
			book.getZati()+
			book.getZyf()+
			book.getPublish()+	
			book.getPublishdate()+				
			book.getState()+	
			book.getId()+
			book.getBorrowdate()+
			book.getReturndate());
        }

		
	}
	
	public static void isbn() {
		BookDAO dao=new BookDAO();
		Book book=new Book();
		
		String isbn="A00087904";
		book=dao.selectBookByISBN(isbn);
		System.out.println(book.getISBN()			
				+book.getBookname()	+		
				book.getBorrow()+
				book.getBrief()+
				book.getCatalog()+
				book.getGcd()+
				book.getMarc()+
				book.getPrice()+
				book.getView()+
				book.getSre()+
				book.getSsre()+
				book.getTel()+
				book.getTheme()+
				book.getTypefile()+
				book.getTypename()+
				book.getZati()+
				book.getZyf()+
				book.getPublish()+	
				book.getPublishdate()+				
				book.getState()+	
				book.getId()+
				book.getBorrowdate()+
				book.getReturndate());
	}
	
	public static void search() {
		BookDAO dao=new BookDAO();
		Book book=new Book();
		
		String sql="select * from 书籍  where 个人责任者='贺世元'";
		book=dao.query(sql);
		System.out.println(book.getISBN()			
				+book.getBookname()	+		
				book.getBorrow()+
				book.getBrief()+
				book.getCatalog()+
				book.getGcd()+
				book.getMarc()+
				book.getPrice()+
				book.getView()+
				book.getSre()+
				book.getSsre()+
				book.getTel()+
				book.getTheme()+
				book.getTypefile()+
				book.getTypename()+
				book.getZati()+
				book.getZyf()+
				book.getPublish()+	
				book.getPublishdate()+				
				book.getState()+	
				book.getId()+
				book.getBorrowdate()+
				book.getReturndate());
	}
	public static void del() {
		int res;
		BookDAO dao=new BookDAO();
		String sql="delete from 书籍 where 条码号='23456'";
		res=dao.delete(sql);
	}
     
	public static void up() {
		BookDAO dao=new BookDAO();
		int res;
		String sql="update 书籍  set 馆藏地='林业楼422资料室' where 条码号='A00087904'";
		res=dao.update(sql);
		isbn();
	}
	public static void main(String[] args) throws Exception {
		//insert();
		//del();
		all();
		//isbn();
		//search();
		//up();
	}
}
