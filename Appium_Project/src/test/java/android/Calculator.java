package android;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Calculator {
	
	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "10");
		capabilities.setCapability("udid","ZF6524KPB3");
		capabilities.setCapability("deviceName", "moto g(8) power lite");
		capabilities.setCapability("appPackage", "com.google.android.claculator");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        URL url=new URL("http://0.0.0.0:4723/");
        driver= new AndroidDriver(url,capabilities);
        System.out.println("Done");
	}

}
