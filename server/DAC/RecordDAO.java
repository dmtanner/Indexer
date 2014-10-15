package server.DAC;

import server.database.*;
import shared.model.*;

import java.util.*;

/** accesses the RECORD table in the DB*/
public class RecordDAO {
	
	/** adds a Record to the DB
	 * 
	 * @param record				the Record to be added
	 * @throws DatabaseException	the operation failed
	 */
	public void add(Record record) throws DatabaseException {
		
	}
	
	/** gets all the Records in the DB
	 * 
	 * @return List<Record>			a list of all the Records
	 * @throws DatabaseException	the operation failed
	 */
	public List<Record> getAll() throws DatabaseException {
		
		List<Record> records = new ArrayList<>();
		return records;
		
	}
	
	/** update the info about a Record
	 * 
	 * @param record				the Record and info to be updated
	 * @throws DatabaseException	the operation failed
	 */
	public void update(Record record) throws DatabaseException {
		
	}

}
