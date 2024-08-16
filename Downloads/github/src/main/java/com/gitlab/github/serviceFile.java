package com.gitlab.github;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class serviceFile {
	
	public UserDaoService usd;

	public serviceFile(UserDaoService usd) {
		super();
		this.usd = usd;
	}

	@GetMapping("/users")
	public List<User> retrieveAll()
	{
		return usd.getUser();
	}
	@GetMapping("/users/{id}")
	public User retrieveOne(@PathVariable int id)
	{
		return usd.getOneUser(1);
	}
}
