package shared.communication;

/** Encapsulates the server info requested with the client submitBatch() method*/
public class SubmitBatch_Results {
	
	/** true if batch submitted successfully*/
	private boolean submitted;
	

	public boolean isSubmitted() {
		return submitted;
	}

	public void setSubmitted(boolean submitted) {
		this.submitted = submitted;
	}
	
}
