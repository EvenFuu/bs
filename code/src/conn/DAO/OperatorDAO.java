package conn.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Operator;



public class OperatorDAO {
	public static int insertOperator(Operator operator) {//录入信息
		int result = 0;
		CommonDAO dao = new CommonDAO();
		String sql = "insert into operator values(?,?,?,?,?,?,?,?)";
		try {
			result = dao.update(sql,  operator.getType(), operator.getName(), 
					operator.getSex(),operator.getId(),operator.getIdencard(),operator.getTel(),operator.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
		dao.close();
		return result;
	}
	public static List<Operator> selectOperator(String sql) {//显示管理者所有信息
		List<Operator> list = new ArrayList<Operator>();
		CommonDAO dao = new CommonDAO();
		 /*sql= "select readerid,type,name,age,sex,phone,dept,regdate,typename,maxborrownum,limit  from reader join readertype on 
reader.type=readertype.id";*/
		ResultSet rs = dao.query(sql);
		try {
			while (rs.next()) {
				Operator operator = new Operator();
				operator.setIdencard(rs.getString("idencard"));
				operator.setType(rs.getString("type"));
				operator.setName(rs.getString("name"));
				operator.setSex(rs.getString("sex"));
				operator.setPassword(rs.getString("password"));
				operator.setTel(rs.getString("tel"));
				operator.setId(rs.getString("id"));
				list.add(operator);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		dao.close();
		return list;
	}
	
	public static List<Operator> selectOperatorById(String id,String sql) {//根据读者证件号查询读者所有信息
		List<Operator> list = new ArrayList<Operator>();
		CommonDAO dao = new CommonDAO();
		/*String sql = "select readerid,type,name,age,sex,phone,dept,regdate,typename,maxborrownum,limit  from reader join readertype on 
reader.type=readertype.id where readerid='"
				+ id + "'";*/
		ResultSet rs = dao.query(sql);
		try {
			while (rs.next()) {
				Operator operator = new Operator();
				operator.setIdencard(rs.getString("idencard"));
				operator.setType(rs.getString("type"));
				operator.setName(rs.getString("name"));
				operator.setSex(rs.getString("sex"));
				operator.setPassword(rs.getString("password"));
				operator.setTel(rs.getString("tel"));
				operator.setId(rs.getString("id"));
				list.add(operator);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		dao.close();
		return list;
	}
	public static int updateOperator( Operator operator,String sql) {
		
		int result = 0;
		CommonDAO dao = new CommonDAO();
		
		try {
			result = dao.update(sql,  operator.getType(), operator.getName(), 
					operator.getSex(),operator.getId(),operator.getIdencard(),operator.getTel(),operator.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
		dao.close();
		return result;
	}
	public static Operator login(String id, String pwd) {
		Operator u = null;
		String sql = "select * from user where id=id";
		CommonDAO dao = new CommonDAO();
		try {
			ResultSet rs = dao.query(sql);
			if (rs.next())// 如果有用户名
			{
				String pass = rs.getString("password");// 得到密码
				if (pass.equalsIgnoreCase(pwd)) {// 将得到密码与输入密码进行比较
					u = new Operator();
					u.setId(rs.getString("id").trim());
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
	
}
