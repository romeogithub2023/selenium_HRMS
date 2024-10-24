package com.hrms.utility;

import org.apache.log4j.Logger;

public class Log {

	// Initialize Log4J logs
	private static Logger Log = Logger.getLogger(Log.class);

	// need to create these methods, so that they can be
	public static void info(String message) {
		Log.info(message);
	}

}
