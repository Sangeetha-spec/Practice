package conflictsfile.demo;

public class Userconf {
	
	  public int id;
		public String name;
		public int employeedId;
		public Userconf(int id, String name, int employeedId) {
			super();
			this.id = id;
			this.name = name;
			this.employeedId = employeedId;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getEmployeedId() {
			return employeedId;
		}
		public void setEmployeedId(int employeedId) {
			this.employeedId = employeedId;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", employeedId=" + employeedId + "]";
		}

}
