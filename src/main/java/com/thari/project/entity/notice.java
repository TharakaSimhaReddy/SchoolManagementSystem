package com.thari.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class notice {
	
	private Long id;
	private String subject;
	private String message;
	private String producedBy;
	private String rsvp;
	

}
