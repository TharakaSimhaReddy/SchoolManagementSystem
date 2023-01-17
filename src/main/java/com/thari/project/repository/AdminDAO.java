package com.thari.project.repository;

import com.thari.project.entity.Admin;
import com.thari.project.entity.Student;

public interface AdminDAO {

	
	public void saveAdmin(Admin admin) ;
	
	public Admin validateAdmin(String name, String password);
	
//	public void saveStudent(Student student );
	
	
		
	
}
