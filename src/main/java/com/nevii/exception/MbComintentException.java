package com.nevii.exception;

public class MbComintentException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private String exceptionMessage;

public MbComintentException(String exceptionMessage) {
	super();
	this.exceptionMessage = exceptionMessage;
}

public String getExceptionMessage() {
	return exceptionMessage;
}

public void setExceptionMessage(String exceptionMessage) {
	this.exceptionMessage = exceptionMessage;
}
	

}
