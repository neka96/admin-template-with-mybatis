package org.kshrd.template.services;

import java.util.List;

import org.kshrd.template.model.User;

public interface UserService {
	public List<User> getAllUser();

	public boolean deleteUser(String userHash);

	public User findUserByHashCode(String userHash);

	public boolean updateUser(User user);

	public boolean insertUser(User user);
}
