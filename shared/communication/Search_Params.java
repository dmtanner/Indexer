package shared.communication;

import java.util.*;

import shared.model.Field;

/** encapsulates info sent to the server when the search() method is called*/
public class Search_Params {
	
	/** the user's username*/
	private String username;
	/** the user's password*/
	private String password;
	/** a list of the fields to be searched*/
	private List<Field> fields;
	/** a list of the strings to be searched*/
	private List<String> search_strings;
	
	
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
	public List<Field> getFields() {
		return fields;
	}
	public void setFields(List<Field> fields) {
		this.fields = fields;
	}
	public List<String> getSearch_strings() {
		return search_strings;
	}
	public void setSearch_strings(List<String> search_strings) {
		this.search_strings = search_strings;
	}

}
