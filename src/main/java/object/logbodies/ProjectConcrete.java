package object.logbodies;

import object.AbstractObjectTemplate;
import object.logbodies.pojo.ProjectPojo;

public class ProjectConcrete extends AbstractObjectTemplate{
	
	@Override
	public Object init() throws NullPointerException {
		// TODO Auto-generated method stub
		ProjectPojo projectPojo = new ProjectPojo();
		projectPojo.setProjectName("tutorial");
		projectPojo.addFile("init.java");
		projectPojo.addFile("process.java");
		projectPojo.addFile("error.java");
		
		return projectPojo;
	}
}
