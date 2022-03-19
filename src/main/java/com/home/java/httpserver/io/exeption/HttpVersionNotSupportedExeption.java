package com.home.java.httpserver.io.exeption;

public class HttpVersionNotSupportedExeption extends AbstractRequestParseFailedExeption {

	private static final long serialVersionUID = -5130677906505994074L;

	public HttpVersionNotSupportedExeption(String message, String startingLine) {
		super(message, startingLine);
		setStatusCode(505);
	}

}
