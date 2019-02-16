package works.factory;

import java.util.Arrays;

import object.logbodies.FoundationConcrete;
import object.logbodies.ProjectConcrete;
import works.factory.blueprint.BluePrintDTO;

public enum LogBodyEnum {
	PROJECT(1) {

		@Override
		public void setObject(BluePrintDTO bp) {
			// TODO Auto-generated method stub
			bp.setProject(new ProjectConcrete().init());
		}
		
	},
	FOUNDATION(2) {

		@Override
		public void setObject(BluePrintDTO bp) {
			// TODO Auto-generated method stub
			bp.setFoundation(new FoundationConcrete().init());
		}
		
	};
	
	private int logType;
	
	private LogBodyEnum(int logType) {
		this.logType = logType;
	}

	public int getLogType() {
		return logType;
	}
	
	public abstract void setObject(BluePrintDTO bp);
	
	public static LogBodyEnum of(int logType) {
		return Arrays.stream(LogBodyEnum.values())
				.filter(data -> data.getLogType() == logType)
				.findFirst()
				.orElseThrow(IllegalArgumentException::new);
	}
}
