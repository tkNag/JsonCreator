package works.factory.blueprint;

public class BluePrintDTO {
	private String _id;
	private Object group;
	private Object project;
	private Object foundation;
	public String getId() {
		return _id;
	}
	public void setId(String _id) {
		this._id = _id;
	}
	public Object getGroup() {
		return group;
	}
	public void setGroup(Object group) {
		this.group = group;
	}
	public Object getProject() {
		return project;
	}
	public void setProject(Object project) {
		this.project = project;
	}
	public Object getFoundation() {
		return foundation;
	}
	public void setFoundation(Object foundation) {
		this.foundation = foundation;
	}
}
