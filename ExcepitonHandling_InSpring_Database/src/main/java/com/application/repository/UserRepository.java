package com.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

	User findByName(String name);


}
