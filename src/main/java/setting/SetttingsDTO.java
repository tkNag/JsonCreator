package setting;

public class SetttingsDTO {
	private int maxMb = 0;
	private String logFrequency = "default";
	
	public int getMaxMb() {
		return maxMb;
	}
	public void setMaxMb(int maxMb) {
		this.maxMb = maxMb;
	}
	public String getLogFrequency() {
		return logFrequency;
	}
	public void setLogFrequency(String logFrequency) {
		this.logFrequency = logFrequency;
	}
	
}
