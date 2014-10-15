package server.DAC;

import server.database.*;
import shared.model.*;

import java.util.*;

/** accesses the USER table in the DB*/
public class UserDAO {
	
	/** adds a User to the DB
	 * 
	 * @param user					the user to be added
	 * @throws DatabaseException	the operation failed
	 */
	public void add(User user) throws DatabaseException {
		
	}
	
	/** gets all the Users in the DB
	 * 
	 * @return List<User>			a list of all the users
	 * @throws DatabaseException	the operation failed
	 */
	public List<User> getAll() throws DatabaseException {
		
		List<User> users = new ArrayList<>();
		return users;
		
	}
	
	/** update the info about a user
	 * 
	 * @param user					the user and info to be updated
	 * @throws DatabaseException	the operation failed
	 */
	public void update(User user) throws DatabaseException {
		
	}

}
