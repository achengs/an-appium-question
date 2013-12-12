package com.company;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class FindElementTest {

	protected static String app = "/path/to/your/clone/of/app/bin/app.apk"; // CHANGE THIS LINE
	protected static String appPackage = "com.company.app";
	protected static String appActivity = appPackage + ".MainActivity";
	protected static final String TIMEOUT = "10000";
	protected static String host = "127.0.0.1";
	protected static String port = "4723";
	protected static WebDriver driver;
	protected static URL url;

	private void setupDriver() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("device", "Android");
		caps.setCapability("app", app);
		caps.setCapability(CapabilityType.BROWSER_NAME, "");
		caps.setCapability("device", "android");
		caps.setCapability(CapabilityType.VERSION, "4.3");
		caps.setCapability(CapabilityType.PLATFORM, "MAC");
		caps.setCapability("newCommandTimeout", TIMEOUT);
		caps.setCapability("launch", "true");
		caps.setCapability("app-activity", appActivity);
		caps.setCapability("app-package", appPackage);
		caps.setCapability("app-wait-activity", appActivity);
		caps.setCapability("device-ready-timeout", TIMEOUT);
		caps.setCapability("compressXml", "true");

		final String u = String.format("http://%s:%s/wd/hub", host, port);
		url = new URL(u);
		driver = new RemoteWebDriver(url, caps);
	}

	@Before
	public void setupTestCase() throws MalformedURLException {
		setupDriver();
	}

	@After
	public void teardownTestCase() {
		driver.quit();
	}

	@Test
	public void findByHintText() throws Exception {
		WebElement f = driver.findElement(By.name("Enter a message"));
		f.sendKeys("qwer");
		WebElement g = driver.findElement(By.name("findme"));
		g.sendKeys("zxcv");
	}
	@Test
	public void findById() throws Exception {
		WebElement f = driver.findElement(By.id("edit_message"));
		f.sendKeys("asdf");
		WebElement g = driver.findElement(By.id("edit_message_1")); // FAILS FOR ME - WHY?
		g.sendKeys("hjkl");
	}
}
