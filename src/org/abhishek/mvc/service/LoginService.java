package org.abhishek.mvc.service;

public class LoginService {
	public boolean authenticate(String userId, String password) {
		if (userId == null || userId.isEmpty())
			return false;
		else {
			if (password == null || password.trim().isEmpty())
				return false;
			return true;
		}
	}
}
