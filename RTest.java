package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.model.Reader;

import conn.DAO.ReaderDAO;

class RTest {

	@Test
	void testInsertReader() {
		//fail("Not yet implemented");
		Reader reader=new Reader();
		ReaderDAO dao=new ReaderDAO();
        int res;
		
		reader.setIdentityCard("161002321");
		reader.setCnumber("1011");
		reader.setMail("SA@qq.com");
		reader.setPassword("234567");
		reader.setSex("女");
		reader.setXy("信息学院");
		reader.setZy("网工");
		reader.setBook(2);
		reader.setFine(1.00F);
		reader.setIfpay("否");
		res=dao.insertReader(reader);
	}

	@Test
	void testSelectReader() {
		//fail("Not yet implemented");
		List<Reader> list = new ArrayList<Reader>();
		ReaderDAO dao=new ReaderDAO();
		String sql="select * from 学生";
		list=dao.selectReader(sql);
		Reader reader=null;
		for (int i = 0; i < list.size(); i++) {
            reader = list.get(i);
            System.out.println(reader.getIdentityCard()			
			+reader.getCnumber()	+		
			reader.getMail()+
			reader.getPassword()+
			reader.getSex()+
			reader.getXy()+
			reader.getZy()+
			reader.getBook()+
			reader.getFine()+
			reader.getIfpay());
        }
	}

	@Test
	void testSelectReaderByCnumber() {
		//fail("Not yet implemented");
		List<Reader> list = new ArrayList<Reader>();
		ReaderDAO dao=new ReaderDAO();
		String cnumber="1010";
		list=dao.selectReaderByCnumber(cnumber);
		Reader reader=null;
		for (int i = 0; i < list.size(); i++) {
            reader = list.get(i);
            System.out.println(reader.getIdentityCard()			
			+reader.getCnumber()	+		
			reader.getMail()+
			reader.getPassword()+
			reader.getSex()+
			reader.getXy()+
			reader.getZy()+
			reader.getBook()+
			reader.getFine()+
			reader.getIfpay());
		}
	}

	@Test
	void testUpdateReader() {
		//fail("Not yet implemented");
		ReaderDAO dao=new ReaderDAO();
		int res;
		String sql="update 学生  set 性别='男' where 证件号='161002321'";
		res=dao.updateReader(sql);
		//all();
	}

	

}
