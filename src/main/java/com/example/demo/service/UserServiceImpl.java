package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.repository.UsersRepository;
@Service
public class UserServiceImpl implements UsersService {
	
	@Autowired
	private UsersRepository usersrepo;

	@Override
	public Users saveUsers(Users users) {
		// TODO Auto-generated method stub
		return usersrepo.save(users);
	}

	@Override
	public List<Users> fetchUsersList() {
		// TODO Auto-generated method stub
		return usersrepo.findAll();
	}

	@Override
	public Users fetchUsersById(Long id) {
		// TODO Auto-generated method stub
		return usersrepo.findById(id).get();
	}

	@Override
	public void deleteUsersById(Long id) {
		// TODO Auto-generated method stub
		usersrepo.deleteById(id);
		
	}

	@Override
	public Users updateUsers(Long id, Users users) {
		// TODO Auto-generated method stub
		Users user = usersrepo.findById(id).get();
		if(Objects.nonNull(users.getName())&&!"".equalsIgnoreCase(users.getName()))
		{
			user.setName(users.getName());
		}
		
		if(Objects.nonNull(users.getEmail()))
		{
			user.setEmail(users.getEmail());
		}
		
		if(Objects.nonNull(users.getNumber()))
		{
			user.setNumber(users.getNumber());
		}
		
		if(Objects.nonNull(users.getPassword()))
		{
			user.setPassword(users.getPassword());
		}
		return usersrepo.save(user);
	}

	@Override
	public Users fetchUserByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
//		if(email != null)email = email.toLowerCase();
		return usersrepo.findByEmailAndPassword(email, password);
	}

	@Override
	public Users fetchUserByEmail(String email) {
		// TODO Auto-generated method stub
		return usersrepo.findByEmail(email);
	}

}
