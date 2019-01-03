package conn.DAO;


import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;
import  com.model.BorrowBook;
public class BorrowBookDAO {
//根据读者ID查询他所借书的信息
	public static List<BorrowBook> selectBorrowByReaderId(String identityCard)
	{		
		List<BorrowBook> list = null;		
		String sql = "select * from 借书  where 证件号=?";		
		CommonDAO dao = new CommonDAO();		
		ResultSet rs = dao.query(sql,identityCard);		
		list = new ArrayList<BorrowBook>();		
		try 
		{			
			while(rs.next()){				
			BorrowBook ci = new BorrowBook();				
			ci.setIdentityCard(rs.getString("证件号"));				
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
	//插入或者更改数据
	public static int borrowBook(String sql)
	{		
		int result = 0;		
		//String sql = "insert into borrowbook(readerid,ISBN,borrowdate) values(?,?,?);";		
		CommonDAO dao = new CommonDAO();		
		result = dao.update(sql);		
		return result;	
	}	
	
	// 删除图书。	
		public static int deleteBookType(String sql)
		{		
			int result = 0;		
			CommonDAO dao = new CommonDAO();		
			//String sql = "delete  from booktype where id=?";		
			result = dao.update(sql);		
			dao.close();		
			return result;	
		}
	
}
