package com.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_Demo {
	static Logger log=Logger.getLogger(Property_Demo.class);
	public static void main(String[] args) {
		
	
	PropertyConfigurator.configure("log4j.properties");
	
	log.debug("Debug msg");
	log.info("info msg");
	log.warn("warning msg");
	log.error("error msg");
	log.fatal("fatal msg");
	}

}
