package conn.Test;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;

import com.model.BookOpe;
import com.model.ReaderOpe;

import conn.DAO.BookOpeDAO;
import conn.DAO.ReaderOpeDAO;

public class testreaderope {
	
	public static void byid() {
		List<ReaderOpe> list = new ArrayList<ReaderOpe>();
		ReaderOpeDAO dao=new ReaderOpeDAO();
		String id="sa";
		list=dao.selectReaderOpeById(id);
		ReaderOpe readerope=null;
		for (int i = 0; i < list.size(); i++) {
            readerope = list.get(i);
            System.out.println(readerope.getIdentityCard()	
			+readerope.getId());
        }
	}
	
	public static void up() {
		ReaderOpeDAO dao=new ReaderOpeDAO();
		int res;
		String sql="insert into 管理学生  values('161002321','sb')";
		res=dao.update(sql);
	}
	/*public static void main(String[] args) throws Exception {
		//insert();
		byid();
		//up();
	}*/

}
