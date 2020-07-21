package com.logger.model;

public class PrevLogs {
	String timestamp;
	String  className;
	String message;
	
	public PrevLogs(String timestamp, String className, String message) {
		super();
		this.timestamp = timestamp;
		this.className = className;
		this.message = message;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
