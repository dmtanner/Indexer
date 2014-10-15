package shared.communication;

/** encapsulates info sent to the server when the getSampleImage() method is called*/
public class GetSampleImage_Params {
	
	/** the user's username*/
	private String username;
	/** the user's password*/
	private String password;
	/** the id of the requested project*/
	private int project_id;
	
	
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
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	
}
