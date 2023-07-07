package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import connection.DBConnection;

public class AdminDao {
	public static boolean adminLogin(String email,String password) {
		boolean flag =false;
		try {
			Connection conn  =DBConnection.crateConnection();
			String sql="select * from admin where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
}
