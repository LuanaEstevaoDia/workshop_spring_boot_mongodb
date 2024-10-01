package com.nelioalves.worhshomongo.sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.worhshomongo.domain.User;
import com.nelioalves.worhshomongo.repository.UserRepository;
import com.nelioalves.worhshomongo.sevices.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public List<User> findAll(){
		return repo.findAll();
		
	}
	
	public User findById(String id) {
	    return repo.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	  
	}

	
		
	}

