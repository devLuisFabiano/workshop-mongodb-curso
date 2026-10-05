package com.luisdev.workshopmongo.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.luisdev.workshopmongo.domain.Post;
import com.luisdev.workshopmongo.repository.PostRepository;
import com.luisdev.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	private final PostRepository repo;

	PostService(PostRepository repo) {
		this.repo = repo;
	}
	
	public List<Post> findAll() {
		return repo.findAll();
	}
	
	public Post findById(String id) {
		Optional<Post> post = repo.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
	
	public List<Post> findByTitle(String txt) {
		return repo.searchTitle(txt);
	}
	
	public List<Post> fullSearch(String txt, Date minDate, Date maxDate) {
		maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
		return repo.fullSearch(txt, minDate, maxDate);
	}
}
