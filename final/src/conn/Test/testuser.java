package conn.Test;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.User;

import conn.DAO.UserDAO;


public class testuser {
	
	public static void all() {
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
	
	public static void search() {
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
	
	public static void insert() {
		UserDAO dao=new UserDAO();
		User user=new User();
        int res;
		
		user.setLogin("heha@qq.com");
		user.setIdentityCard("161002321");
		user.setPassword("234567");
		user.setType("email");
		
		res=dao.insertUser(user);
	}
	
	public static void up() {
		UserDAO dao=new UserDAO();
		int res;
		String sql="update 登陆者  set 密码='565656' where 证件号='161002321'";
		res=dao.updateUser(sql);
		all();
	}
	
	public static void main(String[] args) throws Exception {
		//insert();
		//byid();
		//search();
		up();
	}

}
