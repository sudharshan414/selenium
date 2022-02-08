package com.Hrms.TestScripts;
import org.apache.log4j.xml.DOMConfigurator;
//import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.Hrms.Lib.General;

public class TC004 {
	//public static void main(String args[]) {
	        @Test
	        public void tc004() {
	    		DOMConfigurator.configure("log4j.xml");

	        //Test Steps
	        General obj = new General();
	        obj.openApplication();
	        obj.login();
	        obj.delEmp();
	        obj.logout();
	        obj.closeApplication();
	}
	}