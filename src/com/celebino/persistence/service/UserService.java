package com.celebino.persistence.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.celebino.persistence.dao.UserDAO;
import com.celebino.persistence.model.User;

@Component
public class UserService {
	private UserDAO userDao;
	
	public UserDAO getUserDAO(){
		return userDao;
	}
	
	@Autowired
	public void setUserDao(UserDAO userDao) {
	this.userDao = userDao;
	}
	 
	public void addUser(User user) {
		getUserDAO().insert(user);
	}
	 
	public List<User> fetchAllUsers() {
	return getUserDAO().selectAll();
	}
}
