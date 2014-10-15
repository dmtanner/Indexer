package shared.communication;

import java.util.*;

import shared.model.Field;

/** Encapsulates the server info requested with the client getFields() method*/
public class GetFields_Results {
	
	/** the fields of the project*/
	private List<Field> fields;
	

	public List<Field> getFields() {
		return fields;
	}

	public void setFields(List<Field> fields) {
		this.fields = fields;
	}

}
