package models;

public class User {
	private String name; 
	private String username; 
	private String password; 
	private String function; 
	private String SSN; 
	
	public User(
			String name, 
			String username,
			String password,
			String function,
			String SSN
			){
		this.name=name; 
		this.username=username; 
		this.password=password; 
		this.function=function; 
		this.SSN=SSN; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", username=" + username + ", password="
				+ password + ", function=" + function + ", SSN=" + SSN + "]";
	}
	
}
