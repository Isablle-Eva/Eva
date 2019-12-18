package com.api;

import java.util.Properties;
import java.util.Set;

public class System_text {

	public static void main(String[] args) {
		Properties properties=System.getProperties();
		System.out.println(properties);
		Set<String>propertyNames=properties.stringPropertyNames();
		for(String key:propertyNames) {
			String value=System.getProperty(key);
			System.out.println(key+"---"+value);
		}
	}

}
