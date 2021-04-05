package com.ahaslides.pages;

import com.ahaslides.MyPageObject;

public class MyPresentationPage extends MyPageObject {

	public static final String FULLNAME_LBL = "//p[contains(@class,\"dropdown-username\")]";
	
	public String getFullname() {
		String fullname = element(FULLNAME_LBL).getText();
		System.out.println("Actual fullname: "+fullname);
		return fullname;
	}
}
