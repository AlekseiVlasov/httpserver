package com.home.java.httpserver.io.exeption;

public abstract class AbstractRequestParseFailedExeption extends HttpServerExeption {

	private static final long serialVersionUID = 8749028247047357606L;
	private final String startingLine;

	public AbstractRequestParseFailedExeption(String message, String startingLine) {
		super(message);
		this.startingLine = startingLine;
	}

	public AbstractRequestParseFailedExeption(Throwable cause, String startingLine) {
		super(cause);
		this.startingLine = startingLine;
	}

	public AbstractRequestParseFailedExeption(String message, Throwable cause, String startingLine) {
		super(message, cause);
		this.startingLine = startingLine;
	}

	public String getStartingLine() {
		return startingLine;
	}

}
