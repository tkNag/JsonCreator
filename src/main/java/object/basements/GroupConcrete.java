package object.basements;

import object.AbstractObjectTemplate;
import object.basements.pojo.GroupPojo;

public class GroupConcrete extends AbstractObjectTemplate {

	@Override
	public Object init() throws NullPointerException {
		// TODO Auto-generated method stub
		GroupPojo groupPojo = new GroupPojo();
		groupPojo.setName("ghost");
		groupPojo.setFullName("ghost in the codes");
		
		return groupPojo;
	}
}
