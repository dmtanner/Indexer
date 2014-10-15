package shared.communication;

import shared.model.Batch;

/** Encapsulates the server info requested with the client downloadBatch() method*/
public class DownloadBatch_Results {
	
	/** the batch to be returned*/
	private Batch batch;

	
	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

}
