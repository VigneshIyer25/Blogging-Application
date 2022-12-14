package com.vgnshiyer.blog.api.services;

import com.vgnshiyer.blog.api.payloads.UserDto;

import java.util.List;

public interface UserService {
	
	UserDto registerUser(UserDto user);
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);
}
