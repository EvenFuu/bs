package conn.DAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Book;

public class BookDAO {
	// 添加图书信息	
	public static int insertBook(Book book) 
	{		
		int result = 0;		
		CommonDAO dao = new CommonDAO();		
		String sql = "insert into book values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";	
		try {			
			result = dao.update(sql, book.getISBN(), 
					book.getTypename(),
					book.getBookname(),				
					book.getGcd(),
					book.getSre(),
					book.getPublish(), 
					book.getPublishdate(),					
					book.getBorrow(), 
					book.getPrice(),
					book.getCatalog(),
					book.getBrief(),
					book.getMarc(),
					book.getSsre(),
					book.getTel(),
					book.getTheme(),
					book.getTypefile(),
					book.getZyf(),
					book.getView(),
					book.getZati()
					);		
			} 
		catch (Exception e) {			
			e.printStackTrace();		
			}		
		dao.close();		
		return result;	
	}  	
	// 查询所有图书信息	
	public static List<Book> selectBook(String sql) 
	{		
		List<Book> list = null;		
		CommonDAO dao = new CommonDAO();		
		//String sql = "select * from book";		
		ResultSet rs = dao.query(sql);		
		list=new ArrayList<Book>();		
		try {			
			while (rs.next()) {				
				Book book = new Book();				
				book.setISBN(rs.getString("ISBN"));				
				book.setBookname(rs.getString("bookname"));				
				book.setBorrow(rs.getInt("borrow"));	
				book.setBrief(rs.getString("brief"));
				book.setCatalog(rs.getString("catalog"));
				book.setGcd(rs.getString("gcd"));	
				book.setMarc(rs.getString("marc"));
				book.setPrice(rs.getDouble("price"));
				book.setView(rs.getInt("view"));
				book.setSre(rs.getString("sre"));
				book.setSsre(rs.getString("ssre"));
				book.setTel(rs.getString("tel"));
				book.setTheme(rs.getString("theme"));
				book.setTypefile(rs.getString("typefile"));
				book.setTypename(rs.getString("typename"));
				book.setZati(rs.getString("zaiti"));
				book.setZyf(rs.getString("zyf"));
				book.setPublish(rs.getString("publish"));				
				book.setPublishdate(rs.getDate("publishdate"));				
						
				list.add(book);			}		
			} 
		catch (SQLException e) {			
			e.printStackTrace();		
			}  		
		 dao.close();		
		 return list;	
	}  
	// 根据ISBN编号查询	
	public static Book selectBookByISBN(String ISBN) 
	{		
		Book book = null;		
		ResultSet rs=null;		
		CommonDAO dao = new CommonDAO();		
		String sql = "select * from book where ISBN=?";		 
		rs = dao.query(sql, ISBN);		
		try {			
			if (rs.next()) {				
				book = new Book();	
				book.setISBN(rs.getString("ISBN"));				
				book.setBookname(rs.getString("bookname"));				
				book.setBorrow(rs.getInt("borrow"));	
				book.setBrief(rs.getString("brief"));
				book.setCatalog(rs.getString("catalog"));
				book.setGcd(rs.getString("gcd"));	
				book.setMarc(rs.getString("marc"));
				book.setPrice(rs.getDouble("price"));
				book.setView(rs.getInt("view"));
				book.setSre(rs.getString("sre"));
				book.setSsre(rs.getString("ssre"));
				book.setTel(rs.getString("tel"));
				book.setTheme(rs.getString("theme"));
				book.setTypefile(rs.getString("typefile"));
				book.setTypename(rs.getString("typename"));
				book.setZati(rs.getString("zaiti"));
				book.setZyf(rs.getString("zyf"));
				book.setPublish(rs.getString("publish"));				
				book.setPublishdate(rs.getDate("publishdate"));			
			}		
	} catch (SQLException e) {			
		e.printStackTrace();		
		}		
		dao.close();		
		return book;	
   } 
	//查询图书信息
	public static Book query(String sql){		
		Book book = null;		
		ResultSet rs=null;		
		CommonDAO dao = new CommonDAO();		
			 
		rs = dao.query(sql);		
		try {			
			if (rs.next()) {				
				book = new Book();	
				book.setISBN(rs.getString("ISBN"));				
				book.setBookname(rs.getString("bookname"));				
				book.setBorrow(rs.getInt("borrow"));	
				book.setBrief(rs.getString("brief"));
				book.setCatalog(rs.getString("catalog"));
				book.setGcd(rs.getString("gcd"));	
				book.setMarc(rs.getString("marc"));
				book.setPrice(rs.getDouble("price"));
				book.setView(rs.getInt("view"));
				book.setSre(rs.getString("sre"));
				book.setSsre(rs.getString("ssre"));
				book.setTel(rs.getString("tel"));
				book.setTheme(rs.getString("theme"));
				book.setTypefile(rs.getString("typefile"));
				book.setTypename(rs.getString("typename"));
				book.setZati(rs.getString("zaiti"));
				book.setZyf(rs.getString("zyf"));
				book.setPublish(rs.getString("publish"));				
				book.setPublishdate(rs.getDate("publishdate"));			
			}		
	} catch (SQLException e) {			
		e.printStackTrace();		
		}		
		dao.close();		
		return book;	
   } 
	//修改图书信息
	public static int update(String sql){		
		int result=0;		
			
		
		CommonDAO dao =new CommonDAO();		
		try {			
			result=dao.update(sql);		
			} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		dao.close();
		return result;
		}
	
		

}
