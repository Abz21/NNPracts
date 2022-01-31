package com.example.Demo;

import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	static Logger log = Logger.getLogger(DemoApplication.class.getName());
	public static void main(String[] args) {
		log.info("RUNNNNINNGGG");
		log.debug("RUNNNNINNGGG");
		log.error("RUNNNNINNGGG");
	}
}
