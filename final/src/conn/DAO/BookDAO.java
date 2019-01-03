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
		String sql = "insert into 书籍 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";	
		try {			
			result = dao.update(sql, book.getISBN(), 
					book.getBookname(),
					book.getState(),
					book.getGcd(),
					
					book.getId(),		
					book.getSre(),
					book.getSsre(),
					book.getPublish(), 
					book.getPublishdate(),	
					book.getPrice(),	
					book.getTypename(),	
					book.getBrief(),
					book.getCatalog(),	
					book.getZyf(),
					book.getTheme(),
					book.getZati(),
					book.getTel(),
					book.getMarc(),
					book.getTypefile(),	
					
					book.getView(),
					book.getBorrow(),
					book.getBorrowdate(),
					book.getReturndate()
					
					
					
					
					
					
					
					
					
					
					
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
				book.setISBN(rs.getString("条码号"));				
				book.setBookname(rs.getString("书名"));	
				book.setState(rs.getString("借阅状态"));	
				book.setGcd(rs.getString("馆藏地"));
				book.setId(rs.getString("索书号"));	
				book.setSre(rs.getString("个人责任者"));
				book.setSsre(rs.getString("个人次要责任者"));		
				book.setPublish(rs.getString("出版社"));				
				book.setPublishdate(rs.getDate("出版日期"));	
				book.setPrice(rs.getFloat("ISBN及定价"));
				book.setTypename(rs.getString("类别"));
				book.setBrief(rs.getString("内容简介"));
				book.setCatalog(rs.getString("目录"));
				book.setZyf(rs.getString("中图法分类"));
				book.setTheme(rs.getString("学科主题"));
				book.setZati(rs.getString("载体形态"));
				book.setTel(rs.getString("光盘服务联系方式"));
				book.setMarc(rs.getString("MARC状态"));
				book.setTypefile(rs.getString("文献类型"));
				book.setView(rs.getInt("浏览次数"));
				book.setBorrow(rs.getInt("借阅次数"));	
				book.setBorrowdate(rs.getDate("借阅日期"));
				book.setReturndate(rs.getDate("归还日期"));
					
				
			
				
				
				
				
				
				
				
				
						
					
				
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
		Book book= null;		
		ResultSet rs=null;		
		CommonDAO dao = new CommonDAO();		
		String sql = "select * from 书籍  where 条码号=?";		 
		rs = dao.query(sql, ISBN);		
		try {			
			if (rs.next()) {	
				book = new Book();

				book.setISBN(rs.getString("条码号"));				
				book.setBookname(rs.getString("书名"));	
				book.setState(rs.getString("借阅状态"));	
				book.setGcd(rs.getString("馆藏地"));
				book.setId(rs.getString("索书号"));	
				book.setSre(rs.getString("个人责任者"));
				book.setSsre(rs.getString("个人次要责任者"));		
				book.setPublish(rs.getString("出版社"));				
				book.setPublishdate(rs.getDate("出版日期"));	
				book.setPrice(rs.getFloat("ISBN及定价"));
				book.setTypename(rs.getString("类别"));
				book.setBrief(rs.getString("内容简介"));
				book.setCatalog(rs.getString("目录"));
				book.setZyf(rs.getString("中图法分类"));
				book.setTheme(rs.getString("学科主题"));
				book.setZati(rs.getString("载体形态"));
				book.setTel(rs.getString("光盘服务联系方式"));
				book.setMarc(rs.getString("MARC状态"));
				book.setTypefile(rs.getString("文献类型"));
				book.setView(rs.getInt("浏览次数"));
				book.setBorrow(rs.getInt("借阅次数"));	
				book.setBorrowdate(rs.getDate("借阅日期"));
				book.setReturndate(rs.getDate("归还日期"));
						
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

				book.setISBN(rs.getString("条码号"));				
				book.setBookname(rs.getString("书名"));	
				book.setState(rs.getString("借阅状态"));	
				book.setGcd(rs.getString("馆藏地"));
				book.setId(rs.getString("索书号"));	
				book.setSre(rs.getString("个人责任者"));
				book.setSsre(rs.getString("个人次要责任者"));		
				book.setPublish(rs.getString("出版社"));				
				book.setPublishdate(rs.getDate("出版日期"));	
				book.setPrice(rs.getFloat("ISBN及定价"));
				book.setTypename(rs.getString("类别"));
				book.setBrief(rs.getString("内容简介"));
				book.setCatalog(rs.getString("目录"));
				book.setZyf(rs.getString("中图法分类"));
				book.setTheme(rs.getString("学科主题"));
				book.setZati(rs.getString("载体形态"));
				book.setTel(rs.getString("光盘服务联系方式"));
				book.setMarc(rs.getString("MARC状态"));
				book.setTypefile(rs.getString("文献类型"));
				book.setView(rs.getInt("浏览次数"));
				book.setBorrow(rs.getInt("借阅次数"));	
				book.setBorrowdate(rs.getDate("借阅日期"));
				book.setReturndate(rs.getDate("归还日期"));
					
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
	//删除图书信息
	public static int delete(String sql){		
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
