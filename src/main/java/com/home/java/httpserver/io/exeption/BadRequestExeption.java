package com.home.java.httpserver.io.exeption;

public class BadRequestExeption extends AbstractRequestParseFailedExeption {

	private static final long serialVersionUID = -6172284770110153565L;

	public BadRequestExeption(String message, Throwable cause, String startingLine) {
		super(message, cause, startingLine);
		setStatusCode(400);
	}

}
