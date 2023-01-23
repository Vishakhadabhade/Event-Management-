package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
	
	
	public Users findByEmailAndPassword(String email, String password);

	public Users findByEmail(String email);


}
