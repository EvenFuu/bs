package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.model.Operator;

import conn.DAO.OperatorDAO;

class OTest {

	@Test
	void testInsertOperator() {
		//fail("Not yet implemented");
		Operator operator=new Operator();
		OperatorDAO dao=new OperatorDAO();
        int res;
		
		operator.setId("sb");
		operator.setIdencard("1011");
		operator.setName("李四");
		operator.setPassword("234567");
		operator.setSex("女");
		operator.setTel("13022032233");
		operator.setType("operator");
		res=dao.insertOperator(operator);
	}

	@Test
	void testSelectOperator() {
		//fail("Not yet implemented");
		List<Operator> list = new ArrayList<Operator>();
		OperatorDAO dao=new OperatorDAO();
		String sql="select * from 管理员";
		list=dao.selectOperator(sql);
		Operator operator=null;
		for (int i = 0; i < list.size(); i++) {
            operator = list.get(i);
            System.out.println(operator.getId()			
			+operator.getIdencard()	+		
			operator.getName()+
			operator.getPassword()+
			operator.getSex()+
			operator.getTel()+
			operator.getType());
        }
	}

	@Test
	void testSelectOperatorById() {
		//fail("Not yet implemented");
		List<Operator> list = new ArrayList<Operator>();
		OperatorDAO dao=new OperatorDAO();
		String id="1010";
		list=dao.selectOperatorById(id);
		Operator operator=null;
		for (int i = 0; i < list.size(); i++) {
            operator = list.get(i);
            System.out.println(operator.getId()			
			+operator.getIdencard()	+		
			operator.getName()+
			operator.getPassword()+
			operator.getSex()+
			operator.getTel()+
			operator.getType());
        }
	}

	@Test
	void testUpdateOperator() {
		//fail("Not yet implemented");
		OperatorDAO dao=new OperatorDAO();
		int res;
		String sql="update 管理员  set 电话='13102203223' where 工号='1011'";
		res=dao.updateOperator(sql);
		//all();
	}

}
