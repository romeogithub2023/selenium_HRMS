package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_002 {

	@Test
	public void tc_002() throws Exception {

		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.mouseover();
		obj.addemp();
		obj.logout();
		obj.closeApplication();
	}

}
