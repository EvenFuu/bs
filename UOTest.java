package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.model.UserOpe;

import conn.DAO.UserOpeDAO;

class UOTest {

	@Test
	void testSelectById() {
		//fail("Not yet implemented");
		List<UserOpe> list = new ArrayList<UserOpe>();
		UserOpeDAO dao=new UserOpeDAO();
		String id="sa";
		list=dao.selectById(id);
		UserOpe userope=null;
		for (int i = 0; i < list.size(); i++) {
            userope = list.get(i);
            System.out.println(userope.getLogin()
			+userope.getId());
        }
	}

	@Test
	void testUpdate() {
		//fail("Not yet implemented");
		UserOpeDAO dao=new UserOpeDAO();
		int res;
		String sql="insert into 管理登陆者  values('A00087907','sb')";
		res=dao.update(sql);
	}

}
