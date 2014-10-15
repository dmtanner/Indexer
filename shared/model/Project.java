package shared.model;

import java.util.*;

/** holds a project*/
public class Project {
	
	/** the project's id*/
	private int id;
	/** the name of the project*/
	private String name;
	/** the list of batch files associated with this project*/
	private List<Batch> batches;
	/** the list of fields that this project's batches contain*/
	private List<Field> fields;
	
	
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
	public List<Batch> getBatches() {
		return batches;
	}
	public void setBatches(List<Batch> batches) {
		this.batches = batches;
	}
	public List<Field> getFields() {
		return fields;
	}
	public void setFields(List<Field> fields) {
		this.fields = fields;
	}

}
