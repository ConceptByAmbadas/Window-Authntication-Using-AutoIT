package com.Info.page;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(220, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.engprod-charter.net/");
		Thread.sleep(2);
		Runtime.getRuntime().exec("E:\\Seleium_data\\Auto_IT_Selenium\\windowhandle.exe");

	}

}
