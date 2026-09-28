package com.luisdev.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luisdev.workshopmongo.domain.User;
import com.luisdev.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository repo;

	UserService(UserRepository repo) {
		this.repo = repo;
	}
	
	public List<User> findAll() {
		return repo.findAll();
	}
}
