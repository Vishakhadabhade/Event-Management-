package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Users;

public interface UsersService{
	
	public Users saveUsers (Users users);
	public List<Users>fetchUsersList();
	public Users fetchUsersById(Long id);
	public void deleteUsersById(Long id);
	public Users updateUsers(Long id , Users users);
	public Users fetchUserByEmail(String email);
	public Users fetchUserByEmailAndPassword(String email,String password);

}
