
public class Camcorder extends Item{
	// this is a test comment from roy again
	// updating another time to see workflow
	private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		String output = "";
		// Write your codes here
		return output;
	}
}

