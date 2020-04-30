package io.swagger.service;

import io.swagger.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {



    public User addUser(User User);
    public User deleteByUsername(String username);
	public List<User> findAllUsers();
	public User updateUser(User User);
	public User findById(long id);
	public User findByUsername(String name);
	
}
