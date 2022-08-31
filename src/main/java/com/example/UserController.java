package com.example;
import java.util.List;
import java.util.Optional;

import javax.naming.NameNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController; 


@RestController

public class UserController {

	@Autowired
	UserDAO dao; 
	@PostMapping("user/insert")
	public User insert(@RequestBody User u) {
		return dao.insert(u); 
		
	}
	
	@GetMapping("user/getall")
	public List<User> get() {
		return dao.getall(); 
	}
	
	@DeleteMapping("user/delete/{id}")
	public String Delete(@PathVariable int id) {
		return dao.deleteById(id); 
	}
	
	@GetMapping("user/getName/{name}")
	public User findByName(@PathVariable String name) throws Exception{
		User user = dao.findByName(name);
		if (user == null) {
			throw new NameNotFoundException("name not found");
		}
		return user; 
	}
	
}
