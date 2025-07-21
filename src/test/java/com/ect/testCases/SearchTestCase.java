package com.ect.testCases;

import org.testng.annotations.Test;

import com.ect.pages.BaseClass;

public class SearchTestCase extends BaseClass{
	public BaseClass bp;

	@Test
	public void searchTest() {
		bp=new BaseClass();
		
		lp.performLogin("amanmourya30+99@gmail.com", "Qwerty@123");
		sp.searchProduct();
		
		
		
		
	}
	
	

}
