package com.thari.project.service;

import com.thari.project.entity.Admin;

public interface AdminService {
	
	public void saveAdmin(Admin admin) ;
	
	public Admin validateAdmin(String name, String password);
		
	

}
