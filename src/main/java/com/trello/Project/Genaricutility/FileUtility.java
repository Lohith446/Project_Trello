package com.trello.Project.Genaricutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	/**
	 * this will bring the value form the property file upon then key as the the input
	 * @param key
	 * @return value
	 * @author Lohith
	 * @throws IOException 
	*/
		public String readCommonData(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Trellodata.properties");
         Properties pobj = new Properties();
         pobj.load(fis);
         String value = pobj.getProperty(key);
         return value;
         
}
}