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
public class ShoeController {

	@Autowired
	ShoeDAO dao; 
	@PostMapping("shoe/insert")
	public Shoe insert(@RequestBody Shoe u) {
		return dao.insert(u); 
		
	}
	
	@GetMapping("shoe/getall")
	public List<Shoe> get() {
		return dao.getall(); 
	}
	
	@DeleteMapping("shoe/delete/{id}")
	public void Delete(@PathVariable int id) {
		 dao.deleteByid(id); 
	}
	
	@GetMapping("shoe/getName/{name}")
	public Shoe findByName(@PathVariable String name) throws Exception{
		Shoe shoe = dao.findByName(name);
		if (shoe == null) {
			throw new NameNotFoundException("name not found");
		}
		return shoe; 
	}

	@PutMapping("shoe/update/{id}")
	public Shoe update(@PathVariable int id ,@RequestBody Shoe shoe) {
		return dao.update(id, shoe);
	}

	
	
}
