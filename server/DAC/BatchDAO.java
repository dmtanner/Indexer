package server.DAC;

import server.database.*;
import shared.model.*;
import java.util.*;

/** accesses the BATCH table in the DB*/
public class BatchDAO {
	
	/** adds a Batch to the DB
	 * 
	 * @param batch					the Batch to be added
	 * @throws DatabaseException	the operation failed
	 */
	public void add(Batch batch) throws DatabaseException {
		
	}
	
	/** gets all the Batchs in the DB
	 * 
	 * @return List<Batch>			a list of all the Batchs
	 * @throws DatabaseException	the operation failed
	 */
	public List<Batch> getAll() throws DatabaseException {
		
		List<Batch> batches = new ArrayList<>();
		return batches;
		
	}
	
	
	/** update the info about a Batch
	 * 
	 * @param batch					the Batch and info to be updated
	 * @throws DatabaseException	the operation failed
	 */
	public void update(Batch batch) throws DatabaseException {
		
	}

}
