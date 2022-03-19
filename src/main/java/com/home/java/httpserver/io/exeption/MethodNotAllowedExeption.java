package com.home.java.httpserver.io.exeption;

import com.home.java.httpserver.io.Constants;

public class MethodNotAllowedExeption extends AbstractRequestParseFailedExeption {

	private static final long serialVersionUID = -6213195717409375918L;

	public MethodNotAllowedExeption(String method, String startingLine) {
		super("Only " + Constants.ALLOWED_METHODS + "are supported. Current method is " + method, startingLine);
		setStatusCode(405);
	}

}
