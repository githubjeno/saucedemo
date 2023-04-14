package com.helper;

import java.io.IOException;

public class File_Reader {

	public static Configuration_Reader getInstance() throws IOException {
		Configuration_Reader cf = new Configuration_Reader();
		return cf;
	}
}
