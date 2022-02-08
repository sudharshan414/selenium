package com.Hrms.TestScripts;

import org.apache.log4j.xml.DOMConfigurator;
//import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.Hrms.Lib.General;

public class TC003 {
	        @Test
	        public void tc003() {
	    		DOMConfigurator.configure("log4j.xml");

	        //Test Steps
	        General obj = new General();
	        obj.openApplication();
	        obj.login();
	        obj.enterFrame();
	        obj.editEmp();
	        obj.exitFrame();
	        obj.logout();
	        obj.closeApplication();
	}
	}