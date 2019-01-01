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
		String sql = "insert into reader values(?,?,?,?,?,?,?,?,?)";
		try {
			result = dao.update(sql, reader.getIdentityCard(), reader.getType(), reader.getName(), reader.getCnumber(),
					reader.getSex(), reader.getKeepMoney(), reader. getBn(), reader.getZy(),reader.getMail());
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
				reader.setIdentityCard(rs.getString("IdentityCard"));
				reader.setType(rs.getInt("type"));
				reader.setName(rs.getString("name"));
				reader.setCnumber(rs.getString("cnumber"));
				reader.setSex(rs.getString("sex"));
				reader.setKeepMoney(rs.getDouble("keepmoney"));
				reader.setBn(rs.getInt("bn"));
				reader.setZy(rs.getString("zy"));
				reader.setMail(rs.getString("mail"));
				list.add(reader);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		dao.close();
		return list;
	}
	public static List<Reader> selectReaderByCnumber(String cnumber,String sql) {//根据读者证件号查询读者所有信息
		List<Reader> list = new ArrayList<Reader>();
		CommonDAO dao = new CommonDAO();
		/*String sql = "select readerid,type,name,age,sex,phone,dept,regdate,typename,maxborrownum,limit  from reader join readertype on 
reader.type=readertype.id where readerid='"
				+ id + "'";*/
		ResultSet rs = dao.query(sql);
		try {
			while (rs.next()) {
				Reader reader = new Reader();
				reader.setIdentityCard(rs.getString("IdentityCard"));
				reader.setType(rs.getInt("type"));
				reader.setName(rs.getString("name"));
				reader.setCnumber(rs.getString("cnumber"));
				reader.setSex(rs.getString("sex"));
				reader.setKeepMoney(rs.getDouble("keepmoney"));
				reader.setBn(rs.getInt("bn"));
				reader.setZy(rs.getString("zy"));
				reader.setMail(rs.getString("mail"));
				list.add(reader);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		dao.close();
		return list;
	}
    //修改读者信息,通过身份证号修改
	public static int updateReader(Reader reader,String sql) {
	
		int result = 0;
		CommonDAO dao = new CommonDAO();
		
		try {
			result = dao.update(sql, reader.getIdentityCard(), reader.getType(), reader.getName(), reader.getCnumber(),
					reader.getSex(), reader.getKeepMoney(), reader. getBn(), reader.getZy(),reader.getMail());
		} catch (Exception e) {
			e.printStackTrace();
		}
		dao.close();
		return result;
	}

	}







