package com.session.microservice.exchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbConnectController {
	@Autowired
	Environment env;

	@Autowired
	ConfigPropertiesConsumer configConsumer;

	@GetMapping("/getDBConfig")
	public DBConfig getDBConfig() {

		DBConfig dbConfig = new DBConfig(configConsumer.getUsername(), configConsumer.getPassword(), configConsumer.getUrl(),
				configConsumer.getPort());
		dbConfig.setPort(env.getProperty("local.server.port"));
		return dbConfig;
	}

}
