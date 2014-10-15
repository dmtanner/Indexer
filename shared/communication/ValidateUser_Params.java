package shared.communication;

/** encapsulates info sent to the server when the validateUser() method is called*/
public class ValidateUser_Params {

	/** the user's username*/
	private String username;
	/** the user's password*/
	private String password;
	
	
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
	
}
