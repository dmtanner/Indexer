package shared.model;

import java.util.*;


/** holds a batch*/
public class Batch {
	
	/** the id of the batch*/
	private int id;
	/** the url path of the image*/
	private String image_url;
	/** the y coordinate where the table in the actual image begins*/
	private int first_y_coord;
	/** the height of the table in the image*/
	private int record_height;
	/** a list of the indexed records associated with this batch*/
	private List<Record> records;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public int getFirst_y_coord() {
		return first_y_coord;
	}
	public void setFirst_y_coord(int first_y_coord) {
		this.first_y_coord = first_y_coord;
	}
	public int getRecord_height() {
		return record_height;
	}
	public void setRecord_height(int record_height) {
		this.record_height = record_height;
	}
	public List<Record> getRecords() {
		return records;
	}
	public void setRecords(List<Record> records) {
		this.records = records;
	}

}
