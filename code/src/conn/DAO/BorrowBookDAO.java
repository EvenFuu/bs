package conn.DAO;
import java.sql.Date;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;
import  com.model.BorrowBook;
public class BorrowBookDAO {
//根据读者ID查询他所借书的信息
	public static List<BorrowBook> selectBorrowByReaderId(String readerid)
	{		
		List<BorrowBook> list = null;		
		String sql = "select * from borrowbook where readerid=? and returndate is null";		
		CommonDAO dao = new CommonDAO();		
		ResultSet rs = dao.query(sql,readerid);		
		list = new ArrayList<BorrowBook>();		
		try 
		{			
			while(rs.next()){				
			BorrowBook ci = new BorrowBook();				
			ci.setReaderid(rs.getString("readerid"));				
			ci.setISBN(rs.getString("ISBN"));				
			ci.setBorrowdate(rs.getDate("borrowdate"));				
			ci.setReturndate(rs.getDate("returndate"));				
			ci.setFine(rs.getInt("fine"));				
			list.add(ci);			
			}		
		} 
	catch (SQLException e) 
	{			
		e.printStackTrace();		
	}		
	return list;	
	}
	public static int borrowBook(String readerid,String ISBN,String borrowdate)
	{		
		int result = 0;		
		String sql = "insert into borrowbook(readerid,ISBN,borrowdate) values(?,?,?);";		
		CommonDAO dao = new CommonDAO();		
		result = dao.update(sql, readerid,ISBN,borrowdate);		
		return result;	
	}	
	public static int returnBook(String readerid,String ISBN,Date returndate) 
	{		
		int result = 0; 		
		String sql1 = "update borrowbook set returndate=? where readerid=? and ISBN=? and returndate is null ;";		
		CommonDAO dao = new CommonDAO();		
		result = dao.update(sql1, returndate,readerid,ISBN);		
		return result;	
	}
	// 删除指定类型编号的图书类型。	
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
