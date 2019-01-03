package conn.DAO;
//import java.net.CookieHandler;
//import java.sql.Date;
import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.model.Reader;

public class ReaderDAO {
	public static int insertReader(Reader reader) {//录入读者信息
		int result = 0;
		CommonDAO dao = new CommonDAO();
		String sql = "insert into 学生  values(?,?,?,?,?,?,?,?,?,?)";
		try {
			result = dao.update(sql, 
					reader.getIdentityCard(),  
					reader.getCnumber(),
					reader.getMail(),
					reader.getPassword(), 
					reader.getSex(), 
					reader.getXy(),
					
					reader.getZy(),
					reader.getBook(),
					reader.getFine(),
					reader.getIfpay()
					
					);
		} catch (Exception e) {
			e.printStackTrace();
		}
		dao.close();
		return result;
	}
	public static List<Reader> selectReader(String sql) {//显示读者所有信息
		List<Reader> list = new ArrayList<Reader>();
		CommonDAO dao = new CommonDAO();
		 /*sql= "select readerid,type,name,age,sex,phone,dept,regdate,typename,maxborrownum,limit  from reader join readertype on 
reader.type=readertype.id";*/
		ResultSet rs = dao.query(sql);
		try {
			while (rs.next()) {
				Reader reader = new Reader();
				reader.setIdentityCard(rs.getString("证件号"));
				reader.setCnumber(rs.getString("借书证号"));
				reader.setMail(rs.getString("邮箱"));
				reader.setPassword(rs.getString("密码"));
				
				reader.setSex(rs.getString("性别"));
				reader.setXy(rs.getString("学院"));
				reader.setZy(rs.getString("专业"));
				
				reader.setBook(rs.getInt("借阅数量"));
				reader.setFine(rs.getFloat("罚款金额"));
				reader.setIfpay(rs.getString("是否缴纳"));
				list.add(reader);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		dao.close();
		return list;
	}
	public static List<Reader> selectReaderByCnumber(String cnumber) {//根据读者证件号查询读者所有信息
		List<Reader> list = new ArrayList<Reader>();
		CommonDAO dao = new CommonDAO();
		String sql = "select * from 学生 where 借书证号=?";
		ResultSet rs = dao.query(sql,cnumber);
		try {
			while (rs.next()) {
				Reader reader = new Reader();
				reader.setIdentityCard(rs.getString("证件号"));
				reader.setCnumber(rs.getString("借书证号"));
				reader.setMail(rs.getString("邮箱"));
				reader.setPassword(rs.getString("密码"));
				
				reader.setSex(rs.getString("性别"));
				reader.setXy(rs.getString("学院"));
				reader.setZy(rs.getString("专业"));
				
				reader.setBook(rs.getInt("借阅数量"));
				reader.setFine(rs.getFloat("罚款金额"));
				reader.setIfpay(rs.getString("是否缴纳"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		dao.close();
		return list;
	}
    //修改读者信息
	public static int updateReader(String sql) {
	
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
	//删除读者信息
	public static int deleteReader(String sql) {
		
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







