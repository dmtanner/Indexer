package shared.model;

/** holds a user*/
public class User {

	/** the id of this user*/
	private int id;
	/**the amount of records this person has indexed*/
	private int record_count;
	/** the username associated with this user*/
	private String username;
	/** the password associated with this user*/
	private String password;
	/** the batch on which this user is currently working*/
	private Batch current_batch;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRecord_count() {
		return record_count;
	}
	public void setRecord_count(int record_count) {
		this.record_count = record_count;
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
	public Batch getCurrent_batch() {
		return current_batch;
	}
	public void setCurrent_batch(Batch current_batch) {
		this.current_batch = current_batch;
	}
	
}
