package com.nelioalves.worhshomongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nelioalves.worhshomongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
