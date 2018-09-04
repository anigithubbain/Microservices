package com.session.microservice.exchangeservice;

public class DBConfig {

	private String username;
	private String password;
	private String url;
	private String port;
	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUsername() {
		return username;
	}

	public DBConfig() {
		super();
	}

	public DBConfig(String username, String password, String url, String port) {
		super();
		this.username = username;
		this.password = password;
		this.url = url;
		this.port = port;
	}

	public DBConfig(String username, String password, String url) {
		super();
		this.username = username;
		this.password = password;
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
