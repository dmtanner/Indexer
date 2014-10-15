package server.DAC;

import server.database.*;
import shared.model.*;

import java.util.*;

/** accesses the FIELD table in the DB*/
public class FieldDAO {
	
	/** adds a Field to the DB
	 * 
	 * @param field					the Field to be added
	 * @throws DatabaseException	the operation failed
	 */
	public void add(Field field) throws DatabaseException {
		
	}
	
	/** gets all the Fields in the DB
	 * 
	 * @return List<Field>			a list of all the Fields
	 * @throws DatabaseException	the operation failed
	 */
	public List<Field> getAll() throws DatabaseException {
		
		List<Field> fields = new ArrayList<>();
		return fields;
		
	}
	
	
	/** update the info about a Field
	 * 
	 * @param field					the Field and info to be updated
	 * @throws DatabaseException	the operation failed
	 */
	public void update(Field field) throws DatabaseException {
		
	}

}
