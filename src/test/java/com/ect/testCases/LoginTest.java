package com.ect.testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.ect.pages.BaseClass;
import com.ect.utility.ExcelDataProvider;

public class LoginTest extends BaseClass {

	@Test(dataProvider = "loginData")
	public void Logintest(String userName, String password) {
		lp.performLogin(userName, password);
		if (userName.equals("amanmouryan30+99@gmail.com")) {
			Assert.assertTrue(true);
			lp.logout();
		} else {
			Assert.assertTrue(false);
		}

	}

	@DataProvider(name = "loginData")
	public Object[][] dataProvider() {
		ExcelDataProvider dp = new ExcelDataProvider();
		System.out.println(System.getProperty("user.dir"));
		return dp.readExcelData("./testData/LoginData.xlsx", 0);

	}
}
