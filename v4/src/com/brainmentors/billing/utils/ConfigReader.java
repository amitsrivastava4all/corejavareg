package com.brainmentors.billing.utils;

import java.util.ResourceBundle;

public interface ConfigReader {
	String BROWSE_PATH = "browsepath";
	String USERID = "userid";
	String PWD = "password";
	String DBURL ="dburl";
	String DRIVER = "driver";
	 ResourceBundle rb = ResourceBundle.getBundle("config");
	public static String getValue(String key) {
		return rb.getString(key);
	}
}
