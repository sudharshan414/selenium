package com.Hrms.TestScripts;
import org.apache.log4j.xml.DOMConfigurator;

import org.testng.annotations.Test;

import com.Hrms.Lib.General;

public class TC001 {
	//public static void main(String args[]) {
	//Test steps
	
	@Test
	public void tc001() {
		DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
	}

}
