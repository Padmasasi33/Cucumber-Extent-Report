package com.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Configuration_Demo {
	
	static Logger log=Logger.getLogger(Configuration_Demo.class);
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		log.debug("Debug msg");
		log.info("info msg");
		log.warn("warning msg");
		log.error("error msg");
		log.fatal("fatal msg");
		
	}
	

}
