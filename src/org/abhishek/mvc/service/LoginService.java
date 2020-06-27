package org.abhishek.mvc.service;

import java.util.HashMap;

import org.abhishek.mvc.dto.User;

public class LoginService {
	HashMap<String, String> users;

	public LoginService() {
		users = new HashMap<>();
		users.put("abhiX", "Abhishek Aggarwal");
		users.put("nisgyan", "Nishant Verma");
		users.put("sourabhvn", "Sourabh Tiwari");

	}

	public boolean authenticate(String userId, String password) {
		if (userId == null || userId.isEmpty())
			return false;
		else {
			if (password == null || password.trim().isEmpty())
				return false;
			return true;
		}
	}

	public User getUserDetailss(String userId) {
		User user = new User();
		user.setUsername(users.get(userId));
		user.setUserId(userId);
		return user;
	}
}
