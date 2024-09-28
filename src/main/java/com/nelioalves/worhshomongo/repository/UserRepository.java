package com.nelioalves.worhshomongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.worhshomongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
