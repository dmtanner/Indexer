package shared.communication;

/** a small class to hold project id's and titles together*/
public class ProjectInfo {
	
	/** the id of the project*/
	private int project_id;
	/** the title of the project*/
	private String project_title;
	
	
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public String getProject_title() {
		return project_title;
	}
	public void setProject_title(String project_title) {
		this.project_title = project_title;
	}

}
