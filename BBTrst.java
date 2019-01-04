package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.model.BorrowBook;

import conn.DAO.BorrowBookDAO;

class BBTrst {

	@Test
	void testSelectBorrowByReaderId() {
		//fail("Not yet implemented");
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

	@Test
	void testBorrowBook() {
		//fail("Not yet implemented");
		int res;
		BorrowBookDAO dao=new BorrowBookDAO();
		String sql = "insert into 借书  values('A00087902','161002323')";	
		res=dao.borrowBook(sql);
	}

	@Test
	void testDeleteBookType() {
		//fail("Not yet implemented");
		int res;
		BorrowBookDAO dao=new BorrowBookDAO();
		String sql = "delete from 借书  where 条码号='A00087902'";	
		res=dao.borrowBook(sql);
	}

}
