package conn.Test;
import java.sql.Date;

import java.sql.ResultSet;
import java.math.*;
import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;

import com.model.Book;
import  com.model.BorrowBook;

import conn.DAO.BookDAO;
import conn.DAO.BorrowBookDAO;

public class testborrow {
	public static void selbookbyid() {
		List<BorrowBook> list = new ArrayList<BorrowBook>();
		BorrowBookDAO dao=new BorrowBookDAO();
		list=dao.selectBorrowByReaderId("161002323");
		BorrowBook  book=null;
		for (int i = 0; i < list.size(); i++) {
            book = list.get(i);
            System.out.println(book.getISBN()			
			+book.getIdentityCard()	);
        }
	}
	
	public static void borrow() {
		int res;
		BorrowBookDAO dao=new BorrowBookDAO();
		String sql = "insert into 借书  values('A00087902','161002323')";	
		res=dao.borrowBook(sql);
	}
	
	public static void del() {
		int res;
		BorrowBookDAO dao=new BorrowBookDAO();
		String sql = "delete from 借书  where 条码号='A00087902'";	
		res=dao.borrowBook(sql);
	}
	/*public static void main(String[] args) throws Exception {
		//insert();
		//del();
		//all();
		//isbn();
		//search();
		//up();
		//selbookbyid();
		//borrow();
		del();
	}*/

}
