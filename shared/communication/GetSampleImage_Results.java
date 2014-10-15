package shared.communication;

import java.net.URL;

/** Encapsulates the server info requested with the client getSampleImage() method*/
public class GetSampleImage_Results {

	/** the url of the sample image*/
	private URL sample_image;

	
	public URL getSample_image() {
		return sample_image;
	}

	public void setSample_image(URL sample_image) {
		this.sample_image = sample_image;
	}
	
}
