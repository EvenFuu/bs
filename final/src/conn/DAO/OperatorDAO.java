package conn.DAO;

import java.sql.ResultSet;
//import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Operator;



public class OperatorDAO {
	public static int insertOperator(Operator operator) {//录入信息
		int result = 0;
		CommonDAO dao = new CommonDAO();
		String sql = "insert into 管理员 values(?,?,?,?,?,?,?)";
		try {
			result = dao.update(sql,
					operator.getId(),  
					operator.getPassword(),
					operator.getIdencard(),
					operator.getType(), 
					operator.getName(), 
					operator.getSex(),
					
					
					operator.getTel()
					);
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
				operator.setId(rs.getString("登录名"));
				operator.setPassword(rs.getString("口令"));
				operator.setIdencard(rs.getString("工号"));
				operator.setType(rs.getString("身份"));
				operator.setName(rs.getString("姓名"));
				operator.setSex(rs.getString("性别"));
				
				operator.setTel(rs.getString("电话"));
				
				list.add(operator);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		dao.close();
		return list;
	}
	
	public static List<Operator> selectOperatorById(String id) {//根据读者证件号查询读者所有信息
		List<Operator> list = new ArrayList<Operator>();
		CommonDAO dao = new CommonDAO();
		String sql = "select * from 管理员  where 工号=?";
		ResultSet rs = dao.query(sql,id);
		try {
			while (rs.next()) {
				Operator operator = new Operator();
				operator.setId(rs.getString("登录名"));
				operator.setPassword(rs.getString("口令"));
				operator.setIdencard(rs.getString("工号"));
				operator.setType(rs.getString("身份"));
				operator.setName(rs.getString("姓名"));
				operator.setSex(rs.getString("性别"));
				
				operator.setTel(rs.getString("电话"));
				list.add(operator);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		dao.close();
		return list;
	}
	//查询信息或者删除信息
	public static int updateOperator( String sql) {
		
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
