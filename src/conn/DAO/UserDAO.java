package conn.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.model.User;

public class UserDAO {

	public static User login(String iden, String pwd) {
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
	}
	public static User login1(String ml, String pwd) {//邮箱和密码
		User u = null;
		String sql = "select * from user where mail=ml";
		CommonDAO dao = new CommonDAO();
		try {
			ResultSet rs = dao.query(sql);
			if (rs.next())// 如果有用户名
			{
				String pass = rs.getString("password");// 得到密码
				if (pass.equalsIgnoreCase(pwd)) {// 将得到密码与输入密码进行比较
					u = new User();
					u.setIdentityCard(rs.getString("mail").trim());
					u.setPassword(rs.getString("password").trim());
					return u;
				} else {
					System.out.println("密码不正确");
					return null;
				}
			} else {
				System.out.println("邮箱不存在");
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		dao.close();
		return null;
	}
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

				u.setIdentityCard(rs.getString(" identityCard"));
				u.setMail(rs.getString("mail").trim());
				u.setPassword(rs.getString("password").trim());
				list.add(u);

			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		dao.close();
		return list;
	}

	// 添加用户
	public static int insertUser(User users, String sql) {
		int result = 0;
		CommonDAO dao = new CommonDAO();
		// String sql="insert into users(identityCard,password,mail) values(?,?,?)";
		result = dao.update(sql, users.getIdentityCard(), users.getPassword(), users.getMail());
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

	// 修改指定用户的邮箱
	public static int updateUserPWDByMail(User users, String sql) {
		int result = 0;
		CommonDAO dao = new CommonDAO();

		result = dao.update(sql, users.getMail(), users.getIdentityCard());
		dao.close();
		return result;

	}


	public static int deleteUser(String identityCard, String sql) {
		int result = 0;
		CommonDAO dao = new CommonDAO();

		try {
			result = dao.update(sql, identityCard);
		} catch (Exception e) {
			e.printStackTrace();
		}
		dao.close();
		return result;
	}

}
