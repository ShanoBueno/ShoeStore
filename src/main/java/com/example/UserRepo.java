package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer> {
	@Query("select user from User user where user.name=?1 ")
	public User findByName(String name);
}
