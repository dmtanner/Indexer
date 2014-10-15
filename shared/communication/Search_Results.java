package shared.communication;

import java.util.*;

/** Encapsulates the server info requested with the client search() method*/
public class Search_Results {
	
	/** a list of tuples containing info about the location of each found result*/
	private List<SearchResult> results;

	
	public List<SearchResult> getResults() {
		return results;
	}

	public void setResults(List<SearchResult> results) {
		this.results = results;
	}

}
