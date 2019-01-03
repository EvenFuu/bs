package conn.DAO;
import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;


import  com.model.ReaderOpe;
public class ReaderOpeDAO {
	//根据登录名查询他所管理的学生证件号
	public static List<ReaderOpe> selectReaderOpeById(String id)
	{		
		List<ReaderOpe> list = null;		
		String sql="SELECT * FROM 管理学生  where 登录名=?";	
		CommonDAO dao = new CommonDAO();		
		ResultSet rs = dao.query(sql,id);		
		list = new ArrayList<ReaderOpe>();		
		try 
		{			
			while(rs.next()){				
			ReaderOpe ci = new ReaderOpe();				
			ci.setId(rs.getString("证件号"));				
			ci.setIdentityCard(rs.getString("登录名"));				
			
			list.add(ci);			
			}		
		} 
	catch (SQLException e) 
	{			
		e.printStackTrace();		
	}		
	return list;	
	}
	//更改信息
	public static int update(String sql)
	{		
		int result = 0;		
			
		CommonDAO dao = new CommonDAO();		
		result = dao.update(sql);		
		return result;	
	}	
	
	// 删除信息	
		public static int delete(String id)
		{		
			int result = 0;		
			CommonDAO dao = new CommonDAO();		
			String sql="delete from 管理学生  where 证件号 =id"		;
			result = dao.update(sql);		
			dao.close();		
			return result;	
		}
}
