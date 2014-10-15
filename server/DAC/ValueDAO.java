package server.DAC;

import server.database.*;
import shared.model.*;

import java.util.*;

/** accesses the VALUE table in the DB*/
public class ValueDAO {
	
	/** adds a Value to the DB
	 * 
	 * @param value					the Value to be added
	 * @throws DatabaseException	the operation failed
	 */
	public void add(Value value) throws DatabaseException {
		
	}
	
	/** gets all the Values in the DB
	 * 
	 * @return List<Value>			a list of all the Values
	 * @throws DatabaseException	the operation failed
	 */
	public List<Value> getAll() throws DatabaseException {
		
		List<Value> values = new ArrayList<>();
		return values;
		
	}
	
	/** update the info about a Value
	 * 
	 * @param value					the Value and info to be updated
	 * @throws DatabaseException	the operation failed
	 */
	public void update(Value value) throws DatabaseException {
		
	}

}
