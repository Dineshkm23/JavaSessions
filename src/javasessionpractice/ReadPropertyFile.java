package javasessionpractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fi= new FileInputStream(System.getProperty("user.dir")+"\\Datafolder\\config.properties");
		
		Properties prop= new Properties();
		prop.load(fi);
		String name=prop.getProperty("name");
		String lastname=prop.getProperty("lastname");
		String age=prop.getProperty("age");
		String mobile=prop.getProperty("mobile");
		String gender=prop.getProperty("gender");
		
		System.out.println("name:"+name);
		System.out.println("lastname:"+lastname);
		System.out.println("age:"+age);
		System.out.println("mobile:"+mobile);
		System.out.println("gender:"+gender);
		
		
		Set<String> keyAndValues=prop.stringPropertyNames();
		System.out.println(keyAndValues);
		
		for (String string : keyAndValues) {
			System.out.println(string);
			
		}
		
		Set<Object> keys=prop.keySet();
		System.out.println(keys);
		
		
		Collection<Object> values=prop.values();
		System.out.println(values);
		
		
		
	}

}
