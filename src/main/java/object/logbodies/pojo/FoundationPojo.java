package object.logbodies.pojo;

public class FoundationPojo {
	private String foundation_name = "";
	private Integer bill;
	private Boolean has_outdated;

	public String getFoundationName() {
		return foundation_name;
	}
	public void setFoundationName(String foundationName) {
		this.foundation_name = foundationName;
	}
	public Integer getBill() {
		return bill;
	}
	public void setBill(Integer bill) {
		this.bill = bill;
	}
	public Boolean getHasOutdated() {
		return has_outdated;
	}
	public void setHasOutdated(Boolean hasOutdated) {
		this.has_outdated = hasOutdated;
	}
}
