package conn.DAO;
import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;


import com.model.BookOpe;
public class BookOpeDAO {
	//根据登录名查询他所管理的图书号
			public static List<BookOpe> selectById (String id)
			{		
				List<BookOpe> list = null;		
				String sql="SELECT * FROM 管理书籍  where 登录名=?";	
				CommonDAO dao = new CommonDAO();		
				ResultSet rs = dao.query(sql,id);		
				list = new ArrayList<BookOpe>();		
				try 
				{			
					while(rs.next()){				
					BookOpe ci = new BookOpe();				
					ci.setId(rs.getString("登录名"));				
					ci.setISBN(rs.getString("条码号"));				
					
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
			
			// 删除。	
				public static int delete(String ISBN)
				{		
					int result = 0;		
					CommonDAO dao = new CommonDAO();		
					String sql	="delete from 管理书籍  where 条码号=ISBN ";
					result = dao.update(sql);		
					dao.close();		
					return result;	
				}

}
