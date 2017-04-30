package Accessible;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ReadingFile {
	
	public static void main(String[] args) throws IOException {
		
	    Logger log = Logger.getLogger(ReadingFile.class);
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/Adilmarjana2011/Documents/workspace/BasicProgramming/src/Accessible/Object.Properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("Name"));
		log.debug("This is the begaining of redaing");
		
		System.out.println(prop.getProperty("Age"));
		System.out.println(prop.getProperty("Gender"));
		log.info("This is ending");
	}
	

}
