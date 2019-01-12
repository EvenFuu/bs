package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.model.User;

import conn.DAO.UserDAO;

class UTest {

	@Test
	void testSelectUser() {
		//fail("Not yet implemented");
		List<User> list = new ArrayList<User>();
		UserDAO dao=new UserDAO();
		String sql="select * from 登陆者";
		list=dao.selectUser(sql);
		User user=null;
		for (int i = 0; i < list.size(); i++) {
            user = list.get(i);
            System.out.println(user.getLogin()			
			+user.getIdentityCard()	+		
			user.getPassword()+
			user.getType());
        }
	}

	@Test
	void testQuaryUser() {
		//fail("Not yet implemented");
		List<User> list = new ArrayList<User>();
		UserDAO dao=new UserDAO();
		String sql="select * from 登陆者  where 登录账号='161002323'";
		list=dao.quaryUser(sql);
		User user=null;
		for (int i = 0; i < list.size(); i++) {
            user = list.get(i);
            System.out.println(user.getLogin()			
			+user.getIdentityCard()	+		
			user.getPassword()+
			user.getType());
        }
	}

	@Test
	void testInsertUser() {
		//fail("Not yet implemented");
		UserDAO dao=new UserDAO();
		User user=new User();
        int res;
		
		user.setLogin("heha@qq.com");
		user.setIdentityCard("161002321");
		user.setPassword("234567");
		user.setType("email");
		
		res=dao.insertUser(user);
	}


	@Test
	void testUpdateUser() {
		//fail("Not yet implemented");
		UserDAO dao=new UserDAO();
		int res;
		String sql="update 登陆者  set 密码='565656' where 证件号='161002321'";
		res=dao.updateUser(sql);
		//all();
	}

}
