package com.nelioalves.worhshomongo.sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.worhshomongo.domain.Post;
import com.nelioalves.worhshomongo.repository.PostRepository;
import com.nelioalves.worhshomongo.sevices.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;


	
	public Post findById(String id) {
	    return repo.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	  
		}
	
		
	public List<Post> findByTitle(String text){
		return repo.searchTitle(text);
		
		
		}
	
	
	}


