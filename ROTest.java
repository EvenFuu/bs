package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.model.ReaderOpe;

import conn.DAO.ReaderOpeDAO;

class ROTest {

	@Test
	void testSelectReaderOpeById() {
		//fail("Not yet implemented");
		List<ReaderOpe> list = new ArrayList<ReaderOpe>();
		ReaderOpeDAO dao=new ReaderOpeDAO();
		String id="sa";
		list=dao.selectReaderOpeById(id);
		ReaderOpe readerope=null;
		for (int i = 0; i < list.size(); i++) {
            readerope = list.get(i);
            System.out.println(readerope.getIdentityCard()	
			+readerope.getId());
        }
	}

	@Test
	void testUpdate() {
		//fail("Not yet implemented");
		ReaderOpeDAO dao=new ReaderOpeDAO();
		int res;
		String sql="insert into 管理学生  values('161002321','sb')";
		res=dao.update(sql);
	}

}
