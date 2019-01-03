package conn.Test;
import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;

import com.model.UserOpe;
//import com.model.ReaderOpe;

import conn.DAO.UserOpeDAO;
//import conn.DAO.ReaderOpeDAO;

public class testuserope {
	public static void byid() {
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
	public static void up() {
		UserOpeDAO dao=new UserOpeDAO();
		int res;
		String sql="insert into 管理登陆者  values('A00087907','sb')";
		res=dao.update(sql);
	}
	public static void de() {
		UserOpeDAO dao=new UserOpeDAO();
		int res;
		String sql="delete from 管理登陆者  where 登录账号 =id";
		res=dao.update(sql);
	}
	public static void main(String[] args) throws Exception {
		
		byid();
		//up();
		//de();
	}
}
