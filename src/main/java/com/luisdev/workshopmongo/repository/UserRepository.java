package com.luisdev.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.luisdev.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
