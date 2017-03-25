package org.celebino.persistence.dao;

import org.celebino.persistence.model.ArtificialLight;
import org.celebino.persistence.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, String>{
	public User findByUsername(String username);

}