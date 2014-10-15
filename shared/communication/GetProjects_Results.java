package shared.communication;

import java.util.*;

/** Encapsulates the server info requested with the client getProjects() method*/
public class GetProjects_Results {
	
	/** a list of the id's and titles of each project*/
	private List<ProjectInfo> projectInfos;

	
	public List<ProjectInfo> getProjectInfos() {
		return projectInfos;
	}

	public void setProjectInfos(List<ProjectInfo> projectInfos) {
		this.projectInfos = projectInfos;
	}

}
