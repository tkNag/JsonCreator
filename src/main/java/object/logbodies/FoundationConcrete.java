package object.logbodies;

import object.AbstractObjectTemplate;
import object.logbodies.pojo.FoundationPojo;

public class FoundationConcrete extends AbstractObjectTemplate{
	@Override
	public Object init() {
		// TODO Auto-generated method stub
		FoundationPojo foundationPojo = new object.logbodies.pojo.FoundationPojo();
		foundationPojo.setFoundationName("SectionX");
		foundationPojo.setBill(10000);
		foundationPojo.setHasOutdated(false);

		return foundationPojo;
	}

}
