package conn.DAO;

import java.sql.ResultSet;
//import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.model.User;

public class UserDAO {

	/*public static User login(String iden, String pwd) {
		User u = null;
		String sql = "select * from user where identity=iden";
		CommonDAO dao = new CommonDAO();
		try {
			ResultSet rs = dao.query(sql);
			if (rs.next())// 如果有用户名
			{
				String pass = rs.getString("password");// 得到密码
				if (pass.equalsIgnoreCase(pwd)) {// 将得到密码与输入密码进行比较
					u = new User();
					u.setIdentityCard(rs.getString("identity").trim());
					u.setPassword(rs.getString("password").trim());
					return u;
				} else {
					System.out.println("密码不正确");
					return null;
				}
			} else {
				System.out.println("用户名不存在");
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dao.close();
		return null;
	}*/
	
	// 查询所有用户信息；
	public static List<User> selectUser(String sql) {// 显示用户信息
		List<User> list = new ArrayList<User>();
		CommonDAO dao = new CommonDAO();
		/*
		 * sql= "select
		 * readerid,type,name,age,sex,phone,dept,regdate,typename,maxborrownum,limit
		 * from reader join readertype on reader.type=readertype.id";
		 */
		ResultSet rs = dao.query(sql);
		try {
			while (rs.next()) {
				User u = new User();
                u.setLogin(rs.getString("登录账号"));
				u.setIdentityCard(rs.getString("证件号"));
				
				u.setPassword(rs.getString("密码").trim());
				
				u.setType(rs.getString("登录方式"));
				list.add(u);
				

			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		dao.close();
		return list;
	}
	//查询随意用户的信息
	public static List<User> quaryUser(String sql) {
		List<User> list = new ArrayList<User>();
		CommonDAO dao = new CommonDAO();
		ResultSet rs = dao.query(sql);
		try {
			while (rs.next()) {
				User u = new User();
                u.setLogin(rs.getString(" 登录账号"));
				u.setIdentityCard(rs.getString(" 证件号"));
				
				u.setPassword(rs.getString("密码").trim());
				
				u.setType(rs.getString(" 登录方式"));
				list.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		dao.close();
		return list;
	}

	// 添加用户
	public static int insertUser(User users) {
		int result = 0;
		CommonDAO dao = new CommonDAO();
		String sql="insert into 登陆者  values(?,?,?,?)";
		result = dao.update(sql, users.getLogin(),users.getIdentityCard(), users.getPassword(),users.getType());
		dao.close();
		return result;
	}

	// 修改指定用户的密码、
	public static int updateUserPWDByName(User users, String sql) {
		int result = 0;
		CommonDAO dao = new CommonDAO();

		result = dao.update(sql, users.getPassword(), users.getIdentityCard());
		dao.close();
		return result;

	}
	//更改用户的信息
	public static int updateUser(String sql) {
		int result = 0;
		CommonDAO dao = new CommonDAO();

		try {
			result = dao.update(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		dao.close();
		return result;
	}

	

//删除用户的信息
	public static int deleteUser(String sql) {
		int result = 0;
		CommonDAO dao = new CommonDAO();

		try {
			result = dao.update(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		dao.close();
		return result;
	}

}
