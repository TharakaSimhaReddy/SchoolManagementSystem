package com.thari.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Teacher {
	private Long id;
	private String name;
	private String phno;
	
	private String subject;
	private Long sal;
	private Double experience;
	private String qualification;
	private String email;
	private String classTeacher;
	private String address;
	private String password;

}
