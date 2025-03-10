package com.blog.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private Long id;
	
	private String name;
	
	private String email;
	
	private String password;
	
	private String about;
	

}
