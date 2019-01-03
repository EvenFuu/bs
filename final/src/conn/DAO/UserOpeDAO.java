package conn.DAO;
import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;

import com.model.UserOpe;

public class UserOpeDAO {
	
		//根据登录名查询他所管理的登录号
		public static List<UserOpe> selectById (String id)
		{		
			List<UserOpe> list = null;		
			String sql="SELECT * FROM 管理登陆者  where 登录名=?";	
			CommonDAO dao = new CommonDAO();		
			ResultSet rs = dao.query(sql,id);		
			list = new ArrayList<UserOpe>();		
			try 
			{			
				while(rs.next()){				
					UserOpe ci = new UserOpe();				
				ci.setId(rs.getString("登录名"));				
				ci.setLogin(rs.getString("登录账号"));				
				
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
		
		// 删除	
			public static int delete(String sql)
			{		
				int result = 0;		
				CommonDAO dao = new CommonDAO();		
						
				result = dao.update(sql);		
				dao.close();		
				return result;	
			}

}
