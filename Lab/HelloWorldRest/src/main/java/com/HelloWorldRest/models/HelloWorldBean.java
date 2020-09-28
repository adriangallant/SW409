package com.HelloWorldRest.models;

public class HelloWorldBean {
	
	String message;
	
	public HelloWorldBean(String string) {
		this.message = string;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
