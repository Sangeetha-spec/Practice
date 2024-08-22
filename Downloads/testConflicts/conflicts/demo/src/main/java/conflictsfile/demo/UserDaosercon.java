package conflictsfile.demo;

import java.util.ArrayList;
import java.util.List;

public class UserDaosercon {
	
public static List<Userconf> users = new ArrayList<>();
	
	static {
		 users.add(new Userconf(1 ,"jjj", 2));
		 users.add(new Userconf(2, "ddd",22));
	}
	public List<Userconf> getUser()
	{
		return users;
	}
	
	public Userconf getOneUser(int id)
	{
		return users.get(1);
	}
	
}
