package common;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.yaml.snakeyaml.Yaml;

import setting.SetttingsDTO;

public class YamlOperator {
	public static void testMethod() {
		SetttingsDTO data = new SetttingsDTO();
		data.setMaxMb(1);
		data.setLogFrequency("default");
		Yaml yaml = new Yaml();
		System.out.println(yaml.dump(data));
	}
	
	public static void testMethod2() {
		Yaml yaml = new Yaml();
		SetttingsDTO loaded = yaml.loadAs("!!setting.SetttingsDTO {logFrequency: default, maxMb: 1}", SetttingsDTO.class);
		System.out.printf("logpattern: %s", loaded.getLogFrequency());
	}
	
	public static void testMethod3() {
		SetttingsDTO data = new SetttingsDTO();
		data.setMaxMb(1);
		data.setLogFrequency("default");
		
		try {
			Yaml yaml = new Yaml();
			File file = new File("src/main/resources/res/setting.yaml");
			FileWriter writer = new FileWriter(file);
			yaml.dump(data, writer);
			writer.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
		}
	}
	
}
