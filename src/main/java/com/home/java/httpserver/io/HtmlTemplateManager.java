package com.home.java.httpserver.io;

import java.util.Map;

public interface HtmlTemplateManager {
	String processTemplate(String name, Map<String, Object> args);
}
