package com.Project.PlacementManagementSystem;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class UserService 
{
	@Autowired
	private UserRepository repo;
	
	public List<User> listAll()
	{
		return repo.findAll();
	}

	public void save(User user)
	{
		repo.save(user);
	}
	
	public User get(long id)
	{
		return repo.findById(id).get();
	}
	
	public void delete(long id)
	{
		repo.deleteById(id);
	}
}
