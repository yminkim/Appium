package hihi;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class jebal {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9.0);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "KimsPhone");
		
		dc.setCapability("appPackage", "com.android.calculator2");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
		
		WebElement seven = driver.findElementById("com.android.calculator2:id/digit_7");
		seven.click();
		
		driver.findElementById("com.android.calculator2:id/op_add").click();
		
		WebElement three = driver.findElementById("com.android.calculator2:id/digit_3"); 
		three.click();
		driver.findElementById("com.android.calculator2:id/eq").click();
		
		
		Thread.sleep(3000);
		
		String results = driver.findElementById("com.android.calculator2:id/result").getText(); // String값으로 결과를 getText
		
		if(results.equals("12")) {     // if 결과가 12와 같다면
			System.out.println("Test Passed"); // 이클립스 콘솔에 출력
		} else {
			System.out.println("Test Failed"); // 이클립스 콘솔에 출력
		}
		
		Thread.sleep(5000); 
		
		driver.quit();
		
	}

}
