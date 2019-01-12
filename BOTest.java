package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.model.BookOpe;

import conn.DAO.BookDAO;
import conn.DAO.BookOpeDAO;

class BOTest {

	@Test
	void testSelectById() {
		//fail("Not yet implemented");
		List<BookOpe> list = new ArrayList<BookOpe>();
		BookOpeDAO dao=new BookOpeDAO();
		String id="sa";
		list=dao.selectById(id);
		BookOpe bookope=null;
		for (int i = 0; i < list.size(); i++) {
            bookope = list.get(i);
            System.out.println(bookope.getId()			
			+bookope.getISBN());
        }
	}

	@Test
	void testUpdate() {
		//fail("Not yet implemented");
		BookOpeDAO dao=new BookOpeDAO();
		int res;
		String sql="insert into 管理书籍  values('A00087903','sb')";
		res=dao.update(sql);
	}

	@Test
	void testDelete() {
		//fail("Not yet implemented");
		int res;
		BookDAO dao=new BookDAO();
		String sql="delete from 书籍 where 条码号='23456'";
		res=dao.delete(sql);
	}

}
