package client.communication;

import client.*;
import shared.communication.*;

/** Handles the exchange of data for the client
 * 
 * @author Marcus Tanner
 * @version 1.0
 *
 */
public class ClientCommunicator {

	public ClientCommunicator() {
		
	}
	/** makes sure the user exists in the database
	 * 
	 * @param params			the user's username and password
	 * @return results			the user info, and a validation boolean
	 * @throws ClientException	the operation failed
	 */
	public ValidateUser_Results validateUser(ValidateUser_Params params) throws ClientException {
		
		ValidateUser_Results results = new ValidateUser_Results();
		return results;
		
	}
	
	/**  gets all the projects in the DB so the user can choose one
	 * 
	 * @param params			the user's username and password
	 * @return results			all the projects and their data
	 * @throws ClientException	the operation failed
	 */
	public GetProjects_Results getProjects(GetProjects_Params params) throws ClientException {
		
		GetProjects_Results results = new GetProjects_Results();
		return results;
		
	}
	
	/** gets one batch file pathname from the project so the user can see a sample
	 * 
	 * @param params			the project's unique id
	 * @return results			the pathname to a batch/image
	 * @throws ClientException	the operation failed
	 */
	public GetSampleImage_Results getSampleImage(GetSampleImage_Params params) throws ClientException {
		
		GetSampleImage_Results results = new GetSampleImage_Results();
		return results;
		
	}
	
	/** gets a batch from the DB and gives it to the client
	 * 
	 * @param params			the project's unique id
	 * @return results			a batch from that project, along with any other necessary info
	 * @throws ClientException	the operation failed
	 */
	public DownloadBatch_Results downloadBatch(DownloadBatch_Params params) throws ClientException {
		
		DownloadBatch_Results results = new DownloadBatch_Results();
		return results;
		
	}
	
	/** returns an indexed(hopefully) batch to the server
	 * 
	 * @param params			the indexed values the person has entered, along with necessary info such as batch id
	 * @return results			a boolean that says whether the submit was successful
	 * @throws ClientException	the operation failed
	 */
	public SubmitBatch_Results submitBatch(SubmitBatch_Params params) throws ClientException {

		SubmitBatch_Results results = new SubmitBatch_Results();
		return results;
		
	}
	
	/**	gets all the fill-out categories (fields) for a certain project
	 * 
	 * @param params			the project's unique id
	 * @return results			the fields that go along with this project
	 * @throws ClientException	the operation failed
	 */
	public GetFields_Results getFields(GetFields_Params params) throws ClientException {
		
		GetFields_Results results = new GetFields_Results();
		return results;
		
	}
	
	/** searches all the indexed records for certain string(s)
	 * 
	 * @param params			info about which field(s) to search, and what string(s) to search
	 * @return results			the batch and field info where the string(s) was found
	 * @throws ClientException	the operation failed
	 */
	public Search_Results search(Search_Params params) throws ClientException {
		
		Search_Results results = new Search_Results();
		return results;
		
	}

}