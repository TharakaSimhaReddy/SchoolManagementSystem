package com.thari.project.service;

import com.thari.project.entity.Admin;
import com.thari.project.repository.AdminDAO;
import com.thari.project.repository.AdminDAOImp;

public class AdminServiceImp implements AdminService{
 
	public AdminDAO adminDAO;
	
	
	public AdminServiceImp() {
		 adminDAO = new AdminDAOImp();
	}
	@Override
	public Admin validateAdmin(String name, String password) {
		return adminDAO.validateAdmin(name, password);
		
	}
	@Override
	public void saveAdmin(Admin admin) {
		
		adminDAO.saveAdmin(admin);
		
	}
}
