package com.thari.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Admin {
	private Long id;
	private String name;
	private String password;
	
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//		}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public Admin() {}
	

}
/* StateLess Request:-
 * 
 * the state less Request is the current request which is generated will have no relation with previous request and the data
 * present in previous request will have no effect on any new request
 *  (each request is treated as the new request)
 */
 
