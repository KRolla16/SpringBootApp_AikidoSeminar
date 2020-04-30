package io.swagger.service;

import io.swagger.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User User) {
		return userRepository.save(User);
	}	

	@Override
	public User deleteByUsername(String username) {
		Optional<User> u = userRepository.findByUsername(username);
		if(u.isPresent()) userRepository.deleteById(Long.valueOf(username));
		return u.get();

	}

	@Override
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User updateUser(User u) {
		userRepository.updateUserByName(u.getUsername(),u.getEmail(),u.getFirstName(),u.getLastName(),u.getPassword(),u.getPhone(),u.getUserStatus(),u.getKyu());
		return u;
	}

	@Override
	public User findById(long id) {
		Optional<User> u = userRepository.findById(id);
		if(u.isPresent()) return u.get();
		else return null;
	}

	@Override
	public User findByUsername(String username) {
		Optional<User> u = userRepository.findByUsername(username);
		if(u.isPresent()) return u.get();
		else return null;
	}



}
