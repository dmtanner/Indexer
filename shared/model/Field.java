package shared.model;

import java.net.URL;

/** holds a field*/
public class Field {
	
	/** the id of this field*/
	private int id;
	/** the width in pixels of this field*/
	private int width;
	/** the x coordinate of this field*/
	private int x_coord;
	/** the column this field corresponds to, from the left*/
	private int column;
	/** the actual word that this field will display*/
	private String title;
	/** the url to the text of the helping tip, in case user is confused*/
	private String help_file_url;
	/** the url to a file containing text of common values for each field*/
	private URL known_values_url;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getX_coord() {
		return x_coord;
	}
	public void setX_coord(int x_coord) {
		this.x_coord = x_coord;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getHelp_file_url() {
		return help_file_url;
	}
	public void setHelp_file_url(String help_file_url) {
		this.help_file_url = help_file_url;
	}
	public URL getKnown_values_url() {
		return known_values_url;
	}
	public void setKnown_values_url(URL known_values_url) {
		this.known_values_url = known_values_url;
	}
	
}
