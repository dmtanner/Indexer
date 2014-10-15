package server.DAC;

import server.database.*;
import shared.model.*;

import java.util.*;

/** accesses the PROJECT table in the DB*/
public class ProjectDAO {
	
	/** adds a Project to the DB
	 * 
	 * @param project				the project to be added
	 * @throws DatabaseException	the operation failed
	 */
	public void add(Project project) throws DatabaseException {
		
	}
	
	/** gets all the Projects in the DB
	 * 
	 * @return List<Project>		a list of all the Projects
	 * @throws DatabaseException	the operation failed
	 */
	public List<Project> getAll() throws DatabaseException {
		
		List<Project> projects = new ArrayList<>();
		return projects;
		
	}

	
	/** update the info about a Project
	 * 
	 * @param project				the Project and info to be updated
	 * @throws DatabaseException	the operation failed
	 */
	public void update(Project project) throws DatabaseException {
		
	}

}
