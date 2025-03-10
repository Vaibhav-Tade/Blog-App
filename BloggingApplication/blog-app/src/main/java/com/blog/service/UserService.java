package com.blog.service;

import java.util.List;

import com.blog.payload.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto userDto);
	
	UserDto updateUser(UserDto userDto, Long userId);
	
	UserDto getUserById(Long userId);
	
	List<UserDto> getAllUser();
	
	void deleteUserById(Long userId);

}
