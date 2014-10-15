package shared.communication;

/** Encapsulates the server info requested with the client validateUser() method*/
public class ValidateUser_Results {
	
	/** returns true if the username and password are found in the database*/
	private boolean valid;
	/** the first name of the user*/
	private String first_name;
	/** the last name of the user*/
	private String last_name;
	/** the number of records the user has indexed*/
	private int num_records;
	
	
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getNum_records() {
		return num_records;
	}
	public void setNum_records(int num_records) {
		this.num_records = num_records;
	}

}
