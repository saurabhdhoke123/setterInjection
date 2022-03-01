package PANDCnamespace;

public class engine {
	private int engineId;
	private String model;
	public engine(int engineId, String model) {
		
		this.engineId = engineId;
		this.model = model;
	}
	@Override
	public String toString() {
		return "engine [engineId=" + engineId + ", model=" + model + "]";
	}

}
