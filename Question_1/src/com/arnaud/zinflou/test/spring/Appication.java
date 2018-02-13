package com.arnaud.zinflou.test.spring;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Appication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileSystemXmlApplicationContext( "src/ViaRMI.xml" );

	}

}
