package conn.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CommonDAO {
	private String drivername = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private String url = "jdbc:sqlserver://localhost:1433;DatabaseName=ddd";
	private String name = "sa";
	private String password = "123456";
	private Connection con = null;
	public  CommonDAO() {};
	public void openConnection() {//��������
		try {
			Class.forName(drivername);
			con = DriverManager.getConnection(url, name, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//查询
	public ResultSet query(String sql, Object... objs) {
		ResultSet rs = null;
		try {
			if (con == null) {
				openConnection();
			}
			PreparedStatement ps = null;
			ps = con.prepareStatement(sql);
			if (objs != null) {
				for (int i = 0; i < objs.length; i++) {
					ps.setObject(i + 1, objs[i]);
				}
			}
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;

	}

	
//更新操作
	public int update(String sql, Object... objs) {
		int result = 0;
		PreparedStatement ps = null;
		try {
			if (con == null) {
				openConnection();
			}
			ps = con.prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				ps.setObject(i + 1, objs[i]);
			}
			result = ps.executeUpdate();
			System.out.println(result + "行受影响");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public void close() {//�ر�����
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con = null;
		}
	}

}
