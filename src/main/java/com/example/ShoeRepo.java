package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ShoeRepo extends JpaRepository<Shoe, Integer>{
	@Query("select shoe from Shoe shoe where shoe.shoeName=?1 ")
	public Shoe findByName(String name);
}
