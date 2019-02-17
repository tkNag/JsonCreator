package works.factory;

import com.google.gson.Gson;

import object.basements.GroupConcrete;
import works.factory.blueprint.BluePrintDTO;

public class Shipment {

	public static String exec(int logType) {
		String logString = "";
		Gson gson = new Gson();
		BluePrintDTO bp = new BluePrintDTO();
		
		try {
			// TODO: 後で、logbodyと同様にenum化する
			bp.setId("uuid");
			bp.setGroup(new GroupConcrete().init());
			
			LogBodyEnum.of(logType).setObject(bp);
			
			logString = gson.toJson(bp);
		} catch (IllegalArgumentException e1) {
			System.out.println(e1);
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		return logString;
	}
}
