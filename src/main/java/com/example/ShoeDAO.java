package com.example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoeDAO {
	@Autowired
	ShoeRepo repo; 
	
	public Shoe insert(Shoe s) {
		return repo.save(s);
	}
	
	public List<Shoe> getall(){
		return repo.findAll();
	}
	
	public void deleteByid(int id) {
		repo.deleteById(id);
	}
	
	public Shoe update(int id ,Shoe shoe) {
		Shoe s = repo.findById(id).orElse(null);
		s.setShoeName(shoe.getShoeName());
		s.setPrice(shoe.getPrice());
		return repo.save(s);
	}

	
	public Shoe findByName(String name) {
		return repo.findByName(name);
	}
	
	public Optional<Shoe> findbyid(int id){
		return repo.findById(id); 
	}
	
	

}
