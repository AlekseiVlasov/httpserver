package com.home.java.httpserver.io;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Constants {

	public static final String GET = "Get";
	public static final String POST = "Post";
	public static final String HEAD = "Head";

	public static final List<String> ALLOWED_METHODS = Collections
			.unmodifiableList(Arrays.asList("Get", "Post", "Head"));
}
