package com.home.java.httpserver.io.exeption;

public class HttpServerExeption extends RuntimeException {

	private static final long serialVersionUID = -7334750106528232809L;
	private int statusCode = 500;

	public HttpServerExeption(String message, Throwable cause) {
		super(message, cause);

	}

	public HttpServerExeption(String message) {
		super(message);

	}

	public HttpServerExeption(Throwable cause) {
		super(cause);

	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

}
