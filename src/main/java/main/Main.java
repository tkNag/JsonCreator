package main;

import common.YamlOperator;
import works.factory.Shipment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		YamlOperator.testMethod3();
		
		String text = Shipment.exec(1);
		System.out.println(text);
		
		String text2 = Shipment.exec(2);
		System.out.println(text2);
	}

}
