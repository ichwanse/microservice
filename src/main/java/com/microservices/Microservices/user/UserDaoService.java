package com.microservices.Microservices.user;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	
	private static int userCount = 3;
	
	static {
		users.add(new User(1, "The One", new Date()));
		users.add(new User(2, "The Two", new Date()));
		users.add(new User(3, "The Three", new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		if(user.getId()==null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null; 
	}
}
