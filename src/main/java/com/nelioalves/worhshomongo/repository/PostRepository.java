package com.nelioalves.worhshomongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nelioalves.worhshomongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{
	
	
	List<Post> findByTitleContainingIgnoreCase(String text);
		
	

}
