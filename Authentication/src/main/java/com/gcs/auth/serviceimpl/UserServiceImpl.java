package com.gcs.auth.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcs.auth.model.User;
import com.gcs.auth.repo.UserRepository;
import com.gcs.auth.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserRepository repo;  //HAS-A
	
	
	
public Integer saveUser(User user) {
	return 	repo.save(user).getId();

	}

}
