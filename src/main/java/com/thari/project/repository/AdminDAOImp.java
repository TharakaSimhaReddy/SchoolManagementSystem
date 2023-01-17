package com.thari.project.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.thari.project.entity.Admin;
import com.thari.project.util.AppConstants;
import com.thari.project.util.ConnectionUtil;

public class AdminDAOImp implements AdminDAO{
	public static Connection getConnection() {
		Connection  connection =null;
		try {
			Class.forName(AppConstants.DRIVER_NAME);
			connection =DriverManager.getConnection(AppConstants.URL,"root","root");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	
	
	public void saveAdmin(Admin admin) {
		
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection1 = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/school_data_management","root","root");
				String sql ="INSERT INTO admin(name,password) VALUES (?,?)";
			PreparedStatement ps = connection1.prepareStatement(sql);
			ps.setString(1,admin.getName());
			ps.setString(2, admin.getPassword());
			int res =ps.executeUpdate();
			System.out.println(res);
			ps.close();
			
		
		
			}catch (Exception e) {
				e.printStackTrace();
			}

}
	
	public Admin validateAdmin(String name, String password) {
		Admin admin = null;
		try {
		Connection connection = getConnection();
		String sql ="SELECT * FROM admin WHERE name=? AND password=?";
		
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2,password);
		ResultSet resultSet = ps.executeQuery();
		if(resultSet.next()) {
			admin = new Admin();
			admin.setId(resultSet.getLong(1));
			admin.setName(resultSet.getString(2));
			admin.setPassword(resultSet.getString(3));
		}
		ps.close();
		connection.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return admin;
		
	}

}

