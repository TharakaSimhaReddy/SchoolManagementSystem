package com.thari.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TimeTable {
	
	private Long id;
	private String subject;
	private String day;
	private Integer periodNumber;
	private String teacher;
	private String classNumber;


}
