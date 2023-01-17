package com.thari.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	private Long id;
	private String name;
	private String phno;
	private String address;
	private String email;
	private String grades;
	private String classNumber;
	private String parentphno;
	

}
