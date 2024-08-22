package conflictsfile.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



public class serviceConflictFile {
	
	public UserDaosercon usd;

	public serviceConflictFile(UserDaosercon usd) {
		super();
		this.usd = usd;
	}

	@GetMapping("/userss")
	public List<Userconf> retrieveAll()
	{
		return usd.getUser();
	}
	@GetMapping("/users/{id}")
	public Userconf retrieveOne(@PathVariable int id)
	{
		return usd.getOneUser(1);
	}
}


