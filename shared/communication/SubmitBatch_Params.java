package shared.communication;

import java.util.*;

import shared.model.Record;

/** encapsulates info sent to the server when the submitBatch() method is called*/
public class SubmitBatch_Params {
	
	/** the user's username*/
	private String username;
	/** the user's password*/
	private String password;
	/** the id of the batch the user is submitting*/
	private int batch_id;
	/** the indexed records for each row in the submitted batch*/
	private List<Record> values;
	
	
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
	public int getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}
	public List<Record> getValues() {
		return values;
	}
	public void setValues(List<Record> values) {
		this.values = values;
	}

}
