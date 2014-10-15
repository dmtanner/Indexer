package shared.model;

import java.util.*;

/** holds a record*/
public class Record {
	
	/** the id of this record*/
	private int id;
	/**the batch line number with which this record is associated*/
	private int record_num;	
	/** the row of values that are contained in this record*/
	private List<Value> values;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRecord_num() {
		return record_num;
	}
	public void setRecord_num(int record_num) {
		this.record_num = record_num;
	}
	public List<Value> getValues() {
		return values;
	}
	public void setValues(List<Value> values) {
		this.values = values;
	}
	

}
