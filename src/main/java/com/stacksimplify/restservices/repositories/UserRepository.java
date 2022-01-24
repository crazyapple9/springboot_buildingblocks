package com.stacksimplify.restservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stacksimplify.restservices.entities.User;

//Repository Class
@Repository
public interface UserRepository extends JpaRepository<User, Long>{  
	//primary key @Id = Long, Entity class = user
	
	User findByUsername(String username);

}
