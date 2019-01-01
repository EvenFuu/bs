package conn.DAO;
import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;

 

import com.model.Booktype;
public class BooktypeDAO {

	public static Booktype selectBooktypeDao(int id){		
		Booktype ci = null;				
		String sql = "select * from booktype where id=?";		
		CommonDAO Dao = new CommonDAO();		
		ResultSet rs = Dao.query(sql, id);		
		try {			
			if(rs.next()){				
			String ci_id = rs.getString("id");				
			String ci_type = rs.getString("typename");								
			ci = new Booktype(); 				
			ci.setId(ci_id);				
			ci.setTypename(ci_type);							
			}				
			} 
		catch (SQLException e) 
		{			
			e.printStackTrace();		
		}				
		return ci;	
		}		
	// 查询所有图书类型信息	
	public static List<Booktype> selectBookType() 
	{		
		List<Booktype> list = null;		
		CommonDAO dao = new CommonDAO();		
		String sql = "select * from booktype";		
		ResultSet rs = dao.query(sql);		
		list = new ArrayList<Booktype>();		
		try {			
			while (rs.next()) {				
			Booktype bt = new Booktype();				
			bt.setId(rs.getString("id"));				
			bt.setTypename(rs.getString("typename"));				
			list.add(bt);			
			}		} 
		catch (SQLException e) {			
			e.printStackTrace();		
			}		
		dao.close();
		return list;	
			}
	// 添加图书信息	
	public static int insertBookType(String id, String typename)
	{		
		int result = 0;		
			CommonDAO dao = new CommonDAO();		
			String sql = "insert into booktype(id,typename) values(?,?)";		
			result = dao.update(sql, id, typename);		
			dao.close();		
			return result;	
	} 	
	// 修改指定编号的图书类型信息	
	public static int updateBookType(String id, String typename) 
	{		
		int result=0;		
		String sql="update  Booktype set typename=? where id=?";		
		CommonDAO dao = new CommonDAO();		
		result = dao.update(sql,typename,id);		
		return result;	
	} 	
	// 删除指定类型编号的图书类型。	
	public static int deleteBookType(String  id)
	{		
		int result = 0;		
		CommonDAO dao = new CommonDAO();		
		String sql = "delete  from booktype where id=?";		
		result = dao.update(sql, id);		
		dao.close();		
		return result;	
	}
	
}
