package object.logbodies.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProjectPojo {
	private String project_name = "";
	private List<String> files = new ArrayList<String>();

	public String getProjectName() {
		return project_name;
	}

	public void setProjectName(String projectName) {
		this.project_name = projectName;
	}

	public List<String> getFiles() {
		return files;
	}

	public void addFile(String onefile) {
		this.files.add(onefile);
		//this.files = files;
	}
}
