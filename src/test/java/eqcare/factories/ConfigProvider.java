package eqcare.factories;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProvider {

	
	Properties pro;
	
	public ConfigProvider() {

		pro=new Properties();
		
		try {
			// 4 - AV
			//Nothing-Pony
			//dev - 2
			//Prod = 7
			//Cole - 8
			//Dmtry-stagq=9
			//life journey - 2
			//life journey prod - 10
			pro.load(new FileInputStream(new File(System.getProperty("user.dir")+"/Config/configEqcared2.properties")));
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
		
	}
	
	public String getValue(String key) {
		
		return pro.getProperty(key);
	}
	
	
}
