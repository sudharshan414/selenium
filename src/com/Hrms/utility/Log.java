package com.Hrms.utility;

import org.apache.log4j.Logger;
public class Log {
	//initialize log4j logs
private static Logger Log =Logger.getLogger(Log.class.getName());
public static void info(String message) {
	Log.info(message);
}
public static void error(String message) {
	Log.error(message);
}
}
