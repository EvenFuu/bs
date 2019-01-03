package conn.Test;

import java.util.ArrayList;
import java.util.List;

import com.model.BookOpe;

import conn.DAO.BookOpeDAO;
import conn.DAO.OperatorDAO;


public class testbookope {

	public static void byid() {
		List<BookOpe> list = new ArrayList<BookOpe>();
		BookOpeDAO dao=new BookOpeDAO();
		String id="sa";
		list=dao.selectById(id);
		BookOpe bookope=null;
		for (int i = 0; i < list.size(); i++) {
            bookope = list.get(i);
            System.out.println(bookope.getId()			
			+bookope.getISBN());
        }
	}
	
	public static void up() {
		BookOpeDAO dao=new BookOpeDAO();
		int res;
		String sql="insert into 管理书籍  values('A00087903','sb')";
		res=dao.update(sql);
	}
	public static void main(String[] args) throws Exception {
		//insert();
		//byid();
		up();
	}
}
