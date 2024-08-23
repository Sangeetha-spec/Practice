package com.gitlab.github;

import java.util.ArrayList;
import java.util.List;

public class UserDaoService {
	public static List<User> users = new ArrayList<>();
	
	static {
		    users.add(new User(1 ,"jjj", 99,"ww"));
		    users.add(new User(2, "ddd",22,"oij"));
	}
	public List<User> getUser()
	{
		return users;
	}
	
	public User getOneUser(int id)
	{
		return users.get(1);
	}
	
}
