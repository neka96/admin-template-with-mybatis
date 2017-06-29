package org.kshrd.template.services.impl;

import java.util.List;

import org.kshrd.template.model.User;
import org.kshrd.template.repositories.UserRepository;
import org.kshrd.template.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.getAllUser();
	}

	@Override
	public boolean deleteUser(String userHash) {
		return userRepository.deleteUser(userHash);
	}

	@Override
	public User findUserByHashCode(String userHash) {
		return userRepository.findUserByHashCode(userHash);
	}

	@Override
	public boolean updateUser(User user) {
		return userRepository.updateUser(user);
	}

	@Override
	public boolean insertUser(User user) {
		return userRepository.insertUser(user);
	}

}
