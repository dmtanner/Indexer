package shared.communication;

/** a small class to hold a single search result's info together*/
public class SearchResult {
	
	/** the id of the containing batch*/
	private int batch_id;
	/** the URL of the associated image*/
	private String image_url;
	/** the line on which the record resides*/
	private int record_num;
	/** the id of the field to which the result belongs*/
	private int field_id;
	
	
	public int getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public int getRecord_num() {
		return record_num;
	}
	public void setRecord_num(int record_num) {
		this.record_num = record_num;
	}
	public int getField_id() {
		return field_id;
	}
	public void setField_id(int field_id) {
		this.field_id = field_id;
	}

}
