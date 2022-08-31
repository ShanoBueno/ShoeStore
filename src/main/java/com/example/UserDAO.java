package com.example;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UserDAO {
	@Autowired
	UserRepo repo;
	public User insert(User u) {
		return repo.save(u);
	}
	
	//public User findByName(String name) {
		//return repo.findByName(name); 
	//}
	
	public List<User> getall(){
		return repo.findAll();
	}
	
	public User findByName(String name) {
		return repo.findByName(name);
		
	}
	
	public String deleteById(int id) {
		repo.deleteById(id);
		return "Deleted user by ID" + id; 
	}

}
