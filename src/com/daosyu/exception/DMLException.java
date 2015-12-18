package com.daosyu.exception;

public class DMLException extends RuntimeException{
	private String requestCode;

	public String getRequestCode() {
		return requestCode;
	}

	public void setRequestCode(String requestCode) {
		this.requestCode = requestCode;
	}

	public DMLException(String msg) {
		super(msg);
		
	}
	
	public DMLException(String msg, Throwable e) {
		super(msg, e);
		
	}
	

}
