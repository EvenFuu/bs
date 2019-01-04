package conn.Test;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


import com.model.Operator;

import conn.DAO.BookDAO;
import conn.DAO.OperatorDAO;

public class testoperator {
	public static void insert() {
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
    
	public static void all() {
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
	
	public static void byid() {
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
	
	public static void up() {
		OperatorDAO dao=new OperatorDAO();
		int res;
		String sql="update 管理员  set 电话='13102203223' where 工号='1011'";
		res=dao.updateOperator(sql);
		all();
	}
	/*public static void main(String[] args) throws Exception {
		//insert();
		//byid();
		up();
	}*/
}