package com.masai.main.service;

import com.masai.main.entity.UserEntity;
import com.masai.main.request.UserRegistrationRequest;

public interface UserService {
	
	public UserEntity createUser(UserRegistrationRequest request);
	public UserEntity getUserById(Long id);
	public UserEntity updateUser(Long id, UserRegistrationRequest request);
	public UserEntity deleteUser(Long id);

}
