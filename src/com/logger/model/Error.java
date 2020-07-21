package com.logger.model;

import java.util.List;

public class Error {
	
	String timestamp;
	String  className;
	String message;
    List<PrevLogs> previousLogs;
    
	public Error(String timestamp, String className, String message, List<PrevLogs> previousLogs) {
		super();
		this.timestamp = timestamp;
		this.className = className;
		this.message = message;
		this.previousLogs = previousLogs;
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
	public List<PrevLogs> getPreviousLogs() {
		return previousLogs;
	}
	public void setPreviousLogs(List<PrevLogs> previousLogs) {
		this.previousLogs = previousLogs;
	}
}
