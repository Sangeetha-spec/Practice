package com.gitlab.github;

public class User {
	
	
	public int id;
	public String name;
	public int employeedId;
	public String age;
	
	public User(int id, String name, int employeedId, String age) {
		super();
		this.id = id;
		this.name = name;
		this.employeedId = employeedId;
		this.age=age;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", employeedId=" + employeedId + "]";
	}

}
